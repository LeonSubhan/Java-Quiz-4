package quiz4;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int marks;
    static ArrayList<Integer> addsubject;

    public static int addSubject(){
        Scanner ali = new Scanner(System.in);
        ArrayList<String> sub = new ArrayList<>();
        String userSubject;
        do {
            System.out.println("Enter yous subject");
            userSubject = ali.nextLine();
            sub.add(userSubject);
        }
        while (!userSubject.isEmpty());
        for (int i = 0; i < sub.size(); i++) {
            System.out.println(sub.get(i));
        }
        System.out.println(sub.size());
        return sub.size();
    }

    public static void totalSubject(int sub){

        System.out.println(addsubject.size());
    }
    public static int totalSubjects(){
        int totalSub = addsubject.size();
        System.out.println(totalSub);
        return totalSub;
    }
    public static void addMarks(){
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = ali.nextInt()-5;

        System.out.println(mark + "Keep working hard");
    }

    public static void main(String[] args) {
        addSubject();
        addMarks();

    }
}
