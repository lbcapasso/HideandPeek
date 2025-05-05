import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HideandPeekViewer extends JFrame
{
    private HideandPeek game;
    private Image background;
    public HideandPeekViewer(HideandPeek game1)
    {
        game = game1;
        this.setSize(1430, 800);
        this.setTitle("Hide and Peek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        background = new ImageIcon("Resources/park_ground.jpg").getImage();
    }


    public void paint(Graphics g)
    {
        g.drawImage(background, 0,0, 1430,800, this);
        ArrayList<HidingSpots> newHidingSpots = game.getHidingSpots();
        for(int i = 0; i < newHidingSpots.size(); i++)
        {
            newHidingSpots.get(i).draw(g, i);
        }
    }
}
