package tictactoe;

import javax.swing.JOptionPane;

public class Tester {

    public static void main(String[] args) {
        String[][] Board = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        GameClass Game = new GameClass(Board);
        int L = 1;
        String userName;
        userName = JOptionPane.showInputDialog(" Please enter your name");
        

        JOptionPane.showMessageDialog(null, "Greetings " + userName + "!" + "\n" + "I'm glad you want to play Tic-Tac-Toe" + "\n" + "\n" + "\n" + "This game is very simple, all you have to do its choose where you want to put your 'X'" + "\n"
                + "and compete against the computer, the rules are the same as a conventional Tic-Tac-Toe game" + "\n" + "\n" + "So lets get started!");
        JOptionPane.showMessageDialog(null, "Every time you choose a position the Tic-Tac-Toe board will be updated on the console");

        while (Game.status == false) {
            Game.playerTurn();
            Game.BoardLook(Board);
            Game.computerTurn();
            Game.BoardLook(Board);

        }

    }}
