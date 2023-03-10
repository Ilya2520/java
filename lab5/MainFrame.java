package lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private MainFrame(){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpeg")), SwingConstants.CENTER);
        imgLabel.setSize(1200,1200);
        getContentPane().add(imgLabel);

        Timer timer = new Timer(100, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpeg")));
        if(imgNum == 23) imgNum = 0;

    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}
