package Exceptions;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class ThrowDemo {

    static void demoproc (){

        try{
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Caught inside Demoproc. ");
            throw e; // rethrow the exception
        }

        }

        public static void main(String args[]){

            try{
                demoproc();
            }
            catch(NullPointerException e){
                System.out.println("Recaught: " +e);
            }

    }
}
