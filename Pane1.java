import javax.swing.*;
import java.awt.*;

class Pane1 extends JPanel
{
    private String title=null;
    public Pane1(String title)
    {
        this.title = title;
    }
    @Override
 public void paintComponent(Graphics g)
 {
     super.paintComponent(g);
     Graphics2D g2 = (Graphics2D)g;
     g2.setColor(new Color(10, 160,183));
     g2.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 0, 0);
     g2.setPaint(new GradientPaint(getWidth(), 18, new Color(3, 48, 55),
             getWidth(), 3, new Color(7, 76, 87)));
     g2.fillRoundRect(0, 0, getWidth(), 32, 16, 16);
     g2.setColor(new Color(7, 76, 87));
     g2.fillRect(0, getHeight()-80, getWidth(), 80);
     g2.setFont(new Font("Arial", Font.PLAIN, 12));
     g2.setColor(Color.WHITE);
     g2.drawString(title, 20, 20);
     g2.setFont(new Font("Arial", Font.PLAIN, 10));
     g2.drawString("Copyright of Netfix @Pranav", 340, 560);
     
 }
}