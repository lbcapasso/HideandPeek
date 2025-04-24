import java.util.Scanner;
import java.awt.*;

public class Player
{
    private int guessesLeft;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Image look;
    public Player()
    {
        name = input.nextLine();
        guessesLeft = 5;
    }
}
