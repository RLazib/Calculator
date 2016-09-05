/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorFrame;

/**
 *
 * @author Ryan
 */
public class CalcFrame extends javax.swing.JFrame {
    double firstNumber;
    double secondNumber;
    double resultDouble;
    String operand;
    String resultString;
    Boolean operandJustSet; 
    Boolean decimalUsed; 
    /**
     * Creates new form CalcFrame
     */
    public CalcFrame() {
        initComponents();
        displayPanel.setEditable(false);
        operandJustSet = false;
        decimalUsed = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayPanel = new javax.swing.JTextField();
        dividebutton = new javax.swing.JButton();
        percentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        decimalButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        absButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayPanel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        displayPanel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displayPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPanelActionPerformed(evt);
            }
        });

        dividebutton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        dividebutton.setText("÷");
        dividebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividebuttonActionPerformed(evt);
            }
        });

        percentButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        percentButton.setText("%");
        percentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        backButton.setText("←");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        multiplyButton.setText("×");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        nineButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        eightButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        sevenButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        minusButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        sixButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        fiveButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        fourButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        plusButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        threeButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        twoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        oneButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        equalsButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        decimalButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        decimalButton.setText(".");
        decimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalButtonActionPerformed(evt);
            }
        });

        zeroButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        absButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        absButton.setText("±");
        absButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        clearButton.setText("C");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dividebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(absButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPanelActionPerformed

    }//GEN-LAST:event_displayPanelActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        displayPanel.setText("");
        operandJustSet = false;
        decimalUsed = false;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        String initial = displayPanel.getText(); 
        if (initial != null && initial.length() > 0){
            initial = initial.substring(0, initial.length() - 1);
            displayPanel.setText(initial);
        }
        else {
            decimalUsed = false;
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "7");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "7");
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "8");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "8"); 
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "9");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "9"); 
    }//GEN-LAST:event_nineButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "4");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "4"); 
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "5");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "5"); 
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "6");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "6"); 
    }//GEN-LAST:event_sixButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "1");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "1"); 
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "2");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "2"); 
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "3");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "3"); 
    }//GEN-LAST:event_threeButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        if (operandJustSet == true){
            displayPanel.setText("");
            displayPanel.setText(displayPanel.getText() + "0");
            operandJustSet = false;
        }
        else
            displayPanel.setText(displayPanel.getText() + "0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void percentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentButtonActionPerformed
        String initial = displayPanel.getText();
        if (!("".equals(initial))){
            firstNumber = Double.parseDouble(displayPanel.getText());
            operand = "%";
            operandJustSet = true;
            decimalUsed = false;
        }
    }//GEN-LAST:event_percentButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        String initial = displayPanel.getText();
        if (!("".equals(initial))){
           firstNumber = Double.parseDouble(displayPanel.getText());
            operand = "+";
            operandJustSet = true;
            decimalUsed = false; 
        } 
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        String initial = displayPanel.getText();
        if (!("".equals(initial))){
            firstNumber = Double.parseDouble(displayPanel.getText());
            operand = "-";
            operandJustSet = true;
            decimalUsed = false; 
        } 
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        String initial = displayPanel.getText();
        if (!("".equals(initial))){
            firstNumber = Double.parseDouble(displayPanel.getText());
            operand = "*";
            operandJustSet = true;
            decimalUsed = false;
        } 
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void dividebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividebuttonActionPerformed
        String initial = displayPanel.getText();
        if (!("".equals(initial))){
           firstNumber = Double.parseDouble(displayPanel.getText());
            operand = "/";
            operandJustSet = true;
            decimalUsed = false; 
        } 
    }//GEN-LAST:event_dividebuttonActionPerformed

    private void absButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absButtonActionPerformed
        String initial = displayPanel.getText();
        if (!("".equals(initial))){
            double abs = Double.parseDouble(String.valueOf(displayPanel.getText()));
            abs = abs * (-1);
            displayPanel.setText(String.valueOf(abs));  
        } 
    }//GEN-LAST:event_absButtonActionPerformed

    //Commented lines kept in case current refactor broke something I haven't
    //realized yet
    private void decimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalButtonActionPerformed
        String initial = displayPanel.getText();
        if (decimalUsed.equals(false) /**|| !(initial.contains("."))*/){
            if ("".equals(initial)){
//                if (operandJustSet == true){
//                    displayPanel.setText("");
//                    displayPanel.setText("0.");
//                    operandJustSet = false;
//                }
//                else{
                        displayPanel.setText("0.");
//               }
            }
            else {
                if (operandJustSet == true){
//                    displayPanel.setText("");
//                    displayPanel.setText(initial + ".");
                    displayPanel.setText("0.");
                    operandJustSet = false;
                }
                else{
                    if (!(initial.contains("."))){
                        displayPanel.setText(initial + ".");
                    }
                }
            }
            decimalUsed = true;
        }
    }//GEN-LAST:event_decimalButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        if (firstNumber != 0.0d){
            secondNumber = Double.parseDouble(displayPanel.getText());
        }
        if (firstNumber != 0.0d && secondNumber != 0.0d){
            switch (operand){
                case "+":
                    resultDouble = firstNumber + secondNumber;
                    resultString = String.valueOf(resultDouble);
                    displayPanel.setText(resultString);
                    break;
                
                case "-":
                    resultDouble = firstNumber - secondNumber;
                    resultString = String.valueOf(resultDouble);
                    displayPanel.setText(resultString);
                    break;
                
                case "*":
                    resultDouble = firstNumber * secondNumber;
                    resultString = String.valueOf(resultDouble);
                    displayPanel.setText(resultString);
                    break;
                    
                case "/":
                    resultDouble = firstNumber / secondNumber;
                    resultString = String.valueOf(resultDouble);
                    displayPanel.setText(resultString);
                    break;
                    
                case "%":
                    resultDouble = (firstNumber / secondNumber) * 100;
                    resultString = String.valueOf(resultDouble);
                    displayPanel.setText(resultString);
                    break;
            }
            operandJustSet = false;
            decimalUsed = false;
        }
    }//GEN-LAST:event_equalsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton decimalButton;
    private javax.swing.JTextField displayPanel;
    private javax.swing.JButton dividebutton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton percentButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
