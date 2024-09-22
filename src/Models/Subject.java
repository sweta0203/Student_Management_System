package Models;

public class Subject {
    int subject_id;
    String name;
    int pass_marks;
    int full_marks;
    String teacher;

    // getter and setter
    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass_marks() {
        return pass_marks;
    }

    public void setPass_marks(int pass_marks) {
        this.pass_marks = pass_marks;
    }

    public int getFull_marks() {
        return full_marks;
    }

    public void setFull_marks(int full_marks) {
        this.full_marks = full_marks;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    // Constructor
    public Subject(int subject_id, String name, int pass_marks, int full_marks, String teacher) {
        this.subject_id = subject_id;
        this.name = name;
        this.pass_marks = pass_marks;
        this.full_marks = full_marks;
        this.teacher = teacher;




    }
}
