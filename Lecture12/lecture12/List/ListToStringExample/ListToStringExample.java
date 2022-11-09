import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class ListToStringExample extends JFrame {


    private JList list; 
    
    public ListToStringExample() {
        initUI();
    }

    private void initUI() {
    	
    	Car [] cars = {new Car ("BMW"),new Car ("Skoda"), new Car ("Fiat") };
    	
        model = new DefaultListModel();

    	list = new JList (model);

        for(int i = 0; i < cars.length; i++) {
            list.addElement(cars[i]);
        }
    	
    	//EXMAPLE adding selection listener using anonymous class
    	ListSelectionModel  listSelectionModel = list.getSelectionModel(); 
    	listSelectionModel.addListSelectionListener( new ListSelectionListener () {
    	 @Override
    	 public void valueChanged(ListSelectionEvent e) { 
    	  if (e.getValueIsAdjusting() == false) { 
    	     System.out.println (list.getSelectedIndex());
                if(list.getSelectedIndex() > -1) {
                    model.removeElementAt(list.getSelectedIndex());
                } 
    	   } 
    	 }
    	 });  
    

        createLayout(list);

        this.setTitle("Custom list");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent comp) {

        JPanel pane = new JPanel ();
        pane.add(comp);
        this.setContentPane(pane);
        pack();
    }

    private class Car  {
    	private String model; 
    	
    	public Car (String model) {
    		this.model = model;
    	}
    
        @Override
        public String toString () {
          return model;
        }
    }



    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

        	ListToStringExample ex = new ListToStringExample();
            ex.setVisible(true);
        });
    }
}


