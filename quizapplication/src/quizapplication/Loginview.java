package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loginview extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname;

    Loginview() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz 3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("QUIZ PORTAL");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Times New Roman", Font.ITALIC, 48));

        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter your login id");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        JLabel email = new JLabel("Enter your email");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Times New Roman", Font.BOLD, 18));
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));

        add(name);
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 260, 110, 23);
        rules.setBackground(new Color(30, 140, 250));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(935, 260, 110, 23);
        back.setBackground(new Color(30, 140, 250));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rulesview(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Loginview();
    }
}
