import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ScenarioBTest {

    // Helper method to simulate user input
    private void provideInput(String data) {
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);
    }

    @Test
    public void testGetValidCityChoice_ValidInput() {
        provideInput("1");
        int cityChoice = ScenarioB.getValidCityChoice(new Scanner(System.in));
        Assert.assertEquals(1, cityChoice);
    }

    @Test
    public void testGetValidTimeChoice_ValidInput() {
        provideInput("2");
        int timeChoice = ScenarioB.getValidTimeChoice(new Scanner(System.in));
        Assert.assertEquals(2, timeChoice);
    }


    @Test
    public void testGetValidCityChoice_InvalidInput() {
        provideInput("3\n1");
        int cityChoice = ScenarioB.getValidCityChoice(new Scanner(System.in));
        Assert.assertEquals(1, cityChoice);
    }

    @Test
    public void testGetValidTimeChoice_InvalidInput() {
        provideInput("3\n2");
        int timeChoice = ScenarioB.getValidTimeChoice(new Scanner(System.in));
        Assert.assertEquals(2, timeChoice);
    }

}
