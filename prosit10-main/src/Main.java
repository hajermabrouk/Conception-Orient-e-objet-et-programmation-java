import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DepHashSet depHashSet = new DepHashSet();
        Dep dep1 = new Dep(1, "dep1", 10);
        Dep dep2 = new Dep(2, "dep2", 20);
        Dep dep3 = new Dep(3, "dep3", 30);
        Dep dep4 = new Dep(4, "dep4", 40);

        depHashSet.ajouterDepartement(dep1);
        depHashSet.ajouterDepartement(dep2);
        depHashSet.ajouterDepartement(dep3);
        depHashSet.ajouterDepartement(dep4);

        System.out.println("Recherche dep1: " + depHashSet.rechercherDepartement("dep1"));
        System.out.println("Recherche dep5: " + depHashSet.rechercherDepartement("dep5"));

        System.out.println("Recherche dep1: " + depHashSet.rechercherDepartement(dep1));
        System.out.println("Recherche dep5: " + depHashSet.rechercherDepartement(dep4));

        depHashSet.displayDepartement();

        depHashSet.supprimerDepartement(dep1);
        depHashSet.displayDepartement();

        TreeSet<Dep> treeSet = depHashSet.trierDepartementById();

        for (Dep dep : treeSet) {
            System.out.println(dep);
        }

    }
}