/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

import com.sun.swing.internal.plaf.basic.resources.basic_ja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Doddc
 */
public class JavaApplication6 extends JFrame{
    public  JavaApplication6(){
        this.setSize(300, 300);
        this.setLayout(null);
        this.setVisible(true);
        JButton button=new JButton("one");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBounds(20, 20, 150, 150);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn2=new JButton("tow");
                btn2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JavaApplication6.this.add(button);
                        JavaApplication6.this.remove(btn2);
                        JavaApplication6.this.repaint();
                    }
                });
                btn2.setBounds(150, 50, 150, 150);
                JavaApplication6.this.add(btn2);
                JavaApplication6.this.remove(button);
                JavaApplication6.this.repaint();

            }
        });
        this.add(button);
        this.setLocationRelativeTo(null);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaApplication6();
    }
    
}
