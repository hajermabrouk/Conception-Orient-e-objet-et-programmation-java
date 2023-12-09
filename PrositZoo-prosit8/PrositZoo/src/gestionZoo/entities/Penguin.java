package gestionZoo.entities;

public class Penguin extends Terrestrial{
    private float swimmingDepth;

    public Penguin(){}

    public Penguin(String family,String name,int age,boolean isMammal,int nbrLegs,float swimmingDepth){
        super(family,name,age,isMammal,nbrLegs);
        this.swimmingDepth=swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString(){
        return super.toString() + "swimmingDepth: " + swimmingDepth;
    }
}
