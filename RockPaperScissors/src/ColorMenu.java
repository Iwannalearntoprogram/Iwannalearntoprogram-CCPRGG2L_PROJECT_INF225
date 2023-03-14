import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

class ColorMenu extends JFrame{

    private String[] colorNameArray = {"GRAY", "BLACK", "WHITE", "MAGENTA"};
    
    private Color[] colorListArray = {Color.GRAY, Color.BLACK, Color.WHITE, Color.MAGENTA};
    
    JList<String> colorList;

    ColorMenu(){

        
        JLabel label = new JLabel();
        label.setText("Choose your color: ");
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        this.add(label);

       
        colorList = new JList<>(colorNameArray);
        colorList.setFont(new Font("Times New Roman", Font.BOLD, 25));
        
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

       
        this.add(colorList);

        
        this.setLayout(new FlowLayout());        
        this.setTitle("Color Menu");        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);       
        this.setSize(300, 300);        
        this.setLocationRelativeTo(null);       
        this.setVisible(true);        
        this.setResizable(false);        
        this.getContentPane().setBackground(Color.CYAN);
    }
    
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){

            ERPS.GBGC = colorListArray[colorList.getSelectedIndex()];

            new ERPS();
            dispose();
        }
    }
}
