import org.example.MoodAnalyser;
import org.example.MoodAnalysisException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMessageContainingSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyseMood("I am in Sad Mood");
            assertEquals("SAD", mood);
        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMessageNotContainingSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyseMood("I am in Happy Mood");
            assertEquals("HAPPY", mood);
        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenNoMood_UseClassMessageToReturnSadIfClassMessageIsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        try {
            String mood = moodAnalyser.analyseMood();
            assertEquals("SAD", mood);
        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenNoMood_UseClassMessageToReturnHappyIfClassMessageIsNotSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        try{
           String mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenEmptyMessage_ShouldThrowEmptyTypeException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyseMood("");

        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
            assertEquals(MoodAnalysisException.ExceptionType.EMPTY_MESSAGE, e.exceptionType);
        }
    }

    @Test
    public void givenNullMessageViaConstructor_ShouldThrowNullTypeException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            String mood = moodAnalyser.analyseMood();
        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
            assertEquals(MoodAnalysisException.ExceptionType.NULL_MESSAGE, e.exceptionType);
        }
    }

    @Test
    public void givenNullMessage_ShouldThrowNullTypeException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try{
            String mood = moodAnalyser.analyseMood(null);
        } catch(MoodAnalysisException e) {
            System.out.println(e.getMessage());
            assertEquals(MoodAnalysisException.ExceptionType.NULL_MESSAGE, e.exceptionType);
        }
    }
}
