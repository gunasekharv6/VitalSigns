/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author gunasekhar
 */
public class Patient{
 
    private EncounterHistory encounterHistory;

    public Patient(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Patient(){
        this.encounterHistory = new EncounterHistory();
    }    

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
}
