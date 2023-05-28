import javax.swing.*;
import java.awt.*;

public class MainPanel extends Runnable {
    static Runnable runnable = new Runnable();
    private JLabel jcomp1;
    private JButton makeReservationBtn;
    private JButton bookingBtn;
    private JButton orderFoods;



    public MainPanel(){
        jcomp1 = new JLabel ("OnlyFoods");
        makeReservationBtn = new JButton ("Make Reservation");
        bookingBtn = new JButton ("View Bookings");

        orderFoods = new JButton ("Order Food");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


        //adjust size and set layout
        setPreferredSize (new Dimension(752, 457));
        setLayout (null);

        //add components
        add (jcomp1);
        add (makeReservationBtn);
        add (bookingBtn);

        add (orderFoods);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (335, 55, 100, 25);
        makeReservationBtn.setBounds (235, 110, 270, 55);
        bookingBtn.setBounds (235, 175, 270, 55);

        orderFoods.setBounds (235, 245, 270, 55);

        makeReservationBtn.addActionListener(isClicked -> {
            Reservation reservationPanel = new Reservation();
            runnable.frame.setVisible(false);


        });

        orderFoods.addActionListener(isClicked -> {
            OrderFood orderFoodFrame = new OrderFood();
            runnable.frame.setVisible(false);
        });

        bookingBtn.addActionListener(isClicked -> {
            ViewOrder viewOrder = new ViewOrder();
            runnable.frame.setVisible(false);
        });
    }
}
