/**
 * @author Andrey Kaipov
 * @version 1.6 November 30, 2014
 * This is the driver class for this program. It doubles as a GUI also.
 * I used NetBean's GUI editor, so a lot of code is pre-generated,
 * and cannot be edited.
 * 
 * The main class runs ONLY the GUI, while the buttons within do all the work.
 * 
 * This program represents a Restaurant. Our poorly funded restaurant has only 
 * one table that can be reserved every 15 minutes, and a separate table that
 * is exclusively for those who "walk-in" without a reservation.
 */

package restaurant;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PoorlyFundedRestaurant extends javax.swing.JFrame {
   public PoorlyFundedRestaurant() {
      String laf = UIManager.getSystemLookAndFeelClassName();
       try {
           UIManager.setLookAndFeel(laf);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(PoorlyFundedRestaurant.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           Logger.getLogger(PoorlyFundedRestaurant.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(PoorlyFundedRestaurant.class.getName()).log(Level.SEVERE, null, ex);
       } catch (UnsupportedLookAndFeelException ex) {
           Logger.getLogger(PoorlyFundedRestaurant.class.getName()).log(Level.SEVERE, null, ex);
       }
      initComponents();
      MessageConsole mc1 = new MessageConsole(outputLog1);
      mc1.redirectOut();
      mc1.redirectErr(Color.RED, null);
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameBoxAdd2 = new javax.swing.JTextField();
        nameBoxAdd1 = new javax.swing.JTextField();
        makeResButton = new javax.swing.JButton();
        hourBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        minBox1 = new javax.swing.JComboBox();
        remResButton = new javax.swing.JButton();
        printResButton1 = new javax.swing.JButton();
        remResButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputLog1 = new javax.swing.JTextArea();
        clearMakeOutputButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        replaceResButton = new javax.swing.JButton();
        minBoxOld = new javax.swing.JComboBox();
        hourBoxOld = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nameBoxOld2 = new javax.swing.JTextField();
        nameBoxOld1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        minBoxNew = new javax.swing.JComboBox();
        hourBoxNew = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nameBoxNew2 = new javax.swing.JTextField();
        nameBoxNew1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        oldReservationTitle = new javax.swing.JLabel();
        newReservationTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputLog2 = new javax.swing.JTextArea();
        clearResOutputButton = new javax.swing.JButton();
        printResButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        titleText3 = new javax.swing.JLabel();
        hourBoxW = new javax.swing.JComboBox();
        nameBoxW1 = new javax.swing.JTextField();
        createWalkInButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minBoxW = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        nameBoxW2 = new javax.swing.JTextField();
        titleText4 = new javax.swing.JLabel();
        seatWalkInsButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setName(""); // NOI18N

        jLabel1.setText("Last Name");

        jLabel2.setText("First Name");

        jLabel3.setText("Time:");

        nameBoxAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxAdd1ActionPerformed(evt);
            }
        });

        makeResButton.setText("Make Reservation");
        makeResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeResButtonActionPerformed(evt);
            }
        });

        hourBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "17", "18", "19", "20", "21", "22", "23", "24" }));
        hourBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Hour");

        jLabel11.setText("Minute");

        minBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        remResButton.setText("Cancel Reservation");
        remResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remResButtonActionPerformed(evt);
            }
        });

        printResButton1.setText("Print Reservations");
        printResButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printResButton1ActionPerformed(evt);
            }
        });

        remResButton2.setText("Clear Reservations");
        remResButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remResButton2ActionPerformed(evt);
            }
        });

        outputLog1.setColumns(20);
        outputLog1.setRows(5);
        jScrollPane1.setViewportView(outputLog1);

        clearMakeOutputButton.setText("Clear Output");
        clearMakeOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMakeOutputButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameBoxAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameBoxAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hourBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(minBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(printResButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remResButton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(clearMakeOutputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remResButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(makeResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(nameBoxAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameBoxAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hourBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(makeResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(remResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printResButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remResButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearMakeOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add/Remove Reservations", jPanel1);

        replaceResButton.setText("Replace Reservation");
        replaceResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceResButtonActionPerformed(evt);
            }
        });

        minBoxOld.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        hourBoxOld.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "17", "18", "19", "20", "21", "22", "23", "24" }));
        hourBoxOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourBoxOldActionPerformed(evt);
            }
        });

        jLabel15.setText("Hour");

        jLabel16.setText("Minute");

        nameBoxOld2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxOld2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name");

        jLabel9.setText("First Name");

        jLabel17.setText("Time:");

        minBoxNew.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        hourBoxNew.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "17", "18", "19", "20", "21", "22", "23", "24" }));
        hourBoxNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourBoxNewActionPerformed(evt);
            }
        });

        jLabel18.setText("Hour");

        jLabel19.setText("Minute");

        nameBoxNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxNew2ActionPerformed(evt);
            }
        });

        jLabel20.setText("Last Name");

        jLabel21.setText("First Name");

        jLabel22.setText("Time:");

        oldReservationTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oldReservationTitle.setText("Old Reservation");

        newReservationTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newReservationTitle.setText("New Reservation");

        outputLog2.setEditable(false);
        outputLog2.setColumns(20);
        outputLog2.setRows(5);
        jScrollPane2.setViewportView(outputLog2);

        clearResOutputButton.setText("Clear Output");
        clearResOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearResOutputButtonActionPerformed(evt);
            }
        });

        printResButton2.setText("Print Reservations");
        printResButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printResButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameBoxOld1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameBoxOld2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameBoxNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hourBoxNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minBoxNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameBoxNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hourBoxOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(minBoxOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(oldReservationTitle)
                            .addComponent(newReservationTitle)))
                    .addComponent(replaceResButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(printResButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearResOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(oldReservationTitle)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nameBoxOld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nameBoxOld2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hourBoxOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minBoxOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(newReservationTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(nameBoxNew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(nameBoxNew2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(hourBoxNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(minBoxNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel22)))))
                        .addGap(20, 20, 20)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearResOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printResButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replaceResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Replace Reservations", jPanel3);

        jLabel26.setText("Minute");

        jLabel13.setText("Hour");

        titleText3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titleText3.setText("This tab is for creating new walk-ins.");

        hourBoxW.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "17", "18", "19", "20", "21", "22", "23", "24" }));
        hourBoxW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourBoxWActionPerformed(evt);
            }
        });

        createWalkInButton.setText("Create Walk-In");
        createWalkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createWalkInButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Time");

        jLabel5.setText("Last Name");

        minBoxW.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel7.setText("First Name");

        titleText4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        titleText4.setText("Whenever ready, please seat the walk-ins.");

        seatWalkInsButton.setText("Seat Walk-Ins");
        seatWalkInsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatWalkInsButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("The walk-ins are seated one-by-one!");

        checkButton.setText("Who's Next?");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Print Walk-Ins");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameBoxW1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameBoxW2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(hourBoxW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minBoxW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(createWalkInButton))
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(seatWalkInsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titleText3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(titleText4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleText3)
                    .addComponent(titleText4))
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nameBoxW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nameBoxW2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel26))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hourBoxW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minBoxW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(seatWalkInsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createWalkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Walk-Ins", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void nameBoxNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxNew2ActionPerformed

    }//GEN-LAST:event_nameBoxNew2ActionPerformed

    private void hourBoxNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourBoxNewActionPerformed

    }//GEN-LAST:event_hourBoxNewActionPerformed

    private void nameBoxOld2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxOld2ActionPerformed

    }//GEN-LAST:event_nameBoxOld2ActionPerformed

    private void hourBoxOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourBoxOldActionPerformed

    }//GEN-LAST:event_hourBoxOldActionPerformed

    private void replaceResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceResButtonActionPerformed
        // TODO add your handling code here:
        String lNameOld = nameBoxOld1.getText();
        String fNameOld = nameBoxOld2.getText();
        String rHourOld = (String)hourBoxOld.getSelectedItem();
        String rMinuteOld = (String)minBoxOld.getSelectedItem();
        String rTimeOld = rHourOld + ":" + rMinuteOld;
        Reservation resOld = new Reservation(lNameOld, fNameOld, rTimeOld);

        String lNameNew = nameBoxNew1.getText();
        String fNameNew = nameBoxNew2.getText();
        String rHourNew = (String)hourBoxNew.getSelectedItem();
        String rMinuteNew = (String)minBoxNew.getSelectedItem();
        String rTimeNew = rHourNew + ":" + rMinuteNew;
        Reservation resNew = new Reservation(lNameNew, fNameNew, rTimeNew);

        if(!myItr.replaceReservation(resOld, resNew))
            outputLog2.append("Unable to replace.\nThe old reservation was NOT found!\n");
    }//GEN-LAST:event_replaceResButtonActionPerformed

    private void clearMakeOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMakeOutputButtonActionPerformed
        outputLog1.setText(null);
    }//GEN-LAST:event_clearMakeOutputButtonActionPerformed

    private void remResButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remResButton2ActionPerformed
        myList.clearAll();
        System.out.println("Reservation list cleared!");
    }//GEN-LAST:event_remResButton2ActionPerformed

    private void printResButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printResButton1ActionPerformed
        System.out.println(myList.toString());
        System.out.println("----------------------------");
    }//GEN-LAST:event_printResButton1ActionPerformed

    private void remResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remResButtonActionPerformed
        // TODO add your handling code here:
        String lName = nameBoxAdd1.getText();
        String fName = nameBoxAdd2.getText();
        String rHour = (String)hourBox1.getSelectedItem();
        String rMinute = (String)minBox1.getSelectedItem();
        String rTime = rHour + ":" + rMinute;
        Reservation res = new Reservation(lName, fName, rTime);

        myItr.removeReservation(res);
    }//GEN-LAST:event_remResButtonActionPerformed

    private void hourBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourBox1ActionPerformed

    }//GEN-LAST:event_hourBox1ActionPerformed

    private void makeResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeResButtonActionPerformed
        // TODO add your handling code here:

        String lName = nameBoxAdd1.getText();
        String fName = nameBoxAdd2.getText();
        String rHour = (String)hourBox1.getSelectedItem();
        String rMinute = (String)minBox1.getSelectedItem();
        String rTime = rHour + ":" + rMinute;
        Reservation res = new Reservation(lName, fName, rTime);

        myItr.makeReservation(res);
    }//GEN-LAST:event_makeResButtonActionPerformed

    private void nameBoxAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBoxAdd1ActionPerformed

    private void printResButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printResButton2ActionPerformed
        outputLog2.append(myList.toString() + "\n");
        outputLog2.append("----------------------------\n");
    }//GEN-LAST:event_printResButton2ActionPerformed

    private void clearResOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearResOutputButtonActionPerformed
        outputLog2.setText(null);
    }//GEN-LAST:event_clearResOutputButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(walkIns.toString());
        System.out.println("----------------------------");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        try {
            WalkIn nextUp = walkIns.peek();
            System.out.println("The next person in line is " + nextUp.toString());
        }
        catch(NullPointerException e) {}
    }//GEN-LAST:event_checkButtonActionPerformed

    private void seatWalkInsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatWalkInsButtonActionPerformed
        walkIns.fillEmptyTable();
    }//GEN-LAST:event_seatWalkInsButtonActionPerformed

    private void createWalkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createWalkInButtonActionPerformed
        String lName = nameBoxW1.getText();
        String fName = nameBoxW2.getText();
        String rHour = (String)hourBoxW.getSelectedItem();
        String rMinute = (String)minBoxW.getSelectedItem();
        String rTime = rHour + ":" + rMinute;
        WalkIn walker = new WalkIn(lName, fName, rTime);

        walkIns.addWalkIn(walker);
    }//GEN-LAST:event_createWalkInButtonActionPerformed

    private void hourBoxWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourBoxWActionPerformed

    }//GEN-LAST:event_hourBoxWActionPerformed

   //global vars
   LinkedList myList = new LinkedList();
   LinkedList.ListIterator myItr = myList.getListIterator();
   LinkedQueue walkIns = new LinkedQueue();
   
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new PoorlyFundedRestaurant().setVisible(true);
         }
      });
   }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JButton clearMakeOutputButton;
    private javax.swing.JButton clearResOutputButton;
    private javax.swing.JButton createWalkInButton;
    private javax.swing.JComboBox hourBox1;
    private javax.swing.JComboBox hourBoxNew;
    private javax.swing.JComboBox hourBoxOld;
    private javax.swing.JComboBox hourBoxW;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton makeResButton;
    private javax.swing.JComboBox minBox1;
    private javax.swing.JComboBox minBoxNew;
    private javax.swing.JComboBox minBoxOld;
    private javax.swing.JComboBox minBoxW;
    private javax.swing.JTextField nameBoxAdd1;
    private javax.swing.JTextField nameBoxAdd2;
    private javax.swing.JTextField nameBoxNew1;
    private javax.swing.JTextField nameBoxNew2;
    private javax.swing.JTextField nameBoxOld1;
    private javax.swing.JTextField nameBoxOld2;
    private javax.swing.JTextField nameBoxW1;
    private javax.swing.JTextField nameBoxW2;
    private javax.swing.JLabel newReservationTitle;
    private javax.swing.JLabel oldReservationTitle;
    private javax.swing.JTextArea outputLog1;
    private javax.swing.JTextArea outputLog2;
    private javax.swing.JButton printResButton1;
    private javax.swing.JButton printResButton2;
    private javax.swing.JButton remResButton;
    private javax.swing.JButton remResButton2;
    private javax.swing.JButton replaceResButton;
    private javax.swing.JButton seatWalkInsButton;
    private javax.swing.JLabel titleText3;
    private javax.swing.JLabel titleText4;
    // End of variables declaration//GEN-END:variables
}
