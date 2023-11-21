/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.MarketModel.ChannelCatalog;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() throws FileNotFoundException, IOException {
        Business business = new Business("Xerox");

        MarketCatalog mc = business.getMarketCatalog();
        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();
        String filePath = "src/data/Business.xlsx";
        System.out.println("\n\n Reading from file \n");
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        Sheet markets = workbook.getSheetAt(0);
        Iterator<Row> marketSheet = markets.iterator();
        while (marketSheet.hasNext()) {

            Row row = marketSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String marketName = row.getCell(0).getStringCellValue();
            System.out.println("Markets : " + marketName);
            String characteristics = row.getCell(1).getStringCellValue();

            System.out.println("Characteristics : " + characteristics);
            business.getMarketCatalog().newMarket(marketName, characteristics);
        }
        System.out.println("Market file end \n");

//        Market teenmarket = mc.newMarket("Teenagers");
//        Market teenmarket2 = mc.newMarket("College Grads");
        ChannelCatalog channelCatalog = business.getChannelCatalog();

        Sheet channels = workbook.getSheetAt(1);
        Iterator<Row> channelSheet = channels.iterator();
        while (channelSheet.hasNext()) {

            Row row = channelSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String channelName = row.getCell(0).getStringCellValue();

            System.out.println("Channels : " + channelName);
            business.getChannelCatalog().newChannel(channelName);
        }
        System.out.println("Channel file end \n");

//        Channel tvchannel = channelCatalog.newChannel("tv");
//        Channel webchannel = channelCatalog.newChannel("web");
        Sheet marketChannels = workbook.getSheetAt(2);
        Iterator<Row> marketChannelSheet = marketChannels.iterator();
        while (marketChannelSheet.hasNext()) {

            Row row = marketChannelSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String marketName = row.getCell(0).getStringCellValue();
            String channelName = row.getCell(1).getStringCellValue();

            System.out.println("Market : " + marketName);
            System.out.println("Channels : " + channelName);

            Market m = business.getMarketcatalog().findMarket(marketName);
            Channel c = business.getChannelCatalog().findChannel(channelName);

            m.addValidChannel(c);

            MarketChannelAssignment mca = mccc.newMarketChannelCombo(m, c);
        }
        System.out.println("Market Channel file end \n");

//        teenmarket.addValidChannel(webchannel);
//        teenmarket.addValidChannel(tvchannel);
//        MarketChannelAssignment tvchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, tvchannel);
//        MarketChannelAssignment webchannelteenmarket = mccc.newMarketChannelCombo(teenmarket2, webchannel);
// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
        // Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);
        // Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();

        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

        Sheet salesPerson = workbook.getSheetAt(3);
        Iterator<Row> salesPersonSheet = salesPerson.iterator();
        while (salesPersonSheet.hasNext()) {

            Row row = salesPersonSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String salesPersonName = row.getCell(0).getStringCellValue();

            System.out.println("Sales Person : " + salesPersonName);
            Person xeroxsalesperson001 = persondirectory.newPerson(salesPersonName);
            SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);
            UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX"); /// order products for one of the customers and performed by a sales person
        }
        System.out.println("Sales Person file end \n");

// person representing sales organization        
//        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales1");
//        Person xeroxsalesperson002 = persondirectory.newPerson("Xerox sales2");
//        Person xeroxsalesperson003 = persondirectory.newPerson("Xerox sales3");
//        Person xeroxsalesperson004 = persondirectory.newPerson("Xerox sales4");
//        Person xeroxsalesperson005 = persondirectory.newPerson("Xerox sales5");
        CustomerDirectory customedirectory = business.getCustomerDirectory();

        Sheet customer = workbook.getSheetAt(4);
        Iterator<Row> customerSheet = customer.iterator();
        while (customerSheet.hasNext()) {

            Row row = customerSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String customerName = row.getCell(0).getStringCellValue();
            String marketName = row.getCell(1).getStringCellValue();
            String channelName = row.getCell(2).getStringCellValue();

            Market m = business.getMarketcatalog().findMarket(marketName);
            Channel c = business.getChannelCatalog().findChannel(channelName);
            MarketChannelAssignment mca = business.getMarketChannelComboCatalog().finMarketChannelCombo(m, c);

            System.out.println("Customer : " + customerName);
            Person p = persondirectory.newPerson(customerName);
            CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(p, mca);
        }
        System.out.println("Customer file end \n");
// Create person objects to represent customer organizations. 
//        Person person005 = persondirectory.newPerson("Dell");
//        Person person006 = persondirectory.newPerson("Microsoft");
//        Person person007 = persondirectory.newPerson("Google");
//        Person person008 = persondirectory.newPerson("JP Morgan");
//        Person person009 = persondirectory.newPerson("State street"); //we use this as customer

