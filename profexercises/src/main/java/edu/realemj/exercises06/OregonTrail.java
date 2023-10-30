package edu.realemj.exercises06;

import edu.realemj.exercises03.*;
import edu.realemj.exercises11.*;
import java.util.*;

public class OregonTrail {
    public final static int TOTAL_DISTANCE = 2170;

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Supplies supplies = new Supplies();
        GeneralStore store = new GeneralStore();
        store.enterStore(supplies, input);
        System.out.println(supplies);

        final double RATIONS = 5;

        Party party = Party.askForPartyMembers(input);
        System.out.println(party);

        Wagon wagon = new Wagon();

        while(!isGameOver(supplies, party, wagon)) {
            int aliveCnt = party.getAliveCount();
            double foodEaten = aliveCnt*RATIONS;
            double totalFood = supplies.getTotalFood();
            totalFood -= foodEaten;
            supplies.setTotalFood(totalFood);
            wagon.travelForDay();

            System.out.println("** DAY " + wagon.getDaysTraveled());
            System.out.println(supplies);
            System.out.println(party);
            System.out.println("**************************");
        }

        if(wonGame(supplies, party, wagon)) {
            System.out.println("YOU SURVIVED!");
        }
        else {
            System.out.println("YOU ALL PERISHED!");
        }
    }

    public static boolean isGameOver(Supplies s, Party p, Wagon w) {
        return (wonGame(s,p,w) ||
                (p.getAliveCount() == 0 ||
                s.getTotalFood() == 0));
    }

    public static boolean wonGame(Supplies s, Party p, Wagon w) {
        return (p.getAliveCount() > 0 &&
                TOTAL_DISTANCE <= w.getMilesTraveled());
    }
}
