package edu.hydes.assign03;
import java.util.Scanner;

public class SilentFilm {



    public static Narrator askForNarration(Scanner input){
        System.out.println("Enter boundary character:");
        char boundaryChar = input.nextLine().charAt(0);

        System.out.println("Enter number of lines:");
        String numLines = input.nextLine();
        Integer.parseInt(numLines);

        String [] allLines = new String[numLines];

        System.out.println("Enter lines:");
        for(int i = 0; i < numLines; i++){
            allLines[i] = input.nextLine();
        }

        Narrator narrator = new Narrator(allLines, boundaryChar);
        return narrator;

    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Narrator n = askForNarration();


        System.out.println("Our story begins...");
        System.out.println(n);
    }
}
