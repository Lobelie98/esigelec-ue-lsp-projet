## Projet de Large Scale Processing
**Objectif:**
Spark Streaming

**Projet :**

<p>Notre projet pourrait se répartir en deux parties. Le but est d'utiliser spark streaming avec TCP Socket. Afin de simuler le flux de données nous avons réalisé des scripts Shell qui lisent les lignes de fichiers CSV et les envoient à un port choisi arbitrairement. Les jobs Spark Streaming sont également paramétrés de façon à se connecter sur ces ports.</p>

<p> Nous avons réalisé deux programmes spark. Le premier (contenu dans le fichier <b>fileProject.py</b>) est un wordcount effectué sur les lignes du fichier <b>file.csv</b>. Le script Shell qui transfère les données de ce fichier est <b>script.sh.</b></p>

<p>Le deuxième programme (contenu dans le fichier <b>fileProject2.py</b>) fait le produit de deux colonnes (la troisième et la quatrième) du fichier <b>file2.csv</b>. Le script shell qui transfère les données de ce fichier est <b>scriptProject.sh.</b></p>

<p>Les résultats des opérations réalisées dans par ces deux programmes sont stockés respectivement dans les fichiers <b>random_file_wordcount.txt</b> et <b>random_file.txt.</b></p>

**Comment exécuter les programmes ?**

Pour  exécuter l'un ou l'autre des programmes, il faut ouvrir deux fenêtres WSL. Dans la première, on exécute le script Shell qu'il faut avec la commande ***bash nom_script.sh numero_port*** et dans l'autre on execute le script python en faisant ***spark-submit nom_fichier.py numero_port***. Le numéro de port est le même dans les deux commandes. 

Si nécessaire, il faut spécifier le chemin d'accès de la commande <b>spark-submit</b> dans le dossier <b>spark</b> installé sur la machine. Egalement, le job peut ne rien retourner lors de la première voire la deuxième exécution. Pour rémédier à cela,il faut changer le numéro de port.

Pour plus de clarté, il faudrait modifier les fichiers txt avant toute exécution en ajoutant plusieurs retour chariot.

Les fichiers du projet sont contenus dans le dossier <b>Fichiers_Projet</b>

**Membres**

* BAH Thierno Mamadou

* BAKARY Faridath

* NGBANZA Lobélie

