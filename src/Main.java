package src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setBounds(10,10,700,600);
        jFrame.setTitle("Brick Breaker Ball");
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePlay playGame=new GamePlay();
        jFrame.add(playGame);
    }
}
