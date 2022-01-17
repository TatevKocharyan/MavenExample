package education.storages;

import education.model.Student;
import education.util.FileUtil;

import java.util.Set;
import java.util.TreeSet;

public class StudentStorage {
    private Set<Student> students = new TreeSet<>();

    //M
    public void add(Student student) {
        students.add(student);
        FileUtil.serializeStudents(students);
    }


    //M
    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student printBylessonName(String lessonname) {
        for (Student student : students) {
            if(student.getLesson().equals(lessonname)){
                System.out.println(student);
        }

            }
        return null;

        }


    public Student deleteByEmail(String email) {
        for (Student student : students) {
            if(student.getEmail().equals(email)){
                students.remove(student);
                break;
        }


            } FileUtil.serializeStudents(students);
        return null ;
        }

    public void initData() {
        Set<Student> studentSet=FileUtil.deserializeStudents();
        if (studentSet!=null){
            students=students;
        }
    }
}
