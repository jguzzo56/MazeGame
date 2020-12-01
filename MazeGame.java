package maze;

import MazeClass.MazeClass;
import MazeClass.GameBoard;
import java.util.Scanner;
import javax.swing.JFrame;

public class MazeGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MazeClass player = new MazeClass(0, 0, 1, 4);   
        
        GameBoard window = new GameBoard();
        window.setLocation(860, 440);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 400);
        window.setVisible(true);
        
    
        
        
        System.out.println("You are facing north. You are at (0,0)");
        for (int i = 1; i <= 77; i++) {
            System.out.println("Move (1), turn left (2), turn right (3), or quit (4)?");
            int move = in.nextInt();
            if (move == 1) {
//              System.out.println("Number of spaces to move: ");
//              int spaces = in.nextInt();
                player.move(1);
            } 
            if (move == 2) {
                player.turnLeft();
            }
            if (move == 3) {
                player.turnRight();
            }
            if (move == 4) {
                player.quit();
            }

        }
    }


}
