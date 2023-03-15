import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class MainMenu extends JFrame{

    MainMenu(){
        
        JLabel Logo = new JLabel();
        JLabel Logoname = new JLabel();

        Logoname.setText("ROCKPAPERSCISSORS GAME!!");
        Logoname.setHorizontalTextPosition(JLabel.CENTER);
        Logoname.setVerticalTextPosition(JLabel.TOP);
        Logoname.setVerticalAlignment(JLabel.TOP);
        Logoname.setHorizontalAlignment(JLabel.CENTER);
        Logoname.setFont(new Font("ARIAL", Font.BOLD, 50));
        Logoname.setLocation(800, 800);

        JButton startButton = new JButton("Start Game");

        startButton.setText("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 25));
        startButton.setSize(100, 100);
        startButton.setBounds(100, 100, 250, 250);
        startButton.setLocation(800, 380);
        startButton.setVerticalTextPosition(JButton.CENTER);
        startButton.setHorizontalTextPosition(JButton.CENTER);
        startButton.setLayout(new FlowLayout());
        startButton.setFocusable(false);

        EventHandler startHandler = new EventHandler();

        startButton.addActionListener(startHandler);

        this.add(startButton);
        this.add(Logoname);

        this.setTitle("RockPaperScissors");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.cyan);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            new ColorMenu();
            dispose();
        }
    }
}
