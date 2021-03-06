/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.System;
import model.CityList;

/**
 *
 * @author gunasekhar
 */
public class systemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form systemJPanel
     */
    
    private System system;
    private JPanel displayJpanel;
    
    public systemJPanel(JPanel displayJpanel, System system) {
        this.displayJpanel = displayJpanel;
        this.system = system;
        initComponents();
        initializeCities();
    }
    
    String regxCity = "^[a-zA-Z\\s]+$";
    
    private void initializeCities() {
        
        cityJComboBox.removeAllItems();
        ArrayList<City> cities = CityList.getCitiesList();
        for(City city:cities){
            cityJComboBox.addItem(city.getCityName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageSystemJLabel = new javax.swing.JLabel();
        chooseCityJLabel = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        btnnext = new javax.swing.JButton();
        btnaddcity = new javax.swing.JButton();
        txtaddcity = new javax.swing.JTextField();

        manageSystemJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageSystemJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSystemJLabel.setText("City Health Management System");

        chooseCityJLabel.setText("City :");

        cityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBoxActionPerformed(evt);
            }
        });

        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnaddcity.setText("---> Add City");
        btnaddcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(manageSystemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(chooseCityJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnext)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txtaddcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnaddcity)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnaddcity, txtaddcity});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(manageSystemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cityJComboBox)
                        .addComponent(btnaddcity)
                        .addComponent(txtaddcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseCityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(btnnext)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chooseCityJLabel, cityJComboBox});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnaddcity, txtaddcity});

    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        String selectedCity = String.valueOf(cityJComboBox.getSelectedItem());
        java.lang.System.out.println(selectedCity);
        
        communityJPanel communityJPanel = new communityJPanel(displayJpanel, system, selectedCity);
        displayJpanel.add("CommunityManagePanel", communityJPanel);
        CardLayout layout = (CardLayout) displayJpanel.getLayout();
        layout.next(displayJpanel);
        
    }//GEN-LAST:event_btnnextActionPerformed

    private void cityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxActionPerformed

    private void btnaddcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcityActionPerformed
        if (txtaddcity.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please enter a city name");
            return;
        }
        
        for (City city : CityList.getCitiesList()){
            if (city.getCityName().equals(txtaddcity.getText())){
                JOptionPane.showMessageDialog(this, "City already present");
                return;
            }
        }
        
        if (txtaddcity.getText().matches(regxCity)){
            CityList.addCity(new City(txtaddcity.getText()));
            system.addCity(new City(txtaddcity.getText()));
            JOptionPane.showMessageDialog(this, "City added successfully");
            initializeCities();
            txtaddcity.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter a valid City Name\nOnly alphabets and spaces allowed");
        }
        
        
    }//GEN-LAST:event_btnaddcityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcity;
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel chooseCityJLabel;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JLabel manageSystemJLabel;
    private javax.swing.JTextField txtaddcity;
    // End of variables declaration//GEN-END:variables
}
