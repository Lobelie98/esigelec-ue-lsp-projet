"""
Dans ce fichier, nous réalisons un programme qui compte les occurrences de chaque mot parmi l'ensemble
des mots qui arrivent au port 9992 à une fréquence de 2 secondes. Les résultats sont stockés dans le fichier
random_file.txt
"""

from pyspark import SparkContext
from pyspark.streaming import StreamingContext

import sys
import re

def sendRecord(tup):
	word   = tup[0]
	amount = tup[1]
	f = open("random_file_wordcount.txt", "a")
	f.write(str(word) + ": " + str(amount) + "\n")
	f.close

sc = SparkContext("local[2]", "Project")
ssc = StreamingContext(sc, 5)

lines = ssc.socketTextStream("localhost", int(sys.argv[1]))
words = lines.flatMap(lambda line: line.split(" "))
pairs = words.map(lambda word: (word, 1))
counts = pairs.reduceByKey(lambda a, b: a+b)

#lines = ssc.socketTextStream("localhost",9815)
#phrases = lines.flatMap(lambda line: line.split("\n"))
#words = phrases.flatMap(lambda w: w.split(","))
#intermediates = words.filter(lambda w: isnotstring(w))
#try:
	#pairs = words.map(lambda w: (w[0], int(w[2])*int(w[3])))
#except:
	#pairs = words.map(lambda w: (w[0], 0))

counts.foreachRDD(lambda rdd: rdd.foreach(sendRecord))

counts.pprint()

ssc.start()
ssc.awaitTermination()
