import javax.swing.JFrame;

public class TelaJogo extends JFrame {

    private static final long serialVersionUID = 1L;

    TelaJogo() {
        ConfigJogo panel = new ConfigJogo();
        this.add(panel);
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}