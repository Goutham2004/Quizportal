package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rulesview extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rulesview(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to quiz portal");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. Each correct answer earns your house 10 points." + "<br><br>" +
                        "2. Each question will have four answer choices." + "<br><br>" +
                        "3. You will have 15 seconds to answer each question." + "<br><br>" +
                        "4. If you do not answer a question within 15 seconds, it will be marked incorrect.."
                        + "<br><br>" +
                        "5. You have three 50/50 lifelines that you can use on any question." + "<br><br>" +
                        "6. To use a 50/50 lifeline, click the \"50/50\" button. This will remove two incorrect answer choices, leaving you with two choices."
                        + "<br><br>" +
                        "7. You can only use one 50/50 lifeline per question." + "<br><br>" +
                        "8. Once you use a 50/50 lifeline, you cannot undo it." + "<br><br>" +
                        "9. You cannot use a 50/50 lifeline on the final question.." + "<br><br>" +
                        "10. The highest score is 10 points. Each correct answer is worth 1 point." + "<br><br>" +
                        "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quizview(name);
        } else {
            setVisible(false);
            new Loginview();
        }
    }

    public static void main(String[] args) {
        new Rulesview("User");
    }
}
