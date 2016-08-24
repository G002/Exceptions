package Exceptions;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class FinallyDemo {

    static void procA() {

        try {
            System.out.println("inside ProcA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procBs finally");
        }
    }

    //Execute a try block normally

    static void procC() {
        try {
            System.out.println("Inside procC");
        } finally {
            System.out.println("Proc C's finally");
        }
    }

    public static void main(String []args){
        try {
            procA();
        }catch (Exception e) {
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}
