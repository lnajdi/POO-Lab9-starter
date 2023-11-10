package Lab.Map;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        // Initialisation de la HashMap
        Etudiant e1 = new Etudiant("E001", "Ali", 20);
        Etudiant e2 = new Etudiant("E002", "Fatima", 21);
        HashMap<String, Etudiant> etudiantsMap = new HashMap<>();

        // Parcours de la HashMap
        etudiantsMap.forEach((code, etudiant) -> {

        });

        // Recherche d'un étudiant
        String code1 = "E001";
        Etudiant etudiantRecherche = etudiantsMap.get(code1);
        if (etudiantRecherche != null) {
            System.out.println("Détails de l'étudiant avec le code " + code1 + " : " + etudiantRecherche);
        } else {
            System.out.println("Aucun étudiant trouvé avec le code " + code1);
        }

        // Affichage du nom de chaque étudiant en majuscules
        etudiantsMap.forEach((code, etudiant) -> {
            System.out.println(etudiant.getNom().toUpperCase());
        });

        // Ajout de trois nouveaux étudiants dans la HashMap
        Etudiant e3 = new Etudiant("E003", "Hassan", 22);
        Etudiant e4 = new Etudiant("E004", "Yasmine", 23);
        Etudiant e5 = new Etudiant("E005", "Khalid", 24);

        // Utilisez les Streams pour filtrer les étudiants qui ont plus de 22 ans.
        etudiantsMap.values().stream()
                .filter(e -> e.getAge() > 22)
                .forEach(e -> System.out.println(e.getNom() + " - " + e.getAge()));

        // Utilisez les Streams pour transformer les noms des étudiants en majuscules et
        // les afficher.

        // Recherchez un étudiant spécifique et effectuez une opération si trouvé.
        String code2 = "E003";
        etudiantsMap.values().stream()
                .filter(e -> e.getCode().equals(code2))
                .findFirst()
                .ifPresent(e -> System.out.println("Étudiant trouvé : " + e.getNom()));

    }
}
