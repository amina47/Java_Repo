package Basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class condstatement {

   /// /Assignment Operators
    //        x = x + y;
//        x += y;
//        System.out.println(x);
    // Comparision Operators (Result of an expression in comparision operator is boolean)
//        boolean isGreater = x >= y;
//        boolean isLess = x <= y;
//
//        System.out.println(isLess);
    //Equality
    boolean isEqual ='x'  == 'y';
    boolean isNotEqual = 'x' != 'y';
    //        System.out.println(isNotEqual);
    //Ternery
    // If a person is older than 65, they are senior, otherwise they are consider adult
    int age = 45;
    String status = age > 65 ? "senior" : "adult";
    //        System.out.println(status);
    boolean isUsernameCorrect = true;
    boolean isPasswordCorrect = false;
    //Logical Operators
    //        // // Returns TRUE if both operands are TRUE; //Logical AND (&&)
    //        // //Logical OR (||)
//        // // Returns TRUE if one operands is TRUE;
    boolean isCorrectLogin = isUsernameCorrect || isPasswordCorrect;


    boolean flip = !isCorrectLogin;
     System.out.println(flip);





}
