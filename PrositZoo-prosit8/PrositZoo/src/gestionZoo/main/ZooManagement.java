package gestionZoo.main;

import gestionZoo.entities.*;

import java.util.Arrays;

public class ZooManagement {

    public static void main(String[] args) throws ZooFullException, InvalidAgeException {
        //PROSIT 2
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setAnimals(new Animal[myZoo.getNbrCages()]);


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println("///////" + myZoo.isZooFull(myZoo.getNbrAnimals()));
        Zoo ze = new Zoo("kjel", "kjeflk");
        System.out.println("*****" + Zoo.compareZoo(myZoo, ze));

        System.out.println("---------------------------------------------------------------------------");


        Dolphin d1 = new Dolphin("Dolphin", "D1", 2, true, "Atlantic", 2);

        System.out.println(d1.toString());

        Aquatic a1 = new Dolphin("Aquatic", "A1", 2, true, "Atlantic",45);
        Penguin p1 = new Penguin("Penguin", "P1", 2, true, 8, 8);

        d1.swim();
        a1.swim();
        //p1.swim();

        myZoo.addAquaticAnimal(a1);
        System.out.println(Arrays.toString(myZoo.getAquaticAnimals()));

        System.out.println("**********************************************************************");

        Animal aa = new Animal("Canine", "Snoopy", 2, true);
        Penguin pp = new Penguin("erloj", "zemrjezlk", 2, true, 8, 2);
        myZoo.addAnimal(aa);
        System.out.println(myZoo.getNbrAnimals());
        myZoo.addAnimal(pp);
        System.out.println(myZoo.getNbrAnimals());
        myZoo.addAnimal(p1);
        System.out.println(myZoo.getNbrAnimals());
        myZoo.addAnimal(d1);
        System.out.println(myZoo.getNbrAnimals());
        System.out.println(Arrays.toString(myZoo.getAnimals()));

        System.out.println( myZoo.maxPenguinSwimmingDepth());


        System.out.println(myZoo.displayNumberOfAquaticsByType());

        Aquatic aq1 = new Dolphin("Aquatic", "A1", 2, true, "Atlantic",45);
        Aquatic aq2 = new Dolphin("Aquatic", "A1", 2, true, "Atlantic",45);
        System.out.println(aq1.equals(aq1,aq2));

        System.out.println("---------------------------------------------------------------------------");
        Terrestrial t1 = new Terrestrial("Terrestrial", "T1", 2, true, 2);
        t1.eatPlantAndMeet(Food.PLANT);
        a1.eatMeat(Food.MEAT);

    }


}
