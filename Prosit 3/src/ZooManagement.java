
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = 0;

        while (true) {
            try {
                nbrCages = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Veuillez entrer un nombre valide : ");
            }
        }

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        String message = zooName + " comporte " + nbrCages + " cages.";
        System.out.println(message);


        scanner.close();
    }
}