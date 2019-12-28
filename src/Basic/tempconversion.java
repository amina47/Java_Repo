package Basic;

import java.util.Scanner;

class scaleconversion

//Fahrenheit to Cesius
 //import  java.util.Scanner
{


    public static void main(String[] args) {

    }




    static    {
        double temperature;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32) * 5) / 9;

        System.out.println("temperature in Celsius = " + temperature);



    /*Celsius to Fahrenheit */
//import java.util.Scanner;


    System.out.println(" enter temperature fahrenheit ");
    temperature = in.nextInt();
    temperature = (temperature + 32)* 9/5;

    System.out.println("temperature in Fahrenheit = " + temperature);



 //*   Celsius to Kelvin*/
    //import java.util.Scanner;


    System.out.print("enter temperature Kelvin");
         temperature = in.nextInt();

    temperature = ( temperature + 273.15);


    System.out.println(" temperature in Kelvin = + temperature");




    //*Kelvin to celsius*/


    System.out.println("Temperature in Celsius:");

    // assign to float variable the temperature in Kelvin
        float temperaturekelvin = 0;

    // Kelvin to Degree Celsius Conversion
    float celsius = temperaturekelvin - 273.15F;
    System.out.println("Celsius: "+ celsius);


    //*kelvin to Fahrenheit*/










}
    }

