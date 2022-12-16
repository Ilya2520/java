package prac15;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {



    Calc(){
        super("calculator");
        setSize(420,200);
        Font a=(new Font("Helvetica",Font.ITALIC,15));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final String[] s0 = {""};
        final String[] s1 = {""};
        final String[] s2 = {""};

        JTextField textUserInput = new JTextField(34);
        textUserInput.setEditable( false);
        textUserInput.setBackground(Color.white);

        JButton btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnPlus, btnMinus, btnDevide, btnMultiply, btnDot, btnClear, btnResult;

        btnZero = new JButton("0");
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnSeven.setFont(a);
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnResult = new JButton("=");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDevide = new JButton("/");
        btnMultiply = new JButton("*");
        btnClear = new JButton("C");

        btnDot = new JButton(".");

        JPanel panelMain = new JPanel();
        JButton[] buts={btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnPlus, btnMinus, btnDevide, btnMultiply, btnDot, btnClear, btnResult};
        for (int i=0;i<17;i++){
            buts[i].setFont(a);
            buts[i].setBackground(Color.BLACK);
            buts[i].setForeground(Color.WHITE);
        }
        ActionListener btnActionListenter = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                    if (!s1[0].equals(""))
                        s2[0] += s;
                    else {
                        s0[0] = s0[0] + s;
                    }
                    textUserInput.setText(s0[0] + s1[0] + s2[0]);
                }
                else if (s.charAt(0) == 'C') {
                    s0[0] = s1[0] = s2[0] = "";
                    textUserInput.setText(s0[0] + s1[0] + s2[0]);
                }
                else if (s.charAt(0) == '=') {

                    double te;
                    if (s1[0].equals("+"))
                        te = (Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]));
                    else if (s1[0].equals("-"))
                        te = (Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]));
                    else if (s1[0].equals("/"))
                        te = (Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]));
                    else
                        te = (Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]));

                    textUserInput.setText(s0[0] + s1[0] + s2[0] + "=" + te);

                    s0[0] = Double.toString(te);

                    s1[0] = s2[0] = "";
                }
                else {
                    if (s1[0].equals("") || s2[0].equals(""))
                        s1[0] = s;
                    else {
                        double te;

                        if (s1[0].equals("+"))
                            te = (Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]));
                        else if (s1[0].equals("-"))
                            te = (Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]));
                        else if (s1[0].equals("/"))
                            te = (Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]));
                        else
                            te = (Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]));

                        s0[0] = Double.toString(te);

                        s1[0] = s;

                        s2[0] = "";
                    }
                    textUserInput.setText(s0[0] + s1[0] + s2[0]);
                }
            }
        };
        for (int i=0;i<17;i++){
            buts[i].addActionListener(btnActionListenter);
        }
        panelMain.add(textUserInput);
        for (int i=0;i<17;i++){
            panelMain.add((buts[i]));
        }
        panelMain.setBackground(Color.white);
        add(panelMain);
    }

    public static void main(String[] args) {
        new Calc().setVisible(true);
    }

}