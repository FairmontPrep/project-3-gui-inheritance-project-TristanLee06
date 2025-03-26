import java.awt.*;

public class Treefinalform extends Treewithfruits {
    public String finalMessage;

    public Treefinalform() {
        super();
        finalMessage = "You got " + leafColorName + " leaves with " + fruitType + "! How lucky!";
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawString(finalMessage, 75, 390);
    }
}
