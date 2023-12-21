/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import TheBusiness.MarketModel.Market;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MarketCatalog {

    ArrayList<Market> markets;
    // constructor  MarketCatalog 

    public MarketCatalog() {

        markets = new ArrayList();

    }

    public Market newMarket(String m, String ch) {

        Market market = new Market(m,ch);
        markets.add(market);
        return market;
    }

    public ArrayList<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    }
    
        public Market findMarket(String type){
        
        for( Market m: markets ){
            
            if (m.getName().equalsIgnoreCase(type)) 
                return m;
            
        }
        return null; //not found
    }

}
