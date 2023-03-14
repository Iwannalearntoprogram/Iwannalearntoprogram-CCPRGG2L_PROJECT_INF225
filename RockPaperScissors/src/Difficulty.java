import javax.print.DocFlavor.STRING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.stream.events.StartDocument;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;



public class Difficulty extends JFrame{

    Timer time;
    ERPS USERNAME;

        

    Difficulty(){
       


        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler Difficulty1 = new EventHandler();
        easyButton.addActionListener(Difficulty1);

    

        this.add(easyButton);
        // this.setLayout(new FlowLayout());
        this.setTitle("RockPaperScissors");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        


        JButton normalButton = new JButton();
        normalButton.setText("NORMAL");
        normalButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler1 Difficulty2 = new EventHandler1();
        normalButton.addActionListener(Difficulty2);

    

        this.add(normalButton);
        // this.setLayout(new FlowLayout());
        this.setTitle("RockPaperScissors");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler2 Difficulty3 = new EventHandler2();
        hardButton.addActionListener(Difficulty3);

    

        this.add(hardButton);
        // this.setLayout(new FlowLayout());
        this.setTitle("RockPaperScissors");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        
       

    } private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String title = JOptionPane.showInputDialog("Enter Username:");
            new ERPS().setTitle(title);
            dispose();
              
            
                       


          
        

            
        }
    }private class EventHandler1 implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String title = JOptionPane.showInputDialog("Enter Username:");
            new NRPS().setTitle(title);
            dispose();
            

            

        }


}private class EventHandler2 implements ActionListener{

        public void actionPerformed(ActionEvent event){
            String title = JOptionPane.showInputDialog("Enter Username:");

            new HRPS().setTitle(title);

            dispose();

            

        }

    }

}






