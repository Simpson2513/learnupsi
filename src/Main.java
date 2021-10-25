import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] speedPlayers = {-3, -3, -5.3, -8, -10.5, 0, -23, -0.1, 0, -9, -2};
        System.out.println(GameC.countLoses(speedPlayers));
        System.out.println(Arrays.toString(GameC.LoseArray(speedPlayers)));
        System.out.println(Arrays.toString(GameC.WinArray(speedPlayers)));

    }
}
