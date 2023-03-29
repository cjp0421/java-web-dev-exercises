package exercises;
import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What length is your rectangle? ");
        Integer rec_length = Integer.valueOf(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.println("What width is your rectangle? ");
        Integer rec_width = Integer.valueOf(input2.nextLine());


        System.out.println("Your rectangle has a total area of " + (rec_length * rec_width));
    }
}
