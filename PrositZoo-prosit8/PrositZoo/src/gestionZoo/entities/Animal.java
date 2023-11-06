package gestionZoo.entities;

public sealed class Animal permits Aquatic, Terrestrial {

    private String family, name;
    private int age;
    private boolean isMammal;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "gestionZoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>0){
            this.name = name;
        }else System.out.println("Name must be at least 1 character long");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        /*if (age>0){
            this.age = age;
        }else System.out.println("Age must be positive");*/
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
