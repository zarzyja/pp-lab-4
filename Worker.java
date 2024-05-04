package zad2;

import zad1.employee;

public class Worker extends employee {

    public String position;

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker: {" +
                "fullName='" + getFullName() + '\'' +
                ", salary=" + getSalary() +
                ", position='" + position + '\'' +
                '}';
    }
}
