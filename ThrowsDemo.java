package Exceptions;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{

        System.out.println("Inside Throwone");
        throw new IllegalAccessException("demo");

    }
    public static void main(String [] args){
        try{
            throwOne();
        }
        catch (IllegalAccessException e){
            System.out.println("Caught" + e);
        }

    }

}
