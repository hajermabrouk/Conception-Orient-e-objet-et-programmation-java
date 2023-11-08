import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;

@NoArgsConstructor
public class SocieteArrayList implements IGestion<Employee>{
    private ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public void deleteEmployee(Employee e) {
        employees.remove(e);
    }

    @Override
    public boolean findEmployee(Employee e) {
        for (Employee employee : employees) {
            if (employee.equals(e)) return true;
        }
        return false;
    }

    @Override
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void trierEmployeeParId() {
        employees.sort(Comparator.comparingInt(Employee::getId));
    }

    @Override
    public void trierEmployeeParDepNameEtGrade() {
        employees.sort(Comparator.comparing(Employee::getDepName).thenComparing(Employee::getGrade));
    }
}
