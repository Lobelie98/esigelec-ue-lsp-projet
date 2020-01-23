"""
Dans ce fichier, nous réalisons un programme qui fait le produit du prix unitaire et de la quantité pour chacune
des lignes d'un fichier csv qui arrivent au port 9990 à une fréquence de 2 secondes. 
Les résultats sont stockés dans le fichier random_file.txt
"""
from pyspark import SparkContext
from pyspark.streaming import StreamingContext

import sys

def sendRecord(tup):
	word   = tup[0]
	amount = tup[1]
	f = open("random_file.txt", "a")
	f.write(str(word) + ": " + str(amount) + "\n")
	f.close

def operation(rdd):
	tup = []
	rddDF = rdd.collect()
	print(rddDF)

	if (len(rddDF) == 4):
		key = rddDF[1] + " pour " + rddDF[0]
		try:
			value = int(rddDF[2]) * int(rddDF[3])
		except valueError:
			value = 0
		tup.append(key)
		tup.append(str(value))
		sendRecord(tup)
		print(key, value)
	else:
		print("Aucune valeur enregistrée")


sc = SparkContext("local[2]", "Project")
ssc = StreamingContext(sc, 2)

lines = ssc.socketTextStream("localhost",int(sys.argv[1]))
phrases = lines.flatMap(lambda line: line.split("\n"))
words = phrases.flatMap(lambda w: w.split(","))
words.foreachRDD(lambda rdd: operation(rdd))

#pairs = words.map(lambda w: (w[0], int(w[2])*int(w[3])))
#pairs2 = words.map(lambda w: (w[0], w[2]))
#pairs.foreachRDD(lambda rdd: rdd.foreach(sendRecord))

ssc.start()
ssc.awaitTermination()
