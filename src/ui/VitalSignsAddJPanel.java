/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Encounter;
import model.EncounterHistory;
import model.Person;
import model.System;
import model.VitalSigns;

/**
 *
 * @author gunasekhar
 */
public class VitalSignsAddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsAddJPanel
     */
    
    private JPanel displayJPanel;
    private Person person;
    
    public VitalSignsAddJPanel(JPanel displayJPanel, Person person) {
        this.displayJPanel=displayJPanel;
        this.person=person;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heightJLabel = new javax.swing.JLabel();
        bodyTemperatureJLabel = new javax.swing.JLabel();
        pulseRateJLabel = new javax.swing.JLabel();
        respirationRateJLabel = new javax.swing.JLabel();
        oxygenSaturationJLabel = new javax.swing.JLabel();
        heightJTextField = new javax.swing.JTextField();
        addVitalSignsJLabel = new javax.swing.JLabel();
        bodyTemperatureJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        weightJLabel = new javax.swing.JLabel();
        pulseRateJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        respirationRateJTextField = new javax.swing.JTextField();
        oxygenSaturationJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        txtbloodPressureDiastolic = new javax.swing.JTextField();
        bloodPressureSystolicJLabel = new javax.swing.JLabel();
        bloodPressureDiastolicJLabel = new javax.swing.JLabel();
        txtbloodPressureSystolic = new javax.swing.JTextField();

        heightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        heightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heightJLabel.setText("Height :");

        bodyTemperatureJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bodyTemperatureJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bodyTemperatureJLabel.setText("Body Temperature :");

        pulseRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pulseRateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pulseRateJLabel.setText("Pulse Rate :");

        respirationRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        respirationRateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        respirationRateJLabel.setText("Respiration Rate :");

        oxygenSaturationJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        oxygenSaturationJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oxygenSaturationJLabel.setText("Oxygen Saturation :");

        addVitalSignsJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        addVitalSignsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addVitalSignsJLabel.setText("Add Vital Signs");

        backJButton.setText("< < Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        weightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        weightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightJLabel.setText("Weight :");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        bloodPressureSystolicJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureSystolicJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodPressureSystolicJLabel.setText("Blood Pressure Systolic :");

        bloodPressureDiastolicJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureDiastolicJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodPressureDiastolicJLabel.setText("Blood Pressure Diastolic :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton)
                        .addGap(61, 61, 61)
                        .addComponent(addVitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(78, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(weightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(83, 83, 83)
                                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bloodPressureDiastolicJLabel)
                                        .addComponent(bloodPressureSystolicJLabel))
                                    .addGap(82, 82, 82)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbloodPressureDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbloodPressureSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(heightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pulseRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(respirationRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(bodyTemperatureJLabel))
                                .addComponent(oxygenSaturationJLabel))
                            .addGap(82, 82, 82)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bodyTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pulseRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(respirationRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(oxygenSaturationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(addJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureSystolicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbloodPressureSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureDiastolicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbloodPressureDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyTemperatureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodyTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulseRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respirationRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respirationRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oxygenSaturationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oxygenSaturationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addJButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        EncounterHistoryJPanel encounterHistoryJPanel = (EncounterHistoryJPanel) component;
        encounterHistoryJPanel.populateEncounterHistoryTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        double weight = weightJTextField.getText().isBlank()?0:Double.valueOf(weightJTextField.getText());
        int bpS = txtbloodPressureSystolic.getText().isBlank()?0:Integer.valueOf(txtbloodPressureSystolic.getText());
        int bpD = txtbloodPressureDiastolic.getText().isBlank()?0:Integer.valueOf(txtbloodPressureDiastolic.getText());
        double height = heightJTextField.getText().isBlank()?0:Double.valueOf(heightJTextField.getText());
        double bodyTemp = bodyTemperatureJTextField.getText().isBlank()?0:Double.valueOf(bodyTemperatureJTextField.getText());
        int pulseRate = pulseRateJTextField.getText().isBlank()?0:Integer.valueOf(pulseRateJTextField.getText());
        int respirationRate = respirationRateJTextField.getText().isBlank()?0:Integer.valueOf(respirationRateJTextField.getText());
        double oxysaturation = oxygenSaturationJTextField.getText().isBlank()?0:Double.valueOf(oxygenSaturationJTextField.getText());
        //String createdon = lblcreatedonOUT.getText();
        
        VitalSigns vitalSigns = new VitalSigns(weight, bpS, bpD, height, bodyTemp, pulseRate, respirationRate, oxysaturation);

        Encounter encounter = new Encounter(vitalSigns);
        
        EncounterHistory encounterHistory = person.getPatient().getEncounterHistory();
        encounterHistory.getEncounters().add(encounter);
        
        JOptionPane.showMessageDialog(this, "Successfully Added the Vital Signs");
        resetData();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void resetData() {
        
        weightJTextField.setText("");
        txtbloodPressureSystolic.setText("");
        txtbloodPressureDiastolic.setText("");
        heightJTextField.setText("");
        bodyTemperatureJTextField.setText("");
        pulseRateJTextField.setText("");
        respirationRateJTextField.setText("");
        oxygenSaturationJTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel addVitalSignsJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel bloodPressureDiastolicJLabel;
    private javax.swing.JLabel bloodPressureSystolicJLabel;
    private javax.swing.JLabel bodyTemperatureJLabel;
    private javax.swing.JTextField bodyTemperatureJTextField;
    private javax.swing.JLabel heightJLabel;
    private javax.swing.JTextField heightJTextField;
    private javax.swing.JLabel oxygenSaturationJLabel;
    private javax.swing.JTextField oxygenSaturationJTextField;
    private javax.swing.JLabel pulseRateJLabel;
    private javax.swing.JTextField pulseRateJTextField;
    private javax.swing.JLabel respirationRateJLabel;
    private javax.swing.JTextField respirationRateJTextField;
    private javax.swing.JTextField txtbloodPressureDiastolic;
    private javax.swing.JTextField txtbloodPressureSystolic;
    private javax.swing.JLabel weightJLabel;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}