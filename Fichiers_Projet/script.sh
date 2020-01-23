#! /bin/bash

#nc -l 9999

while read line 
do 
echo -e "$line " | nc -l $1
done < file.csv
echo "Fichier terminé"
