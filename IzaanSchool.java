package javaQuiz4;


import java.util.Scanner;

public class IzaanSchool {

    private String fullName;
    private String email;
    private long phoneNumber;
    private String course;
    private String role;
    private int fee;


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCourse(String course) {
        if (course.equalsIgnoreCase("QA") || course.equalsIgnoreCase("DevOps") || course.equalsIgnoreCase("Data Analyst"))
            this.course = course;
        else System.out.println("Invalid course");
    }

    public void setRole(String role) {
        if (role.equalsIgnoreCase("teacher") || role.equalsIgnoreCase("student"))
        this.role = role;
        else System.out.println("Invalid role");
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    public String getRole() {
        return role;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter your plan");
        String plan = ali.next();
        if (plan.equalsIgnoreCase("plan1")){
            this.fee=7200;
        } else if (plan.equalsIgnoreCase("Plan2")) {
            this.fee=7600;
        } else if (plan.equalsIgnoreCase("Plan3")) {
            this.fee=8000;
        }else {
            System.out.println("Invalid plan");

        }




    }

    public static void main(String[] args) {
        IzaanSchool izaanSchool = new IzaanSchool();
        izaanSchool.setFullName("Leon Subhan");
        izaanSchool.setEmail("leonsubhan@outlook.com");
        izaanSchool.setPhoneNumber(5615770000L);
        izaanSchool.setCourse("QA");
        izaanSchool.setRole("Student");
        izaanSchool.setFee(0);

        System.out.println(izaanSchool.getFullName());
        System.out.println(izaanSchool.getEmail());
        System.out.println(izaanSchool.getPhoneNumber());
        System.out.println(izaanSchool.getCourse());
        System.out.println(izaanSchool.getRole());
        System.out.println(izaanSchool.getFee());
    }
}