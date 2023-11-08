package edu.hydes.exercises13;

public class InvalidRadiusException extends Exception{
    public InvalidRadiusException() {
        super("Invalid radius");
    }
    public InvalidRadiusException(String message) {
        super(message);
    }
    public InvalidRadiusException(String message, Exception cause) {
        super(message, cause);
    }

}