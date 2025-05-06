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
        int count = 0;
        g.drawImage(background, 0,0, 1430,800, this);
        for(HidingSpots hs : game.getHidingSpots())
        {
            hs.draw(g,count);
            count++;
        }
         int count2 = 0;
        for(Hider h : game.getHiders())
        {
            h.draw(g,count2);
            count2++;
        }

        getGraphics().drawString("this is a test String", 300, 500);
    }
}
