import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Peter's Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // all components fit snugly
        this.setVisible(true);
        this.setLocationRelativeTo(null); // window appear at center

    }
}
