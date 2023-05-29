import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;

public class MainPanel extends Runnable {
    static Runnable runnable = new Runnable();
    private JLabel jcomp1;
    private JButton makeReservationBtn;
    private JButton bookingBtn;
    private JButton orderFoods;
    static OrderFood orderFoodFrame = new OrderFood();
    static Reservation reservationPanel = new Reservation();
    static ViewOrder viewOrder = new ViewOrder();


    public MainPanel(){

        jcomp1 = new JLabel ("OnlyFoods");
        makeReservationBtn = new JButton ("Make Reservation");
        bookingBtn = new JButton ("View Bookings");

        orderFoods = new JButton ("Order Food");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


        //adjust size and set layout
        setPreferredSize (new Dimension(752, 400));
        setLayout (null);

        //add components
        add (jcomp1);
        add (makeReservationBtn);
        add (bookingBtn);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (335, 55, 100, 25);
        makeReservationBtn.setBounds (235, 110, 270, 55);
        bookingBtn.setBounds (235, 200, 270, 55);

        makeReservationBtn.addActionListener(isClicked -> {
            reservationPanel.showReservationFrame();
            runnable.frame.setVisible(false);


        });

        bookingBtn.addActionListener(isClicked -> {
            viewOrder.showViewOrderFrame();
            runnable.frame.setVisible(false);
        });
    }


}
