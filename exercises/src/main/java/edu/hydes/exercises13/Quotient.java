package edu.hydes.exercises13;
import java.io.IOException;
import java.util.*;
public class Quotient {

    public static void badFileStuff() throws IOException{
        throw new IOException("NOPE!");
    }

    public static int quotient(int number1, int number2){
        if(number2 == 0) {
            throw new ArithmeticException("YOU FOOL! YOU CANNOT DIVIDE BY ZERO!");
        }
        return number1/number2;

    }
    public static void main(String [] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            int z = quotient(x,y);
            System.out.println("Answer is: " + z);
        }
        catch(ArithmeticException e){
            System.err.println("SOMETHING HAS GONE AWRY!!!");
            System.err.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.err.println("THAT'S NOT A NUMBER!!!");
        }
        //catch(IOException e){
        //    System.err.println("Huh... that's odd.");
        //}
        System.out.println("DONE!");

    }
}
