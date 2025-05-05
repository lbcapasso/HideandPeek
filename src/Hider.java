import java.util.Scanner;
import java.awt.*;

public class Hider
{
    private boolean found;
    private String name;
    private Scanner input = new Scanner(System.in);
    private HideandPeekViewer window;
    private Image look;

    public Hider(String newName, HideandPeekViewer w)
    {
        int lookFinder = (int)(Math.random() * 4 + 1);
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

    public void draw(Graphics g)
    {
        g.drawImage(look, 100, 100,100, 100, window);
    }

    public void setImage(Image newLook)
    {
        look = newLook;
    }


}