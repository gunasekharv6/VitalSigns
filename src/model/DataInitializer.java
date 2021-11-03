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
public class DataInitializer {
    
    public static System initializeSystem(){
        
        
        //Boston
        //JamaicaPlain
        //Person1
        //VitalSigns(weight,bloodPressure,height,bodyTemperate,pulseRate,respirationRate,oxygenSaturation,createdDate,lastUpdatedDate,createdBy,modifiedBy)
        VitalSigns vsJPPerson1visit1 = new VitalSigns(60.20, 120, 80, 5.11, 38.8, 90, 19, 97.50);
        VitalSigns vsJPPerson1visit2 = new VitalSigns(63.45, 135, 99, 6.00, 37.7, 90, 18, 99.50);
        VitalSigns vsJPPerson1visit3 = new VitalSigns(58.21, 98, 89, 6.00, 39.5, 90, 18, 98.00);

        Encounter jPPerson1Encounter1 = new Encounter(vsJPPerson1visit1);
        Encounter jPPerson1Encounter2 = new Encounter(vsJPPerson1visit2);
        Encounter jPPerson1Encounter3 = new Encounter(vsJPPerson1visit3);

        List<Encounter> jPPerson1Encounters = new ArrayList<Encounter>();
        jPPerson1Encounters.add(jPPerson1Encounter1);
        jPPerson1Encounters.add(jPPerson1Encounter2);
        jPPerson1Encounters.add(jPPerson1Encounter3);
        EncounterHistory jPPerson1encounterHistory = new EncounterHistory(jPPerson1Encounters);
        
        Patient jPPatient1 = new Patient(jPPerson1encounterHistory);
        Person jPPerson1 = new Person("Ronaldo",23.5,"Male",true,jPPatient1);
        
        //Person2
        VitalSigns vsJPPerson2visit1 = new VitalSigns(65.20, 118, 80, 5.70, 39.8, 94, 19, 95.58);
        VitalSigns vsJPPerson2visit2 = new VitalSigns(64.60, 85, 95, 5.70, 40.5, 93, 20, 97.78);
        VitalSigns vsJPPerson2visit3 = new VitalSigns(66.80, 142, 94, 5.70, 38.3, 96, 18, 99.50);
        
        Encounter jPPerson2Encounter1 = new Encounter(vsJPPerson2visit1);
        Encounter jPPerson2Encounter2 = new Encounter(vsJPPerson2visit2);
        Encounter jPPerson2Encounter3 = new Encounter(vsJPPerson2visit3);

        List<Encounter> jPPerson2Encounters = new ArrayList<Encounter>();
        jPPerson2Encounters.add(jPPerson2Encounter1);
        jPPerson2Encounters.add(jPPerson2Encounter2);
        jPPerson2Encounters.add(jPPerson2Encounter3);
        EncounterHistory jPPerson2encounterHistory = new EncounterHistory(jPPerson2Encounters);
       
        Patient jPPatient2 = new Patient(jPPerson2encounterHistory);
        Person jPPerson2 = new Person("Thomas",26.0,"Female",false,jPPatient2);
        
        List<Person> house1Persons = new ArrayList<>();
        house1Persons.add(jPPerson1);
        house1Persons.add(jPPerson2);
        
        House jPHouse1 = new House("50 EvergreenST", "MA", "USA", house1Persons);
        List<House> jphouses = new ArrayList<>();
        jphouses.add(jPHouse1);
        
        Community jpCommunity = new Community("Jamaica Plain",1000,jphouses);
        List<Community> jpCommunities = new ArrayList<>();
        jpCommunities.add(jpCommunity);
        
        //CityList citylist = new 
        City bostonCity = CityList.getCitiesList().get(0);
        bostonCity.addCommunity(jpCommunity);
        
//        City NewYork = CityList.getCitiesList().get(1);
        
//        City bostonCity = new City(CityList.getCitiesList().get(0).getCityName(), jpCommunities);
//        City bostonCity = new City(CityList.getCitiesList().get(0).getCityName(), jpCommunities);
//        City bostonCity = new City(CityList.getCitiesList().get(0).getCityName(), jpCommunities);
        
        //MissionHill
        //Person1
        VitalSigns vsMHPerson1visit1 = new VitalSigns(55.20, 138, 86, 5.10, 38.8, 95, 19, 97.50);
        VitalSigns vsMHPerson1visit2 = new VitalSigns(56.45, 122, 87, 6.00, 37.7, 96, 19, 98.50);
        VitalSigns vsMHPerson1visit3 = new VitalSigns(57.21,143, 89, 6.00, 39.5, 97, 19, 99.50);

        //Person2
        VitalSigns vsMHPerson2visit1 = new VitalSigns(65.20, 111, 72, 5.70, 39.8, 94, 19, 95.58);
        VitalSigns vsMHPerson2visit2 = new VitalSigns(64.60, 125, 95, 5.70, 40.5, 93, 20, 97.78);

        //Roxubory
        //Person1
        VitalSigns vsRBPerson1visit1 = new VitalSigns(46.20, 128, 83, 5.10, 38.8, 95, 19, 99.50);
        VitalSigns vsRBPerson1visit2 = new VitalSigns(48.45, 102, 89, 5.10, 38.7, 96, 19, 98.50);
        
        //Person2
        VitalSigns vsRBPerson2visit1 = new VitalSigns(55.20, 136, 86, 5.10, 38.8, 95, 19, 97.50);
        
        List<City> cities = new ArrayList<>();
        cities.add(bostonCity);
        
        
        List<Person> parentsList = new ArrayList<>();
        parentsList.add(jPPerson1);
        parentsList.add(jPPerson2);
        PersonDirectory personDirectory = new PersonDirectory(parentsList);
        
        List<Patient> patientsList = new ArrayList<>();
        patientsList.add(jPPatient1);
        patientsList.add(jPPatient2);
        PatientDirectory patientDirectory = new PatientDirectory(patientsList);
        System system = new System(cities, personDirectory, patientDirectory);
        
        return system;
    }
    
}