// Create Customers
//        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005, tvchannelteenmarket);
//        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006, tvchannelteenmarket);
//        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007, webchannelteenmarket);
//        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008, webchannelteenmarket);
//        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009, tvchannelteenmarket);
// Create Sales people
//        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
//        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);
//        SalesPersonProfile salespersonprofile1 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson002);
//        SalesPersonProfile salespersonprofile2 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson003);
//        SalesPersonProfile salespersonprofile3 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson004);
//        SalesPersonProfile salespersonprofile4 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson005);
// Create product catalog
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Sheet suppliers = workbook.getSheetAt(5);
        Iterator<Row> supplierSheet = suppliers.iterator();
        while (supplierSheet.hasNext()) {

            Row row = supplierSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String sName = row.getCell(0).getStringCellValue();

            System.out.println("Supplier : " + sName);
            Supplier supplier1 = suplierdirectory.newSupplier(sName);

        }

        Supplier supplier1 = suplierdirectory.findSupplier("Lenovo");
        ProductCatalog productcatalog0 = supplier1.getProductCatalog();
        Sheet product1 = workbook.getSheetAt(6);
        Iterator<Row> product1Sheet = product1.iterator();
        while (product1Sheet.hasNext()) {

            Row row1 = product1Sheet.next();
            if (row1.getRowNum() == 0) {
                continue;
            }

            String pName = row1.getCell(0).getStringCellValue();
            int fp = (int) row1.getCell(1).getNumericCellValue();
            int tp = (int) row1.getCell(2).getNumericCellValue();
            int cp = (int) row1.getCell(3).getNumericCellValue();
            productcatalog0.newProduct(pName, fp, cp, tp);
        }

        Supplier supplier2 = suplierdirectory.findSupplier("Epson");
        ProductCatalog productcatalog1 = supplier2.getProductCatalog();
        Sheet product2 = workbook.getSheetAt(7);
        Iterator<Row> product2Sheet = product2.iterator();
        while (product2Sheet.hasNext()) {

            Row row1 = product2Sheet.next();
            if (row1.getRowNum() == 0) {
                continue;
            }

            String pName = row1.getCell(0).getStringCellValue();
            int fp = (int) row1.getCell(1).getNumericCellValue();
            int tp = (int) row1.getCell(2).getNumericCellValue();
            int cp = (int) row1.getCell(3).getNumericCellValue();
            productcatalog1.newProduct(pName, fp, cp, tp);
        }

//        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
//        
//        Product products1p1 = productcatalog0.newProduct("Scanner 3  1", 2000, 16500, 10000);
//        Product products1p2 = productcatalog0.newProduct("Scanner 4", 10000, 25000, 16500);
//        Product products1p3 = productcatalog0.newProduct("Printer 2", 22000, 40000, 36500);
//        Product products1p4 = productcatalog0.newProduct("Photocopier 2", 30000, 70000, 50000);
//        Product products1p5 = productcatalog0.newProduct("Scanner  5", 19000, 36500, 25000);
//        Product products1p6 = productcatalog0.newProduct("Scanner 6", 90000, 125000, 105000);
//        Product products1p7 = productcatalog0.newProduct("Printer 3", 22000, 60000, 36500);
//        Product products1p8 = productcatalog0.newProduct("Photocopier 3", 30000, 70000, 50000);
        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        //        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
//        ProductCatalog productcatalog1 = supplier2.getProductCatalog();
//        Product products2p1 = productcatalog1.newProduct("Scanner 13  1", 12000, 26000, 18500); // fp,cp,tp
//        Product products2p2 = productcatalog1.newProduct("Scanner 14", 90000, 165000, 125000);
//        Product products2p3 = productcatalog1.newProduct("Color Printer 112", 422000, 540000, 495000);
//        Product products2p4 = productcatalog1.newProduct("Photocopier 922 ", 430000, 890000, 550000);
//        Product products2p5 = productcatalog1.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
//        Product products2p6 = productcatalog1.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
//        Product products2p7 = productcatalog1.newProduct("Premier Printer 300", 322000, 470000, 736500);
//        Product products2p8 = productcatalog1.newProduct("Color Photocopier 500", 350000, 580000, 780000);
//        SolutionOffer sof1 = new SolutionOffer(productcatalog0, 225000, 330500, 329500, "Offer1", tvchannelteenmarket); // tp,fp,cp
//        SolutionOffer sof2 = new SolutionOffer(productcatalog1, 2341200, 3296100, 4720102, "Offer2", webchannelteenmarket);
        Random random = new Random();
        ProductCatalog[] pc = new ProductCatalog[2];
        pc[0] = productcatalog0;
        pc[1] = productcatalog1;
        SolutionOfferCatalog soc = business.getSolutionOfferCatalog();
        Sheet so = workbook.getSheetAt(8);
        Iterator<Row> soSheet = so.iterator();
        while (soSheet.hasNext()) {

            Row row = soSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            int tp = (int) row.getCell(0).getNumericCellValue();
            int cp = (int) row.getCell(1).getNumericCellValue();
            int fp = (int) row.getCell(2).getNumericCellValue();
            String market = row.getCell(3).getStringCellValue();
            String channel = row.getCell(4).getStringCellValue();

            Market m = business.getMarketcatalog().findMarket(market);
            Channel c = business.getChannelCatalog().findChannel(channel);
            MarketChannelAssignment mca = business.getMarketChannelComboCatalog().finMarketChannelCombo(m, c);
            SolutionOffer sof1 = new SolutionOffer(pc[random.nextInt(2)], 225000, 330500, 329500, "Offer1", mca);
            soc.newSolutionOffer(sof1);
        }

        MasterSolutionOrderList mastersolutionorderlist = new MasterSolutionOrderList();
        Sheet sor = workbook.getSheetAt(9);
        Iterator<Row> sorSheet = sor.iterator();
        while (sorSheet.hasNext()) {

            Row row = sorSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String pName = row.getCell(0).getStringCellValue();
            String market = row.getCell(1).getStringCellValue();
            String channel = row.getCell(2).getStringCellValue();
            String customerN = row.getCell(3).getStringCellValue();
            String spName = row.getCell(4).getStringCellValue();
            int tp = (int) row.getCell(5).getNumericCellValue();
            int sp = (int) row.getCell(6).getNumericCellValue();
            int cp = (int) row.getCell(7).getNumericCellValue();
            int fp = (int) row.getCell(8).getNumericCellValue();
            int quantity = (int) row.getCell(9).getNumericCellValue();
            String status = row.getCell(10).getStringCellValue();
            SolutionOrder so1 = new SolutionOrder(pName, market, channel, customerN, spName, tp, sp, cp, fp, quantity, status);
            mastersolutionorderlist.newSolutionOrder(so1);
        }

