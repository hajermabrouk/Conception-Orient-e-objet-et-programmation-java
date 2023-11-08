public interface IGestion<T> {
    public void addEmployee(T e);
    public void deleteEmployee(T e);
    public boolean findEmployee(T e);
    public void displayEmployees();
    public void trierEmployeeParId();
    public void trierEmployeeParDepNameEtGrade();
}
