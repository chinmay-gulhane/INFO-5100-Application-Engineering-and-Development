/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

/**
 *
 * @author kal bugrara
 */
public class Channel {
    String name; //tv, internet, mobile app..
    public Channel(String t){
        name = t;
    }
    public boolean isMatch(String t){
        if (name.equalsIgnoreCase(t))return true;
        else return false;
    }
    public String getChannelName( ){
        return name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
