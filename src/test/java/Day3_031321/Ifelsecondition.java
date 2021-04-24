package Day3_031321;

public class    Ifelsecondition {
    public static void main(String[] args) {

        //declare the integer variables

        int a,b;
        a = 5;
        b = 5;

        //using if condition, verify that a is less than b
        if (a < b){
            System.out.println("a is less than b");

        }//end of condition

        //using if else condition, verify if a is less than b, else is equal of greater to b
        if (a < b){
            System.out.println("a is less than b");
        } else {
            System.out.println(" A is either greater than b or equal to b ");
        }//end of else

        //using <= operator verify if a is less than b or is equal to b
        if (a <= b){
            System.out.println(" a is less than b or a is equal to b");


        }//end of if condition

    }//end of main method



}//end of java class
