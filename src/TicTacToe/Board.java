package TicTacToe;
import com.sun.tools.javac.util.Pair;
import java.util.ArrayList;
import java.util.List;


public class Board {
    private int size;
    private PieceType[][] board;

    public Board(int size) {
        this.size = size;
        board = new PieceType[size][size];
    }

    public PieceType[][] getBoard() {
        return board;
    }

    public int getSize() {
        return size;
    }

    boolean addPiece(int row, int col, PieceType pieceType){
        if(board[row][col]!=null){
            return false;
        }
        board[row][col] = pieceType;
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i =0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j]==null){
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }


    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

}
