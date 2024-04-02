# Imane El Assari 

## M1 IA-ALT      

[![codecov](https://codecov.io/gh/ImaneElAssari/ceri-m1-techniques-de-test/graph/badge.svg?token=VYSB9VE64D)](https://codecov.io/gh/ImaneElAssari/ceri-m1-techniques-de-test)

[![CircleCI](https://dl.circleci.com/status-badge/img/circleci/H4ikkREn9g6WzK5JRX6245/H62MfKgRPJS3n3rm1JxSVK/tree/master.svg?style=svg&circle-token=CCIPRJ_FmiTPmBynTRJBiSUcaTNp7_1c163290933a3668c56fea8b3377ca63adc55926)](https://dl.circleci.com/status-badge/redirect/circleci/H4ikkREn9g6WzK5JRX6245/H62MfKgRPJS3n3rm1JxSVK/tree/master)


 

### Instructions pour l'installation des dépendances avec Maven et l'exécution de tests avec JUnit

Ce document fournit des instructions sur la façon d'installer les dépendances nécessaires à un projet Java à l'aide de Maven et comment exécuter des tests avec JUnit.

Installation des dépendances avec Maven

1. Assurez-vous d'avoir Maven installé sur votre système. Si ce n'est pas le cas, vous pouvez le télécharger et l'installer à partir du [site officiel de Apache Maven](https://maven.apache.org/download.cgi).

2. Clonez ou téléchargez le dépôt de votre projet depuis GitHub ou un autre système de gestion de versions.

3. Ouvrez un terminal ou une invite de commande et naviguez jusqu'au répertoire racine de votre projet.

4. Exécutez la commande suivante pour installer les dépendances du projet à l'aide de Maven 
`mvn install`

5. Après avoir installé les dépendances avec Maven, vous pouvez exécuter les tests JUnit pour votre projet avec la commande
`mvn test`.


# UCE Génie Logiciel Avancé : Techniques de tests

## Introduction

Vous allez à travers ces projet mettre en application une partie des aspects évoqués en cours vis à vis des techniques de tests.  
Pour cela nous allons réaliser un projet logiciel de petite taille, en suivant la roadmap suivante : 
- Setup du projet
- Mise en place des outils d’intégration continue
- Écriture des tests unitaires
- Écriture des mocks, et validation des tests
- Développement dirigé par les tests
- Documentation et conventions de style
- Test d'une implémentation donnée

Durant cette série de TPs, le gestionnaire de version Git sera utilisé à foison, à travers la plateforme GitHub. Si vous n’êtes pas à l’aise avec cet outil[^1], [voici](http://rogerdudler.github.io/git-guide/) un petit guide à garder sous la main.

## Sujets

L'ensemble des sujets de TPs peut être trouvé dans le dossier `TPs`.

Le dossier `src` contient la définition de l'ensemble des interfaces qui seront l'objet de vos travaux.

## Rendus

Le rendu des TPs se fait au rythme suivant :

- TP1 : 2ème séance
- TP2 : 2ème séance
- TP3 : 3ème séance
- TP4 : 5ème séance
- TP5 : dernière séance
- TP6 : dernière séance

Pour chaque rendu vous devez créer un tag à partir du commit qui correspond à la complétion du TP.  
Si vous ne spécifiez pas de tag, le dernier commit à la date-heure de la fin de séance sera celui considéré.

[^1]: Si vous n’êtes vraiment pas à l’aise avec cet outil nous vous conseillons quand même vivement de vous y mettre.
