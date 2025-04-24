import java.util.Scanner;
import java.awt.*;

public class Hider
{
    private boolean found;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Image look;

    public Hider()
    {
        int lookFinder = (int)(Math.random() * 4 + 1);
    }
}