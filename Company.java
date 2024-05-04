package zad1;

public class Company {

    public static void main(String[] args) {
        employee[] employees = new employee[5];

        employees[0] = new employee("Jan Kowalski", 3500.00);
        employees[1] = new employee("Anna Nowak", 4000.00);
        employees[2] = new employee("Piotr Zieliński", 2800.00);
        employees[3] = new employee("Maria Wiśniewska", 3200.00);
        employees[4] = new employee("Krzysztof Górski", 4500.00);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(4200.00);

        System.out.println("\nDane wszystkich pracowników:");
        for (employee employee : employees) {
            System.out.println(employee);
        }
    }
}
