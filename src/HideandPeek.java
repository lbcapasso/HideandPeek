import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class HideandPeek implements MouseListener, MouseMotionListener
{
    private ArrayList<Hider> hiders = new ArrayList<Hider>();
    private ArrayList<Image> hiderImages = new ArrayList<Image>();
    private ArrayList<HidingSpots> hidingSpots = new ArrayList<HidingSpots>();
    private HideandPeekViewer window;

    public HideandPeek()
    {
        window = new HideandPeekViewer(this);
        window.repaint();
        this.window.addMouseListener(this);
        this.window.addMouseMotionListener(this);
        Hider one = new Hider("Hider 1", window);
        Hider two = new Hider("Hider 2", window);
        Hider three = new Hider("Hider 3", window);
        hiders.add(one);
        hiders.add(two);
        hiders.add(three);
        hiderImages.add(new ImageIcon("Resources/Miis/John_Mii.jpg").getImage());
        hiderImages.add(new ImageIcon("Resources/Miis/matt_wii.png").getImage());
        hiderImages.add(new ImageIcon("Resources/Miis/Mii_Female.jpg").getImage());
        for(int i = 0; i < hiders.size(); i++)
        {
            gethiderImage(hiders.get(i));
        }
        HidingSpots tube = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/tube.png").getImage(), window);
        HidingSpots slide = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/slide.png").getImage(), window);
        HidingSpots tower = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/tower.png").getImage(), window);
        HidingSpots igloo = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/igloo.png").getImage(), window);
        HidingSpots statue = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/statue.png").getImage(), window);
        HidingSpots car = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/car.png").getImage(), window);
        HidingSpots plane = new HidingSpots(new ImageIcon("Resources/Hiding_Spots/plane.png").getImage(), window);
        hidingSpots.add(tube);
        hidingSpots.add(slide);
        hidingSpots.add(tower);
        hidingSpots.add(igloo);
        hidingSpots.add(statue);
        hidingSpots.add(car);
        hidingSpots.add(plane);
        window.repaint();
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

    public void gethiderImage(Hider hider)
    {
        int num = (int)((Math.random() * 3) + 1);
        hider.setImage(hiderImages.get(num));
    }

    public ArrayList<HidingSpots> getHidingSpots() {
        return hidingSpots;
    }
}

