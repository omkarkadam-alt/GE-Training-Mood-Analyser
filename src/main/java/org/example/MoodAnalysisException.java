package org.example;

public class MoodAnalysisException extends Exception {

    public enum ExceptionType {
        EMPTY_MESSAGE, NULL_MESSAGE
    };

    public ExceptionType exceptionType;

    public MoodAnalysisException(String message){
        super(message);
    }

    public MoodAnalysisException(ExceptionType exceptionType, String message){
        super(message);
        this.exceptionType = exceptionType;
    }
}
