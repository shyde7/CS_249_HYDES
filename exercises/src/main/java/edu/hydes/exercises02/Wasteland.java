package edu.hydes.exercises02;

public class Wasteland
{
    public static void main(String [] args)
    {
        System.out.println("Fallout Exercise to demonstrate OOP.");

        NPC bob = new NPC();
        NPC sue = new NPC();
        NPC jim = new NPC(90, 'E');

        int h = bob.getHealth();
        h -= 5;
        bob.setHealth(h);

    }






}
