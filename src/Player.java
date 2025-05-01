import java.util.Scanner;
import java.awt.*;

public class Player
{
    private int guessesLeft;
    private String name;
    private Scanner input = new Scanner(System.in);
    int lookGetter;
    private Image look;
    public Player()
    {
        name = input.nextLine();
        guessesLeft = 5;
        lookGetter = getLook();
    }

    public int getLook()
    {
        return (int)((Math.random() * 4) + 1);
    }
}
