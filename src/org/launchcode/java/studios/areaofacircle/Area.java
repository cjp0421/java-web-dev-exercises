package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double circle_radius = input.nextDouble();
        double circle_area = Circle.getArea(circle_radius);

        System.out.println("The area of a circle with radius " + circle_radius + " is: " + circle_area);
    }

}
