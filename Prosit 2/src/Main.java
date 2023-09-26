public class Main {
    public static void main(String[] args) {
        // Création du zoo
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 10);

        // Ajout d'animaux
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidae", "Éléphant", 15, true);
        Animal giraffe = new Animal("Giraffidae", "Girafe", 8, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);

        // Affichage des animaux du zoo
        System.out.println("Animaux dans le zoo avant suppression :");
        myZoo.displayAnimals();

        // Suppression d'un animal par son nom
        Animal animalToRemove = new Animal("", "Lion", 0, false);
        myZoo.removeAnimal(animalToRemove);

        // Affichage des animaux du zoo après suppression
        System.out.println("\nAnimaux dans le zoo après suppression :");
        myZoo.displayAnimals();
    }
}