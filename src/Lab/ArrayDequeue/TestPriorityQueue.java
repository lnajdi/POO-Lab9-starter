package Lab.ArrayDequeue;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        // Création d'une PriorityQueue pour gérer les tâches selon leur priorité.
        PriorityQueue<Tache> taches = new PriorityQueue<>();

        // Ajout de tâches à la file avec différentes priorités.
        taches.add(new Tache("Lire les emails", 2));
        taches.add(new Tache("Rédiger un rapport", 1));
        taches.add(new Tache("Participer à une réunion", 3));

        // Traiter la tâche avec la plus haute priorité et la retirer de la file.
        Tache tacheCourante = ;
        System.out.println("Tâche en cours de traitement : " + tacheCourante.getNom());

        // Afficher la prochaine tâche à traiter sans la retirer de la file.
        Tache prochaineTache = taches.peek();
        if (prochaineTache != null) { // Vérifier si la file n'est pas vide avant de peek.
            System.out.println("Prochaine tâche à traiter : " + prochaineTache.getNom());
        }

        // Vérifier si la file de priorités est vide.
        boolean fileEstVide = ;
        System.out.println("La file est-elle vide? " + fileEstVide);

        // Traiter toutes les tâches restantes jusqu'à ce que la file soit vide.
        while (!taches.isEmpty()) {
            Tache tacheATraiter = taches.poll();
            System.out.println("Traitement de la tâche : " + tacheATraiter);
        }
    }
}
