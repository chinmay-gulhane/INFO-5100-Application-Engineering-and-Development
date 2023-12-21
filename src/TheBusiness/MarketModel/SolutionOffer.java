/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class SolutionOffer {
    ProductCatalog productCatalog;
    int targetPrice;//floor, ceiling, and target ideas
    int floorPrice;
    int ceilingPrice;
    String name;
    MarketChannelAssignment marketchannelcomb;
    ArrayList<SolutionOrder> solutionorder;
    
    public SolutionOffer(MarketChannelAssignment m){
        marketchannelcomb = m;
        solutionorder = new ArrayList();
        m.addSolutionOffer(this);   
    } 
     public SolutionOffer(ProductCatalog productCatalog, int targetPrice, int floorPrice, int ceilingPrice, String name, MarketChannelAssignment marketchannelcomb){
        this.productCatalog = productCatalog;
        this.targetPrice = targetPrice;
        this.ceilingPrice = ceilingPrice;
        this.floorPrice = floorPrice;
        this.name = name;
        this.marketchannelcomb = marketchannelcomb;
    } 

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }


    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MarketChannelAssignment getMarketchannelcomb() {
        return marketchannelcomb;
    }

    public void setMarketchannelcomb(MarketChannelAssignment marketchannelcomb) {
        this.marketchannelcomb = marketchannelcomb;
    }

    public ArrayList<SolutionOrder> getSolutionorder() {
        return solutionorder;
    }

    public void setSolutionorder(ArrayList<SolutionOrder> solutionorder) {
        this.solutionorder = solutionorder;
    }
     

   
//    public int getRevenues(){
//        int sum = 0;
//        for(SolutionOrder so: solutionorder){
//            sum = sum + so.getSolutionPrice();
//            
//        }
//        return sum;
//    }
    
    public void addSolutionOrder(SolutionOrder so){
        solutionorder.add(so);
    }
    // this will allow one to retrieve all offers meant for this market/channel combo
    public boolean isSolutionOfferMatchMarketChannel(MarketChannelAssignment mca){
        
        if (marketchannelcomb==mca) return true;
        else return false;
    }
@Override
    public String toString(){
        return name;
    }

    
}
