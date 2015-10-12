import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class detail
{
    private int xLeft;
    private int yTop;
    public detail(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
       Rectangle antena = new Rectangle(xLeft + 490, yTop + 240,35,100);
       
       g2.setPaint(Color.black);
       g2.draw(antena);
       g2.fill(antena);
    }
}
