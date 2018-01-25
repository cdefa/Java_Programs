package tictactoe;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameClass {

    String[][] Board ={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    int position;
    boolean status;

    public GameClass(String Board[][]) {

        this.Board = Board;

    }
    
    public void BoardLook(String Board[][]){
         for (int i = 0; i < Board.length; i++) {

            for (int j = 0; j < Board[i].length; j++) {
                System.out.print("| " + Board[i][j] + " ");
            }
            System.out.println("|");
            if(i < 2){
            System.out.print("-------------");
            }
            System.out.println();
        
    }
    }
    public void playerTurn() {
        ImageIcon TicTacToeBoard = new ImageIcon("images/TicTacToeBoard.png");
        JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, TicTacToeBoard);
        
        int position = Integer.parseInt(JOptionPane.showInputDialog("Select a position to put an 'X'" + "\n" + "Remember not to select the same position more than one time!" + "\n" + "type the respective number."));
        

        switch (position) {
            case 1:
                Board[0][0] = "X";
                break;
            case 2:
                Board[0][1] = "X";
                break;
            case 3:
                Board[0][2] = "X";
                break;
            case 4:
                Board[1][0] = "X";
                break;
            case 5:
                Board[1][1] = "X";
                break;
            case 6:
                Board[1][2] = "X";
                break;
            case 7:
                Board[2][0] = "X";
                break;
            case 8:
                Board[2][1] = "X";
                break;
            case 9:
                Board[2][2] = "X";
                break;
        }
        
    }

    /*public void status(boolean status, String Board[][]) {
        if ((Board[0][0] = "X") && Board[0][1] = "X" && Board[0][2] = "X") || (Board[0][0] = "O" && Board[0][1] = "O" && Board[0][2] = "O")) {
            status = false;
        }
        if ((Board[0][0] = "X" && Board[1][0] = "X" && Board[2][0] = "X") || (Board[0][0] = "O" && Board[1][0] = "O" && Board[2][0] = "O")) {
            status = false;
        }
        if ((Board[1][0] = "X" && Board[1][1] = "X" && Board[1][2] = "X") || (Board[1][0] = "O" && Board[1][1] = "O" && Board[1][2] = "O")) {
            status = false;
        }
        if ((Board[2][0] = "X" && Board[2][1] = "X" && Board[2][2] = "X") || (Board[2][0] = "O" && Board[2][1] = "O" && Board[2][2] = "O")) {
            status = false;
        }
        if ((Board[0][1] = "X" && Board[1][1] = "X" && Board[2][1] = "X") || (Board[0][1] = "O" && Board[1][1] = "O" && Board[2][1] = "O")) {
            status = false;
        }
        if ((Board[0][2] = "X" && Board[1][2] = "X" && Board[2][2] = "X") || (Board[0][2] = "O" && Board[1][2] = "O" && Board[2][2] = "O")) {
            status = false;
        }
        if ((Board[0][0] = "X" && Board[1][1] = "X" && Board[2][2] = "X") || (Board[0][0] = "O" && Board[1][1] = "O" && Board[2][2] = "O")) {
            status = false;
        }
        if ((Board[2][0] = "X" && Board[1][1] = "X" && Board[0][2] = "X") || (Board[2][0] = "O" && Board[1][1] = "O" && Board[0][2] = "O")) {
            status = false;
        }

    }
*/

public void computerTurn() {

        Random rand = new Random();
        int position = rand.nextInt(9) + 1;

        switch (position) {
            case 1:
                Board[0][0] = "O";
                break;
            case 2:
                Board[0][1] = "O";
                break;
            case 3:
                Board[0][2] = "O";
                break;
            case 4:
                Board[1][0] = "O";
                break;
            case 5:
                Board[1][1] = "O";
                break;
            case 6:
                Board[1][2] = "O";
                break;
            case 7:
                Board[2][0] = "O";
                break;
            case 8:
                Board[2][1] = "O";
                break;
            case 9:
                Board[2][2] = "O";
                break;

        }
        
    }
}
