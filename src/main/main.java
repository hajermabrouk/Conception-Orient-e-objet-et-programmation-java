package main;
import entities.*;


import java.util.*;
import java.util.function.Consumer;

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

        AffectationHashMap map=new AffectationHashMap();
        map.ajouterEmployeDepartement(employe1,departement1);
        System.out.println("Map employés et Départements");
        map.afficherEmployesEtDepartements();
        map.ajouterEmployeDepartement(employe1,departement4);
        System.out.println("Map employés et Départements aprés mise à jour ");
        map.afficherEmployesEtDepartements();
        System.out.println("liste des departements");
        map.afficherDepartements();
        System.out.println("liste des employés");
        map.afficherEmployes();
        map.ajouterEmployeDepartement(employe2,departement4);
        map.supprimerEmploye(employe2);
        map.supprimerEmployeEtDepartement(employe2,departement1);
        System.out.println(map.rechercherEmploye(employe1));
        System.out.println(map.rechercherDepartement(departement1));
        map.ajouterEmployeDepartement(employe2,departement4);
        System.out.println("map des départements et employés");
        System.out.println(map.trierMap());
      
        StudentManagement studentManagement = new StudentManagement();
        List <Etudiant>students=new ArrayList<>();
        Etudiant etd1=new Etudiant(100,21,"Nawres");
        Etudiant etd2=new Etudiant(20,20,"Sarra");
        Etudiant etd3=new Etudiant(35,22,"Amir");
        Etudiant etd5=studentManagement.createStudent(()->new Etudiant(12,28,"nnnn"));
        students.add(etd1);
        students.add(etd2);
        students.add(etd3);
        students.add(etd5);
        System.out.println("la liste des étudiants");
        studentManagement.displayStudents(students, (Etudiant etd)-> System.out.println(etd.toString()));
        System.out.println("la liste des étudiants selon leurs id");
        studentManagement.displayStudentsByFilter(students,(Etudiant etd)->etd.getId()>40, (Etudiant etd)->System.out.println(etd.toString()));
        System.out.println("Liste des noms des etudiants");
        System.out.println(studentManagement.returnStudentsNames(students,(Etudiant etd) -> etd.getNom()));
        System.out.println("Liste des etudiants triée selon l'age ");
        List<Etudiant> listeSorted=studentManagement.sortStudentsById(students, (Etudiant etd6,Etudiant etd7)-> etd6.getAge()- etd7.getAge());
        System.out.println(listeSorted);
        studentManagement.convertToStream(students);

    }
}
