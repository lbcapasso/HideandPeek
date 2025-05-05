import java.awt.*;

public class HidingSpots
{
    private Player playerHiding;
    private boolean isPlayerHiding;
    private Image look;
    private HideandPeekViewer window;


    public HidingSpots(Image newLook, HideandPeekViewer w)
    {
        look = newLook;
        window = w;
    }

    public void playerHid()
    {
        isPlayerHiding = true;

    }

    public void hide()
    {

    }

    public void draw(Graphics g, int i)
    {
        g.drawImage(look, 250 +(100 * i), 600, 100, 150, window);
    }
}
