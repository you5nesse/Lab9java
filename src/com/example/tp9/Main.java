package com.example.tp9;

public class Main {
    public static void main(String[] args) {
    	System.out.println("======= DÉBUT DU PROGRAMME  =======");
        // Test de Calculator
    	System.out.println(" ===Test de Calculator===");
        Calculator calc = new Calculator();

        System.out.println("--- Test Addition ---");
        System.out.println("5 + 3 = " + calc.add(5, 3));

        System.out.println("--- Test Division Valide ---");
        try {
            System.out.println("8 / 2 = " + calc.divise(8, 2));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("--- Test Division par Zéro ---");
        try {
            System.out.println("6 / 0 = " + calc.divise(6, 0));
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur interceptée : " + e.getMessage());
        }
        
        // Test de la création d'un utilisateur invalide
        System.out.println(" ===Test d'utilisateur===");
        try {
        	User user1 = new User("", 100);
            
        } catch (InvalidUserException e) {
            System.err.println("Échec de création utilisateur : " + e.getMessage());
            LoggerUtil.logError(e.getMessage());
        }
        try {
        	User user2 = new User("younesse", 150);
		} catch (InvalidUserException e) {
			 System.err.println("Échec de création utilisateur : " + e.getMessage());
	            LoggerUtil.logError(e.getMessage());
		}

        // Test de lecture de fichier inexistant
        System.out.println(" ===Test de fichier===");
        FileReaderUtil readerUtil1 = new FileReaderUtil();
        readerUtil1.readFileModern("inexistant.txt");
        FileReaderUtil readerUtil2 = new FileReaderUtil();
        readerUtil2.readFileModern("existant.txt");
        
        System.out.println("======= FIN DU PROGRAMME  =======");
    }
}
