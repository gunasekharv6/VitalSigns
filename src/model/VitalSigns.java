/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gunasekhar
 */
public class VitalSigns{
    
    private double weight;
    
    private double bloodPressureSystolic;
    
    private double bloodPressureDiastolic;
    
    private double height;
    
    private double bodyTemperature;
    
    private int pulseRate;
    
    private int respirationRate;
    
    private double oxygenSaturation;
    
    private String createdOn;
    
    private String updatedOn;

    public VitalSigns(double weight, int bloodPressureSystolic, int bloodPressureDiastolic, double height, double bodyTemperate, int pulseRate, int respirationRate, double oxygenSaturation) {
        this.weight = weight;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
        this.height = height;
        this.bodyTemperature = bodyTemperate;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.oxygenSaturation = oxygenSaturation;
        this.createdOn = formatDate(new Date());
        this.updatedOn = formatDate(new Date());
    }
   
    public VitalSigns(){
        
    }
    
    private String formatDate(Date date){

        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(double bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public double getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(double bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(double oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    } 
    
    @Override
    public String toString() {
        return  String.valueOf(weight);
    }
    
}
