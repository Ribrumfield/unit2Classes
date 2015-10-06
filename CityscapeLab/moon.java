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
               = new Ellipse2D.Double(xLeft + 10 , yTop + 30, 40,40);
        
        g2.draw (MOON);
    }
}