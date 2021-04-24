package Day3_031321;

public class        Switchcasestatements {
    public static void main(String[] args) {

        /*print using switch case statements print
        if milktype is oat milk, almond milk or organic milk
        else milk type is not recognized
         */

        //declare and define the variable for milkType
        String milkType = "goat milk";

        switch (milkType){
            case "oat milk":
                System.out.println("milk type is oatmilk");
                break;
            case "almond milk":
                System.out.println("milk type is almond milk");
                break;
            case "organic milk":
                System.out.println("milk type is organic milk");
                break;
            default:
                System.out.println("milk type is not recognized " + milkType);

        }//end of switch statement


    }//End of main method

}//end of java class
