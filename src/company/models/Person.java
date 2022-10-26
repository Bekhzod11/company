package company.models;

public abstract class Person {
private String lastName;
private String firstName;
private String patron;
private String birthday;
private String gender;

    public Person(String lastName, String firstName, String patron, String birthday, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patron = patron;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patron='" + patron + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
