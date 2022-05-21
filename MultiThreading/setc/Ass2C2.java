import java.awt.*;
import javax.swing.*;

class Ass2C2 extends JFrame implements Runnable{
        Thread t;
        int x, y;

        Ass2C2() {
            super();
            t = new Thread(this);
            x = 10;
            y = 10;
            t.start();
            setSize(700, 700);
            setVisible(true);
            setTitle("BOUNCING BALL WINDOW");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void run() {
            try {
                while (true) {
                    x += 10;
                    y += 10;
                    repaint();
                    Thread.sleep(1000);
                }
            } catch (Exception e) {

            }
        }

        public void paint(Graphics g) {

            g.drawOval(x, y, 7, 7);

        }

        public static void main(String args[]) throws Exception {
            Ass2C2 t = new Ass2C2();
            Thread.sleep(10);
        }
    }


