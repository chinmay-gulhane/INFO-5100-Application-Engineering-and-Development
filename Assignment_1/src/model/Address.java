/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chinmaygulhane
 */
public class Address {
    
    private String street;
    private String city;
    private String state;
    private Long zipCode;
    private String country;

    @Override
    public String toString() {
        return "Address\n" + "Street: " + street + "\n City: " + city + "\n State: " + state + "\n Zip Code: " + zipCode + "\n Country: " + country + '\n';
    }
    
    public String getAddressDisplay(){
        return  street + ", " + city + ", " + state + ", " + zipCode + ", " + country;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
