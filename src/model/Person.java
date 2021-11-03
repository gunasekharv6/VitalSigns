/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author gunasekhar
 */
public class Person{
    
    private String name;
    
    private double age;
    
    private String gender;
    
    private boolean married;
    
    private Patient patient;

    public Person(String name, double age, String gender, boolean married, Patient patient) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.patient = patient;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }      

    @Override
    public String toString() {
        return name;
    }

}
