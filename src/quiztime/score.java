
package quiztime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score  extends JFrame implements ActionListener {
    JButton submit;
    score(String name,int score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,150,300,270);
        add(image);
        
        JLabel heading=new JLabel(" Thank You " +name+" For Playing Simple Minds Quiz");
        heading.setBounds(50,50,700,30);
        heading.setFont(new Font("Tahoma",Font.ITALIC,26));
        add(heading);
        
        JLabel tscore=new JLabel(" Your Score is " + score);
        tscore.setBounds(330,220,700,30);
        tscore.setFont(new Font("Tahoma",Font.ITALIC,26));
        add(tscore);
        
        submit=new JButton("Play Again");
        submit.setBounds(370,300,156,30);
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setBounds(150,100,700,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            setVisible(false);
            new login();
            
        }
    }
    
    public static void main(String[] args){
        new score("User",0);
    }
       
}
