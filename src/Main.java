import Models.Bill;
import Models.Club;
import Models.Student;
import Models.Subject;
import Models.Class_info;

public class Main {
    public static void main(String[] args) {

        // Classroom details
        Class_info classInfo1 = new Class_info(12, 'A');
        Class_info classInfo2 = new Class_info(6, 'B');
        Class_info classInfo3 = new Class_info(4, 'C');

        // Student details
        Student student1 = new Student("Prinsa Shrestha", 1, 12345, classInfo1);
        Student student2 = new Student("Suraj Ghimire", 2, 67890, classInfo2);
        Student student3 = new Student("Gita Neupane", 3, 456789, classInfo3);

        // Subject details
        Subject math = new Subject(101, "Mathematics", 50, 100, "Mr. Pradan");
        Subject english = new Subject(102, "English", 50, 100, "Ms. Rai");
        Subject nepali = new Subject(103, "Nepali", 50, 100, "Mr. Kafle");

        // Adding subjects to students
        student1.addSubject(math);
        student2.addSubject(english);
        student3.addSubject(nepali);

        // Adding results to students
        student1.addResult(math, 67);
        student2.addResult(english, 52);
        student3.addResult(nepali, 90);

        // Club details
        Club dance = new Club("Dance Club", "Inclusive");
        dance.addStudent(student1);

        Club music = new Club("Music Club", "Exclusive");
        music.addStudent(student2);

        Club science = new Club("Science Club", "Inclusive");
        science.addStudent(student3);

        // Adding bills to students
        Bill bill1 = new Bill(5000, "Tuition Fee");
        Bill bill2 = new Bill(3000, "Library Fee");

        student1.addBill(bill1);
        student2.addBill(bill2);

        // Printing total bill amount for students
        System.out.println("Total Bill for " + student1.getName() + ": " + student1.getTotalBillAmount());
        System.out.println("Total Bill for " + student2.getName() + ": " + student2.getTotalBillAmount());
        System.out.println("Total Bill for " + student3.getName() + ": " + student3.getTotalBillAmount());
    }
}
