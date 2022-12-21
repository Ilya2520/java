package prac6;

public class Student {
    String name;
    String surname;
    int idNumber;
    int Gpa;

    public Student(String name, String surname, int idNumber, int Gpa) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.Gpa = Gpa;
    }

    public int getGpa() {
        return Gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idNumber=" + idNumber +
                ", Gpa=" + Gpa +
                '}';
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(int gpa) {
        Gpa = gpa;
    }
}
