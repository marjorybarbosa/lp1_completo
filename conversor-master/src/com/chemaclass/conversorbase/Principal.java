
package com.chemaclass.conversorbase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

import com.chemaclass.conversorbase.base.Base;
import com.chemaclass.conversorbase.base.Binary;
import com.chemaclass.conversorbase.base.Decimal;
import com.chemaclass.conversorbase.base.Hexadecimal;
import com.chemaclass.conversorbase.base.Octal;

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    private void initComponents() {

        bgInput = new javax.swing.ButtonGroup();
        bgOutput = new javax.swing.ButtonGroup();
        tfEntrada = new javax.swing.JTextField();
        btConvertir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfSaida = new javax.swing.JTextField();
        btlimpatudo = new javax.swing.JButton();
        btlimpaEntrada = new javax.swing.JButton();
        btlimpaSaida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doConsole = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        panelHexa = new javax.swing.JPanel();
        panelBaseInput = new javax.swing.JPanel();
        rbBinarioInput = new javax.swing.JRadioButton();
        rbOctalInput = new javax.swing.JRadioButton();
        rbHexadecimalInput = new javax.swing.JRadioButton();
        rbDecimalInput = new javax.swing.JRadioButton();
        panelBaseOutput = new javax.swing.JPanel();
        rbBinarioOutput = new javax.swing.JRadioButton();
        rbOctalOutput = new javax.swing.JRadioButton();
        rbHexadecimalOutput = new javax.swing.JRadioButton();
        rbDecimalOutput = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btInvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tfEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEntradaKeyPressed(evt);
            }
        });

        btConvertir.setText("converter ! go");
        btConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConvertirActionPerformed(evt);
            }
        });

       

        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHexaLayout = new javax.swing.GroupLayout(panelHexa);
        panelHexa.setLayout(panelHexaLayout);
        panelHexaLayout.setHorizontalGroup(
            panelHexaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHexaLayout.setVerticalGroup(
            panelHexaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelHexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(bt0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelHexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bgInput.add(rbBinarioInput);
        rbBinarioInput.setText("Binario");
        rbBinarioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBinarioInputActionPerformed(evt);
            }
        });

        bgInput.add(rbOctalInput);
        rbOctalInput.setText("Octal");
        rbOctalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOctalInputActionPerformed(evt);
            }
        });

        bgInput.add(rbHexadecimalInput);
        rbHexadecimalInput.setText("Hexadecimal");
        rbHexadecimalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHexadecimalInputActionPerformed(evt);
            }
        });

        bgInput.add(rbDecimalInput);
        rbDecimalInput.setSelected(true);
        rbDecimalInput.setText("Decimal");
        rbDecimalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDecimalInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBaseInputLayout = new javax.swing.GroupLayout(panelBaseInput);
        panelBaseInput.setLayout(panelBaseInputLayout);
        panelBaseInputLayout.setHorizontalGroup(
            panelBaseInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaseInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbHexadecimalInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBaseInputLayout.createSequentialGroup()
                        .addGroup(panelBaseInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBinarioInput)
                            .addComponent(rbOctalInput)
                            .addComponent(rbDecimalInput))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBaseInputLayout.setVerticalGroup(
            panelBaseInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbBinarioInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOctalInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbHexadecimalInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbDecimalInput)
                .addContainerGap())
        );

        bgOutput.add(rbBinarioOutput);
        rbBinarioOutput.setSelected(true);
        rbBinarioOutput.setText("Binario");
        rbBinarioOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBinarioOutputActionPerformed(evt);
            }
        });

        bgOutput.add(rbOctalOutput);
        rbOctalOutput.setText("Octal");
        rbOctalOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOctalOutputActionPerformed(evt);
            }
        });

        bgOutput.add(rbHexadecimalOutput);
        rbHexadecimalOutput.setText("Hexadecimal");
        rbHexadecimalOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHexadecimalOutputActionPerformed(evt);
            }
        });

        bgOutput.add(rbDecimalOutput);
        rbDecimalOutput.setText("Decimal");
        rbDecimalOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDecimalOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBaseOutputLayout = new javax.swing.GroupLayout(panelBaseOutput);
        panelBaseOutput.setLayout(panelBaseOutputLayout);
        panelBaseOutputLayout.setHorizontalGroup(
            panelBaseOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaseOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbHexadecimalOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBaseOutputLayout.createSequentialGroup()
                        .addGroup(panelBaseOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBinarioOutput)
                            .addComponent(rbOctalOutput)
                            .addComponent(rbDecimalOutput))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBaseOutputLayout.setVerticalGroup(
            panelBaseOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbBinarioOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOctalOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbHexadecimalOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbDecimalOutput)
                .addContainerGap())
        );

        jLabel4.setText("Entrada");

        jLabel5.setText("Saida");

        btInvertir.setText("inverter");
        btInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaida, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btlimpaEntrada)
                            .addComponent(btlimpaSaida)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelBaseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(panelBaseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(116, 116, 116)
                                .addComponent(btInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btlimpatudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btlimpatudo)
                    .addComponent(btInvertir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlimpaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlimpaSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelBaseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelBaseOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(8, 8, 8))
        );

        pack();
    }

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        printLetter(2);
    }

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        printLetter(1);
    }

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        printLetter(3);
    }

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        printLetter(4);
    }
    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        printLetter(5);
    }
    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        printLetter(6);
    }

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        printLetter(7);
    }

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        printLetter(8);
    }

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        printLetter(9);
    }

    private void btConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConvertirActionPerformed
        convertir();
    }

    private void rbBinarioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBinarioInputActionPerformed
        selectInput(Conversor.Binary);
    }

    private void rbOctalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOctalInputActionPerformed
        selectInput(Conversor.Octal);
    }

    private void rbHexadecimalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHexadecimalInputActionPerformed
        selectInput(Conversor.Hexadecimal);
    }

    private void rbDecimalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDecimalInputActionPerformed
        selectInput(Conversor.Decimal);
    }

    private void selectInput(Conversor c) {
        panelHexa.setVisible(false);
        switch (c) {
            case Binary: 
                baseInput = new Binary();
                break;
            case Octal: 
                baseInput = new Octal();
                break;
            case Decimal: 
                baseInput = new Decimal();
                break;
            case Hexadecimal: 
                baseInput = new Hexadecimal();
                panelHexa.setVisible(true);
                break;
        }
    }

    private void selectOutput(Conversor c) {
        switch (c) {
            case Binary: 
                conversorOutput = Conversor.Binary;
                break;
            case Octal: 
                conversorOutput = Conversor.Octal;
                break;
            case Decimal: 
                conversorOutput = Conversor.Decimal;
                break;
            case Hexadecimal: 
                conversorOutput = Conversor.Hexadecimal;
                break;
        }
    }

    private void btCleanEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanEntradaActionPerformed
        tfEntrada.setText("");
    }

    private void btCleanSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanSalidaActionPerformed
        tfSaida.setText("");
    }

    private void btCleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanAllActionPerformed
        btCleanEntradaActionPerformed(evt);
        btCleanSalidaActionPerformed(evt);
        taSaida.setText(null);
        doConsole.setText(null);
    }

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        printLetter(0);
    }
    private void tfEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEntradaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            convertir();
        }
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tfEntrada.requestFocus();
        init();
    }

    private void init() {
        baseInput = new Decimal();
        conversorOutput = Conversor.Binary;
        initPanelHexa();
    }

   
    private void initPanelHexa() {
        int width = 50, height = 40;
        String[][] letras = {{"A", "B", "C"}, {"D", "E", "F"}};
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                final String letra = letras[i][j];
                JButton bt = new JButton(letra);
                int x = 5 + j * width;
                int y = i * height;
                bt.setBounds(x, y, width, height);
                bt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        printLetter(letra);
                    }
                });
                panelHexa.add(bt);
            }
        }
    }

   
    private void printLetter(String letter) {
        String input = tfEntrada.getText().toString();
        
        int start = tfEntrada.getSelectionStart();
       
        String s = input.substring(0, start) + letter + input.substring(start);
        tfEntrada.setText(s);
        
        tfEntrada.setSelectionStart(start + 1);
       
    }

    private void printLetter(int letter) {
        printLetter(String.valueOf(letter));
    }

    
    private void convertir() {
        doConsole.setText(null);
        String input = tfEntrada.getText().toString();
        String result = "...result...";
        try {
            if (input.length() == 0) {
                log("error");
                return;
            }
            log(" convertendo " + baseInput.me() + " " + "(" + input + ") "
                    + " para "
                    + conversorOutput.name() + ": " + "\n");
            switch (conversorOutput) {
                case Binary:
                    result = baseInput.toBinary(input);
                    break;
                case Octal:
                    result = baseInput.toOctal(input);
                    break;
                case Decimal:
                    result = baseInput.toDecimal(input);
                    break;
                case Hexadecimal:
                    result = baseInput.toHexadecimal(input);
                    break;
            }
            tfSaida.setText(result);
         
        } catch (NumberFormatException e) {
            log("error");
        }
        tfEntrada.requestFocus();
    }

    private void rbBinarioOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBinarioOutputActionPerformed
        selectOutput(Conversor.Binary);
    }

    private void rbOctalOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOctalOutputActionPerformed
        selectOutput(Conversor.Octal);
    }

    private void rbHexadecimalOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHexadecimalOutputActionPerformed
        selectOutput(Conversor.Hexadecimal);
    }

    private void rbDecimalOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDecimalOutputActionPerformed
        selectOutput(Conversor.Decimal);
    }

    private void btInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInvertirActionPerformed
        invertir();
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void logConsole(String s) {
        doConsole.setText(doConsole.getText() + s + "\n");
    }

   
    public static void log(String s) {
        
        taSaida.setText(taSaida.getText() + s + "\n");
    }

    
    private void invertir() {
        
        String input = tfEntrada.getText().toString();
        String output = tfSaida.getText().toString();
        tfEntrada.setText(output);
        tfSaida.setText(input);
    }

    private enum Conversor {

        Binary, Octal, Hexadecimal, Decimal
    }
   
    private static Conversor conversorOutput = Conversor.Binary;
   
    private Base baseInput;
    private javax.swing.ButtonGroup bgInput;
    private javax.swing.ButtonGroup bgOutput;
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btlimpatudo;
    private javax.swing.JButton btlimpaEntrada;
    private javax.swing.JButton btlimpaSaida;
    private javax.swing.JButton btConvertir;
    private javax.swing.JButton btInvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBaseInput;
    private javax.swing.JPanel panelBaseOutput;
    private javax.swing.JPanel panelHexa;
    private javax.swing.JRadioButton rbBinarioInput;
    private javax.swing.JRadioButton rbBinarioOutput;
    private javax.swing.JRadioButton rbDecimalInput;
    private javax.swing.JRadioButton rbDecimalOutput;
    private javax.swing.JRadioButton rbHexadecimalInput;
    private javax.swing.JRadioButton rbHexadecimalOutput;
    private javax.swing.JRadioButton rbOctalInput;
    private javax.swing.JRadioButton rbOctalOutput;
    private javax.swing.JTextArea doConsole;
    private static javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfEntrada;
    private javax.swing.JTextField tfSaida;
}
