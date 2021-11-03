/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gunasekhar
 */
public class House{
 
    private String houseName;
    
    private String state;
    
    private String country;
    
    private List<Person> persons;
    
    

    public House(String houseName, String state, String country, List<Person> persons) {
        this.houseName=houseName;
        this.state = state;
        this.country = country;
        this.persons=persons;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public House(String houseName, String state, String country) {
        this.houseName = houseName;
        this.state = state;
        this.country = country;
        this.persons = new ArrayList<Person>();
    } 

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return houseName;
    }
    
}
