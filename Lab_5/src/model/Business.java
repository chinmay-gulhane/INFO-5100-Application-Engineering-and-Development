/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chinmaygulhane
 */
public class Business {
    MasterOrderList masterOrderList;
    SupplierDirectory supplierDrirectory;
    
    public Business() {
        masterOrderList = new MasterOrderList();
        supplierDrirectory = new SupplierDirectory();
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public SupplierDirectory getSupplierDrirectory() {
        return supplierDrirectory;
    }

    public void setSupplierDrirectory(SupplierDirectory supplierDrirectory) {
        this.supplierDrirectory = supplierDrirectory;
    }
    
}
