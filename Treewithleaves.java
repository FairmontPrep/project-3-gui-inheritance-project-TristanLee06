import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Treewithleaves extends Treebase {
    protected BufferedImage leavesImage;
    protected String leafColorName;

    public Treewithleaves() {
        super();
        int leafColor = (int)(Math.random() * 2); // 0 = green, 1 = purple
        String leafFile = (leafColor == 0) ? "green.png" : "purple.png";
        leafColorName = (leafColor == 0) ? "green" : "purple";

        try {
            leavesImage = ImageIO.read(new File(leafFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        layerInfo += " Leaves added.";
    }

    /**
     * @param g
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (leavesImage != null) {
            g.drawImage(leavesImage, 0, 0, (ImageObserver) this);
        }
    }
}
