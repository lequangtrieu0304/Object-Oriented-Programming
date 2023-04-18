package test;

import student.Student;
import student.Impl.StudentServiceImpl;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServiceImpl studentService = new StudentServiceImpl();
        int choose = 0;
        do {
            System.out.println("Welcome");
            System.out.println("1.Them sinh vien");
            System.out.println("2.Hien thi tat ca sinh vien");
            System.out.println("3.Xoa sinh vien");
            System.out.println("4.Tim sinh vien theo ID");
            System.out.println("5.Cap nhat sinh vien");
            System.out.println("6.Loc sinh vien gioi");
            System.out.println("7.Loc sinh vien kha");
            System.out.println("8.Loc sinh vien kem");
            System.out.println("9.Loc sinh vien ten");

            System.out.println("0.Thoat");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1: {
                    System.out.println("Nhap ID: ");
                    Integer id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine().trim();

                    System.out.println("Nhap dia chi");
                    String address = sc.nextLine();

                    System.out.println("Nhap diem toan");
                    float diemToan = sc.nextFloat();

                    System.out.println("Nhap diem ly");
                    float diemLy = sc.nextFloat();

                    System.out.println("Nhap diem hoa");
                    float diemHoa = sc.nextFloat();

                    Student student = new Student(id, name, address, diemToan, diemLy, diemHoa);
                    studentService.createStudent(student);

                    break;
                }
                case 2: {
                    studentService.getAllStudents();
                    break;
                }
                case 3: {
                    System.out.println("Nhap ID: ");
                    Student student = null;
                    while(Objects.isNull(student)){
                        Integer id = sc.nextInt();
                        student = studentService.findById(id);
                        if(student != null){
                            boolean result = studentService.delete(id);
                            System.out.println("Deleted: " + result);
                        }
                        else {
                            System.out.println("Khong ton tai sinh vien co Id " + id + ", nhap lai: ");
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhap ID: ");
                    Student student = null;
                    while(Objects.isNull(student)){
                        Integer id = sc.nextInt();
                        student = studentService.findById(id);
                        if(student != null){
                            student.showInfo();
                        }
                        else {
                            System.out.println("Khong ton tai sinh vien co Id " + id + ", nhap lai: ");
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Nhap ID: ");
                    Student student = null;
                    while(Objects.isNull(student)){
                        Integer id = sc.nextInt();
                        student = studentService.findById(id);
                        sc.nextLine();
                        if(student != null){
                            System.out.println("Nhap ten: ");
                            String name = sc.nextLine().trim();

                            System.out.println("Nhap dia chi");
                            String address = sc.nextLine();

                            System.out.println("Nhap diem toan");
                            float diemToan = sc.nextFloat();

                            System.out.println("Nhap diem ly");
                            float diemLy = sc.nextFloat();

                            System.out.println("Nhap diem hoa");
                            float diemHoa = sc.nextFloat();
                            Student updateStudent = new Student(id, name, address, diemToan, diemLy, diemHoa);
                            String result = studentService.update(student, updateStudent);
                            System.out.println(result);
                        }
                        else {
                            System.out.println("Khong ton tai sinh vien co Id " + id + ", nhap lai: ");
                        }
                    }
                    break;
                }
                case 6: {
                    studentService.getAllStudents(studentService.goodStudent());
                    break;
                }
                case 7: {
                    studentService.getAllStudents(studentService.normalStudent());
                    break;
                }
                case 8: {
                    studentService.getAllStudents(studentService.badStudent());
                    break;
                }
                case 9: {
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    studentService.getAllStudents(studentService.findByName(name));
                    break;
                }
                case 0: {
                    return;
                }
            }
        }while (choose != 0);
    }
}