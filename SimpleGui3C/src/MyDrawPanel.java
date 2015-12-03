import javax.swing.*;
import java.awt.*;

/**
 * Created by robertsg on 4/6/2015.
 */
public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green , blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);

    }
}
