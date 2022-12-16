package prac15;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Country extends JFrame {




    public Country(){
        super("Countries");
        setLayout(new GridLayout(3,1));

        Font fontMedium = new Font("Verdana", Font.PLAIN, 24);
        Font fontLarge = new Font("Verdana", Font.PLAIN, 28);
        Font fontSmall = new Font("Verdana", Font.PLAIN, 20);

        JPanel[] panel = new JPanel[3];
        final JLabel countryName = new JLabel(" ");
        final JLabel textPopulation = new JLabel("");
        JLabel Bel = new JLabel(new ImageIcon("bel.jpg"));
        JLabel Rus = new JLabel(new ImageIcon("rus.jpg"));
        JLabel Ger = new JLabel(new ImageIcon("ger.jpg"));
        String[] arCountries = {
                "Russia",
                "Belarus",
                "Germany"
        };

        panel[0] = new JPanel();
        panel[0].setBackground(Color.WHITE);
        panel[1] = new JPanel();
        panel[1].setBackground(Color.WHITE);
        panel[2] = new JPanel();
        panel[2].setBackground(Color.WHITE);

        add(panel[0]);
        add(panel[1]);
        add(panel[2]);
        panel[1].add(Rus);

        textPopulation.setFont(fontSmall);
        panel[2].add(textPopulation);


        JComboBox comboBox = new JComboBox(arCountries);
        comboBox.setFont(fontLarge);
        comboBox.setBackground(Color.WHITE);
        panel[0].add(comboBox);

        comboBox.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                countryName.setText(item);

                switch (item){
                    case "Belarus":
                        panel[1].remove(0);
                        panel[1].add(Bel);
                        textPopulation.setText("Capital - Minsk,Population: 9,2 million");
                        break;
                    case "Russia":
                        panel[1].remove(0);
                        panel[1].add(Rus);
                        textPopulation.setText("Capital- Moscow,Population: 146,1 million");
                        break;
                    case "Germany":
                        panel[1].remove(0);
                        panel[1].add(Ger);
                        textPopulation.setText("Capital - Berlin, Population: 19,1 million");
                }
            }
        });


        setSize(480,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[]args)
    {
        new Country().setVisible(true);
    }
}
