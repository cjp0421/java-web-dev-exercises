package exercises;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] integerArray = {1,1, 2, 3,5,8};
        for(int i =0; i <6; i++){
            if(i==5){
                //skips 8 because it's i = index of 5
                continue;
            }
            System.out.println("i plus the array item equals " + (integerArray[i] + 1));
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
