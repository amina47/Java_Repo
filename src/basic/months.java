package basic;

public class months {



    public static void main(String[] args){

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (String month: months){
            boolean isDecember = month.equals("December");
            if  (isDecember = true){
                System.out.println("December is here");
                break;
            }

        }


    }
}



