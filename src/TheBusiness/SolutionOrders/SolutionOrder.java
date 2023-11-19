/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SolutionOrders;

import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */

public class SolutionOrder {
    
    SolutionOffer selectedsolutionoffer;
    CustomerProfile customerprofile;
    SalesPersonProfile salesProfile;
    MarketChannelAssignment marketChannelAssignment; 
    int sp;
    int q;
    
    public SolutionOrder(SolutionOffer so,  MarketChannelAssignment mca,CustomerProfile customerprofile, SalesPersonProfile salesProfile,int sp, int q){
        selectedsolutionoffer = so;
        marketChannelAssignment = mca;
        this.customerprofile = customerprofile;
        this.salesProfile = salesProfile;
        this.sp = sp;
        this.q = q;
    }
    
    public int getSolutionPrice(){
        return selectedsolutionoffer.getTarget();
    }
    public MarketChannelAssignment getMarketChannelCombo(){
        
        return marketChannelAssignment;
                
    }

   
}
