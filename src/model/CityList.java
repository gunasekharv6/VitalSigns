/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author gunasekhar
 */
//public enum CityList {
//    Boston,NewYork,Florida;
//    
//        public static List<String> getCitiesList(){
//       
//        return Stream.of(CityList.values()).map(CityList::name).collect(Collectors.toList());
//    }
//    
//    public static String[] getCitiesArray() {
//        
//        return Arrays.stream(CityList.values()).map(CityList::name).toArray(String[]::new);
//    }
//
//}

public class CityList{
    
//    private City city;    
    private static ArrayList<City> citiesList  = new ArrayList<City>(){
        {
            add(new City("Boston", new ArrayList<Community>()));
//            add(new City("New York", new ArrayList<Community>()));
//            add(new City("Chicago", new ArrayList<Community>())); 
        }
    };
    


    public static ArrayList<City> getCitiesList() {
        return citiesList;
    }

    public static void setCitiesList(ArrayList<City> citiesList) {
        CityList.citiesList = citiesList;
    }
    
    public static void addCity(City cityName){
        CityList.getCitiesList().add(cityName);
    }
    
    
}
