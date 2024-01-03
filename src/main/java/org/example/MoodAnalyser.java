package org.example;
public class MoodAnalyser {

    String message;

    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException{
        try {
            if(message.length() == 0)
            {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MESSAGE, "Entered an empty message, please entry a valid message.");
            }

            String mood = (message.toLowerCase().contains("sad")) ? "SAD" : "HAPPY";
            return mood;

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MESSAGE, "Entered a null message, please entry a valid message.");
        }
    }

    public String analyseMood() throws MoodAnalysisException{
        try{
            if(this.message.length() == 0)
            {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MESSAGE, "Entered an empty message, please entry a valid message.");
            }

            String mood = (this.message.toLowerCase().contains("sad"))?"SAD":"HAPPY";
            return mood;
        } catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MESSAGE, "Entered an null message, please enter valid message.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Mood Analyzer");
    }
}