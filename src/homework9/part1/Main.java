package homework9.part1;

import homework9.part2.Circle;
import homework9.part2.Rectangle;
import homework9.part2.Triangle;

public class Main {

    public static void main(String[] args) {

        Director director = new Director("Archil", 27);
        Employer employer = new Employer("German", 25);
        Accountant accountant = new Accountant("TeachMeSkills", 20);

        director.titleOfThePosition();
        employer.titleOfThePosition();
        accountant.titleOfThePosition();

        System.out.println("-".repeat(50));

        Triangle triangle = new Triangle(15,12);
        triangle.getArea();

        Rectangle rectangle = new Rectangle(4,4);
        rectangle.getArea();

        Circle circle = new Circle(14);
        circle.getArea();

        try {
            Director director1 = (Director) director.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }



    }

}
