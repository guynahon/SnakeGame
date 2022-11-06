import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ImageIcon logo = new ImageIcon("snakelogo.jpg");
        this.setIconImage(logo.getImage());
        this.setTitle("Guy's Snake Game");
    }
}
