package Day7_032721;

import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Manhattan");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Staten Island");

        for (int i=0;i< cities.size(); i++){
            if (cities.get(i) == "Queens") {
                System.out.println("My city is " + cities.get(i));
            }
        }


    }//end of main
}//end of class
