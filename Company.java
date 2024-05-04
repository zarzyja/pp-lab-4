public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Employee("Jan Kowalski", 3500.00);
        employees[1] = new Manager("Anna Nowak", 4000.00, 3);  // Manager
        employees[2] = new Employee("Piotr Zieliński", 2800.00);
        employees[3] = new Worker("Maria Wiśniewska", 3200.00, "Software Engineer");  // Worker
        employees[4] = new Manager("Krzysztof Górski", 4500.00, 5);  // Manager
        employees[5] = new Worker("Dariusz Baran", 3000.00, "QA");  // Worker
        employees[6] = new Manager("Justyna Sojka", 4200.00, 2);  // Manager

        int nonManagerCount = 0;  // Introduced to count non-manager employees

        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        System.out.println("Number of non-manager employees: " + nonManagerCount);
    }
}

