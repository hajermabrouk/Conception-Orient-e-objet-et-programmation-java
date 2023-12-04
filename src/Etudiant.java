public class Etudiant {
    // Attributs
    private int id;
    private String nom;
    private int age;

    // Constructeur sans paramètre
    public Etudiant() {
        // Initialisation par défaut
        this.id = 0;
        this.nom = "";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    // Getters & Setters pour id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters & Setters pour nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getters & Setters pour age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
