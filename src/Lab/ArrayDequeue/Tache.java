package Lab.ArrayDequeue;

// Classe Tache qui implémente l'interface Comparable pour définir l'ordre de priorité.
class Tache implements Comparable<Tache> {
    private String nom;
    private int priorite;

    // Constructeur de la classe Tache.
    public Tache(String nom, int priorite) {
        this.nom = nom;
        this.priorite = priorite;
    }

    // Getter pour obtenir le nom de la tâche.
    public String getNom() {
        return nom;
    }

    // Getter pour obtenir la priorité de la tâche.
    public int getPriorite() {
        return priorite;
    }

    // Méthode compareTo pour comparer les tâches en fonction de leur priorité.
    // Utilisation de Integer.compare pour éviter le dépassement de capacité.
    @Override
    public int compareTo(Tache autreTache) {
        return Integer.compare(this.priorite, autreTache.priorite);
    }

    // Redéfinition de la méthode toString pour afficher le nom de la tâche.
    @Override
    public String toString() {
        return nom + " (Priorité: " + priorite + ")";
    }
}
