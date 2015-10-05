import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.applet.Applet;
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
        Color lightblue = new Color(110,193,255);
        setBackground(lightblue); 
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
        
        Graphics2D g2 = (Graphics2D) g;
        Building1 building1 = new Building1(10,60);
        building1.draw(g2);
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
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
