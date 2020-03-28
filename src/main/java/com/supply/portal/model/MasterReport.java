package com.supply.portal.model;

import javax.persistence.*;

/**
 * Created by saef rahal on 3/27/2020.
 */

public class MasterReport {

    private String stateName;
    private String hospitalName;
    private String categoryName;
    private String itemName;
    private String unitName;
    private int supplyRequestQuantity;
    private int deliveredQuantity;
    private int remainingQuantity;

    public MasterReport() {

    }

    public MasterReport(String stateName, String hospitalName, String categoryName, String itemName, String unitName, int supplyRequestQuantity, int deliveredQuantity, int remainingQuantity) {
        this.stateName = stateName;
        this.hospitalName = hospitalName;
        this.categoryName = categoryName;
        this.itemName = itemName;
        this.unitName = unitName;
        this.supplyRequestQuantity = supplyRequestQuantity;
        this.deliveredQuantity = deliveredQuantity;
        this.remainingQuantity = remainingQuantity;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getSupplyRequestQuantity() {
        return supplyRequestQuantity;
    }

    public void setSupplyRequestQuantity(int supplyRequestQuantity) {
        this.supplyRequestQuantity = supplyRequestQuantity;
    }

    public int getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(int deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(int remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }
}

