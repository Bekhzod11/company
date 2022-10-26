package company.models;

public class Employee extends Person {
private Section section;
private Position position;
private double salary;

    public Employee(String lastName, String firstName, String patron, String birthday, String gender, Section section, Position position, double salary) {
        super(lastName, firstName, patron, birthday, gender);
        this.section = section;
        this.position = position;
        this.salary = salary;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "section=" + section +
                super.toString() +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
