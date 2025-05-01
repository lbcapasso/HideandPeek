import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class HideandPeek implements MouseListener, MouseMotionListener
{
    private ArrayList<Hider> hiders = new ArrayList<Hider>();
    private ArrayList<Image> playerImages = new ArrayList<Image>();
    private ArrayList<Image> hidingSpotImages = new ArrayList<Image>();
    private ArrayList<HidingSpots> hidingSpots = new ArrayList<HidingSpots>();
    private HideandPeekViewer window;

    public HideandPeek()
    {
        window = new HideandPeekViewer(this);
        window.repaint();
        this.window.addMouseListener(this);
        this.window.addMouseMotionListener(this);
        Hider one = new Hider("Hider 1");
        Hider two = new Hider("Hider 2");
        Hider three = new Hider("Hider 3");
        hiders.add(one);
        hiders.add(two);
        hiders.add(three);
        HidingSpots tube = new HidingSpots();
        HidingSpots slide = new HidingSpots();
        HidingSpots tower = new HidingSpots();
        HidingSpots igloo = new HidingSpots();
        HidingSpots statue = new HidingSpots();
        HidingSpots car = new HidingSpots();
        HidingSpots plane = new HidingSpots();
        hidingSpots.add(tube);
        hidingSpots.add(slide);
        hidingSpots.add(tower);
        hidingSpots.add(igloo);
        hidingSpots.add(statue);
        hidingSpots.add(car);
        hidingSpots.add(plane);



    }


    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("mouse was clicked");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        System.out.println("mouse was pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("mouse was released");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        System.out.println("mouse was dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        System.out.println("mouse was moved");
    }
    public static void main (String[] args)
    {
        HideandPeek newGame = new HideandPeek();

    }
}

