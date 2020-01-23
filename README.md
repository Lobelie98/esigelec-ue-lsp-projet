## Projet de Large Scale Processing
**Objectif:**
Spark Streaming

**Projet :**

<p>Notre projet pourrait se répartir en deux parties. Le but est d'utiliser Spark Streaming avec TCP Socket. Afin de simuler le flux de données nous avons réalisé des scripts shell qui lisent les lignes d'un fichiers CSV et les envoient à un port choisi arbitrairement. Les jobs Spark Streaming sont également paramétrés de façon à se connecter sur ces ports.</p>

<p> Nous avons réalisé deux programmes Spark. Le premier (contenu dans le fichier <b>fileProject.py</b>) est un wordcount effectué sur les lignes du fichier <b>file.csv</b>. Le script shell qui transfère les données de ce fichier est <b>script.sh</b></p>

<p>Le deuxième programme (contenu dans le fichier <b>fileProject2.py</b>) fait le produit de deux colonnes (la deuxième et la troisième) du fichier <b>file2.csv</b>. Le script shell qui transfère les données de ce fichier est <b>scriptProject.sh</b></p>

<p>Les résultats des opérations réalisées dans par ces deux programmes sont stockés respectivement dans le fichier <b>ranom_file_wordcount.txt</b> et <b>random_file.txt</b></p>

**Comment exécuter les programme ?**

Pour  exécuter l'un ou l'autre des programmes, il faut ouvrir deux fenêtres WSL. Dans la première, on exécute le script Shell qu'il faut avec la commande ***bash nom_script.sh numero_port*** et dans l'autre on execute le script python en faisant ***spark-submit nom_fichier.py numero_port***. Le numéro de port est le même dans les deux commandes. 

Si nécessaire, il faut spécifier le chemin d'accès de la commande spark-submit dans le dossier Spark installé sur la machine. Egalement, le job peut ne rien retourner lors de sa première voire deuxième exécution. Pour rémédier à cela,il faut changer le numéro de port.

**Membres**

* BAH Thierno Mamadou

* BAKARY Faridath

* NGBANZA Lobélie

