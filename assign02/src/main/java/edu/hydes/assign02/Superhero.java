package edu.hydes.assign02;

public class Superhero {


    private String heroName = "";
    private String realName = "";
    private int height = 0;
    private double weight = 0.0;

    public Superhero (){}

    public String getHeroName(){
        return heroName;
    }

    public String getRealName(){
        return realName;
    }

    public int getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public void setHeroName(String name){
        heroName = name;

    }
    public void setRealName(String name){
        realName = name;
    }
    public void setHeight(int totalInches){
        height = totalInches;
    }
    public void setWeight(double pounds){
        weight = pounds;
    }

    public int calculateBMI(){
        int BMI = (int)((703 * weight)/(height * height));

        return BMI;
    }

    public String getNameString(){
        String nameString = heroName + " (" + realName +")";

        return nameString;
    }

    public String getHeightString(){
        int feet = height / 12;
        int remainder = height % 12;

        String heightString = feet + "'-" + remainder +"\"";
        return heightString;
    }

    public String getWeightString(){
        String weightString = weight +" " + "lbs.";
        return weightString;
    }

    public String toString(){
        String finalString = ("NAME: " + getNameString() + "\n" +
                              "WEIGHT: " + getWeightString() + "\n" +
                              "HEIGHT: " + getHeightString() + "\n" +
                              "BMI: " + calculateBMI() + "\n");
        return finalString;
    }
}
