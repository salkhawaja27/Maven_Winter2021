package Day3_031321;

public class    Multiplecondition {
    public static void main(String[] args) {

        //using multiple conditional statements
        int a,b,c;
        a = 2;
        b = 3;
        c = 4;

        //verify either a+b >c, a+b <c, a+b =c
        if (a+b >c){
            System.out.println("a & b is greater than c");
        } else if (a+b <c) {
            System.out.println("a & b is less than c");
        }else { //if previous two conditions don't match then you can just end it with ELSE statement
            System.out.println("a & b is equal to c");
        }//end of multiple condition

        }//End of main method


}//end of Java class
