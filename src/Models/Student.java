package Models;

import java.util.ArrayList;

public class Student {
    String name;
    int studentId;
    int enrollment;
    Class_info classInfo;
    ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<Result> results = new ArrayList<>();
    ArrayList<Club> clubs = new ArrayList<>();
    ArrayList<Bill> bills = new ArrayList<>();

    // Constructor
    public Student(String name, int studentId, int enrollment, Class_info classInfo) {
        this.name = name;
        this.studentId = studentId;
        this.enrollment = enrollment;
        this.classInfo = classInfo;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public Class_info getClassInfo() {
        return classInfo;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public ArrayList<Club> getClubs() {
        return clubs;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    // Add subject to student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Add result to student
    public void addResult(Subject subject, int marks) {
        Result result = new Result(subject, marks);
        results.add(result);
    }

    // Add club to student
    public void joinClub(Club club) {
        clubs.add(club);
    }

    // Add bill to student
    public void addBill(Bill bill) {
        bills.add(bill);
    }

    // Get total bill amount
    public double getTotalBillAmount() {
        double total = 0;
        for (Bill bill : bills) {
            total += bill.getAmount();
        }
        return total;
    }
}
