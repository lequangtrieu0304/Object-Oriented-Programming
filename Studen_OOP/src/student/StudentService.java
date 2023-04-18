package student;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);
    Student findById(Integer id);
    List<Student> findByName(String name);
    void getAllStudents();
    void getAllStudents(List<Student> studentList);
    boolean delete(Integer id);
    String update(Student student, Student updateStudent);
}
