package javaQuiz4;

//Create a class Person with following instance variables and methods:
//
//private String name;
//private int age;
//private int weight;
//private int height;
//Person(String name, int age, int weight, int height)
//growOlder(): Add 2 years to age of person.
//Create a array list "persons" and read/get input from user to enter
// persons in list and entering an empty name will end the reading part.
//Print the number of entered persons.
//Print information of all persons.

import sun.applet.Main;

import java.util.*;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;


    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public Person() {

    }

    public void getOlder(){
        Scanner ali = new Scanner(System.in);
        System.out.println("your age");
        this.age = ali.nextInt()+2;


    }

    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<String>();
        Scanner ali1 = new Scanner(System.in);
        Person person = new Person();
        String input;
        do {
            System.out.println("Enter name:");
            input = ali1.nextLine();
            System.out.println("Enter age");
            int age = Integer.valueOf(ali1.nextLine());
            System.out.println("Enter weight");
            int weight = Integer.valueOf(ali1.nextLine());
            System.out.println("Enter height");
            int height = Integer.valueOf(ali1.nextLine());

            input = ali1.nextLine();

            persons.add(String.valueOf((new Person(input, age, weight, height))));
        }while (!input.isEmpty());

        System.out.println(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((persons.get(i)).toString());
        }


    }


}



