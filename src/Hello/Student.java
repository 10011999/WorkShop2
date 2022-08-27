package Hello;

import java.util.Objects;

public class Student {
    public String Name;
    public int studentId;
    public int marks;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + Name + '\'' +
                ", studentId=" + studentId +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(),getMarks());
    }
}
