public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false; //all lose
        int speedOfPlayer1 = 7;
        int speedOfPlayer2 = 5;
        int speedOfPlayer3 = 2;
        int count = 0;

        if (!isGreenLight) {
            if (speedOfPlayer1 != 0)
                count++;
            if (speedOfPlayer2 != 0)
                count++;
            if (speedOfPlayer3 != 0)
                count++;
        }
        System.out.println(count + " выбывают");
    }
}
