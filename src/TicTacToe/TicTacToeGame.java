package TicTacToe;

import com.sun.tools.javac.util.Pair;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    private Board board;
    private Deque<Player> players;

    void init(){
        board = new Board(3);

        players = new LinkedList<>();
        PlayingPiece playingPieceX = new PlayingPieceX();
        Player p1 = new Player("A",playingPieceX);

        PlayingPiece playingPieceY = new PlayingPieceO();
        Player p2 = new Player("B",playingPieceY);

        players.add(p1);
        players.add(p2);
    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<Pair<Integer, Integer>> freeSpaces =  board.getFreeCells();
            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            String[] values = value.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            boolean pieceAddedSuccessfully = board.addPiece(inputRow,inputColumn,playerTurn.getPlayingPiece().getPieceType());
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;

            }
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPieceType());
            if(winner) {
                return playerTurn.getName();
            }

        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.getSize();i++) {

            if(board.getBoard()[row][i] == null || !board.getBoard()[row][i].name().equals(pieceType.name())) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.getSize();i++) {

            if(board.getBoard()[i][column] == null || !board.getBoard()[i][column].name().equals(pieceType.name())) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.getSize();i++,j++) {
            if (board.getBoard()[i][j] == null || !board.getBoard()[i][j].name().equals(pieceType.name())) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.getSize()-1; i<board.getSize();i++,j--) {
            if (board.getBoard()[i][j] == null || !board.getBoard()[i][j].name().equals(pieceType.name())) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }


}
