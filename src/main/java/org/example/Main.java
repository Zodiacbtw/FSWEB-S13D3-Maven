package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("Age: " + person.age);

        Person person2 = new Person("Jane", "Doe", 18);

        System.out.println("First Name: " + person2.firstName);
        System.out.println("Last Name: " + person2.lastName);
        System.out.println("Age: " + person2.age);

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
