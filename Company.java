import zad1.employee;

public class Company {

    public static void main(String[] args) {
        employee[] employees = new zad1.employee[5];

        employees[0] = new zad1.employee("Jan Kowalski", 3500.00);
        employees[1] = new Manager("Anna Nowak", 4000.00, 3);  // Manager
        employees[2] = new zad1.employee("Piotr Zieliński", 2800.00);
        employees[3] = new Worker("Maria Wiśniewska", 3200.00, "Software Engineer");  // Worker
        employees[4] = new Manager("Krzysztof Górski", 4500.00, 5);  // Manager

        int nonManagerCount = 0;  // Introduced to count non-manager employees

        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        System.out.println("Number of non-manager employees: " + nonManagerCount);
    }
}
