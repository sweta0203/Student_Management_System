package Models;

import java.util.ArrayList;

public class Club {
    String name;
    String type;
    ArrayList<Student> students = new ArrayList<>();

    // Constructor
    public Club(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // Add a student to the club
    public void addStudent(Student student) {
        students.add(student);
    }
}
