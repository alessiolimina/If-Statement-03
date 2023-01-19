package it.develhope.ifstatement;

import java.util.Random;

public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge() {

        Random random = new Random();
        int randomAge = random.nextInt(35);

        System.out.println("I generated the random value " + randomAge + " for student " + name);

        if (age == randomAge) {

            System.out.println("The random value is equal to " + name + "'s age");

        } else if (age < randomAge) {

            System.out.println("The random value is greater than the " + name + "'s age");

        } else if (age > randomAge) {

            System.out.println("The random value is lower than " + name + "'s age");

        } else {

            System.out.println("I can't compare the ages");

        }
    }
}

