public class Zoo {
    private static final int MAX_CAGES = 25;
    private String zooName;
    private int nbrCages;
    private int nbrAnimaux;

    public Zoo(String zooName) {
        this.zooName = zooName;
        this.nbrCages = MAX_CAGES;
        this.nbrAnimaux = 0;
    }

    public Zoo(String monZoo, String maVille, int i) {
    }

    public void afficherMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages et contient " + nbrAnimaux + " animaux");
    }

    public boolean isZooFull() {
        return nbrAnimaux == nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNbrAnimaux() > z2.getNbrAnimaux()) {
            return z1;
        } else if (z2.getNbrAnimaux() > z1.getNbrAnimaux()) {
            return z2;
        } else {
            return z1;
        }
    }


    public int getNbrAnimaux() {
        return nbrAnimaux;
    }

    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo A");
        zoo1.afficherMessage();
        zoo1.nbrAnimaux = 15;

        Zoo zoo2 = new Zoo("Zoo B");
        zoo2.afficherMessage();
        zoo2.nbrAnimaux = 20;

        Zoo zooAvecPlusAnimaux = comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecPlusAnimaux.zooName);
    }

    public void addAnimal(Animal lion) {
    }

    public void displayAnimals() {
    }

    public void removeAnimal(Animal animalToRemove) {
    }
}