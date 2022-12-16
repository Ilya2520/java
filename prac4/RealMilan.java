package prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class RealMilan extends JFrame {
    public void mySetText(){
        jlb1.setText("RESULT: "+ rm+" VS "+ ac);
        jlb2.setText("LAST SCORER: "+ scores);
        jlb3.setText("WINNER: "+ result);
    }
    int rm=0,ac=0;
    String scores="N/A",result="DRAW";
    JButton but1=new JButton("Real Madrid");
    JButton but2=new JButton("Ac Milan");
    JButton but3=new JButton("Reset");
    JLabel jlb1=new JLabel("RESULT: "+ rm+" VS "+ ac,SwingConstants.CENTER);
    JLabel jlb2=new JLabel("LAST SCORER: "+ scores,SwingConstants.CENTER);
    JLabel jlb3=new JLabel("WINNER: "+ result,SwingConstants.CENTER);
    JPanel jl1=new JPanel();
    Font fn=new Font("Times new roman",Font.BOLD,18);
    public RealMilan() {
        super("Real madrid vs Milan");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mySetText();
        but1.setBounds(30,250,150,40);
        but1.setBackground(new java.awt.Color(203, 23, 23));
        but2.setBounds(210,250,150,40);
        but2.setBackground(new java.awt.Color(203, 23, 23));
        but3.setBounds(125,300,150,40);
        but3.setBackground(new java.awt.Color(203, 23, 23));
        but1.setForeground(Color.white);
        but2.setForeground(Color.white);
        but3.setForeground(Color.white);
        jlb1.setBackground(new java.awt.Color(103, 130, 220));
        jlb2.setBackground(new java.awt.Color(103, 130, 220));
        jlb3.setBackground(new java.awt.Color(102, 130, 220));
        jlb1.setForeground(Color.white);
        jlb2.setForeground(Color.white);
        jlb3.setForeground(Color.white);
        jlb1.setOpaque(true);
        jlb2.setOpaque(true);
        jlb3.setOpaque(true);
        jlb1.setBounds(0,80,400,40);
        jlb2.setBounds(0,120,400,40);
        jlb3.setBounds(0,160,400,40);
        jl1.setBounds(0,0,400,400);
        jl1.setBackground(new java.awt.Color(103, 130, 220));
        jlb1.setFont(fn);
        jlb2.setFont(fn);
        jlb3.setFont(fn);
        URL imgURL1 = RealMilan.class.getResource("mil3.png");
        URL imgURL2 = RealMilan.class.getResource("rm.png");
        ImageIcon icon1 = new ImageIcon(imgURL1);
        ImageIcon icon2 = new ImageIcon(imgURL2);
        but2.setIcon(icon1);
        but1.setIcon(icon2);
        add(but1);
        add(but2);
        add(but3);
        add(jlb1);
        add(jlb2);
        add(jlb3);
        add(jl1);
        setResizable(false);
        setSize(new Dimension(400,400));
        setVisible(true);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rm+=1;
                scores="REAL MADRID";
                if (rm>ac){
                    result="REAL MADRID";
                }
                else if(rm==ac){
                    result="DRAW";
                }
                else {
                    result="AC MILAN";
                }
                mySetText();
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac+=1;
                scores="AC MILAN";
                if (rm>ac){
                    result="REAL MADRID";
                }
                else if(rm==ac){
                    result="DRAW";
                }
                else {
                    result="AC MILAN";
                }
                mySetText();

            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac=0;
                rm=0;
                scores="N/A";
                result="DRAW";
                mySetText();

            }
        });
    }

    public static void main(String[] args) {
        new RealMilan();
    }
}
