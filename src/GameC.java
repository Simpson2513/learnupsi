public class GameC {
    public static boolean isGreenLight = false;

    public static boolean isWinCalamary(double speedPlayer) {
        return (!isGreenLight && speedPlayer == 0) || (isGreenLight && speedPlayer >= 0);
    }

    public static boolean isNegativeSpeed(double speedPlayer) {
        return speedPlayer < 0;
    }

    public static String GameWithNegativeCheck(double speedPlayer) {
        String s;
        if (!GameC.isNegativeSpeed(speedPlayer)){
            s = "is victory " + GameC.isWinCalamary(speedPlayer);
        } else {
            s = "speed is negative";
        }
        return s;
    }
}

