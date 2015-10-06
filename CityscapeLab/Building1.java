import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Building1 
{
    private int xLeft;
    private int yTop;
    public Building1(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
       Rectangle tower = new Rectangle(xLeft, yTop +10,100,450);
       Rectangle window1 = new Rectangle (xLeft + 10, yTop +280,30,50);
       Rectangle window2 = new Rectangle (xLeft + 60, yTop +280,30,50);
       Rectangle window3 = new Rectangle (xLeft + 10, yTop +280,30,50);
       Rectangle window4 = new Rectangle (xLeft + 60, yTop +280,30,50);       
       
       g2.draw (tower);
       g2.draw (window1);
       g2.draw (window2);
    }
}
