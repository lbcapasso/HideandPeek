import java.util.Scanner;
import java.awt.*;

public class Hider
{
    private boolean found;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Image look;

    public Hider(String newName)
    {
        int lookFinder = (int)(Math.random() * 4 + 1);
        found = false;
        name = newName;
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

    }
}