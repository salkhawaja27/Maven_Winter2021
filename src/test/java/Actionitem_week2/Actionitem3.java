package Actionitem_week2;

public class Actionitem3 {
    public static void main(String[] args) {

        String[] cities = new String[4];
        cities[0] = "Queens";
        cities[1] = "Manhattan";
        cities[2] = "Brooklyn";
        cities[3] = "Staten Island";

        //using for loop and if else to print only Brooklyn or Manhattan
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] == "Brooklyn" || cities[i] == "Manhattan") {
                System.out.println("City is " + cities[i]);

            }//end of loop

        }//End of main method
    }//end of class
}
