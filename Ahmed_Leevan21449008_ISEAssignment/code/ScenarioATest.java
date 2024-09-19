import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import java.io.PrintStream;

public class ScenarioATest {

    @Test
    // White-box test: Valid country choice
    public void testGetCountryChoice_ValidInput() {
        int expected = 1;
        int actual = ScenarioA.getCountryChoice(new Scanner("1"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    // White-box test: Lower bound of the input range
    public void testGetCountryChoice_LowerBound() {
        int expected = 1;
        int actual = ScenarioA.getCountryChoice(new Scanner("1"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    // Black-box test: First country choice
    public void testGetCountryChoice_FirstCountry() {
        int expected = 1;
        int actual = ScenarioA.getCountryChoice(new Scanner("1"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    // White-box test: Australia (Meteorological) in different months
    public void testCheckSeason_AustraliaMeteorological() {
        String expected = "The current season in Australia (Meteorological) is Summer.";
        String actual = captureSystemOut(() -> ScenarioA.checkSeason(1, 1));
        Assert.assertEquals(expected, actual.trim()); 
    }

    // Helper method to capture System.out.println() output
    private String captureSystemOut(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        runnable.run();

        System.out.flush();
        System.setOut(originalOut);
        return outputStream.toString();
    }
}
