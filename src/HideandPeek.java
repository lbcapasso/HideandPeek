import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class HideandPeek implements MouseListener, MouseMotionListener
{
    private Hider[] hiders = new Hider[3];
    private HideandPeekViewer window;

    public HideandPeek()
    {
        window = new HideandPeekViewer(this);
        window.repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

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

    }

    @Override
    public void mouseMoved(MouseEvent e)
    {

    }
    public static void main (String[] args)
    {
        HideandPeek newGame = new HideandPeek();

    }
}

