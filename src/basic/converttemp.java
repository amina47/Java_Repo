package basic;



public class convertTemp {
    private static double celcius;


//fahrenheit to celcius

    public static void main(String[] args) {

    }


//Homework part 2:
//convert below implementation to methods
////   1.     Celsius to Kelvin
////   2.    Celsius to Fahrenheit
//////   3.   Kelvin to Celsius
/////    4.  Kelvin to Fahrenheit//


    public static double Kelvin(double celcius,
                                double Kelvin) {
        convertTemp.celcius = celcius;
        {
            double Kelvin = celcius + 273.15;
            return Kelvin;
        }


        double Celcius ;{
            double Fahrenheit = Celcius * 9 + 32 * 9) / 5;
            return Fahrenheit;
        }


        public static double Celcius ( double Kelvin){

            double Celcius = Kelvin - 273.15;
            return Celcius;

        }


        static double Fahrenheit ( double Kelvin){
            double Fahrenheit = ((Kelvin - 273.15) * 9 / 5 + 32);
            return Fahrenheit;

        }
    }
}


