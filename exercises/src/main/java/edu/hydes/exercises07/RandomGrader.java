package edu.hydes.exercises07;
import java.util.*;

public class RandomGrader {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter seed:");
        int seed = input.nextInt();
        Random rand = new Random(seed);

        System.out.println("Enter the number of students:");
        int studentCnt = input.nextInt();
        double sumGrades = 0;

        for(int i = 0; i < studentCnt; i++){
            int grade = getRandomGrade(rand);
            sumGrades += grade;
            String letter = getLetterGrade(grade);
            printGrade("Student " + (i+1), grade, letter);
        }

        int avgGrade = (int)Math.round(sumGrades/studentCnt);
        printGrade("AVERAGE", avgGrade, getLetterGrade(avgGrade));

    }

    public static int getRandomGrade(Random rand){


        return 50 + (int)(51 * rand.nextDouble());
    }

    public static String getLetterGrade(int grade){
        String letter = "F";
        if(grade >= 90){
            letter = "A";
        }
        else if(grade >= 80){
            letter = "B";
        }
        else if(grade >= 70){
            letter = "C";
        }
        else if(grade >= 60){
            letter = "D";
        }
       return letter;
    }

    public static void printGrade(String name, int grade, String letter){
        System.out.println(name + ": " + grade + " (" + letter + ")");


    }
}
