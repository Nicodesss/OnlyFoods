
import javax.swing.*;

public class OrderFood extends MainPanel {
   static OrderDataClass[] orderDataClasses = new OrderDataClass[10];

    static void hideOrderFoodFrame(){
        orderFrame.setVisible(false);
    }

    public void showOrderFoodFrame(){
        orderFrame.setVisible(true);

    }
    static JFrame orderFrame = new JFrame();

    public OrderFood() {
        initComponents();
    }

    public void initComponents() {


        jLabel1 = new javax.swing.JLabel();
        totalButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        burgerTxtFd = new javax.swing.JTextField();
        steakTxtFd = new javax.swing.JTextField();
        FriesandOnionringsTxtFd = new javax.swing.JTextField();
        BaconandEggTxtFd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chickenTxtFd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        orangeTxtFd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cokeTxtFd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spriteTxtFd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        icedteaTxtFd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lemonjuiceTxtFd = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        costofmealsTxtFd = new javax.swing.JTextField();
        costofdrinksTxtFd = new javax.swing.JTextField();
        totalcostofitemsTxtFd = new javax.swing.JTextField();

        orderFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("          ONLY FOODS ");

        totalButton.setText("TOTAL");

        saveButton.setText("SAVE");

        backBtn.setText("BACK");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("               MEALS");

        jLabel3.setText("Chicken");

        jLabel4.setText("Burger");

        jLabel5.setText("Steak");

        jLabel6.setText("Fries and Onion rings");

        jLabel7.setText("Bacon and Egg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(chickenTxtFd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addComponent(burgerTxtFd)
                                        .addComponent(steakTxtFd)
                                        .addComponent(FriesandOnionringsTxtFd)
                                        .addComponent(BaconandEggTxtFd))
                                .addGap(69, 69, 69))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(chickenTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(burgerTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(steakTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FriesandOnionringsTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BaconandEggTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setText("Coke");

        jLabel11.setText("Lemon Juice");

        jLabel12.setText("Sprite");

        jLabel8.setText("DRINKS");

        jLabel9.setText("IcedTea");

        jLabel13.setText("Orange");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel8)
                                .addContainerGap(162, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lemonjuiceTxtFd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(spriteTxtFd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(orangeTxtFd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cokeTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(icedteaTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(icedteaTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(cokeTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(lemonjuiceTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spriteTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(orangeTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("RECEIPT");

        jLabel15.setText("COST OF MEALS");

        jLabel16.setText("COST OF DRINKS");

        jLabel17.setText("TOTAL COST OF ITEMS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(41, 41, 41)
                                                .addComponent(totalcostofitemsTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel15))
                                                .addGap(71, 71, 71)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(costofmealsTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(costofdrinksTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(217, 217, 217))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(costofmealsTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(costofdrinksTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(totalcostofitemsTxtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(orderFrame.getContentPane());
        orderFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 33, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(173, 173, 173)
                                                .addComponent(totalButton)
                                                .addGap(117, 117, 117)
                                                .addComponent(saveButton)
                                                .addGap(121, 121, 121)
                                                .addComponent(backBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(307, 307, 307)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalButton)
                                        .addComponent(saveButton)
                                        .addComponent(backBtn))
                                .addGap(0, 28, Short.MAX_VALUE))
        );
        backBtn.addActionListener(isClicked -> {

            orderFrame.setVisible(false);
            viewOrder.showViewOrderFrame();
        });
        saveButton.addActionListener(isCLicked -> {
            clearTextFields();
            viewOrder.showViewOrderFrame();
            hideOrderFoodFrame();
        });
        totalButton.addActionListener(isClicked -> {
            orderDataClasses[viewOrder.selectedRow] = new OrderDataClass(chickenTxtFd.getText(),burgerTxtFd.getText(),steakTxtFd.getText(),FriesandOnionringsTxtFd.getText(),BaconandEggTxtFd.getText(),
                    icedteaTxtFd.getText(),cokeTxtFd.getText(),lemonjuiceTxtFd.getText(),spriteTxtFd.getText(),
                    orangeTxtFd.getText(),costofmealsTxtFd.getText(),costofdrinksTxtFd.getText(),totalcostofitemsTxtFd.getText());

            // meals
            String quantityChicken = chickenTxtFd.getText();
            if (quantityChicken.equals("")) {
                quantityChicken = "0";
            }
            int Chicken = Integer.parseInt(quantityChicken);
            int totalChicken = Chicken * 76;

            String quantityBurger = burgerTxtFd.getText();
            if (quantityBurger.equals("")) {
                quantityBurger = "0";
            }
            int Burger = Integer.parseInt(quantityBurger);
            int totalBurger = Burger * 45;

            String quantitySteak = steakTxtFd.getText();
            if (quantitySteak.equals("")) {
                quantitySteak = "0";
            }
            int Steak = Integer.parseInt(quantitySteak);
            int totalSteak = Steak * 81;

            String quantityFriesandOnionrings = FriesandOnionringsTxtFd.getText();
            if (quantityFriesandOnionrings.equals("")) {
                quantityFriesandOnionrings = "0";
            }
            int FriesOnionRings = Integer.parseInt(quantityFriesandOnionrings);
            int totalFriesOnionRings = FriesOnionRings * 90;

            String quantityBaconandEggTxtFd = BaconandEggTxtFd.getText();
            if (quantityBaconandEggTxtFd.equals("")) {
                quantityBaconandEggTxtFd = "0";
            }
            int BaconEgg = Integer.parseInt(quantityBaconandEggTxtFd);
            int totalBaconEgg = BaconEgg * 65;

            int totalMealsPrice = totalChicken + totalBurger + totalSteak + totalFriesOnionRings + totalBaconEgg;
            orderDataClasses[viewOrder.selectedRow].setCom(String.valueOf(totalMealsPrice));
            costofmealsTxtFd.setText(String.valueOf(totalMealsPrice));

            // drinks
            String quantityorange = orangeTxtFd.getText();
            if (quantityorange.equals("")) {
                quantityorange = "0";
            }
            int Orange = Integer.parseInt(quantityorange);
            int totalOrange = Orange * 37;

            String quantityCoke = cokeTxtFd.getText();
            if (quantityCoke.equals("")) {
                quantityCoke = "0";
            }
            int Coke = Integer.parseInt(quantityCoke);
            int totalCoke = Coke * 37;

            String quantitySprite = spriteTxtFd.getText();
            if (quantitySprite.equals("")) {
                quantitySprite = "0";
            }
            int Sprite = Integer.parseInt(quantitySprite);
            int totalSprite = Sprite * 37;

            String quantityIcedTea = icedteaTxtFd.getText();
            if (quantityIcedTea.equals("")) {
                quantityIcedTea = "0";
            }
            int IcedTea = Integer.parseInt(quantityIcedTea);
            int totalIcedTea = IcedTea * 35;

            String quantityLemonjuice = lemonjuiceTxtFd.getText();
            if (quantityLemonjuice.equals("")) {
                quantityLemonjuice = "0";
            }
            int LemonJuice = Integer.parseInt(quantityLemonjuice);
            int totalLemonJuice = LemonJuice * 35;

            int totalDrinksPrice = totalOrange + totalCoke + totalSprite + totalIcedTea + totalLemonJuice;
            orderDataClasses[viewOrder.selectedRow].setCod(String.valueOf(totalDrinksPrice));
            costofdrinksTxtFd.setText(String.valueOf(totalDrinksPrice));

            int totalPrice = totalDrinksPrice + totalMealsPrice + seatPrice();
            orderDataClasses[viewOrder.selectedRow].setTc(String.valueOf(totalPrice));
            totalcostofitemsTxtFd.setText(String.valueOf(totalPrice));

        });

        orderFrame.pack();

    }

    private static void clearTextFields() {
        orderFoodFrame.chickenTxtFd.setText("");
        orderFoodFrame.burgerTxtFd.setText("");
        orderFoodFrame.steakTxtFd.setText("");
        orderFoodFrame.FriesandOnionringsTxtFd.setText("");
        orderFoodFrame.BaconandEggTxtFd.setText("");
        orderFoodFrame.icedteaTxtFd.setText("");
        orderFoodFrame.cokeTxtFd.setText("");
        orderFoodFrame.lemonjuiceTxtFd.setText("");
        orderFoodFrame.spriteTxtFd.setText("");
        orderFoodFrame.orangeTxtFd.setText("");
        orderFoodFrame.costofmealsTxtFd.setText("");
        orderFoodFrame.costofdrinksTxtFd.setText("");
        orderFoodFrame.totalcostofitemsTxtFd.setText("");
    }

    int seatPrice(){
        int price = 0;

        Object selectedItem = reservationPanel.jComboBox1.getSelectedItem();
        if (selectedItem.equals("1-3")) {
            price = 50;
        } else if (selectedItem.equals("4-7")) {
            price = 75;
        } else if (selectedItem.equals("8-12")) {
            price = 90;
        } else if (selectedItem.equals("13-20")) {
            price = 115;
        }

        return price;
    }

     javax.swing.JTextField BaconandEggTxtFd;
     javax.swing.JTextField FriesandOnionringsTxtFd;
    javax.swing.JTextField burgerTxtFd;
     javax.swing.JTextField chickenTxtFd;
    javax.swing.JTextField cokeTxtFd;
     javax.swing.JTextField costofdrinksTxtFd;
     javax.swing.JTextField costofmealsTxtFd;

    private javax.swing.JButton backBtn;
     javax.swing.JTextField icedteaTxtFd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
   javax.swing.JTextField lemonjuiceTxtFd;
     javax.swing.JTextField orangeTxtFd;
    private javax.swing.JButton saveButton;
    javax.swing.JTextField spriteTxtFd;
     javax.swing.JTextField steakTxtFd;
     javax.swing.JButton totalButton;
     javax.swing.JTextField totalcostofitemsTxtFd;

}