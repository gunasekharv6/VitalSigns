/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunasekhar
 */
public class EncounterHistory{
    
    private List<Encounter> encounters;

    public EncounterHistory(List<Encounter> encounters) {
        this.encounters = encounters;
    }
    
    public EncounterHistory() {
        this.encounters = new ArrayList<Encounter>();
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }
    
}
