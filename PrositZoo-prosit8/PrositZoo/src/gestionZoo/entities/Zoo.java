package gestionZoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name, city;
    private final int nbrCages=10;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (searchAnimal(animal) != -1)
            throw new ZooFullException("Animal already exists");
        if (nbrAnimals == nbrCages)
            throw new ZooFullException("Zoo is full");
        if (isZooFull(nbrAnimals))
            throw new ZooFullException("Zoo is full");
        if (animal.getAge()<=0)
            throw new InvalidAgeException("Age must be positive");
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull(int nbrAnimals){
        if (nbrAnimals<this.nbrCages){
            return false;
        }else return true;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals>z2.nbrAnimals){
            return z1;
        }else return null;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i]==null){
                aquaticAnimals[i]=aquatic;
                break;
            }
        }
    }

    public float maxPenguinSwimmingDepth(){
        Penguin[] tabP = new Penguin[25];
        for (Animal an:animals) {
            if (an instanceof Penguin){
                for (int i = 0; i < tabP.length; i++) {
                    if (tabP[i]==null){
                        tabP[i]=(Penguin) an;
                        break;
                    }
                }
            }
        }
        float max = tabP[0].getSwimmingDepth();
        for (Penguin p:tabP){
            if (p!=null){

                if (p.getSwimmingDepth()>max){
                    max=p.getSwimmingDepth();
                }
            }
        }
        return max;

    }

    public String displayNumberOfAquaticsByType(){
        int numDolphins = 0;
        int numPenguins = 0;

        for (Animal an:animals) {
            if(an != null){
                if (an instanceof Dolphin){
                    numDolphins++;
                }
                if (an instanceof Penguin){
                    numPenguins++;
                }
            }
        }


        String table = "------------------------\n";
        table += String.format("| %-15s | %-15s |\n", "Number of Dolphins", "Number of Penguins");
        table += String.format("| %-18s | %-18s |\n", numDolphins, numPenguins);
        table += "------------------------\n";
        return table;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }
}


