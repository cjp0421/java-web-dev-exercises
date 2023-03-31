package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double circle_radius = input.nextDouble();
        do {
            if(!input.hasNextDouble()){
                System.out.println("The radius must be a valid number.");
            }
            else if (circle_radius<=0) {
                System.out.println("The radius must be a valid number.");
            } else {
                double circle_area = Circle.getArea(circle_radius);

                System.out.println("The area of a circle with radius " + circle_radius + " is: " + circle_area);
            }

        } while (!input.hasNextDouble());

        System.out.println("Enter a radius: ");
    }

}
