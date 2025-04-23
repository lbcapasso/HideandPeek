import javax.swing.*;

public class HideandPeekViewer extends JFrame
{
    private HideandPeek game;
    public HideandPeekViewer(HideandPeek game1)
    {
        game = game1;
        this.setSize(500, 500);
        this.setTitle("Hide and Peek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
