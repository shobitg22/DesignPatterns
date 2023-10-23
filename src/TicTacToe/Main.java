package TicTacToe;

public class Main {
    public static void main(String[] args) {

        TicTacToeGame game = new TicTacToeGame();
        game.init();
        System.out.println("game winner is: " + game.startGame());

    }
}
