public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getter pour la famille
    public String getFamily() {
        return family;
    }

    // Getter pour le nom de l'animal
    public String getName() {
        return name;
    }

    // Getter pour l'âge de l'animal
    public int getAge() {
        return age;
    }

    // Getter pour savoir si l'animal est un mammifère
    public boolean isMammal() {
        return isMammal;
    }

    // Setter pour la famille
    public void setFamily(String family) {
        this.family = family;
    }

    // Setter pour le nom de l'animal
    public void setName(String name) {
        this.name = name;
    }

    // Setter pour l'âge de l'animal
    public void setAge(int age) {
        this.age = age;
    }

    // Setter pour savoir si l'animal est un mammifère
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    // Méthode pour afficher les informations de l'animal
    public void displayAnimal() {
        System.out.println("Famille : " + family);
        System.out.println("Nom : " + name);
        System.out.println("Âge : " + age);
        System.out.println("Est un mammifère : " + isMammal);
    }

    // Méthode toString() pour une représentation textuelle de l'animal
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}