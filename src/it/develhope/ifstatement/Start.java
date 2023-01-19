package it.develhope.ifstatement;

public class Start {
    public static void main(String[] args) {
        System.out.println("---------Starting----------------");

        Student student = new Student("Alessio", 32);

        student.guessingAge();

        System.out.println("----------------------------------");
    }
}
