package edu.realemj.exercises03;

import java.util.*;

public class Party {
    private Person [] people;

    public Party(String [] names) {
        int cnt = names.length;
        people = new Person[cnt];
        for(int i = 0; i < cnt; i++) {
            people[i] = new Person(names[i]);
        }
    }

    public int getPartyCnt() {
        return people.length;
    }

    public void printParty() {
        System.out.println("** PARTY ***********");
        //for(int i = 0; i < people.length; i++) {
        //    System.out.println("\t* " + people[i].getName());
        //}
        for(Person p: people) {
            System.out.println("\t* " + p);
        }
        System.out.println("********************");
    }

    public int getAliveCount() {
        int cnt = 0;
        for(Person p: people) {
            if(p.isAlive()) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean killRandom() {
        int aliveCnt = getAliveCount();
        if(aliveCnt == 0) {
            return false;
        }

        Person [] livingFolks = new Person[aliveCnt];
        int aliveIndex = 0;
        for(Person p: people) {
            if(p.isAlive()) {
                livingFolks[aliveIndex] = p;
                aliveIndex++;
            }
        }

        int deathIndex = (int)(Math.random()*aliveCnt);
        livingFolks[deathIndex].setAlive(false);

        return true;
    }

    public static Party askForPartyMembers(Scanner input) {
        System.out.println("How many party members?");
        String cntStr = input.nextLine();
        int cnt = Integer.parseInt(cntStr);
        String [] names = new String[cnt];
        System.out.println("Enter names:");
        for(int i = 0; i < cnt; i++) {
            names[i] = input.nextLine();
        }
        Party p = new Party(names);
        return p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** PARTY MEMBERS **\n");
        for(Person p: people) {
            sb.append("* ");
            sb.append(p);
            sb.append("\n");
        }
        sb.append("*******************\n");
        return sb.toString();
    }
}
