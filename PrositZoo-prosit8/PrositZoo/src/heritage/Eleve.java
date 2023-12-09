package heritage;

public class Eleve extends Student{
    private String classe;

    public Eleve(String nom, String prenom, int age, String school, String classe) {
        super(nom, prenom, age, school);
        this.classe = classe;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Classe : " + this.classe);
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return this.classe;
    }
}
