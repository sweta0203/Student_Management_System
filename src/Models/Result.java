package Models;

public class Result {
    Subject subject;
    int marks;

    // getter and setter
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Constructor
    public Result(Subject subject, int marks) {
        this.subject = subject;
        this.marks = marks;



    }
}
