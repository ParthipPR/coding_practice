/* 
Using Swing create a JFrame with a JLabel and two JButtons. Set the texts of JButtons as 
“Yes” and “No” respectively. Set the JLabel’s text to the text of the button currently being 
pressed. Initially the JLabel’s text is blank.

 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class OOPA1Q2{

    public static void main (String args[]){

        JFrame Frame = new JFrame("Assignment 1 Q 1");
        JLabel Label = new JLabel();
        JButton Button = new JButton("Yes");
        JButton Nobutton = new JButton("No");

        Button.addActionListener(new ActionListener(){
      
            public void actionPerformed(ActionEvent e) {
            
                Label.setText(Button.getText());
            }
            });

        Nobutton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
            
                Label.setText(Nobutton.getText());
            }
            });

        Frame.add(Label);
        Frame.add(Button);
        Frame.add(Nobutton);

        
        Frame.setLayout(new FlowLayout());
        Frame.setSize(200, 200);

        
        Frame.setVisible(true);


    }
}