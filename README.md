-----------------------
✨ Application Name : "Seasajob"

✔️ Version : "1.0.0" 

✔️ Version JAVA : "19.0.1" 

✔️ Version jdk : "openjdk-19"

✔️ Version Spring Boot : "2.7.6" 

✔️ Gradle : "Groovy" 

🔗 URL du dépôt : [https://github.com/tiffany-dumaire/ig5-iwa-service-offers](https://github.com/tiffany-dumaire/ig5-iwa-service-offers)
-----------------------

# ig5-iwa-service-offers

## Description et origine

### 📜 Description et objectif 📜

Ceci est le micro-service de gestion des offres de l'application Seasajob. Seasajob est une application pour la gestion des candidatures et offres d'emploi à des jobs saisonniers.

Voici le schéma de l'architecture de l'application : 
![ArchitectureIWA](https://drive.google.com/uc?id=1_p0O8CNfavvygypsgEwNbb2eGWup09Ao)

Les fonctionnalités de ce micro-service sont les suivantes : 
* Offres
  * Création d'une offre
  * Récupérer la liste des offres
  * Récupérer la liste des offres avec un bout du titre
  * Récupérer la liste des offres avec un bout du titre et/ou un bout de la description
  * Récupérer une offre par id
  * Fermer une offre
  * Modifier le brouillon d'une offre (titre, description, date d'ouverture de l'offre)
* Companies
  * Créer une entreprise
  * Récupérer la liste des entreprises
  * Récupérer une entreprise par id
* Recommendations
  * Créer une recommandation
  * Récupérer la liste de toutes les recommandations
  * Récupérer la liste des recommandations d'un utilisateur
  
Ce micro-service aurait dû contenir une partie de l'algorithme de recommandation mais celui-ci n'a pas été développé.

Vous trouverez les deux autres micro-services ici : 
* Gestion des utilisateurs & mailing, réalisé par Joan TERIIHOANIA : [https://github.com/joan-teriihoania/iwa2-rest-api](https://github.com/joan-teriihoania/iwa2-rest-api)
* Gestion des candidatures, réalisé par Aaron LAZAROO : [https://github.com/AaronLaz/ig5-iwa-service-applications](https://github.com/AaronLaz/ig5-iwa-service-applications)

Vous pourrez également tester les fonctionnalités de ce micro-service en utilisant Postman. Voici un [fichier contenant l'ensemble des requêtes de ce micro-service](https://drive.google.com/file/d/1eLftXN8_koIdOb97zVpgxYZvRmpgnnTR/view?usp=sharing), en l'important sur Postman, vous aurez accès à un dossier pour le tester en local. 

### 🖋️ Auteurs 🖋️

#### Application Seasajob

Ce projet a été réalisée par Tiffany DUMAIRE, Aaron LAZAROO & Joan TERIIHOANIA (IG5 - 2022/2023) dans le cadre du cours d'Ingénierie des Applications Web du semestre 9.

#### Micro-service de gestion des offres et des recommandations

Réalisé par Tiffany DUMAIRE

## 📟 Lancer l'application 📟

### 💻 En local 💻

- Après avoir clôné les fichiers sur votre fabuleux PC, ouvrez l'application sur IntelliJ IDEA.
- Aller dans le fichier build.gradle et assurer vous d'avoir bien synchronisé les dépendances. Si vous n'avez pas de fichier build.gradle vous pouvez utiliser [celui-ci](https://drive.google.com/file/d/1geTjzEUjoHGCmM5WDs0phjz7ibgk08WA/view?usp=sharing).
- Vous devrez également avoir installé PostgreSQL sur votre machine ! A l'aide de PG Admin, vous pourrez facilement importer le [fichier pour la création de la BDD](https://drive.google.com/file/d/1Vv2rTY6dMCuca6Abd1lpYBUHkyDAkZ-n/view?usp=sharing).
- Dans le fichier : src/main/resources/application.properties , pensez à bien modifier les informations données avec les informations de connexion à votre BDD nouvellement créé !

### ❌ Hébergé ❌

Ce micro-service n'a pas été hébergé et se lancera automatiquement sur l'adresse suivante : [http://localhost:8080](http://localhost:8080)
La base de données n'a pas été hébergée, mais une fois créée elle devrait se lancer automatiquement sur l'adresse suivante : [http://localhost:5432](http://localhost:5432)
