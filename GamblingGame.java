public class GamblingGame {
    public static final int everyGameBet = 1;
    public static int everyDayStake = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling simulation program on master branch");
        int win,loose;
        int game = (int)(Math.random() * 2);
        if (game == 1) {
            everyDayStake+=everyGameBet;
            System.out.println("Win the game :The amount is = "+everyDayStake);
        } else {
            everyDayStake-=everyGameBet;
            System.out.println("Loose the game :The amount is ="+everyDayStake);
        }
    }
}
