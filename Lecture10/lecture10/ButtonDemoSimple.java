

 
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 

public class ButtonDemoSimple extends JPanel implements ActionListener
                       {
    protected JButton b1, b2, b3;
    int sumleft = 0;
    int sumright = 0;
    int summiddle = 0;
 
    public ButtonDemoSimple() {
       
 
        b1 = new JButton("Button one");
        b2 = new JButton("Button two");
        b3 = new JButton("Button three");
     
       
        b1.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Button one pressed"); 
                System.out.println(sumleft += 1);
            }
            });
        b2.addActionListener(this);
        b3.addActionListener(new MyActionListener ());
 
        //Add Components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
        add(b3);
    }
   
    @Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button two pressed");
		System.out.println(summiddle += 1);
	}

	class  MyActionListener  implements ActionListener {
  
   
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button three pressed");	
            System.out.println(sumright += 1);
		} 	
    }
    
  
 
    /**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        ButtonDemoSimple newContentPane = new ButtonDemoSimple();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }

	
}