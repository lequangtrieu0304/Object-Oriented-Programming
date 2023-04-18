import entity.GoodStudent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine();
        String doB = sc.nextLine();
        String sex = sc.nextLine();
        String phoneNumber = sc.nextLine();
        String universityName = sc.nextLine();
        String gradeLevel = sc.nextLine();
        String bestRewardName = sc.nextLine();
        double gpa = sc.nextDouble();

        GoodStudent student = new GoodStudent();
        student.setFullName(fullName);
        student.setDoB(doB);
        student.setSex(sex);
        student.setPhoneNumber(phoneNumber);
        student.setUniversityName(universityName);
        student.setGradeLevel(gradeLevel);
        student.setGpa(gpa);
        student.setBestRewardName(bestRewardName);
        student.showMyInfo();
    }
}