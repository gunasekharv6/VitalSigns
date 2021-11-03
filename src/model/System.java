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
public class System{
    
    private List<City> cities = new ArrayList<City>();
    
    private PersonDirectory personDirectory;
    
    private PatientDirectory patientDirectory;

    public System(List<City> cities,PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        this.cities= cities;
        this.personDirectory=personDirectory;
        this.patientDirectory=patientDirectory;
    }
    
    public void addCity(City cityName){
        this.cities.add(cityName);
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
   
}
