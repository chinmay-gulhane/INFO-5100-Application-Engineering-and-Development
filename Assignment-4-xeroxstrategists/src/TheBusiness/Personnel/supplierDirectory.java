/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Personnel;

import TheBusiness.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class supplierDirectory {
    ArrayList<Supplier> supplierlist ;
    
    public supplierDirectory (){
          
       supplierlist = new ArrayList();

    }
    
    public Supplier findSupplier(String id) {

        for (Supplier p : supplierlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
}
