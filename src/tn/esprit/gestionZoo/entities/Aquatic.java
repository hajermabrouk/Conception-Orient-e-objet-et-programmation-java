package tn.esprit.gestionZoo.entities;

<<<<<<< HEAD
public non-sealed abstract  class  Aquatic extends Animal implements Carnivore<Food>{
=======
public non-sealed abstract class  Aquatic extends Animal{
>>>>>>> 2881431055b6b1c96834f421134087235c4dc839

   protected String habitat ;
   public Aquatic(){}
    public abstract void swim();  // instruction 28
  public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
       super(family,name,age,isMammal);
       this.habitat=habitat;
   }

    //instruction 23
   @Override
    public String toString() {
        return super.toString()+" " +habitat;
    }
    // instruction 24
    /* public void swim(){
        System.out.println("This aquatic animal is swimming.");
    } */
    //instruction 31
    public boolean equals(Object object) {
        if (this == object) return true;
        if (null == object || getClass() != object.getClass()) return false;
        Aquatic aquatic =(Aquatic) object;
        return getAge() == aquatic.getAge() && getName().equals(aquatic.getName()) && habitat.equals(aquatic.habitat) ;

    }
<<<<<<< HEAD
    @Override
    public void eatMeat(Food meat){
        if(meat.equals(Food.MEAT))
            System.out.println("Aquatic animal est carnivore");
        else
            System.out.println("Aquatic animal n'est pas carnivore");
    }
=======
>>>>>>> 2881431055b6b1c96834f421134087235c4dc839
}




