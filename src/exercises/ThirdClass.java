package exercises;

import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args){
        String first_line = "Alice was beginning to get very tired of sitting by her sister on the bank, and having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word are you looking for? ");
        if(first_line.equals(input.nextLine())){
            System.out.println(input + " is in the sentence");
        }
        if(!first_line.equals(input.nextLine()))
        System.out.println(input + " is not in the sentence");
    }
}