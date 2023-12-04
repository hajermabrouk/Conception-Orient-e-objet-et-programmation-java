public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SocieteArrayList societe = new SocieteArrayList();
        Employee e1 = new Employee(1, "ermùkm", "erùlk", "IT", 1);
        Employee e2 = new Employee(2, "apieh", "ùyerlk", "erlk", 2);
        Employee e3 = new Employee(3, "rarar", "ùlmkyer", "IT", 3);

        societe.addEmployee(e1);
        societe.addEmployee(e2);
        societe.addEmployee(e3);

        System.out.println("Before sorting:");
        societe.displayEmployees();
        System.out.println("After sorting by id:");
        societe.trierEmployeeParId();
        societe.displayEmployees();
        System.out.println("After sorting by depName and grade:");
        societe.trierEmployeeParDepNameEtGrade();
        societe.displayEmployees();
    }
}