//        SolutionOrder so1 = new SolutionOrder("Scanner 13  1", "Teenagers", "tv", "Dell", "Xerox sales1", 18500, 15000, 26000, 12000, 3, "Submitted"); //tp,sp,cp,fp
//        SolutionOrder so2 = new SolutionOrder("Scanner 4", "Teenagers", "tv", "Dell", "Xerox sales1", 16500, 20000, 25000, 16500, 2, "Submitted");
//        SolutionOrder so3 = new SolutionOrder("Printer 2", "Teenagers", "tv", "Microsoft", "Xerox sales2", 36500, 15000, 40000, 36500, 3, "Submitted");
//        SolutionOrder so4 = new SolutionOrder("Photocopier 2", "College Grads", "web", "Microsoft", "Xerox sales2", 50000, 15000, 70000, 50000, 3, "Submitted");
//        SolutionOrder so5 = new SolutionOrder("Printer 3", "College Grads", "web", "Google", "Xerox sales3", 36500, 150000, 60000, 36500, 3, "Submitted");
//        SolutionOrder so6 = new SolutionOrder("Offer1", "Teenagers", "tv", "Google", "Xerox sales3", 18500, 15000, 26000, 12000, 3, "Submitted");
//        SolutionOrder so7 = new SolutionOrder("Offer2", "College Grads", "web", "State street", "Xerox sales3", 18500, 15000, 26000, 12000, 3, "Submitted");
//        SolutionOrder so8 = new SolutionOrder("Offer3", "College Grads", "web", "Samiksha", "Xerox sales3", 10, 10000, 26000, 12000, 200, "Submitted");
//        SolutionOrder so9 = new SolutionOrder("Offer4", "College Grads", "web", "Adwait", "Xerox sales4", 100, 10000, 26000, 12000, 200, "Submitted");
//        mastersolutionorderlist.newSolutionOrder(so1);
//        mastersolutionorderlist.newSolutionOrder(so2);
//        mastersolutionorderlist.newSolutionOrder(so3);
//        mastersolutionorderlist.newSolutionOrder(so4);
//        mastersolutionorderlist.newSolutionOrder(so5);
//        mastersolutionorderlist.newSolutionOrder(so6);
//        mastersolutionorderlist.newSolutionOrder(so7);
//        mastersolutionorderlist.newSolutionOrder(so8);
//        mastersolutionorderlist.newSolutionOrder(so9);
// Solution 1: Our top 3 best negotiated solutions (meaning solutions that sell above target) broken down by market segment           
        System.out.println("Our top 3 best negotiated solutions (meaning solutions that sell above target) broken down by market segment");
        System.out.println("");
        Map<String, Map<String, Integer>> marketProfitMap = new HashMap<>();
        for (SolutionOrder order : mastersolutionorderlist.getSolutionorderlist()) {
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
        for (SolutionOrder order : mastersolutionorderlist.getSolutionorderlist()) {
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
        for (SolutionOrder order : mastersolutionorderlist.getSolutionorderlist()) {
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
        for (SolutionOrder order : mastersolutionorderlist.getSolutionorderlist()) {
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

        business.setMastersolutionorderlist(mastersolutionorderlist);
        business.setBusiness(business);
        return business;
    }
}
