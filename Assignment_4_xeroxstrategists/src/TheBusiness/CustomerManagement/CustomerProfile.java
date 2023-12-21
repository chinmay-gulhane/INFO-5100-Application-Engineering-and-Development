/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import java.util.ArrayList;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;

/**
 *
 * @author kal bugrara
 */
public class CustomerProfile extends Profile {

    ArrayList<Order> orders;
    ArrayList<Market> markets;
    Person person;
    MarketChannelAssignment mca;
    
    public CustomerProfile(Person p,MarketChannelAssignment mca) {
        super(p);
        person = p;
        this.mca = mca;
        orders = new ArrayList();
    }
    
    @Override
    public String getRole(){
        return "Sales";
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    }

    public MarketChannelAssignment getMca() {
        return mca;
    }

    public void setMca(MarketChannelAssignment mca) {
        this.mca = mca;
    }
    
    

    public int getTotalPricePerformance() {

        //for each order in the customer orderlist 
        //calculate order price performance and add it to the sum
        return 0;
    }

    public int getNumberOfOrdersAboveTotalTarget() {
        //for each order in the customer order list 
        //calculate if order is positive (actual order total is greater than sum of item targets
        //if yes then add 1 to total 
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int getNumberOfOrdersBelowTotalTarget() {
        return 0;
    }
    //for each order in the customer order list 
    //calculate if order is negative
    //if yes then add 1 to total 

    public boolean isMatch(String id) {
        if (person.getPersonName().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order o) {
        orders.add(o);
    }

    @Override
    public String toString() {
        return person.getPersonName();
    }

    public String getCustomerName() {
        return person.getPersonName();
    }

    public Person getPerson() {
        return person;
    }

}
