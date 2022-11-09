import javax.swing.*;

public class Example2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Checkbox Example");
        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(100, 100, 100, 50);
        JCheckBox checkbox2 = new JCheckBox("Java");
        checkbox2.setBounds(100, 150, 100, 50);
        f.add(checkbox1);
        f.add(checkbox2);
    }
}