package main;
import entities.*;


import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Employe employe1 = new Employe(1, "nawres", "ellafi", "gestion", 3);
        Employe employe2 = new Employe(2, "nana", "eeeee", "IT", 5);
        Employe employe3 = new Employe(3, "nnn", "ee", "bb", 4);

        IGestion<Employe> employes = new SocieteArrayList();
        employes.ajouterEmploye(employe1);
        employes.ajouterEmploye(employe2);
        employes.ajouterEmploye(employe3);
        employes.rechercherEmploye("nawres");
        employes.rechercherEmploye("nawres1");
        employes.rechercherEmploye(employe2);
        employes.supprimerEmploye(employe3);
        employes.displayEmploye();
        employes.trierEmployeParId();
        employes.displayEmploye();  // affichage trie par id
        employes.trierEmployeParNomDépartementEtGrade();
        employes.displayEmploye();    //affichage trie par nomdep et grade
         // Prosit 10
         Departement departement1 = new Departement(1,"info",10);
        Departement departement2 = new Departement(2,"gestion",18);
        Departement departement3 = new Departement(3,"etudiants",100);
        Departement departement4 = new Departement(10,"profs",40);

        IDepartement<Departement> gestiondep = new DepartementHashSet();

        gestiondep.ajouterDepartement(departement1);
        gestiondep.ajouterDepartement(departement2);
        gestiondep.ajouterDepartement(departement3);
        gestiondep.ajouterDepartement(departement4);
        gestiondep.displayDepartement();
        System.out.println(gestiondep.rechercherDepartement("info"));
        System.out.println(gestiondep.rechercherDepartement(departement1));
        gestiondep.supprimerDepartement(departement2);
        System.out.println("La liste aprés suppression :");
        gestiondep.displayDepartement();
        System.out.println("La liste triée est:");
        System.out.println(gestiondep.trierDepartementById());
    }
}