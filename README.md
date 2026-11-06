
1. Calculator.java

Cette classe permet d'effectuer des opérations mathématiques :

add() : additionne deux nombres.

divise() : divise deux nombres et déclenche une exception IllegalArgumentException si le diviseur est égal à zéro.

2. InvalidUserException.java

Cette classe représente une exception personnalisée qui hérite de la classe Exception.

Elle permet de signaler les erreurs lors de la création d'un utilisateur invalide.

3. User.java

Cette classe représente un utilisateur avec deux attributs :

username : nom d'utilisateur.

age : âge de l'utilisateur.

Le constructeur vérifie deux conditions :

Le nom d'utilisateur ne doit pas être vide.

L'âge doit être compris entre 0 et 120 ans.

Si une condition n'est pas respectée, une exception InvalidUserException est déclenchée.

4. LoggerUtil.java

Cette classe permet d'enregistrer les erreurs dans le fichier error.log.

La méthode logError() utilise BufferedWriter et FileWriter pour ajouter les messages d'erreur avec la date et l'heure.

5. FileReaderUtil.java

Cette classe permet de lire le contenu des fichiers avec trois méthodes :

readFile() : lecture avec propagation de l'exception grâce à throws IOException.

readFileSafely() : lecture avec les blocs try-catch-finally.

readFileModern() : lecture avec try-with-resources, qui ferme automatiquement le fichier.


<img width="1920" height="1080" alt="Capture d’écran (346)" src="https://github.com/user-attachments/assets/e5afe198-d252-4979-8119-677601132cb0" />
<img width="1920" height="1080" alt="Capture d’écran (345)" src="https://github.com/user-attachments/assets/043eb22e-78ab-4e4c-ad02-900ab9b43e55" />
