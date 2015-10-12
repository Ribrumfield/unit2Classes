import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Building3 
{
    private int xLeft;
    private int yTop;
    public Building3(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
       Rectangle lower = new Rectangle(xLeft + 470, yTop + 310,300,250);
       
       Rectangle tower1 = new Rectangle(xLeft + 800, yTop + 70,100,530);
       
       Rectangle tower2 = new Rectangle(xLeft + 960, yTop + 160,210,390);
       g2.setPaint(Color.black);
      
       g2.draw (lower);
       g2.draw (tower1);
       g2.draw(tower2);
       g2.fill(tower2);
       g2.fill(tower1);
       g2.fill(lower);
    }
}
