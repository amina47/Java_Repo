package basic;

import java.util.Scanner;

class loginValidation {


     public static void main(String[] args) {
         //	instance of scanner
                                            Scanner scan = new Scanner(System.in);
        // tell user to enter username
                                            String userName;
                                             String passWord ;
                                             String username = scan.nextLine();
         //Tell user to enter password;
                                            System.out.println("please enter username"+ "Please enter your password");
         //takes input from console and storing the value into actualPassword variable
                                            String actualPassword = scan.nextLine();
         //setting expected password which is associated with user account details in database
                                             String expectedPassword = "technosoft";
         //Creating for loop to give user max tries to enter valid password and log the user to system if
         //correct password is entered
                                             for (int i = 0; i < 5; i++) {
             //checking if actual password is not equal to expected password
                                             if (!actualPassword.equals(expectedPassword)) {
           // subtracting the count by iteration so user will have less tries (-1 every miss tries)
                                                 // int count = (5 - i);
                 //console message to user to enter valid password
                                                System.out.println("Please enter the valid password");
                 //console message to let user know how many more tries he has left with
                                                 int count = 5-1;

                                            System.out.println("You have " + count + " more tries");
                 //letting user to update the actualPassword value with new input from console
                                                 actualPassword = scan.nextLine();
                 //if count equals to 5, then notifying user with custom message
                                                if (i == 4) {
                                              System.out.println("Your account will be locked for 15 min");
                 }
                                             } else {
                 // if any point in the loop user enters correct password then system let user into home page
                                               System.out.println("Welcome to home page");
                                                 break;
             }
         }
     }
 }
/*
 * Test Cases
 * 1. Verify username & password is correct scenario


 * Homework:
 * 1. Create a system that checks valid username and password
 * And if they both are valid then only system displays homepage
 * User can only try up to 5 times with invalid login details
 * if it reaches 5 times then system should be locked for 10 min
 * 2. Fix existing bug from the system

     }
 }

//* 3. Write test cases to validate the scenario*/