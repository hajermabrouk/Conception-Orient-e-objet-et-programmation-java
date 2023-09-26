import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= nbrCages) {
            System.out.println("Le zoo est plein, impossible d'ajouter un nouvel animal.");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo.");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }

        System.out.println("L'animal " + animal.getName() + " n'a pas été trouvé dans le zoo.");
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i].getName());
        }
    }

    public int searchAnimal(String animalName) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animalName)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}