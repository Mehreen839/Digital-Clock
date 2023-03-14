package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private  JLabel clockLabel;
    private Font font =new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("My Clock");//setTitle is method of JFrame class(parent)
        // and is called by super keyword
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
    public void createGUI(){
        //gui
        heading=new JLabel("My Clock");
        clockLabel=new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }
    public void startClock(){
        Timer timer =new Timer(1000, new ActionListener() {//action listener is interface
            @Override
            public void actionPerformed(ActionEvent e) {
             //String datetime=new Date().toString();
              //  String datetime=new Date().toLocaleString();
                Date date=new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
               String datetime= sdf.format(date);
             clockLabel.setText(datetime);
            }
        });
   timer.start();




}
}
