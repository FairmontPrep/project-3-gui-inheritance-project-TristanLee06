import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Treewithfruits extends Treewithleaves {
    protected BufferedImage fruitImage;
    protected String fruitType;

    public Treewithfruits() {
        super();
        int fruitChoice = (int)(Math.random() * 2); // 0 = apples, 1 = oranges
        fruitType = (fruitChoice == 0) ? "apples" : "oranges"; 
        String fruitFile = fruitType.equals("apples") ? "apples.png" : "oranges.png";

        try {
            fruitImage = ImageIO.read(new File(fruitFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        layerInfo += " " + fruitType + " added randomly.";
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fruitImage != null) {
            g.drawImage(fruitImage, 0, 0, this);
        }
    }
}
