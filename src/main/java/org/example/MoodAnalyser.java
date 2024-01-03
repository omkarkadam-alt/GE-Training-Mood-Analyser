package org.example;
public class MoodAnalyser {

    String message;

    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood(String message) throws IllegalArgumentException{

        String mood = (message.toLowerCase().contains("sad"))?"SAD":"HAPPY";
        return mood;
    }

    public String analyseMood(){
        String mood = (this.message.toLowerCase().contains("sad"))?"SAD":"HAPPY";
        return mood;
    }

    public static void main(String[] args) {
        System.out.println("Mood Analyzer");
    }


}