import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class moon
{
    private int xLeft;
    private int yTop;
    public moon(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double MOON
               = new Ellipse2D.Double(xLeft + 10 , yTop + 15, 90,90);
        g2.setPaint(Color.white);

        g2.draw(MOON);
        g2.fill(MOON);
        
         Ellipse2D.Double CRATER1
               = new Ellipse2D.Double(xLeft + 50,yTop +20, 20,20);
        Ellipse2D.Double CRATER2
               = new Ellipse2D.Double(xLeft + 60,yTop +56, 30,20);
        Ellipse2D.Double CRATER3
               = new Ellipse2D.Double(xLeft + 13,yTop +50, 20,20);       
   
        g2.setPaint(Color.black);
        g2.draw(CRATER1);
        g2.draw(CRATER2);
        g2.draw(CRATER3);
    }
}