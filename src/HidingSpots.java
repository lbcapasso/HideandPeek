import java.awt.*;

public class HidingSpots
{
    private Hider playerHiding;
    private boolean isPlayerHiding;
    private Image look;
    private HideandPeekViewer window;
    private int x;
    private int y;


    public HidingSpots(Image newLook, HideandPeekViewer w)
    {
        look = newLook;
        window = w;
    }

    public void playerHid(Hider p)
    {
        isPlayerHiding = true;
        playerHiding = p;
    }

    public boolean isPlayerHiding()
    {
        return isPlayerHiding;
    }

    public Hider getPlayerHiding()
    {
        return playerHiding;
    }


    public void draw(Graphics g, int i)
    {
        x = 10 + (200 * i);
        y = 400;
        g.drawImage(look, x, y, 200, 150, window);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public boolean isClicked(int mouseX, int mouseY)
    {
        if (mouseX >= x && mouseX <= x + look.getWidth(window))
        {
            if (mouseY >= y && mouseY <= y + look.getHeight(window))
            {
                return true;
            }
        }
        return false;
    }

}
