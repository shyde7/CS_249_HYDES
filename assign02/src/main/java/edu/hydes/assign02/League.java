package edu.hydes.assign02;

import java.util.*;

public class League {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Superhero p = new Superhero();

        System.out.println("Enter hero name:");
        String heroName = input.nextLine();


        System.out.println("Enter real name:");
        String heroRealName = input.nextLine();


        System.out.println("Enter height (inches) and weight (pounds):");
        String heightAndWeight = input.nextLine();
        Scanner parseLine = new Scanner(heightAndWeight);
        int heightInches = parseLine.nextInt();
        double weightPounds = parseLine.nextDouble();

        p.setHeroName(heroName);
        p.setRealName(heroRealName);
        p.setHeight(heightInches);
        p.setWeight(weightPounds);

        System.out.println(p);
    }
}
