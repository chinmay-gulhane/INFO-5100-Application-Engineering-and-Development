/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataImport;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.Personnel.Person;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.Supplier.Supplier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author chinmaygulhane
 */
public class DataImportFile {

    public static void read(Business business) {
        // Use a relative path from the project root
        String filePath = "src/data/Business.xlsx";
        System.out.println("\n\n Reading from file \n");
            try ( FileInputStream fileInputStream = new FileInputStream(new File(filePath));  Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            readMarketingSheet(business, workbook);
            readChannelsSheet(business, workbook);
            readMarketChannelAssgnShhet(business, workbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readMarketingSheet(Business business, Workbook workbook) {
        Sheet markets = workbook.getSheetAt(1);
        Iterator<Row> marketSheet = markets.iterator();
        while (marketSheet.hasNext()) {

            Row row = marketSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String name = row.getCell(0).getStringCellValue();

            System.out.println("Markets : " + name);
          //  business.getMarketCatalog().newMarket(name);
        }
        System.out.println("\nMarket file end \n");
    }
    
    private static void readChannelsSheet(Business business, Workbook workbook) {
        Sheet channel = workbook.getSheetAt(2);
        Iterator<Row> channelSheet = channel.iterator();
        while (channelSheet.hasNext()) {

            Row row = channelSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }

            String type = row.getCell(0).getStringCellValue();
            System.out.println("Channels : " + type);
            business.getChannelCatalog().newChannel(type);
        }
       System.out.println("\nChannel file end \n");
    }

    private static void readMarketChannelAssgnShhet(Business business, Workbook workbook) {
        Sheet marketChannelCombo = workbook.getSheetAt(3);
        Iterator<Row> marketChannelSheet = marketChannelCombo.iterator();
        while (marketChannelSheet.hasNext()) {
            Row row = marketChannelSheet.next();
            if (row.getRowNum() == 0) {
                continue;
            }
            String marketName = row.getCell(0).getStringCellValue();
            String channelName = row.getCell(1).getStringCellValue();
            
            System.out.println("Market : " + marketName);
            System.out.println("Channel : " + channelName);         
            
//            Market m = business.getMarketCatalog().getMarketByName(marketName);
//            Channel c = business.getChannelCatalog().getChannelByName(channelName);
//            business.getMarketChannelComboCatalog().newMarketChannelCombo(m, c);
        }
        System.out.println("Market Channel file end \n");   
    }

}
