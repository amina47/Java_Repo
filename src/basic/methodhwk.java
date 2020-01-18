package basic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;




import java.util.Scanner;

public class MethodLab {


    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        {

            System.out.println ("please enter name" + "type of sport fan");

            Object scan;

        }

        String[] fanName;
        fanName = new String[]{"Deepak", "Ani", "Rana", "Delwar", "Fedous", "Ahsan", "palina", "MArk", "Mareeha", "Roshan", "Suman", "Himani"};


        System.out.println (Arrays.toString (fanName) + " fan type");
        switch(fanName) {


            case 'a':
                System.out.println (Arrays.toString (fanName) + "Football fan");
                break;


            case 'b':
                System.out.println ("fanName" + "fanName" + "Soccer fan");
                break;


            case 'c':
                System.out.println ("fanName" + "fanName" + "fanName" + "Cricket fan");
                break;


            case 'D':
                System.out.println ("fan name" + "fanName" + "fanName" + "fanName" + "Basket Ball Fan");
                break;


            case 'E':
                System.out.println ("fanName" + "fanName" + "Not a fan of any sport");
                break;


            default:
        }


    }

}
