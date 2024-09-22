package Models;

public class Class_info {
    int grade;
    char section;

    // Constructor
    public Class_info(int grade, char section) {
        this.grade = grade;
        this.section = section;
    }

    //  getter and setter
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public char getSection() {
        return section;
    }
    public void setSection(char section) {
        this.section = section;
    }

}
