public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 10);

        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidae", "Éléphant", 15, true);
        Animal giraffe = new Animal("Giraffidae", "Girafe", 8, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);

        System.out.println("Animaux dans le zoo avant suppression :");
        myZoo.displayAnimals();

        Animal animalToRemove = new Animal("", "Lion", 0, false);
        myZoo.removeAnimal(animalToRemove);
        
        System.out.println("\nAnimaux dans le zoo après suppression :");
        myZoo.displayAnimals();
    }
}