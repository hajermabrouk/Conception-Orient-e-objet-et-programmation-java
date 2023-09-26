import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

    public ZooManagement() {
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Entrez le nombre de cages : ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages >= 0) {
                    break;
                } else {
                    System.out.println("Le nombre de cages ne peut pas être négatif.");
                }
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.next();
            }
        } while (true);

        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.next();

        scanner.close();
    }

    public void afficherMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public static void main(String[] args) {
        ZooManagement gestionnaireZoo = new ZooManagement();
        gestionnaireZoo.afficherMessage();
    }
}