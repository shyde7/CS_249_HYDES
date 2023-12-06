package edu.hydes.assign06;

import java.util.Scanner;

public class Tome extends Item{
    private String skill;
    public Tome(){
        this("", 0, "");
    }
    public Tome(String ID, int value, String skill){
        super(ID, value);
        this.skill = skill;
    }
    public String getSkill(){
        return skill;
    }
    public void setSkill(String skill){
        this.skill = skill;
    }
    public void read(){
        System.out.println("Skill " + skill
                            + " increased!");
    }
    public String toString(){
        return super.toString() + ", enhances " + skill;
    }
    public void load(Scanner input) throws GameFileException{
        try{
            super.load(input);
            this.skill = input.next();
        }catch(Exception e){
            super.setID("");
            super.setValue(0);
            this.skill = "";

        throw new GameFileException("Error loading Tome", e);
        }
    }

}

