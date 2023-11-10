package Lab.Map;

// Définition de la classe Etudiant
class Etudiant {
    private String code;
    private String nom;
    private int age;

    public Etudiant(String code, String nom, int age) {
        this.code = code;
        this.nom = nom;
        this.age = age;
    }

    // Accesseurs et mutateurs
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Méthode toString pour obtenir une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "Etudiant{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
