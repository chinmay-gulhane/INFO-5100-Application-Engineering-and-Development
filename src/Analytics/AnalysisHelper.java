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

    public static void BestThreeNegotiatedSolutions() {
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
    }

    public static void BestThreeCustomers() {
        
    }

    public static void BestThreeSalesPeople() {

    }

    public static void TotalMarginalRevenueByMarket() {

    }
}
