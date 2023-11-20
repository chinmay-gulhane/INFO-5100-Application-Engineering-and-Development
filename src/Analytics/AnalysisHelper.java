/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analytics;

import TheBusiness.Business.Business;
import TheBusiness.SolutionOrders.SolutionOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chinmaygulhane
 */
public class AnalysisHelper {
    public static void test(){
        
        Business business = Business.getBusiness();
        // Solution 1: Our top 3 best negotiated solutions (meaning solutions that sell above target) broken down by market segment           
        System.out.println("Our top 3 best negotiated solutions (meaning solutions that sell above target) broken down by market segment");
        System.out.println("");
        Map<String, Map<String, Integer>> marketProfitMap = new HashMap<>();
        for (SolutionOrder order : business.getMastersolutionorderlist().getSolutionorderlist()) {
            int profit = (order.getSellingPrice() - order.getTargetPrice()) * (order.getQuantity());
            String marketName = order.getMarketName();
            String solutionOfferName = order.getSolutionOfferName();
            marketProfitMap
                    .computeIfAbsent(marketName, k -> new HashMap<>())
                    .merge(solutionOfferName, profit, Integer::sum);
        }
// Find the top 3 solutionOfferNames with the highest accumulated profit for each market
        for (Map.Entry<String, Map<String, Integer>> entry : marketProfitMap.entrySet()) {
            String marketName = entry.getKey();
            Map<String, Integer> solutionProfits = entry.getValue();

            // Create a list of solutionOfferNames sorted by profit in descending order
            List<String> topThreeSolutionOffers = new ArrayList<>(solutionProfits.keySet());
            topThreeSolutionOffers.sort((a, b) -> Integer.compare(solutionProfits.get(b), solutionProfits.get(a)));

            // Print the top 3 solutionOfferNames for each market
            System.out.println("Market: " + marketName);
            for (int i = 0; i < Math.min(3, topThreeSolutionOffers.size()); i++) {
                String solutionOffer = topThreeSolutionOffers.get(i);
                int accumulatedProfit = solutionProfits.get(solutionOffer);
                System.out.println("  Solution Offer: " + solutionOffer + ", Accumulated Profit: " + accumulatedProfit);
            }
        }

// Solution 2: Our 3 best customers (customers who buy about target price)  
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println("Our 3 best customers (customers who buy about target price)");
        System.out.println("");
        List<String> top3customerNames = null;
        Map<String, Integer> customerProfits = new HashMap<>();
        for (SolutionOrder order : business.getMastersolutionorderlist().getSolutionorderlist()) {
            int profit = (order.getSellingPrice() - order.getTargetPrice()) * (order.getQuantity());
            String customerName = order.getCustomerName();
            customerProfits.put(customerName, customerProfits.getOrDefault(customerName, 0) + profit);

            List<String> customerNames = new ArrayList<>(customerProfits.keySet());

            Collections.sort(customerNames, (a, b) -> Integer.compare(customerProfits.get(b), customerProfits.get(a)));
            top3customerNames = customerNames.subList(0, Math.min(3, customerNames.size()));
        }
        for (int i = 0; i < top3customerNames.size(); i++) {
            System.out.println(top3customerNames.get(i) + " Total Profits "
                    + customerProfits.get(top3customerNames.get(i)));
        }

// Solution 3: Our top 3 best sales people (sell higher that target)   
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println("Our top 3 best sales people (sell higher that target)");
        System.out.println("");
        List<String> top3salesPerson = null;
        Map<String, Integer> salesPersonProfits = new HashMap<>();
        for (SolutionOrder order : business.getMastersolutionorderlist().getSolutionorderlist()) {
            int profit = (order.getSellingPrice() - order.getTargetPrice()) * (order.getQuantity());
            String salesPersonName = order.getSalesPerson();
            salesPersonProfits.put(salesPersonName, salesPersonProfits.getOrDefault(salesPersonName, 0) + profit);

            List<String> salesPersonNames = new ArrayList<>(salesPersonProfits.keySet());

            Collections.sort(salesPersonNames, (a, b) -> Integer.compare(salesPersonProfits.get(b), salesPersonProfits.get(a)));
            top3salesPerson = salesPersonNames.subList(0, Math.min(3, salesPersonNames.size()));
        }
        for (int i = 0; i < top3salesPerson.size(); i++) {
            System.out.println(top3salesPerson.get(i) + " Total Profits "
                    + salesPersonProfits.get(top3salesPerson.get(i)));
        }

// Solution 4: Our top 3 best sales people (sell higher that target)
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println("Our total marginal revenue broken down by market that is above or below expected target (actual minus target)");
        System.out.println("");
        Map<String, Integer> marketProfits = new HashMap<>();
        List<String> marketNames = null;
        for (SolutionOrder order : business.getMastersolutionorderlist().getSolutionorderlist()) {
            int profit = (order.getSellingPrice() - order.getTargetPrice()) * (order.getQuantity());
            String marketName = order.getMarketName();
            marketProfits.put(marketName, marketProfits.getOrDefault(marketName, 0) + profit);

            marketNames = new ArrayList<>(marketProfits.keySet());

            Collections.sort(marketNames, (a, b) -> Integer.compare(marketProfits.get(b), marketProfits.get(a)));
        }
        for (int i = 0; i < marketNames.size(); i++) {
            System.out.println(marketNames.get(i) + " Total Revenue "
                    + marketProfits.get(marketNames.get(i)));
        }

// Determine if the company is pricing its solutions correctly. Show how to update price ranges so prices perform at optimum levels (higher and lower targets).
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println("Determine if the company is pricing its solutions correctly. Show how to update price ranges so prices perform at optimum levels (higher and lower targets).");
        System.out.println("");
    }
}
