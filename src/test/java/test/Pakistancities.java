package test;

public class Pakistancities {
    public static void main(String[] args) {

        String[] cities;
        int[] numberlabel;


        cities = new String[5];
        cities[0] = "Islamabad";
        cities[1] = "Lahore";
        cities[2] = "Karachi";
        cities[3] = "Multan";
        cities[4] = "Sialkot";

        numberlabel = new int[5];
        numberlabel[0] = 1;
        numberlabel[1] = 2;
        numberlabel[2] = 3;
        numberlabel[3] = 4;
        numberlabel[4] = 5;

        for(int i= 0;i <5; i++){
            System.out.println(numberlabel[i] + " " +  cities[i]);

        }//end of loop



    }//end of main method

}//end of Pakistan cities
