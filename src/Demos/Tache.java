package Demos;

class Tache implements Comparable<Tache> {
    private String nom;
    private int priorite;

    public Tache(String nom, int priorite) {
        this.nom = nom;
        this.priorite = priorite;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int compareTo(Tache autreTache) {
        return this.priorite - autreTache.priorite;
    }

}