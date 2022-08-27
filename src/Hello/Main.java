package Hello;

import java.util.List;
import java.util.Scanner;

public class Main {
    int b=10;
    static int a;
    public static void main(String[] args) {
        Main stud = new Main();
        Register register = new Register();
        register.addStudent(stud.addStudentDetails());
        register.addStudent(stud.addStudentDetails());
        stud.displayDetails(register.getList());
        stud.updateDetails(register);
        stud.displayDetails(register.getList());
        stud.deleteStudent(register);
        stud.displayDetails(register.studentList);
        System.out.println(Main.a);
        System.out.println(stud.b);
    }

    public Student addStudentDetails() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        student.setName(sc.nextLine());
        System.out.println("Enter a id");
        student.setStudentId(sc.nextInt());
        System.out.println("Enter a marks");
        student.setMarks(sc.nextInt());
        return student;

    }

    public void displayDetails(List<Student> List) {
        for (Student printList : List) {
            System.out.println(printList);
        }

    }

    public void updateDetails(Register register) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id update: ");
        int id = scanner.nextInt();
        Student student = register.getStudent(id);
        System.out.println("Enter a name");
        String name = scanner.next();
        student.setName(name);
    }

    public void deleteStudent(Register register) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Id Delete");
        int id = scanner.nextInt();
        Student student =register.getStudent(id);

        register.deleteStudent(student);
    }
}
