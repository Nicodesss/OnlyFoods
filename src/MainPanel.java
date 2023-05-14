import javax.swing.*;
import java.awt.*;

public class MainPanel extends Runnable {
    static Runnable runnable = new Runnable();
    private JLabel jcomp1;
    private JButton makeReservationBtn;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton orderFoods;



    public MainPanel(){
        jcomp1 = new JLabel ("OnlyFoods");
        makeReservationBtn = new JButton ("Make Reservation");
        jcomp3 = new JButton ("View Bookings");
        jcomp4 = new JButton ("Cancel Reservations");
        orderFoods = new JButton ("Order Food");

        //adjust size and set layout
        setPreferredSize (new Dimension(752, 457));
        setLayout (null);

        //add components
        add (jcomp1);
        add (makeReservationBtn);
        add (jcomp3);
        add (jcomp4);
        add (orderFoods);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (335, 55, 100, 25);
        makeReservationBtn.setBounds (235, 110, 270, 55);
        jcomp3.setBounds (235, 175, 270, 55);
        jcomp4.setBounds (235, 245, 270, 50);
        orderFoods.setBounds (235, 315, 270, 55);

        makeReservationBtn.addActionListener(isClicked -> {
            Reservation reservationPanel = new Reservation();
            runnable.frame.setVisible(false);


        });

        orderFoods.addActionListener(isClicked -> {
            OrderFood orderFoodFrame = new OrderFood();
            runnable.frame.setVisible(false);
        });
    }
}
