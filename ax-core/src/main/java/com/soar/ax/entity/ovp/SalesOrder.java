/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.entity.ovp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * 
 * <pre>
 * </pre>
 * 
 * <p>
 * <dt><b>Thread Safety:</b></dt>
 * <dd> <b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be
 * used on multi-thread occasion.) </dd>
 * 
 * <p>
 * <dt><b>Serialization:</b></dt>
 * <dd> <b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no
 * need to be serializable.) </dd>
 * 
 * <p>
 * <dt><b>Design Patterns:</b></dt>
 * <dd>
 * 
 * </dd>
 * 
 * <p>
 * <dt><b>Change History:</b></dt>
 * <dd> Date Author Action </dd>
 * <dd> Mar 2, 2011 henry leu Create the class </dd>
 * 
 * </dl>
 * 
 * @author henry leu
 * @see
 * @see
 */
/*@Entity
@Table(name = "MQT_RDL_SLS_ORDR_STS_SN ",schema="OVP")*/
public class SalesOrder extends SalesOrderEntity{

	private static final long serialVersionUID = -5120348807781246357L;
	
	public static final String DEFAULT_STATS_DTTM = ""; 
	
    @Column(name = "SRL_NUM")
    private String serialNumber;
        
    @Column(name = "ASSET_TAGS_SD")
    private String assetTagsSd;
    
    @Column(name = "MAC_ADDRES")
    private String macAddresses;
    
    /**add this column,hubaozhong 2011-6-15 14:11 */
    @Column(name = "MAC_ADDR_2")
    private String macAddresses2;
    
    @Column(name = "UUID")
    private String uuid;
    
    @Column(name = "WTY_STRT_DT")
    private String warrantyStartDate;
    //Added by zhx at 2011/10/13
    @Column(name = "WTY_END_DT")
    private String warrantyEndDate;
    
    /**
     * @return the invoiceNumber
     */
    @Override
    public String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * @param invoiceNumber the invoiceNumber to set
     */
    @Override
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * @return the assetTagsSd
     */
    public String getAssetTagsSd() {
        return assetTagsSd;
    }


    /**
     * @param assetTagsSd the assetTagsSd to set
     */
    public void setAssetTagsSd(String assetTagsSd) {
        this.assetTagsSd = assetTagsSd;
    }


    /**
     * @return the macAddresses
     */
    public String getMacAddresses() {
        return macAddresses;
    }


    /**
     * @param macAddresses the macAddresses to set
     */
    public void setMacAddresses(String macAddresses) {
        this.macAddresses = macAddresses;
    }


    /**
     * @return the macAddresses2
     */
    public String getMacAddresses2() {
        return macAddresses2;
    }


    /**
     * @param macAddresses2 the macAddresses2 to set
     */
    public void setMacAddresses2(String macAddresses2) {
        this.macAddresses2 = macAddresses2;
    }


    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }


    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * @return the warrantyStartDate
     */
    public String getWarrantyStartDate() {
        return warrantyStartDate;
    }


    /**
     * @param warrantyStartDate the warrantyStartDate to set
     */
    public void setWarrantyStartDate(String warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }


    /**
     * @return the warrantyEndDate
     */
    public String getWarrantyEndDate() {
        return warrantyEndDate;
    }


    /**
     * @param warrantyEndDate the warrantyEndDate to set
     */
    public void setWarrantyEndDate(String warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

	/**
     * @return the sourceSystem
     */
    @Override
    public String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * @param sourceSystem the sourceSystem to set
     */
    @Override
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

}