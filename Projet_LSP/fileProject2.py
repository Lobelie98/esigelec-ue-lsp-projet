"""
Dans ce fichier, nous réalisons un programme qui fait le produit du prix unitaire et de la quantité pour chacune
des lignes d'un fichier csv qui arrivent au port 9990 à une fréquence de 2 secondes. 
Les résultats sont stockés dans le fichier random_file.txt
"""

from pyspark import SparkContext
from pyspark.streaming import StreamingContext

import pickle

def sendRecord(tup):
	word   = tup[0]
	amount = tup[1]
	f = open("random_file.txt", "a")
	f.write(str(word) + ": " + str(amount) + "\n")
	f.close

sc = SparkContext("local[2]", "Project")
ssc = StreamingContext(sc, 2)

lines = ssc.socketTextStream("localhost",9990)
phrases = lines.flatMap(lambda line: line.split("\n"))
words = phrases.flatMap(lambda w: w.split(","))
pairs = words.map(lambda w: (w[0], int(w[2])*int(w[3])))

pairs.foreachRDD(lambda rdd: rdd.foreach(sendRecord))

pairs.pprint()

ssc.start()
ssc.awaitTermination()
