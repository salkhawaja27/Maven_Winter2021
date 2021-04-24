package Day4_031421;

import net.bytebuddy.description.ModifierReviewable;

public class reusablemethodday4 {
    public static void addtwonumbers (int number1, int number2){
        System.out.println("My result is " + (number1+number2));
    }//end of method

    //Create a return method which will subtract two numbers and print as well
    //return the  result
    public static int subtractTwonumbers (int number1, int number2){
        int result = number1-number2;
        System.out.println("My result is " + result);
        return result;
    }//end of method

}//end of java class
