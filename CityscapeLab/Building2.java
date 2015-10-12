import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Building2 
{
    private int xLeft;
    private int yTop;
    public Building2(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
       Rectangle tower = new Rectangle(xLeft + 135, yTop + 150,100,400);
       
       Rectangle tower1 = new Rectangle(xLeft + 240, yTop + 70,100,530);
       
       Rectangle tower2 = new Rectangle(xLeft + 350, yTop + 160,100,390);
       g2.setPaint(Color.black);
      
       g2.draw (tower);
       g2.draw (tower1);
       g2.draw(tower2);
       g2.fill(tower2);
       g2.fill(tower1);
       g2.fill(tower);
    }
}
