package Exceptions;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class multiExec {

    public static void main(String [] args){
        int num = 10, dividend =0;

        int vals[] = {1,2,3 };

        try{
            vals[10]= 25; // generate ArrayIndexOfBoundsException
            int result = num/dividend; // generate Arithmetic Exception

        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught : " + e);
        }

        System.out.println("After Multi - Catch");
    }

}
