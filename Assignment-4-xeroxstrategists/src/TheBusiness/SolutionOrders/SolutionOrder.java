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
    
    String solutionOfferName;
    String marketName;
    String channelName;
    String customerName;
    String salesPerson;
    int targetPrice;
    int sellingPrice;
    int ceilingPrice;
    int floorPrice;
    int quantity;
    String status;
    
    
    
    public SolutionOrder(SolutionOffer so,  MarketChannelAssignment mca,CustomerProfile customerprofile, SalesPersonProfile salesProfile,int sp, int q){
        selectedsolutionoffer = so;
        marketChannelAssignment = mca;
        this.customerprofile = customerprofile;
        this.salesProfile = salesProfile;

    }
    
    public SolutionOrder(String solutionOfferName, String marketName, String channeName,String customerName, String salesPerson,int targetPrice, int sellingPrice,int ceilingPrice,int floorPrice, int quantity, String status){
        this.solutionOfferName=solutionOfferName;
        this.marketName=marketName;
        this.channelName=channeName;
        this.customerName=customerName;
        this.salesPerson=salesPerson;
        this.targetPrice=targetPrice;
        this.sellingPrice=sellingPrice;
        this.ceilingPrice=ceilingPrice;
        this.floorPrice=floorPrice;
        this.quantity=quantity;
        this.status=status;
    }

    public SolutionOffer getSelectedsolutionoffer() {
        return selectedsolutionoffer;
    }

    public void setSelectedsolutionoffer(SolutionOffer selectedsolutionoffer) {
        this.selectedsolutionoffer = selectedsolutionoffer;
    }

    public CustomerProfile getCustomerprofile() {
        return customerprofile;
    }

    public void setCustomerprofile(CustomerProfile customerprofile) {
        this.customerprofile = customerprofile;
    }

    public SalesPersonProfile getSalesProfile() {
        return salesProfile;
    }

    public void setSalesProfile(SalesPersonProfile salesProfile) {
        this.salesProfile = salesProfile;
    }

    public MarketChannelAssignment getMarketChannelAssignment() {
        return marketChannelAssignment;
    }

    public void setMarketChannelAssignment(MarketChannelAssignment marketChannelAssignment) {
        this.marketChannelAssignment = marketChannelAssignment;
    }

    public String getSolutionOfferName() {
        return solutionOfferName;
    }

    public void setSolutionOfferName(String solutionOfferName) {
        this.solutionOfferName = solutionOfferName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int performance(){
        return sellingPrice-targetPrice;
    }
    
//    public int getSolutionPrice(){
//        return selectedsolutionoffer.getTarget();
//    }
    
    public MarketChannelAssignment getMarketChannelCombo(){
        
        return marketChannelAssignment;
                
    }

   
}
