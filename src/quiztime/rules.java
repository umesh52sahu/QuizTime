
package quiztime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    rules(String name){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+ name+" to Simeple Minds Quiz");
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(30,144,254));
        heading.setBounds(70,20,800,30);
        add(heading);
        
        JLabel rules =new JLabel();
        rules.setFont(new Font("Serif",Font.ITALIC,16));
        rules.setBounds(30,70,700,400);
        rules.setText(
            "<html>"+ 
                    "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                    "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                    "4. Crying is allowed but please do so quietly." + "<br><br>" +
                    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                    "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                    "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                    "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(390,470,150,30);
        back.setForeground(new Color(30,144,254));
        add(back);
        back.addActionListener(this);
        
        start=new JButton("Start");
        start.setBounds(130,470,150,30);
        start.setForeground(new Color(30,144,254));
        start.addActionListener(this);
        add(start);
        
        setSize(800,600);
        setLocation(200,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new login();
        } else{
            setVisible(false);
           new Quiz(name);
                  
        }
    }
    
    public static void main(String[] args){
        new rules("user");
    }
}
