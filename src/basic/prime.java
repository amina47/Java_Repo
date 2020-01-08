package basic;

public class prime {



    public static void main(String[] args){


        //2. Write a logic that prints multiplication table of the user provided number up to ten.



        //3. Write a logic that checks if a number is a Prime number

        int remainder;
        boolean isPrime=true;
        int number=7; // Enter the numberToCheck you want to check for prime

        //Loop to check whether the numberToCheck is divisible any numberToCheck other than 1 and itself
        for(int i=2;i<=number/2;i++)
        {
            //numberToCheck is dived by itself
            remainder=number%i;
            System.out.println(number+" Divided by "+ i + " gives a remainder "+ remainder);

            //if remainder is 0 then number is not prime and break loop. Else continue loop
            if(remainder==0)
            {
                isPrime=false;
                break;
            }
        }
        // Check value true or false,if is prime is true then number is prime otherwise not prime
        if (isPrime){
            System.out.println(number + " is  a Prime number");}

        else
            System.out.println(number + " is not a Prime number");
    }
}
/*
 * *7
 * 7/2
 * 7/3
 * 7/4
 * 7/5
 *7/6

//for  (int i=2;i checkprime; i+= ) {//for condition  can also be,i<checkprime}*/
