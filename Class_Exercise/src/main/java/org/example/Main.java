package org.example;

public class Main {
    public static void main(String[] args) {
       Person person = new Person("Karolina", 33);
       person.printInfo();

       Rectangle rectangle = new Rectangle(3,4);
       rectangle.printArea();

       Student student = new Student("Karolina", 12345, 3.0);
       student.printStudent();
    }
}