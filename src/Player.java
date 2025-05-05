import javax.swing.*;
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
        look = getLook();
    }

    public Image getLook()
    {
        return new ImageIcon("Resources/Miis/thinking Mii.jpg").getImage();
    }
}
