package gestionZoo.entities;

import Interface.Omnivore;

public non-sealed class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(){
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public String toString(){
        return super.toString() + "nbrLegs: " + nbrLegs;
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("I eat " + food);
    }
}
