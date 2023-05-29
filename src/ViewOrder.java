/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ViewOrder extends MainPanel {
    static JFrame viewOrderFrame = new JFrame();
    static void hideViewOrderFrame(){
        viewOrderFrame.setVisible(false);

    }
    public void showViewOrderFrame(){
        viewOrderFrame.setVisible(true);

    }


    /**
     * Creates new form RestaurantTable
     */
    public ViewOrder() {
        initComponents();
    }


    String[] columnNames = {"FIRST NAME", "LAST NAME", "EMAIL ADDRESS", "CHECK IN TIME/DATE", "NUMBER OF PEOPLE"};


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        viewBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        viewOrderFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



//        model.setRowCount(10);

        jTable1 = new javax.swing.JTable(model);
//
//        Object [] row1 = {" "," ", " ", " ", " ", " "
//        };
//        model.addRow(row1);


        jScrollPane1.setViewportView(jTable1);


        jLabel1.setText("Table Reservations");

        jLabel2.setText("Date:");

        viewBtn.setText("View Order");

        exitBtn.setText("Exit");


        deleteBtn.setText("Delete");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(viewOrderFrame.getContentPane());
        viewOrderFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField2)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(viewBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(exitBtn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
        );

        exitBtn.addActionListener(isClicked -> {
            runnable.frame.setVisible(true);
            viewOrderFrame.setVisible(false);
        });
        viewBtn.addActionListener(isCLicked ->{
        });

        deleteBtn.addActionListener(isClicked ->{
            model.removeRow(0);
        });

        viewOrderFrame.pack();


    }// </editor-fold>//GEN-END:initComponents


    void addInfos(String name, String lastName, String email, String checkIn, String numberOfPeople){
        model.addRow(new Object[]{name, lastName, email, checkIn, numberOfPeople});
//        model.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public DefaultTableModel model = new DefaultTableModel(columnNames,0);
    // End of variables declaration//GEN-END:variables
}