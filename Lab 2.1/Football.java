package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Football extends JFrame
{
    int milan = 0;
    int rm = 0;
    JLabel res = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel win = new JLabel("Winner: DRAW");
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    Football() {
        super("Football");
        setLayout(new FlowLayout());
        setSize(350,400);
        add(res);
        res.setForeground(Color.pink);
        add(last);
        last.setForeground(Color.RED);
        add(win);
        win.setForeground(Color.GREEN);
        add(button1);
        add(button2);
button1.addActionListener(new ActionListener()  //AC Milan
    {
        public void actionPerformed(ActionEvent ae)
        {
            milan+=1;
            res.setText("Result: " + milan + " X " + rm);
            last.setText("Last Scorer: AC Milan");
            if (milan>rm) {
                win.setText("Winner: WIN");
            }
            if (milan<rm){
                win.setText("Winner: LOSE");
            }
            if (milan==rm){
                win.setText("Winner: DRAW");
            }
        }
    });
button2.addActionListener(new ActionListener() {  //Real Madrid
    public void actionPerformed(ActionEvent ae)
    {
        rm+=1;
        res.setText("Result: " + milan + " X " + rm);
        last.setText("Last Scorer: Real Madrid");
        if (milan>rm) {
            win.setText("Winner: LOSE");
        }
        if (milan<rm){
            win.setText("Winner: WIN");
        }
        if (milan==rm){
            win.setText("Winner: DRAW");
        }
    }
});
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Football();
    }
}
