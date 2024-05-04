package zad1;

public class employee {

    private String fullName;
    private double salary;

    public employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Pracownik: {" +
                "Imię i nazwisko: '" + fullName + '\'' +
                ", Pensja: " + salary +
                '}';
    }
}

