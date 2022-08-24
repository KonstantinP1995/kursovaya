public class Main {

    private final static float DEFAULT_MIN_SALARY = 1_000_000;
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Ivanov I.I.", 1, 20000);
        employees[1] = new Employee("Petrov I.I.", 2, 22000);
        employees[2] = new Employee("Sidorov I.I.", 3, 23000);
        employees[3] = new Employee("Svetlov I.I.", 4, 25000);
        employees[4] = new Employee("Puplin I.I.", 5, 45000);

        printEmployee();
        System.out.println(getCalculateSalarySum());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAndCalculateAverageSalary());
        printEmployees();

    }

    public static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }
    }

    public static float getCalculateSalarySum() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }

        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        float minSalary = -1;
        Employee minSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
                index = i;
                break;
            }
            }

        if (minSalaryEmployee == null) {
            return null;
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmployee = employees[i];
                }
            }

        }
        return minSalaryEmployee;

        }


    public static Employee getEmployeeMaxSalary() {
        float maxSalary = -1;
        Employee maxSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                index = i;
                break;
            }
        }

        if (maxSalaryEmployee == null) {
            return null;
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                }
            }

        }
        return maxSalaryEmployee;

    }


    public static float getAndCalculateAverageSalary() {
        float sumSalary = getCalculateSalarySum();
        if (employees.length != 0) {
            return sumSalary / employees.length;
        } else {
            return 0;
        }
    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFio());
            }

        }
    }


    }

