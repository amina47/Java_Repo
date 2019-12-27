package Basic;

public class array {
    public static void main (String [] args ) {

    String[] cars = new String [5];     //try to name ur variable in plural
    cars[0] = "Tesla";
    cars[1] = "honda";
    cars[2] ="Kia";
    cars[3] = "Audi";
    cars[4] ="BMW";

    int size = cars.length;
    System.out.println("The Array Length is:" + size);

        boolean uppercase = cars[4].equals("BMW");

        boolean isEqual = cars[4].equals("BMW");
        System.out.println(isEqual);




       // create an array for seven days in a week

        String[] days = new String[7];
        days[0] = "Sun" ;
        days[1] = "Mon";
        days[2] = "Tues";
        days[3] = "Wed";
        days[4] = "Thurs";
        days[5] = "Fri";
        days[6] = "Sat";

        // when the variables are going to be constant u can use the folllow:
        String [ ] days = { "Sun", "Mon", "Tues","wed", "Thurs","Fri", "Sat"};
    }
}




