package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    JTextArea j1=new JTextArea();
    JMenuBar jm=new JMenuBar();
    Font a1=new Font("Times New Roman",Font.BOLD,18);
    Font a2=new Font("Ms Sans Serif",Font.BOLD,18);
    Font a3=new Font("Courier New",Font.BOLD,18);
    Menu(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        jm.add(menuFont());
        jm.add(menuFont2());
        setJMenuBar(jm);
        j1.setText("Enter text");
        j1.setFont(a1);
        j1.setBackground(Color.WHITE);
        j1.setBounds(100,0,200,50);
        add(j1);
        setVisible(true);
    }

    public JMenu menuFont(){
        JMenu jmenu=new JMenu("Цвет");
        JMenuItem mj1=new JMenuItem("Синий");
        JMenuItem mj2=new JMenuItem("Красный");
        JMenuItem mj3=new JMenuItem("Чёрный");
        jmenu.add(mj1);
        jmenu.add(mj2);
        jmenu.add(mj3);
        mj1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j1.setForeground(Color.BLUE);
            }
        });
        mj2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j1.setForeground(Color.red);
            }
        });
        mj3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j1.setForeground(Color.BLACK);
            }
        });
        return jmenu;
    }

    public JMenu menuFont2(){
        JMenu jmenu=new JMenu("Стиль");
        JMenuItem mj1=new JMenuItem("Times New Roman");
        JMenuItem mj2=new JMenuItem("MS Sans Serif");
        JMenuItem mj3=new JMenuItem("Courier New");
        jmenu.add(mj1);
        jmenu.add(mj2);
        jmenu.add(mj3);
        mj1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j1.setFont(a1);
            }
        });
        mj2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               j1.setFont(a2);
            }
        });
        mj3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j1.setFont(a3);
            }
        });
        return jmenu;
    }

    public static void main(String[] args) {
        Menu a=new Menu();
    }

}
