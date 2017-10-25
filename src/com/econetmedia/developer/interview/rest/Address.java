/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.econetmedia.developer.interview.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * VimbainasheNhira on 25/10/2017
 */

@XmlRootElement
public class Address {
    
    private String streetNo;
    private String streetName;
    private String city;
    private String country;
    
    public String getStreetNo()
    {
        return streetNo;
    }
    
    public String getStreetName()
    {
        return streetName;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    public void setStreetNo(String streetNo)
    {
        this.streetNo = streetNo;
    }
    
    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
     public void setCountry(String country)
    {
        this.country = country;
    }
     
       @Override
    public String toString() {
        return  "StreetNo : " + streetNo +
                ", Street Name :'" + streetName + '\'' +
                ", City : '" + city + '\'' +
                ", Country='" + country + '\'' +
                "";
    }
    
}
