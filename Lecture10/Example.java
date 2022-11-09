import javax.swing.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JSlider slider = new JSlider(JSlider.VERTICAL, 0, 50, 25);

        JButton button = new JButton("OK");
        System.out.println(button.VERTICAL); // prints 1 to the terminal
        button.setSize(200, 30);
        frame.add(button);
        frame.add(slider);
        frame.setSize(200, 400);
        frame.setVisible(true);
    }
}
