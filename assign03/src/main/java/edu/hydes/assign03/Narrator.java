package edu.hydes.assign03;

public class Narrator {

    private char boundaryChar;
    private String lines;


    public Narrator(String [] lines, char boundaryChar){
        setLines(lines);
        setBoundaryChar(boundaryChar);
    }

    public char getBoundaryChar(){

        return boundaryChar;
    }

    public String getLines(){
        lines += "\n";
        return lines;
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;

    }

    public void setLines(String [] lines){
        String [] linesCopy = new String[0];
        for(int i= 0; i < lines.length; i++){
            linesCopy[i] = lines[i];
        }
    }

    public String generateBoundaryLine(){
        String boundaryLine = "";
        for(int i = 0; i < 50; i++){
            boundaryLine += boundaryChar;
        }
        System.out.println("\n");
        return boundaryLine;
    }

    public String generateCenteredLine(String text){
        StringBuilder centeredLine = new StringBuilder();

        centeredLine.append(boundaryChar);
        int totalSpaces = (50 - text.length()) -2;

        int halfTotalSpaces = totalSpaces / 2;
        int secondHalfSpaces = totalSpaces - halfTotalSpaces;

        centeredLine.append(halfTotalSpaces);
        centeredLine.append(text);
        centeredLine.append(secondHalfSpaces);
        centeredLine.append(boundaryChar);
        centeredLine.append("\n");
        return centeredLine.toString();

        //GET HELP
    }

    public String toString(){
        StringBuilder narrationCard = new StringBuilder();
        int height = 8;


        for(int i = 0; i < lines.length(); i+=4 ){
            narrationCard.append(generateBoundaryLine());
            narrationCard.append(generateCenteredLine(""));

                int extraLineCount = 0;
                int linesLeft = lines.length() - i;
                if(linesLeft >= 4){
                    extraLineCount = 4 - linesLeft;
                    lines += linesLeft;
                }
                else{
                    linesLeft = 4;
                    extraLineCount = 0;

                    narrationCard.append(lines);
                    narrationCard.append(extraLineCount);
                }
                narrationCard.append("\n");
                narrationCard.append(generateBoundaryLine());


        }

        return narrationCard.toString();
    }


}
