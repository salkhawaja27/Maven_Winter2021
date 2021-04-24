package Day2_030721;

public class DynamicArray {

    public static void main(String[] args) {

        //declare countries  variable
        String[] countries;
        int[] streetnumber;

        //set the length of the array for the number of data it can store
        countries = new String[4];
        countries[0] = "USA";
        countries[1] = "Spain";
        countries[2] = "Bangladesh";
        countries[3] = "India";

        //set the length of the array for street number
        streetnumber = new int[4];
        streetnumber[0] = 222;
        streetnumber[1] = 333;
        streetnumber[2] = 444;

        //print usa from countries list
        System.out.println("Country is " + countries[0] + " on street number " +streetnumber[2]);
        System.out.println("Country is " + countries[2] + " on street number " +streetnumber[1]);


    }//end of main method





}//end of java class

