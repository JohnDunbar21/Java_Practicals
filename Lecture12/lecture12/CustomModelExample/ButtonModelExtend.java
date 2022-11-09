
import javax.swing.AbstractAction;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class ButtonModelExtend extends JFrame {

    private JCheckBox checkBox;
    private JButton button; 
    
    public ButtonModelExtend() {
        initUI();
    }

    private void initUI() {
    	button = new JButton(new ButtonAction ("Toggle enabled/dissabled"));     
        checkBox = new JCheckBox("hello");

        DefaultButtonModel model = new CustomButtonModel();
        checkBox.setModel(model);
        checkBox.getModel();
        
        ((CustomButtonModel) checkBox.getModel()).extraMethod();
         
        createLayout(new JComponent [] {checkBox,button});

        this.setTitle("Custom button model");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent [] comp) {

        JPanel pane = new JPanel ();
        pane.add(comp[0]);
        pane.add(comp[1]);
        this.setContentPane(pane);
        pack();
    }

    private class CustomButtonModel extends DefaultButtonModel {
    	
    	 public void extraMethod () {
         	//do something here
             System.out.println("Hello");
         }
        @Override
        public void setEnabled(boolean b) {
            if (b) {
            	checkBox.setText(checkBox.getText().replace(" (currently dissabled)", "") );
            } else {
            	checkBox.setText(checkBox.getText() + " (currently dissabled)");
            	
            }
            super.setEnabled(b);
        }
    }

    private class ButtonAction extends AbstractAction {
        public ButtonAction (String text) {
        super (text);	
        }
        
       
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (checkBox.isEnabled()) {
            	checkBox.setEnabled(false);
            } else {
            	checkBox.setEnabled(true);
            }
        }
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

        	ButtonModelExtend ex = new ButtonModelExtend();
            ex.setVisible(true);
        });
    }
}

