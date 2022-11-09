import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SwingExample1 extends JFrame {
    private final JLabel helloLabel;
    private final JButton button;
    private final JLabel newLine;

    public SwingExample1() {
        setTitle("Simple Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        helloLabel = new JLabel("Hello World!");
        this.add(helloLabel);
        newLine = new JLabel("\n");
        this.add(newLine);
        button = new JButton("Click this, or else...");
        button.setBounds(50, 100, 95, 30);
        this.add(button);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingExample1 ex = new SwingExample1();
    }
}
