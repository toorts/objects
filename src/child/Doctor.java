package child;

import parent.Human;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human {
    private String grade;
    private int age;

    public Doctor(String name, String grade, int age) {
        super(name);
        this.grade = grade;
        this.age = age;
    }

    public Doctor(String name, String grade) {
        super(name);
        this.grade = grade;
    }

    public Doctor(String name) {
        super(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String grade) {
        this.grade = grade;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public void heal() {
    }

    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        for (Doctor doctor : doctors) {
            doctors.add((Doctor) doctor);
        }
        return doctors;
    }

    @Override
    public String toString() {
        return String.format("Name : %s, Grade : %s\n", this.getName(), this.grade);
    }
}
