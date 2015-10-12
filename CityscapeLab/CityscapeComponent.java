import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JPanel
{
    // define the objects in your Cityscape as instance variables
    public CityscapeComponent() 
    { 
        GradientPaint bluetoyellow = new GradientPaint(0,0,Color.BLUE,100,0,Color.YELLOW);
        //Color lightblue = new Color(110,193,255);
        
    } 
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = Color.BLUE;
        Color color2 = Color.YELLOW;
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        
        Graphics2D g2 = (Graphics2D) g;
        Building1 building1 = new Building1(10,60);
        Building2 building2 = new Building2(10,60);
        Building3 building3 = new Building3(10,60);
        detail Detail = new detail(10,60);
        moon Moon = new moon(20,10);
        
        // invoke the draw method on each object in your Cityscape
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        Detail.draw(g2);
        Moon.draw(g2);
        
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
