package Hello;

import java.util.ArrayList;
import java.util.List;

public class Register {
    ArrayList<Student> studentList=new ArrayList<>();
    public void addStudent(Student student){
        studentList.add(student);
    }
    public List getList(){
      return studentList;
    }

    public Student getStudent(int id) {
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }
    public void deleteStudent(Student student){
        studentList.remove(student);

    }



}
