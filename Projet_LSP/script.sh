#! /bin/bash

#nc -l 9999

while read line 
do 
echo -e "$line " | nc -l 9996
done < file.csv

