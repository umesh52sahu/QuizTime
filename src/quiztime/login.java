
package quiztime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JButton rules, exit;
    JTextField fname;
    login(){
        getContentPane().setBackground(new Color(30,144,254));
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(20,10,900,300);
        add(image);
        
        JLabel headline=new JLabel("Simple Minds Quiz");
        headline.setFont(new Font("Viner Hand ITC",Font.ITALIC,42));
        headline.setBounds(100,330,1000,80);
        add(headline);
        
        JLabel Name=new JLabel("Enter your Name ");
        Name.setFont(new Font("Serif",Font.ITALIC,20));
        Name.setBounds(70,400,1000,80);
        add(Name);
        
        rules=new JButton("Rules");
        rules.setBounds(70,500,150,30);
        rules.addActionListener(this);
        add(rules);
        
        exit=new JButton("Exit");
        exit.setBounds(330,500,150,30);
        add(exit);
        exit.addActionListener(this);
        
        fname=new JTextField();
        fname.setBounds(280,424,200,30);
        add(fname);
        
        setSize(955,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=fname.getText();
            new rules(name);
            setVisible(false);
        } else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new login();
    }
}
