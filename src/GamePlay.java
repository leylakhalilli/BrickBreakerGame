package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;

    private int score = 0;
    private int totalBricks = 21;
    private Timer time;
    private int delay = 0;
    private int playerX = 310;

    private int ballposX = 120;
    private int ballposY = 350;
    private int ballX = -1;
    private int ballY = -2;

    public GamePlay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
//        time = new Timer(delay, this);
//        time.start();
    }

    public void paint(Graphics graphics) {
        //background
        graphics.setColor(Color.BLACK);
        graphics.fillRect(1, 1, 692, 592);
        //ball
        graphics.setColor(Color.red);
        graphics.fillRect(ballposX, ballposY, 20, 20);


        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, 3, 592);
        graphics.fillRect(0, 0, 692, 3);
        graphics.fillRect(0, 0, 3, 592);

        graphics.setColor(Color.green);
        graphics.fillRect(playerX, 550, 100, 8);

        graphics.dispose();

    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }

    public void moveLeft() {
        play = true;
        playerX -= 20;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time.start();
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
