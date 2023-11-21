/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Market {

    String name;
    ArrayList<Channel> validchannels;
    String characteristics; //a way to describe in plain language what is that group
  //  ArrayList<Market> submarkets;
    int size;

    public Market(String m, String cha) {
        name = m;
        characteristics = cha;
        //submarkets = new ArrayList();
        validchannels = new ArrayList();
    }

    

    public void addValidChannel(Channel c) {
        validchannels.add(c);
    }
    
    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Channel> getValidchannels() {
        return validchannels;
    }

    public void setValidchannels(ArrayList<Channel> validchannels) {
        this.validchannels = validchannels;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
