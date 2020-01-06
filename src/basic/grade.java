package basic;

import java.util.Scanner;

public class grade {
    public static void main (String[] args){


        ///Homework:
        ////1.Students score, total possible score
        //// 15/20 -> You got a C (75%)
        //// A 90-100, B 80-89, C 70-79, D 60-69, F 0-59


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage");
        int percentage = sc.nextInt();
        char grade;

        if(percentage>=90){
            System.out.println("grade = 'A'");

        }else if(percentage>=80){
            System.out.println("grade = 'B'");
        }
        else if(percentage>=70){
            System.out.println("grade = 'C'");
        }
        else if (percentage >=60) {
            System.out.println("grade = 'D'");
        }
         else   {
            System.out.println("grade = 'F'");
        }


}
}