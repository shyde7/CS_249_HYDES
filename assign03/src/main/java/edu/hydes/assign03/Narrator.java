package edu.hydes.assign03;

public class Narrator {

    private char boundaryChar;
    private String [] lines;


    public Narrator(String [] lines, char boundaryChar){
        setLines(lines);
        setBoundaryChar(boundaryChar);
    }

    public char getBoundaryChar(){

        return boundaryChar;
    }

    public String getLines(){
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;

    }

    public void setLines(String [] lines){
        this.lines = new String[lines.length];
        for(int i= 0; i < lines.length; i++){
            this.lines[i] = lines[i];
        }
    }

    public String generateBoundaryLine(){
        StringBuilder boundaryLine = new StringBuilder();
        for(int i = 0; i < 50; i++){
            boundaryLine.append(boundaryChar);
        }
        boundaryLine.append("\n");
        return boundaryLine.toString();
    }

    public String generateCenteredLine(String text){
        StringBuilder centeredLine = new StringBuilder();

        int totalSpaces = 50 - text.length() - 2;

        int halfTotalSpaces = totalSpaces / 2;
        int secondHalfSpaces = totalSpaces - halfTotalSpaces;

        centeredLine.append(boundaryChar);
        for (int i = 0; i < halfTotalSpaces; i++) {
            centeredLine.append(' ');
        }

        centeredLine.append(text);

        for (int i = 0; i < secondHalfSpaces; i++) {
            centeredLine.append(' ');
        }

        centeredLine.append(boundaryChar);
        centeredLine.append('\n');

        return centeredLine.toString();

    }

    public String toString(){
        StringBuilder narrationCard = new StringBuilder();

        for(int i = 0; i < lines.length; i+=4 ){
            narrationCard.append(generateBoundaryLine());
            narrationCard.append(generateCenteredLine(""));

                int lineCount = 0;
                int extraLineCount = 0;
                int linesLeft = lines.length - i;
                if(linesLeft < 4){
                    extraLineCount = 4 - linesLeft;
                    lineCount = linesLeft;
                }
                else{
                    lineCount = 4;
                    extraLineCount = 0;
                }
                for(int j = 0; j < lineCount; j++ ){
                    narrationCard.append(generateCenteredLine(lines[i+j]));
                }
                for(int j = 0; j < extraLineCount; j++){
                    narrationCard.append(generateCenteredLine(""));
                }
                narrationCard.append(generateCenteredLine(""));
                narrationCard.append(generateBoundaryLine());


        }

        return narrationCard.toString();
    }


}
