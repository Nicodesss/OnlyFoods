//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import javax.swing.*;

public class Runnable extends JPanel{
    static JFrame frame = new JFrame ("MyPanel");

    public static void main (String[] args) {
        frame.getContentPane().add (new MainPanel());
        frame.pack();
        frame.setVisible (true);
    }


}