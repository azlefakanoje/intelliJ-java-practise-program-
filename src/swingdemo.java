import javax.swing.*;

import java.awt.*;

public class swingdemo extends JFrame {
    public static void main(String args[]){
        swingdemo sd=new swingdemo();
        sd.setSize(400,400);
        sd.setVisible(true);
        sd.setLayout(new FlowLayout());
        JLabel l1=new JLabel("name");
        JTextField t1=new JTextField(20);
        JRadioButton rb=new JRadioButton("male");
        JRadioButton rb1=new JRadioButton("female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb);
        bg.add(rb1);
        JCheckBox ch=new JCheckBox ("python");
        JCheckBox ch1=new JCheckBox("java");
        JButton b1=new JButton("submit");
        sd.add(l1);
        sd.add(t1);
        sd.add(rb);
        sd.add(rb1);
        sd.add(ch);
        sd.add(ch1);
        sd.add(b1);


    }



}
