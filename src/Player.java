import javax.swing.*;
import java.awt.*;

public class Player {
    private int guessesLeft;
    private String name;
    private Image look;

    public Player()
    {
        this.name = "seeker";
        this.guessesLeft = 5;
        this.look = new ImageIcon("Resources/Miis/thinking Mii.jpg").getImage(); // Make sure this path is correct
    }

    public int getGuessesLeft()
    {
        return guessesLeft;
    }

    public void lowerGuesses()
    {
        if (guessesLeft > 0)
        {
            guessesLeft--;
        }
    }

    public Image getLook()
    {
        return look;
    }

    public String getName()
    {
        return name;
    }
}