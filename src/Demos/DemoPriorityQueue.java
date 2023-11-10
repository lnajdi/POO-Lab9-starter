package Demos;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

    public static void main(String[] args) {
        // Création de la PriorityQueue
        PriorityQueue<Tache> taches = new PriorityQueue<>();

        // Ajout des tâches à la file
        taches.add(new Tache("Lire les emails", 2));
        taches.add(new Tache("Rédiger un rapport", 1));
        taches.add(new Tache("Participer à une réunion", 3));

        // Traitement des tâches selon leur priorité
        while (!taches.isEmpty()) {
            Tache tache = taches.poll();
            System.out.println("Traitement de la tâche: " + tache.getNom());
        }
    }

}
