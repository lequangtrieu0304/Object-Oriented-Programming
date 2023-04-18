package entity;

public class GoodStudent extends Student {
    private Double gpa;
    private String bestRewardName;

    public GoodStudent() {
    }

    public GoodStudent(Double gpa, String bestRewardName) {
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }
    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
    @Override
    public void showMyInfo(){
       System.out.println(
               "Ten: " + getFullName() +
               ", Ngay Sinh: " + getDoB() +
               ", Gioi tinh: " + getDoB() +
               ", So Dien Thoai: " + getPhoneNumber() +
               ", Truong THPT: " + getUniversityName() +
               ", GradeLeve: " + getGradeLevel() +
               ", GPA: " + getGpa() +
               ", Giai thuong: " + getBestRewardName()
       );
    }
}
