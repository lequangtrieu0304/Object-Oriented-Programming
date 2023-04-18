package entity;

import exception.InvalidFullNameException;

public abstract class Student {
    private String fullName;
    private String doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;
    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName){
        try {
            if(fullName.length() >= 50 || fullName.length() <= 10) {
               throw new InvalidFullNameException("Ten khong hop le");
            }
            this.fullName = fullName;
        }
        catch (InvalidFullNameException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public abstract void showMyInfo();
}
