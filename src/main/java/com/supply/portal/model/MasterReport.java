package com.supply.portal.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class MasterReport {

    private String stateName;
    private String hospitalName;
    private String categoryName;
    private String itemName;
    private String unitName;
    private Number supplyRequestQuantity;
    private Number deliveredQuantity;
    private Number remainingQuantity;

    public MasterReport() {

    }

    public MasterReport(Object stateName, Object hospitalName, Object categoryName, Object itemName, Object unitName, Object supplyRequestQuantity, Object deliveredQuantity, Object remainingQuantity) {
        this.stateName = (String) stateName;
        this.hospitalName = (String) hospitalName;
        this.categoryName = (String) categoryName;
        this.itemName = (String) itemName;
        this.unitName = (String) unitName;
        this.supplyRequestQuantity = (Number) supplyRequestQuantity;
        this.deliveredQuantity = (Number) deliveredQuantity;
        this.remainingQuantity = (Number) remainingQuantity;
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

    public Number getSupplyRequestQuantity() {
        return supplyRequestQuantity;
    }

    public void setSupplyRequestQuantity(Number supplyRequestQuantity) {
        this.supplyRequestQuantity = supplyRequestQuantity;
    }

    public Number getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(Number deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public Number getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Number remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }
}

