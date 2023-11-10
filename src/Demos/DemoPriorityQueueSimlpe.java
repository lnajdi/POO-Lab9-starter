package Demos;

import java.util.PriorityQueue;

public class DemoPriorityQueueSimlpe {
    public static void main(String[] args) {
        // Création de la PriorityQueue
        PriorityQueue<String> taches = new PriorityQueue<>();

        // Ajout d'éléments
        taches.add("Rédiger un rapport");

        // Visualiser sans retirer le premier élément
        String tache = taches.peek();
        System.out.println("Prochaine tâche à faire: " + tache);

        // Retirer le premier élément
        String tacheTerminee = taches.poll();
        System.out.println("Tâche terminée: " + tacheTerminee);

        // Taille de la queue
        int taille = taches.size();
        System.out.println("Nombre de tâches restantes: " + taille);

        // Vérifier si la queue est vide
        boolean estVide = taches.isEmpty();
        System.out.println("La liste de tâches est-elle vide? " + estVide);
    }
}
