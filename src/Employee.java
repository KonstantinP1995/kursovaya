public class Employee {
    private final int id;
    private String fio;
    private int department;
    private float salary;
    private static int counter;


    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment(int i) {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public String toString() {
        return "id: " + id + " fio: " + fio + " department: " + " salary: " + salary;
    }


}


