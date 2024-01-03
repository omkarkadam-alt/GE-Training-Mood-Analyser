import org.example.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMessageContainingSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageNotContainingSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNoMood_UseClassMessageToReturnSadIfClassMessageIsSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void givenNoMood_UseClassMessageToReturnHappyIfClassMessageIsNotSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        assertEquals("HAPPY", mood);
    }
}
