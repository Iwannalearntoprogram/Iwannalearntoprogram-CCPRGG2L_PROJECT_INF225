import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    private JButton startButton;

    MainMenu() {
        // Create and set up the Start Game button
        startButton = new JButton("Start Game");
        startButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        startButton.addActionListener(e -> {
            // Open the ColorMenu and set the background color based on the user's selection
            ColorMenu colorMenu = new ColorMenu();
            colorMenu.setVisible(true);
            colorMenu.colorList.addListSelectionListener(event -> {
            Color selectedColor = colorMenu.colorListArray[colorMenu.colorList.getSelectedIndex()];
            getContentPane().setBackground(selectedColor);
                
            });
        });
        this.add(startButton);

        // Set up the JFrame
        this.setLayout(new FlowLayout());
        this.setTitle("Rock Paper Scissors");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
