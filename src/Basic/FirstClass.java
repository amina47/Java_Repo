package Basic;

public class hw2{
    public static void main(String[] args) {
///)
//String myStatment = "I am a good programmer";
//Use string methods to do following tasks:
//	Extract "Programmer" string from myStatement.
//	Display the total number of words in the myStatement.
//	replace all the 'r' characters with 'f' characters.
//2)
//Store your name in a string variable.
//Calculate the length of your name, without using length() method of String class.
//3)
// "String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" ,Mareeha" , "Ruslan" , "Himani"};
//Verify if "JOHN" is present at index 1.
//4)
//Array:
//Store first names of 5 of your friends/colleagues in an array, and display the following in console:
//    1. Length of that array
//    2. Print name written on 3rd position (hint: 2nd index)
//    3. Name of each friend/colleague
//    4. Does name on 2nd position, start with "A"
// */
String myStatement  = "I am a good programmer";
String extractedString = myStatement.substring(12,22);
        System.out.println("extracted Word" +extractedString);


String[] words = myStatement.split(  "");
        System.out.println("number of Words " + words.length);

     String replaceStatement = myStatement.replace(  "r",  "f");
        System.out.println(replaceStatement);

//problem 2

        String  name = "Amina";
            int count = name.lastIndexOf("");
            System.out.println("count with lastIndexOf):" + count);
            int charCount =name.toCharArray().length;
            System.out.println("Count with charArray" + charCount);




      String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" ,"Mareeha" , "Ruslan" , "Himani"};

boolean isJohnpresent = names[1].equals("John");
        System.out.println("isJohnpresent" + isJohnpresent);


//problen 4

        String [] friends = {"Eileen", "Shazia","Ana", "Hasan","Z"};
        int lengthOfArray = friends.length;
        System.out.println(lengthOfArray + friends[lengthOfArray -1] +  "," + friends [lengthOfArray -2]);

        boolean secondPositionStartA  = friends [2].startsWith ("A");
        System.out.println("issecondPositionStartsA" +  "issecondPositionStartA ");




















