package edu.hydes.assign06;

import java.util.Scanner;

public class Tome extends Item{
    private String skill = "";
    public Tome(){
        skill = "";
    }
    public Tome(String ID, int value, String skill){
        super(ID, value);
        this.skill = skill;
    }
    public String getSkill(){
        return skill;
    }
    public void setSkill(){
        this.skill = skill;
    }
    public void read(){
        System.out.println("Skill " + skill
                            + " increased!");
    }
    public String toString(){
        return  super.toString() + ", enhances" + skill;
    }
    public void load(Scanner input) throws GameFileException{
        try{
            super.load(input);
            skill = input.nextLine();
        }catch(Exception e){
            setID("");
            setValue(0);
            skill = "";
        }
        throw new GameFileException("Error loading Tome", e);
    }

}

