/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SolutionOrders;

import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.SalesManagement.SalesPersonProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MasterSolutionOrderList {
        ArrayList<SolutionOrder> solutionorderlist;

    public MasterSolutionOrderList() {
        solutionorderlist = new ArrayList();
    }

    public ArrayList<SolutionOrder> getSolutionorderlist() {
        return solutionorderlist;
    }
    
    public SolutionOrder newSolutionOrder(String solutionOfferName, String marketName, String channeName,String customerName, String salesPerson,int targetPrice, int sellingPrice,int ceilingPrice,int floorPrice, int quantity, String status) {
        SolutionOrder so = new SolutionOrder(solutionOfferName,marketName,channeName,customerName,salesPerson,targetPrice,sellingPrice,ceilingPrice,floorPrice,quantity,status);
        solutionorderlist.add(so);
   //     soloffer.addSolutionOrder(so);
        return so;
    }
    
    public SolutionOrder newSolutionOrder(SolutionOrder so1) {
        solutionorderlist.add(so1);
   //     soloffer.addSolutionOrder(so);
        return so1;
    }
     

//    public int getRevenueByMarket(Market m) {
//        int sum = 0;
//        for(SolutionOrder so: solutionorderlist){
//         
//         MarketChannelAssignment mcc =   so.getMarketChannelCombo();
//         if(mcc.getMarket()==m) sum = sum +so.getSolutionPrice();
//           
//        }
//
//        return sum;
//
//    }
//    public int getRevenueByChannel(Channel c) {
//        int sum = 0;
//        for(SolutionOrder so: solutionorderlist){
//         
//         MarketChannelAssignment mcc =   so.getMarketChannelCombo();
//         if(mcc.getChannel()==c) sum = sum +so.getSolutionPrice();
//           
//        }
//
//        return sum;
//
//    }
//    public int getRevenueByMarketChannelCombo(MarketChannelAssignment mca) {
//        int sum = 0;
//        for(SolutionOrder so: solutionorderlist){
//         
//         MarketChannelAssignment mcc =   so.getMarketChannelCombo();
//         if(mcc==mca) sum = sum +so.getSolutionPrice(); 
//           
//        }
//        return sum;
//
//    }

}
