/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewOrder extends MainPanel {
    static int selectedRow;

    static JFrame viewOrderFrame = new JFrame();
    static void hideViewOrderFrame(){
        viewOrderFrame.setVisible(false);

    }
    public void showViewOrderFrame(){
        viewOrderFrame.setVisible(true);
    }
    public ViewOrder() {
        initComponents();
    }

    String[] columnNames = {"FIRST NAME", "LAST NAME", "EMAIL ADDRESS", "CHECK IN TIME/DATE", "NUMBER OF PEOPLE"};

    public void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        viewOrderFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table = new javax.swing.JTable(model);

        jScrollPane1.setViewportView(table);

        jLabel1.setText("Table Reservations");

        backBtn.setText("Back");

        deleteBtn.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(viewOrderFrame.getContentPane());
        viewOrderFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()

                                                .addGap(18, 18, 18)
                                                .addComponent(deleteBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(backBtn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        )
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)

                                )
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(41, 41, 41))
        ));
        backBtn.addActionListener(isClicked -> {
            runnable.frame.setVisible(true);
            viewOrderFrame.setVisible(false);
        });

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    orderFoodFrame.showOrderFoodFrame();
                    if (!(OrderFood.orderDataClasses[ViewOrder.selectedRow] == null)) {
                        orderFoodFrame.chickenTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getChicken());
                        orderFoodFrame.burgerTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getBurger());
                        orderFoodFrame.steakTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getSteak());
                        orderFoodFrame.FriesandOnionringsTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getFno());
                        orderFoodFrame.BaconandEggTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getBng());
                        orderFoodFrame.icedteaTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getIcedTea());
                        orderFoodFrame.cokeTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getCoke());
                        orderFoodFrame.lemonjuiceTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getLemon());
                        orderFoodFrame.spriteTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getSprite());
                        orderFoodFrame.orangeTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getOrange());
                        orderFoodFrame.costofmealsTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getCom());
                        orderFoodFrame.costofdrinksTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getCod());
                        orderFoodFrame.totalcostofitemsTxtFd.setText(OrderFood.orderDataClasses[selectedRow].getTc());

                    }

                }
            }

        });

        deleteBtn.addActionListener(isClicked ->{

            try {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != 1) {
                    model.removeRow(selectedRow);
                }
                }catch (ArrayIndexOutOfBoundsException e){

            }


        });

        viewOrderFrame.pack();
    }

    void addInfos(String name, String lastName, String email, String checkIn, String numberOfPeople){
        model.addRow(new Object[]{name, lastName, email, checkIn, numberOfPeople});
    }

    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    public DefaultTableModel model = new DefaultTableModel(columnNames,0);
    // End of variables declaration//GEN-END:variables
}