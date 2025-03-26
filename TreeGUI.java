import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TreeGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tristan's Tree");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 450); // room for button

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            // mutable container to hold the current tree panel
            final JPanel[] treeHolder = new JPanel[1];
            treeHolder[0] = new Treefinalform();
            panel.add(treeHolder[0], BorderLayout.CENTER);

            JButton refreshButton = new JButton("Generate New Tree 🍀");
            panel.add(refreshButton, BorderLayout.SOUTH);

            refreshButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    panel.remove(treeHolder[0]); // remove old tree

                    treeHolder[0] = new Treefinalform(); // new tree
                    panel.add(treeHolder[0], BorderLayout.CENTER);

                    panel.revalidate();
                    panel.repaint();
                }
            });

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
