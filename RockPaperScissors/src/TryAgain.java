import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.stream.events.StartDocument;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.awt.event.ActionEvent;




public class TryAgain extends JFrame{
TryAgain(){


        JLabel defeat = new JLabel("Would you Like to try again?");

        JButton tryAgainButton = new JButton("Try Again");
        tryAgainButton.setSize(100,100);
        EventHandler event = new EventHandler();




        tryAgainButton.addActionListener(event);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        
        
        this.add(tryAgainButton);
        this.add(defeat);
        this.setLayout(new FlowLayout());
        this.setTitle("Tryagain");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        this.getContentPane();
        this.setBackground(Color.red);
        







        

    } private class EventHandler implements ActionListener{


        public void actionPerformed(ActionEvent event){
   
           new Difficulty();
   
           dispose();

}
    }

}