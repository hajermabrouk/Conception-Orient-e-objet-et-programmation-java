package heritage;

public class Student extends Personne{
    private String school;

    public Student(String nom, String prenom, int age, String school) {
        super(nom, prenom, age);
        this.school = school;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Ecole : " + this.school);
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }
}
