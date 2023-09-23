/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import java.util.Date;

/**
 *
 * @author chinmaygulhane
 */
public class Insuarance {
    private String corporateIdNumber;
//    private Date startDate;
//    private Date endDate;
    private long premiumAmount;
    private long deductableAmount;
    private String benefits;
    private String isClaimed;

    @Override
    public String toString() {
        return "Insuarance:\n" + "Corporate Id Number: " + corporateIdNumber + "\n Premium Amount: " + premiumAmount + "\n Deductable Amount: " + deductableAmount + "\n Benefits: " + benefits + "\n Is Claimed=" + isClaimed + '\n';
    }

    public String getCorporateIdNumber() {
        return corporateIdNumber;
    }

    public void setCorporateIdNumber(String corporateIdNumber) {
        this.corporateIdNumber = corporateIdNumber;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(long premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public long getDeductableAmount() {
        return deductableAmount;
    }

    public void setDeductableAmount(long deductableAmount) {
        this.deductableAmount = deductableAmount;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String isIsClaimed() {
        return isClaimed;
    }

    public void setIsClaimed(String isClaimed) {
        this.isClaimed = isClaimed;
    }
       
}
