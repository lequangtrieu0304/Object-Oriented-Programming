package student.Impl;

import student.Student;
import student.StudentService;
import student.StudentService2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService, StudentService2 {
    static private final List<Student> studentList = new ArrayList<>();
    @Override
    public void createStudent(Student student) {
        studentList.add(student);
    }
    @Override
    public Student findById(Integer id) {
       return studentList
               .stream()
               .filter(e -> e.getId().equals(id))
               .findFirst()
               .orElse(null);
    }

    @Override
    public List<Student> findByName(String name) {
        return studentList
                .stream()
                .filter(student -> student.getName().toLowerCase().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public void getAllStudents() {
        if(studentList.size() == 0){
            System.out.println("Danh sach trong");
        }
        else {
            for(Student student : studentList){
                student.showInfo();
            }
        }
    }
    @Override
    public void getAllStudents(List<Student> studentList) {
        if(studentList.size() == 0){
            System.out.println("Danh sach trong");
        }
        else {
            for(Student student : studentList){
                student.showInfo();
            }
        }
    }
    @Override
    public boolean delete(Integer id) {
        return studentList.removeIf(s -> s.getId().equals(id));
    }

    @Override
    public String update(Student student, Student updateStudent) {
        student.setName(updateStudent.getName());
        student.setAddress(updateStudent.getAddress());
        student.setDiemToan(updateStudent.getDiemToan());
        student.setDiemLy(updateStudent.getDiemLy());
        student.setDiemHoa(updateStudent.getDiemHoa());
        return "Updated";
    }

    @Override
    public List<Student> goodStudent() {
        return studentList
                .stream()
                .filter(student -> student.getDtb() >= 8.5)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> normalStudent() {
        return studentList
                .stream()
                .filter(student -> student.getDtb() >= 6.5 && student.getDtb() < 8.5)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> badStudent() {
        return studentList
                .stream()
                .filter(student -> student.getDtb() < 6.5)
                .collect(Collectors.toList());
    }
}
