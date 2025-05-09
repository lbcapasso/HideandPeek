import java.util.Scanner;
import java.awt.*;

public class Hider
{
    private boolean found;
    private String name;
    private Scanner input = new Scanner(System.in);
    private HideandPeekViewer window;
    private Image look;
    private boolean isHidden;

    public Hider(String newName, HideandPeekViewer w)
    {
        found = false;
        name = newName;
        window = w;
    }

    public boolean isFound()
    {
        return found;
    }

    public void setFound(boolean found)
    {
        this.found = found;
    }

    public void Hide(HidingSpots i)
    {
        isHidden = true;
    }

    public void draw(Graphics g, int i)
    {
        g.drawImage(look, 600 + (100 * i), 100,100, 100, window);
    }

    public void setImage(Image newLook)
    {
        look = newLook;
    }



}