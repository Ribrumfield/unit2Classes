import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class biulding1 
{
    private int xLeft;
    private int yTop;
    public void Biulding(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
       Rectangle tower = new Rectangle(xLeft, yTop +10,60,10);
       
       
       g2.draw (tower);
       
    }
}