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
public class City{
    
    private String cityName;
    
    private List<Community> communities;

    public City(String cityName, List<Community> communityList) {
        this.cityName=cityName;
        this.communities=communityList;
    }
    
    public City(String cityName) {
        this.cityName=cityName;
        this.communities= new ArrayList<Community>();
    }
    
    
    
    public void addCommunity(Community community){
        this.communities.add(community);
    }
    
    public void addCommunities(ArrayList<Community> communities){
        this.communities.addAll(communities);
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
    
}
