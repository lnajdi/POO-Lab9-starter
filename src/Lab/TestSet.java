package Lab;

import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        // 1. Création d'un HashSet de type String
        HashSet<String> setVilles = new HashSet<>();

        // 2. Ajouter cinq villes marocaines à votre HashSet
        setVilles.add("Casablanca");
        setVilles.add("Rabat");
        setVilles.add("Fès");
        setVilles.add("Marrakech");
        setVilles.add("Agadir");

        // 3. Insérer à nouveau une ville marocaine déjà contenue dans l'ensemble
        // initial, puis afficher l'ensemble

        // Note : Comme vous pouvez le voir, même après avoir essayé d'ajouter
        // "Casablanca" une deuxième fois,
        // elle n'apparaît qu'une seule fois dans le HashSet car un HashSet ne contient
        // pas de doublons.

        // 4. Vérifier l'existence d'une ville en utilisant la méthode appropriée

        // 5. Afficher la taille de votre HashSet avant et après la suppression d'une
        // ville donnée

        // 6. Traverser l'ensemble pour afficher les trois premières lettres en
        // majuscules de chacune des villes
        for (String ville : setVilles) {
            System.out.println(ville.substring(0, 3).toUpperCase());
        }
    }
}
