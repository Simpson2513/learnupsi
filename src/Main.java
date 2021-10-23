class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;
        int speedOfPlayer1 = 0;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 0;
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
