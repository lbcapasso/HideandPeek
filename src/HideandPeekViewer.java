import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HideandPeekViewer extends JFrame {
    private HideandPeek game;
    private Image background;

    public HideandPeekViewer(HideandPeek game1) {
        game = game1;
        this.setSize(1430, 800);
        this.setTitle("Hide and Peek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        background = new ImageIcon("Resources/park_ground.jpg").getImage();
    }


    public void paint(Graphics g) {
        int count = 0;
        g.drawImage(background, 0, 0, 1430, 800, this);
        for (HidingSpots hs : game.getHidingSpots()) {
            hs.draw(g, count);
            count++;
        }
        int count2 = 0;
        for (Hider h : game.getHiders()) {
            if (h.isFound() == true)
            {
                h.draw(g, count2);
                count2++;
            }
        }
        g.setColor(Color.BLUE);
        g.drawString("Guesses", 690, 590);

        for (int i = 0; i < game.getPlayer().getGuessesLeft(); i++) {
            g.setColor(Color.RED);
            g.fillOval(650 + (i * 30), 600, 20, 20);
            g.drawString("Find The Three Hiders", 650, 250);
        }
    }
}
