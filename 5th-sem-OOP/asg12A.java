import java.awt.*;
import javax.swing.*;

public class asg12A extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(40,40,120,150);       // Head
        g.drawOval((40-20),(40+52),20,30);//left ear
        g.drawOval((50+110),(50+42),20,30);//right ear
        g.drawOval((50+7),(50+25),30,20);//left eye
        g.drawOval((50+60),(50+25),30,20);//right eye
        g.drawOval((50+35),(50+50),30,30);//nose
        g.fillOval((50+18), (50+31), 10, 10);//left pupil
        g.fillOval((50+71), (50+31), 10, 10);//right pupil
        g.fillArc((50+10), (50+75), 80, 40, 180, 180); // mouth
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiling Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new asg12A());
        frame.setVisible(true);
    }
}
