import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Treebase extends JPanel {
    protected BufferedImage trunkImage;
    protected String layerInfo = "Tree trunk added.";

    public Treebase() {
        loadImage();
    }

    protected void loadImage() {
        try {
            trunkImage = ImageIO.read(new File("trunk.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (trunkImage != null) {
            g.drawImage(trunkImage, 0, 0, this);
        }
    }
}
