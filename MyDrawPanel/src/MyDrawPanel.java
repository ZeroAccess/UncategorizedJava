import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;

/**
 * Created by robertsg on 3/31/2015.
 */
public class MyDrawPanel extends JPanel {

    public static void main (String[] args){
        JFrame frame = new JFrame();
        MyDrawPanel button = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red,green,blue);
        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        Color endColor = new Color(red,green,blue);
        GradientPaint gradient = new GradientPaint(100,100,startColor,300,300,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(100,100,300,300);

//        Graphics2D g2d = (Graphics2D) g;
//        GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.orange);
//        g2d.setPaint(gradient);
//        g2d.fillOval(70,70,100,100);

//        g.fillRect(0,0,this.getWidth(),this.getHeight());
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//        Color randomColor = new Color(red, green , blue);
//        g.setColor(randomColor);
//        g.fillOval(70,70,100,100);


//        Image image = new ImageIcon("C:\\Users\\robertsg\\Desktop\\Misc\\Images\\batmanavatar.jpg").getImage();
//        g.drawImage(image,3,4,this);

//          g.setColor(Color.orange);
//          g.fillRect(20,50,100,100);

    }
}
