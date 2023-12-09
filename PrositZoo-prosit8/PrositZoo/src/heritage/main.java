package heritage;

public class main {
    public static void main(String[] args) {
        Personne p = new Personne("Dupont", "Jean", 20);
        p.afficher();
        System.out.println();

        Student s = new Student("Dupont", "Jean", 20, "ECE");
        s.afficher();
        System.out.println();

        Eleve e = new Eleve("Dupont", "Jean", 20, "ECE", "E1");
        e.afficher();
        System.out.println();

        Personne p2 = new Student("Dupont", "Jean", 20 , "ECE");
        p2.afficher();
        System.out.println();

        Personne p3 = new Eleve("Dupont", "Jean", 20, "ECE", "E1");
        p3.afficher();
        System.out.println();

        Student s2 = new Eleve("Dupont", "Jean", 20, "ECE", "E1");
        s2.afficher();
        System.out.println("--------------------------------------------------");

         /*Eleve e2 = (Eleve) new Student("Dupont", "Jean", 20, "ECE");
         e2.afficher();
         System.out.println();*/

    }
}
