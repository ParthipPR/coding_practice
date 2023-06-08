/*
Write a Java program using Swing to create a frame having three text fields, threelabels and a 
button. The interface has to accept a number in the first text field. While clicking the button, 
the second and third textfields have to display the previous number and next number 
respectively, of the accepted input number
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;





class OOPA1Q2{

    public static void main (String args[]){

        JFrame Frame = new JFrame("Assignment 2 Q 2");
        JLabel Label = new JLabel("Number");
        JTextField text = new JTextField(5);
        JButton Button = new JButton("find");
        JLabel Label1 = new JLabel("Previous number");
        JTextField text1 = new JTextField(5);
        JLabel Label2 = new JLabel("Next number");
        JTextField text2 = new JTextField(5);
       

        Button.addActionListener(new ActionListener(){
      
            public void actionPerformed(ActionEvent e) {
            
                text1.setText(Integer.toString(Integer.parseInt(text.getText())-1));
                text2.setText(Integer.toString(Integer.parseInt(text.getText())+1));
            }
            });

       

        Frame.add(Label);
        Frame.add(text);
        Frame.add(Button);
        Frame.add(Label1);
        Frame.add(text1);
        Frame.add(Label2);
        Frame.add(text2);
       
        
        Frame.setLayout(new FlowLayout());
        Frame.setSize(200, 200);

        
        Frame.setVisible(true);



    }
}