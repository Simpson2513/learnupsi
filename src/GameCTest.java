
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameCTest {

    @Test
    public void shouldWinWithIntAndRed() {
        int a = 0;
        GameC.isGreenLight = false;

        Assertions.assertTrue(GameC.isWinCalamary(a));
    }

    @Test
    public void shouldLoseWithDoubleAndRed() {
        Double a = 4.5;
        GameC.isGreenLight = false;

        Assertions.assertFalse(GameC.isWinCalamary(a));
    }

    @Test
    public void shouldLoseWithIntAndRed() {
        int a = 4;
        GameC.isGreenLight = false;

        Assertions.assertFalse(GameC.isWinCalamary(a));
    }

    @Test
    public void shouldErrorWithNegativeAndGreen() {
        double a = - 4.8;
        GameC.isGreenLight = false;
        String s = "speed is negative";

        String actual = GameC.GameWithNegativeCheck(a);
        String expected = s;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldErrorWithNegativeWithGreen() {
        double a = - 4.8;
        GameC.isGreenLight = true;
        String s = "speed is negative";

        String actual = GameC.GameWithNegativeCheck(a);
        String expected = s;

        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void shouldWinWithIntAndGreen() {
        int a = 4;
        GameC.isGreenLight = true;

        Assertions.assertTrue(GameC.isWinCalamary(a));
    }
}

