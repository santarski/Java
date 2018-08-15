package pawelsiwek.java.basic.opp.exercise4;

public class Employee {
    private String name;
    private String surname;
    private int yearOfBird;
    private int seniority;

    public Employee() {
    }

    public Employee(String name, String surname, int yearOfBird, int seniority) {
        this.name = name;
        this.surname = surname;
        this.yearOfBird = yearOfBird;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBird() {
        return yearOfBird;
    }

    public void setYearOfBird(int yearOfBird) {
        this.yearOfBird = yearOfBird;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
