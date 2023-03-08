import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{

    // Color name array
    private String[] colorNameArray = {"GRAY", "BLACK", "WHITE",};
    // Color list array
    private Color[] colorListArray = {Color.GRAY, Color.BLACK, Color.WHITE};
    // JList
    JList colorList;

    ColorMenu(){

        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose your color: ");
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Times New Roman", Font.BOLD, 25));
        // Allows only one selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Add event
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        // Add list to frame
        this.add(colorList);

        // Frame Layout
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Color Menu");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(300, 300);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set background color
        this.getContentPane().setBackground(Color.CYAN);
    }
    
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            getContentPane().setBackground(colorListArray[colorList.getSelectedIndex()]);
        }
    }

    public static void main(String[] args) {
        new ColorMenu();
    }
}
