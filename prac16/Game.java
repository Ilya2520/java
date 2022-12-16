package prac16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Game extends JFrame {
    public Game(){
        super("Game");
        setSize(580,320);
        setLayout(new BorderLayout());

        JTextField userInput = new JTextField();
        userInput.setSize(20,29);
        userInput.setBackground(Color.WHITE);
        add(userInput,BorderLayout.CENTER);

        JButton userButton = new JButton("TRY");
        add(userButton, BorderLayout.SOUTH);
        final int[] counter = {0};
        Integer iProgrammValue = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userInput.getText().toString() == "") return;
                if (userInput.getText().toString().equals(iProgrammValue.toString())){
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Good job.",
                            "You are right",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else if(counter[0] == 2){
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Awwww, you lose.",
                            "Good bye",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else{
                    counter[0]++;
                    if (Integer.parseInt(userInput.getText().toString()) > iProgrammValue){
                        JOptionPane.showMessageDialog(getContentPane(),
                                "My value lower than yours",
                                "Nice try.",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(getContentPane(),
                                "My value bigger than yours",
                                "Nice try.",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }

}