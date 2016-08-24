package Exceptions;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class Exczero {
    public static void main(String [] args){

        int divident,result;

        try{
            divident=0;
            result = 42/divident;
            System.out.println("This will not be printed");
        }
        catch (ArithmeticException e) { // catching division by zero
            System.out.println("Division by Zero " + e);

        }

        System.out.println("After catch stmt");
    }

}
