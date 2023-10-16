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
        int width = 50;
        int height = 8;

        for(int i = 0; i < height; i++ ){
            for(int j = 0; j < width; j++){
            if(j % 4 == 0){
                narrationCard.append(generateBoundaryLine());
                narrationCard.append(generateCenteredLine(""));
            }
            int numWidthLeft = width - j;
            int numHeightLeft = height - i;

            if(numWidthLeft < 4 && numHeightLeft < 4){
                //LINE COUNT WILL BE HOWEVER MASNY LEFT
                //EXTRA LINE COUNT WILL BE 4
            }
            else{
                //LINE COUNT = 4
                //EXTRA LINE COUNT = 0
                narrationCard.append(lines);
            }
        }

        return narrationCard.toString();

            //GET HELP
    }


}
