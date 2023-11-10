package Lab;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        // 1. Déclaration de l'ArrayList
        ArrayList<String> villes = new ArrayList<>();

        // 3. Insertion d'une nouvelle ville à la troisième position
        villes.add(2, "Tanger");

        // 4. Affichage de la ville à l'indice 4

        // 5. Vérification de l'existence d'une ville dans la liste
        boolean existe = villes.contains("Fès");
        System.out.println("Fès existe-t-il dans la liste ? " + existe);

        // 6. Affichage de l'indice d'une ville donnée
        int indice = villes.indexOf("Marrakech");
        System.out.println("Indice de Marrakech : " + indice);

        // 7. Affichage de la taille de l'ArrayList avant et après la suppression d'une
        // ville

        // 8. Création d'une seconde ArrayList avec les trois premières lettres de
        // chaque ville
        ArrayList<String> nomsCourts = new ArrayList<>();

    }
}
