/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.entity.ovp;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Transient;

import org.springframework.data.annotation.Id;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * <pre>
 * 
 * </pre>
 * 
 * <p><dt><b>Thread Safety:</b></dt> 
 * <dd>
 *  <b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be used on multi-thread occasion.)
 * </dd>
 * 
 * <p><dt><b>Serialization:</b></dt>
 * <dd>
 *  <b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no need to be serializable.)
 * </dd>
 * 
 * <p><dt><b>Design Patterns:</b></dt>
 * <dd>
 *  
 * </dd>
 * 
 * <p><dt><b>Change History:</b></dt>
 * <dd>
 *  Date        Author      Action
 * </dd>
 * <dd>
 *  Jun 15, 2011    ovp Create the class
 * </dd>
 * 
 * </dl>
 * @author  ovp
 * @see         
 * @see         
 */
/*@Entity
@Table(name = "MQT_RDL_SLS_ORDR_STS",schema="OVP")*/
public class SalesOrderEntity implements Serializable{

    protected static final long serialVersionUID = -5120348807781246357L;

   
    
    @Id
    protected String id;

    
    @Column(name = "SLS_ORDR_NUM")
    protected String salesOrderNumber;

    
    @Column(name = "SLS_ORDR_LINE_NUM")
    protected String salesOrderLineItemNumber;

    
    @Column(name = "DLVRY_NUM")
    protected String deliveryNumber;

    
    @Column(name = "DLVRY_ITEM_NUM")
    protected String deliveryItemNumber;

    @Column(name = "INVC_NUM")
    protected String invoiceNumber;

    @Column(name = "ORDR_TYPE")
    protected String orderType;

    @Column(name = "ORDR_TYPE_DESC")
    protected String orderTypeDescription;

    @Column(name = "ORDR_STS_HDR")
    protected String orderStatusHeader;

    @Column(name = "ORDR_STS_ITEM")
    protected String orderStatusItem;

    @Column(name = "PRTL_SHIP")
    protected String partialShip;

    @Column(name = "ORDR_CTGRY")
    protected String orderCategory;

    @Column(name = "PROD_ID")
    protected String productId;

    @Column(name = "PROD_DESC")
    protected String productDescription;

    @Column(name = "PROD_HIER")
    protected String productHierarchy;

    @Column(name = "MACH_TYPE")
    protected String machineType;

    @Column(name = "MACH_TYPE_DESC")
    protected String machineTypeDescription;

    @Column(name = "MACH_MDL")
    protected String machineModel;

    @Column(name = "MACH_MDL_DESC")
    protected String machineModelDescription;

    @Column(name = "PROD_GRP")
    protected String productGroup;

    @Column(name = "PROD_GRP_DESC")
    protected String productGroupDescription;

    @Column(name = "PROD_BRD")
    protected String productBrand;

    @Column(name = "PROD_BRD_DESC")
    protected String productBrandDescription;

    @Column(name = "PROD_FMLY")
    protected String productFamily;

    @Column(name = "EAN_UPC")
    protected String eanUpc;

    @Column(name = "ORDR_QTY")
    protected Integer orderQuantity;

    @Column(name = "DLVRD_QTY")
    protected Integer deliveredQuantity;

    @Column(name = "DLVRY_NOTES")
    protected String deliveryNotes;

    @Column(name = "SLS_UNIT")
    protected String salesUnit;

    @Column(name = "HDR_CRNCY")
    protected String headerCurrency;

    @Column(name = "ITEM_CRNCY")
    protected String itemCurrency;
    /**
     * Base HDR_CRNCY
     */
    @Column(name = "UNIT_PRC")
    protected String unitPrice;
//  @Column(name = "TOT_PRCH_AMT")
//  protected BigDecimal totalPurchaseAmount;
    
    /**
     * Base HDR_CRNCY
     */
    @Column(name = "ORDR_AMT_ITEM")
    protected String totalLineItemPrice;
    /**
     * Base HDR_CRNCY
     */
    @Column(name = "ORDR_AMT_HDR")
    protected String purchaseAmount;
    /**
     * Base HDR_CRNCY
     */
    @Column(name = "TOT_PRC_ORDR_TAX")
    protected String totalPurchaseOrderTax;
    
    @Column(name = "DOC_DT")
    protected Date documentDate;

    @Column(name = "ORDR_ENT_DT")
    protected Date orderEntryDate;

    @Column(name = "ORDR_ENT_TM")
    protected String orderEntryTime;

    @Column(name = "ORDR_CHG_DT")
    protected Date orderChangeDate;

    @Column(name = "ORDR_RCPT_DT")
    protected Date orderReceiptDate;
    
    @Column(name = "ORDR_CNCLL_DT")
    protected Date orderCancellDate;

    @Column(name = "CUST_RQSTD_ARR_DT")
    protected Date customerRequestedArrivalDate;

    @Column(name = "PLAN_ARR_DT")
    protected Date plannedArrivalDate;
    //esd
    @Column(name = "PLAN_SPLR_SHIP_DT")
    protected Date plannedSupplierShipDate;

    @Column(name = "ORDR_RELSE_DT")
    protected Date orderReleaseDate;

    @Column(name = "FIRM_SHIP_DT")
    protected Date firmShipDate;

    @Column(name = "FIRM_ARR_DT")
    protected Date firmArrivalDate;

    @Column(name = "SO_LINE_ITEM_LEAD_TM")
    protected String soLineItemLeadTime;

    @Column(name = "PROOF_OF_DLVRY")
    protected Date proofOfDelivery;

    @Column(name = "CMT_GOODS_ISS_CSD")
    protected Date committedGoodsIssueCSD;

    @Column(name = "CT_ORDR_ENT_TO_SHIP_DT_BSNS")
    protected String ctOrderEntryToShipDateBusiness;

    @Column(name = "CT_ORDR_ENT_TO_SHIP_DT_CAL")
    protected String ctOrderEntryToShipDateCalendar;

    @Column(name = "CT_ORDR_RCPT_TO_SHIP_DT_BSNS")
    protected String ctShipDateBus;

    @Column(name = "CT_ORDR_RCPT_TO_SHIP_DT_CAL")
    protected String ctShipDateCalendar;

    @Column(name = "CT_ORDR_ENT_TO_DLVRY_DT_BSNS")
    protected String ctDeliveryDateBusiness;

    @Column(name = "CT_ORDR_ENT_TO_DLVRY_DT_CAL")
    protected String ctDeliveryCalendar;

    @Column(name = "CT_ORDR_RCPT_TO_DLVRY_DT_CAL")
    protected String ctReceiptDeliCalendar;

    @Column(name = "CT_ORDR_RCPT_TO_DLVRY_DT_BSNS")
    protected String ctReceiptToDeliDateBusi;

    @Column(name = "ORDR_RCPT_TO_ORDR_RELSE")
    protected String orderReceiptToOrderRelease;

    @Column(name = "CUST_PO_NUM")
    protected String customerPurchaseOrderNumber;

    @Column(name = "SOH_PO_NUM")
    protected String sohPurchaseOrderNumber;

    @Column(name = "ORDRG_METH")
    protected String orderingMethod;

    @Column(name = "ORDRG_METH_DESC")
    protected String orderingMethodDescription;

    @Column(name = "REJ_RSN")
    protected String rejectReason;

    @Column(name = "PO_DOC_DT")
    protected Date purchaseOrderDocumentDate;

    @Column(name = "PO_CNFRM_DT")
    protected Date purchaseOrderConfirmationDate;

    @Column(name = "VNDR_NUM")
    protected String vendorNumber;

    @Column(name = "VNDR_NM")
    protected String vendorName;

    @Column(name = "MO_RELSE_DT")
    protected Date moReleaseDate;

    @Column(name = "REJ_RSN_DESC")
    protected String rejectReasonDescription;

    @Column(name = "GEO_ID")
    protected String geographyIdentifier;

    @Column(name = "SHPNG_COND")
    protected String shippingCondition;

    @Column(name = "SHPNG_COND_DESC")
    protected String shippingConditionDescription;

    @Column(name = "SHPNG_PT")
    protected String shippingPoint;

    @Column(name = "SLS_ORGN")
    protected String salesOrganization;

    @Column(name = "SLS_OFF_CTRY")
    protected String salesOfficeCountry;

    @Column(name = "DVSN")
    protected String division;

    @Column(name = "DSTRBTN_CHNL")
    protected String distributionChannel;

    @Column(name = "DLVRY_BLK_ITEM")
    protected String deliveryBlockItem;

    @Column(name = "DLVRY_BLK_HDR")
    protected String deliveryBlockHeader;

    @Column(name = "DLVRY_BLK_DESC_HDR")
    protected String deliveryBlockDescriptionHeader;

    @Column(name = "CRDT_RELSE_DT")
    protected Date creditReleaseDate;

    @Column(name = "CRDT_CARD_TYPE")
    protected String creditCardType;

    @Column(name = "CRDT_CARD_LAST_4_DIG")
    protected String creditCardLast4Digit;

    @Column(name = "TRAN_OR_RLTN")
    protected String transactionorRelation;

    @Column(name = "CNTRC_NUM")
    protected String contractNumber;

    @Column(name = "CARR_CD")
    protected String carrierCode;

    @Column(name = "CARR_NM")
    protected String carrierName;

    @Column(name = "CARR_PHN_DESC_1")
    protected String carrierPhoneDescription1;

    @Column(name = "CARR_PHN_DESC_2")
    protected String carrierPhoneDescription2;

    @Column(name = "CARR_PHN_NUM_1")
    protected String carrierPhoneNumber1;

    @Column(name = "CARR_PHN_NUM_2")
    protected String carrierPhoneNumber2;

    @Column(name = "CARR_TCKG_NUM")
    protected String carrierTrackingNumber;
    /** hubaozhong 2012-2-17 13:39 */
    @Column(name = "CARR_TCKG_QTY")
    protected Integer carrierTrackingQuantity;

    @Column(name = "CARR_PICK_UP_DT")
    protected Date carrierPickUpDate;

    @Column(name = "MODE_OF_TRSPN")
    protected String modeOfTransportation;

    @Column(name = "RTE")
    protected String route;

    @Column(name = "SHPNG_SRC")
    protected String shippingSource;

    @Column(name = "SOS_DLVRY_NUM")
    protected String sosDeliveryNumber;

    @Column(name = "SOS_ORDR_NUM")
    protected String sosOrderNumber;

    @Column(name = "INVC_DT")
    protected Date invoiceDate;

    @Column(name = "SOLD_TO_CUST_NUM")
    protected String soldToCustomerNumber;

    @Column(name = "SOLD_TO_CUST_NM")
    protected String soldToCustomerName;

    @Column(name = "SOLD_TO_CUST_NM2")
    protected String soldToCustomerName2;

    @Column(name = "SOLD_TO_CUST_NM3")
    protected String soldToCustomerName3;

    @Column(name = "SOLD_TO_CUST_NM4")
    protected String soldToCustomerName4;

    @Column(name = "SOLD_TO_HOUSE_NUM")
    protected String soldToHouseNumber;

    @Column(name = "SOLD_TO_STREET_1")
    protected String soldToStreet1;

    @Column(name = "SOLD_TO_STREET_2")
    protected String soldToStreet2;

    @Column(name = "SOLD_TO_DIST")
    protected String soldToDistrict;

    @Column(name = "SOLD_TO_CITY_1")
    protected String soldToCity1;

    @Column(name = "SOLD_TO_RGN_CD")
    protected String soldToRegionCode;

    @Column(name = "SOLD_TO_RGN_NM")
    protected String soldToRegionName;

    @Column(name = "SOLD_TO_CTRY_CD")
    protected String soldToCountryCode;

    @Column(name = "SOLD_TO_CTRY_NM")
    protected String soldToCountryName;

    @Column(name = "SOLD_TO_PSTL_CD")
    protected String soldToPostalCode;

    @Column(name = "SHIP_TO_CUST_NUM")
    protected String shipToCustomerNumber;

    @Column(name = "SHIP_TO_CUST_NM")
    protected String shipToCustomerName;

    @Column(name = "SHIP_TO_CUST_NM2")
    protected String shipToCustomerName2;

    @Column(name = "SHIP_TO_CUST_NM3")
    protected String shipToCustomerName3;

    @Column(name = "SHIP_TO_CUST_NM4")
    protected String shipToCustomerName4;

    @Column(name = "SHIP_TO_HOUSE_NUM")
    protected String shipToHouseNumber;

    @Column(name = "SHIP_TO_STREET_1")
    protected String shipToStreet1;

    @Column(name = "SHIP_TO_STREET_2")
    protected String shipToStreet2;

    @Column(name = "SHIP_TO_DIST")
    protected String shipToDistrict;

    @Column(name = "SHIP_TO_CITY_1")
    protected String shipToCity1;

    @Column(name = "SHIP_TO_RGN_CD")
    protected String shipToRegionCode;

    @Column(name = "SHIP_TO_RGN_NM")
    protected String shipToRegionName;

    @Column(name = "SHIP_TO_CTRY_CD")
    protected String shipToCountryCode;

    @Column(name = "SHIP_TO_CTRY_NM")
    protected String shipToCountryName;

    @Column(name = "SHIP_TO_PSTL_CD")
    protected String shipToPostalCode;

    @Column(name = "SHIP_TO_EML")
    protected String shipToEmail;

    @Column(name = "SHIP_TO_PHN_NUM")
    protected String shipToTelephoneNumber;

    @Column(name = "BILL_TO_CUST_NUM")
    protected String billToCustomerNumber;

    @Column(name = "BILL_TO_CUST_NM")
    protected String billToCustomerName;

    @Column(name = "BILL_TO_CUST_NM2")
    protected String billToCustomerName2;

    @Column(name = "BILL_TO_CUST_NM3")
    protected String billToCustomerName3;

    @Column(name = "BILL_TO_CUST_NM4")
    protected String billToCustomerName4;

    @Column(name = "BILL_TO_HOUSE_NUM")
    protected String billToHouseNumber;

    @Column(name = "BILL_TO_STREET_1")
    protected String billToStreet1;

    @Column(name = "BILL_TO_STREET_2")
    protected String billToStreet2;

    @Column(name = "BILL_TO_DIST")
    protected String billToDistrict;

    @Column(name = "BILL_TO_CITY_1")
    protected String billToCity1;

    @Column(name = "BILL_TO_RGN_CD")
    protected String billToRegionCode;

    @Column(name = "BILL_TO_RGN_NM")
    protected String billToRegionName;

    @Column(name = "BILL_TO_CTRY_CD")
    protected String billToCountryCode;

    @Column(name = "BILL_TO_PSTL_CD")
    protected String billToPostalCode;

    @Column(name = "BILL_TO_EML")
    protected String billToEmail;

    @Column(name = "BILL_TO_PHN_NUM")
    protected String billToTelephoneNumber;

    @Column(name = "BILL_TO_CUST_CNTCT_NM_1")
    protected String billToCustomerContactName1;

    @Column(name = "BILL_TO_CUST_CNTCT_NM_2")
    protected String billToCustomerContactName2;

    @Column(name = "PAYER_CUST_NUM")
    protected String payerCustomerNumber;

    @Column(name = "PAYER_CUST_NM")
    protected String payerCustomerName;

    @Column(name = "PAYER_CUST_NM2")
    protected String payerCustomerName2;

    @Column(name = "PAYER_CUST_NM3")
    protected String payerCustomerName3;

    @Column(name = "PAYER_CUST_NM4")
    protected String payerCustomerName4;

    @Column(name = "PAYER_HOUSE_NUM")
    protected String payerHouseNumber;

    @Column(name = "PAYER_STREET_1")
    protected String payerStreet1;

    @Column(name = "PAYER_STREET_2")
    protected String payerStreet2;

    @Column(name = "PAYER_DIST")
    protected String payerDistrict;

    @Column(name = "PAYER_CITY_1")
    protected String payerCity1;

    @Column(name = "PAYER_RGN_CD")
    protected String payerRegionCode;

    @Column(name = "PAYER_RGN_NM")
    protected String payerRegionName;

    @Column(name = "PAYER_CTRY_CD")
    protected String payerCountryCode;

    @Column(name = "PAYER_CTRY_NM")
    protected String payerCountryName;

    @Column(name = "PAYER_PSTL_CD")
    protected String payerPostalCode;

    @Column(name = "GLOBL_LOC_NUM")
    protected String globalLocNum;

    @Column(name = "GLOBL_LOC_NM")
    protected String globalLocName;

    @Column(name = "GIN")
    protected String gin;

    @Column(name = "CNSMR_ID")
    protected String consumerId;

    @Column(name = "END_CUST_CHM_NUM")
    protected String endCustomerChmNumber;

    @Column(name = "END_CUST_CHM_NM")
    protected String endcustomerChmName;

    @Column(name = "LAST_UPDT_DTTM")
    protected Date lastUpdateDatetime;
    
    @Column(name = "AR_DUE_DT")
    protected Date arDueDate;
    
    @Column(name = "AR_PYMT_TERM")
    protected String arPaymentTerm;
    
    @Column(name = "LOCAL_CRNCY")
    protected String localCurrency;
    
    @Column(name = "DOC_CRNCY")
    protected String documentCurrency;
    /**
     * Base LOCAL_CRNCY
     */
    @Column(name = "TOT_AMT_IN_LOCAL_CRNCY")
    protected String toltalAmountInLocCurrency;
    /**
     * Base DOC_CRNCY
     */
    @Column(name = "TOT_AMT_IN_DOC_CRNCY")
    protected String toltalAmountInDocCurrency;
    
    @Column(name = "CASH_CLRG_DT")
    protected Date cashClearanceDate;
    
    @Column(name = "AR_RECV_DT")
    protected Date arReceivingDate;
    
    @Column(name = "DSPUT_CTGRY_CD")
    protected String disputeCategoryCode;
    
    @Column(name = "DSPUT_CTGRY_DESC")
    protected String disputeCategoryDesc;
    
    @Column(name = "DSPUT_RSN_CD")
    protected String disputeReasonCode;
    
    @Column(name = "DSPUT_RSN_DESC")
    protected String disputeReasonDesc;
    
    @Column(name = "DSPUT_ROOT_CAUSE_CD")
    protected String disputeRootCauseCode;
    
    @Column(name = "DSPUT_ROOT_CAUSE_DESC")
    protected String disputeRootCauseDesc;
    
    @Column(name = "SHIP_TO_ADDR")
    protected String shipToAddress;
    
    @Column(name = "BILL_TO_ADDR")
    protected String billToAddress;
    
    @Column(name = "SOLD_TO_ADDR")
    protected String soldToAddress;
    
    @Column(name = "BILL_TO_CTRY_NM")
    protected String billToCountryName;
    //edd
    @Column(name = "CALC_ARR_DT")
    protected Date calculateArrivalDate;
    
    @Column(name = "CUST_ACCT_GRP")
    protected String customerAccountGroup;

    /**
     * add some columns,hubaozhong 2011-6-16,14:00
     */
    @Column(name = "SRC_SYS")
    protected String sourceSystem;
    

    /*wave2 new added*/
    @Column(name = "NFENUM")
    protected String notFisca;
    
    @Column(name = "SHIP_ORDR_NUM")
    //Shipping and handling amount
    protected String shipAmount;
    
    @Column(name = "TAX_ORDR_NUM")
    protected String taxAmount;
    
    @Column(name = "REC_FEE")
    protected String recyclingFees;
    
    @Column(name = "CUST_RQSTD_ARR_DT_ITEM")
    //Customer Request Arrive Date[CRAD]
    protected Date itemCrad;
    
    @Column(name = "SHIP_STS_DESC")
    protected String milestone;
    
    @Column(name = "X1_STS_DTTM")
    //Milestone code X1 create time 
    protected Date x1SttaSDttm;
    
    @Column(name = "AF_STS_DTTM")
    //Milestone code AF create time 
    protected Date afStatsDttm;
    
    @Column(name = "X4_STS_DTTM")
    //Milestone code X4 create time 
    protected Date x4StatsDttm;   
    
    @Column(name = "AE_STS_DTTM")
    //Milestone code AE create time
    protected Date aeStatsDttm;
    
    @Column(name = "F_STS_DTTM")
    //Milestone code F create time
    protected Date f1StatsDttm;
    
    @Column(name = "E_STS_DTTM")
    //Milestone code E create time 
    protected Date e1StatsDttm;
    
    @Column(name = "A_STS_DTTM")
    //Milestone code A create time
    protected Date a1StatsDttm;
    
    @Column(name = "CT_STS_DTTM")
    //Milestone code CT create time 
    protected Date ctStatsDttm;
    
    @Column(name = "UV_STS_DTTM")
    //Milestone code UV create time 
    protected Date uvStatsDttm;
    
    @Column(name = "D_STS_DTTM")
    //Milestone code D create time
    protected Date d1StatsDttm;
    
    @Column(name = "OA_STS_DTTM")
    //Milestone code OA create time 
    protected Date oaStatsDttm;
    
    @Column(name = "SMATL_HIGH_LEVEL")
    //SO table  Higher-level item mapping
    protected String smatlHighLevel;
    /**
     * if this value is not null,this item is physical item.
     */
    @Column(name = "SMATL_ITEM_GATG_SERV")
    protected String smatlItemCategory;
    
    @Column(name = "SERIES")
    protected String series;

    //ADD BY WEISY 20120314
    @Column(name="CTO_FLG")
	protected String cto;
    
    
	public String getTotalPurchaseOrderTax() {
		return totalPurchaseOrderTax;
	}

	public void setTotalPurchaseOrderTax(String totalPurchaseOrderTax) {
		this.totalPurchaseOrderTax = totalPurchaseOrderTax;
	}

	public String getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setSalesOrderNumber(String salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public String getSalesOrderLineItemNumber() {
        return salesOrderLineItemNumber;
    }

    public void setSalesOrderLineItemNumber(String salesOrderLineItemNumber) {
        this.salesOrderLineItemNumber = salesOrderLineItemNumber;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryItemNumber() {
        return deliveryItemNumber;
    }

    public void setDeliveryItemNumber(String deliveryItemNumber) {
        this.deliveryItemNumber = deliveryItemNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderTypeDescription() {
        return orderTypeDescription;
    }

    public void setOrderTypeDescription(String orderTypeDescription) {
        this.orderTypeDescription = orderTypeDescription;
    }

    public String getOrderStatusHeader() {
        return orderStatusHeader;
    }

    public void setOrderStatusHeader(String orderStatusHeader) {
        this.orderStatusHeader = orderStatusHeader;
    }

    public String getOrderStatusItem() {
        return orderStatusItem;
    }

    public void setOrderStatusItem(String orderStatusItem) {
        this.orderStatusItem = orderStatusItem;
    }

    public String getPartialShip() {
        return partialShip;
    }

    public void setPartialShip(String partialShip) {
        this.partialShip = partialShip;
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductHierarchy() {
        return productHierarchy;
    }

    public void setProductHierarchy(String productHierarchy) {
        this.productHierarchy = productHierarchy;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineTypeDescription() {
        return machineTypeDescription;
    }

    public void setMachineTypeDescription(String machineTypeDescription) {
        this.machineTypeDescription = machineTypeDescription;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
    }

    public String getMachineModelDescription() {
        return machineModelDescription;
    }

    public void setMachineModelDescription(String machineModelDescription) {
        this.machineModelDescription = machineModelDescription;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getProductGroupDescription() {
        return productGroupDescription;
    }

    public void setProductGroupDescription(String productGroupDescription) {
        this.productGroupDescription = productGroupDescription;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductBrandDescription() {
        return productBrandDescription;
    }

    public void setProductBrandDescription(String productBrandDescription) {
        this.productBrandDescription = productBrandDescription;
    }

    public String getProductFamily() {
        return productFamily;
    }

    public void setProductFamily(String productFamily) {
        this.productFamily = productFamily;
    }

    public String getEanUpc() {
        return eanUpc;
    }

    public void setEanUpc(String eanUpc) {
        this.eanUpc = eanUpc;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Integer getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(Integer deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    public String getHeaderCurrency() {
        return headerCurrency;
    }

    public void setHeaderCurrency(String headerCurrency) {
        this.headerCurrency = headerCurrency;
    }

    public String getItemCurrency() {
        return itemCurrency;
    }

    public void setItemCurrency(String itemCurrency) {
        this.itemCurrency = itemCurrency;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

//  public BigDecimal getTotalPurchaseAmount() {
//      return totalPurchaseAmount;
//  }
//
//  public void setTotalPurchaseAmount(BigDecimal totalPurchaseAmount) {
//      this.totalPurchaseAmount = totalPurchaseAmount;
//  }

    public Date getPurchaseOrderDocumentDate() {
        return purchaseOrderDocumentDate;
    }

    public void setPurchaseOrderDocumentDate(Date purchaseOrderDocumentDate) {
        this.purchaseOrderDocumentDate = purchaseOrderDocumentDate;
    }

    public Date getOrderEntryDate() {
        return orderEntryDate;
    }

    public void setOrderEntryDate(Date orderEntryDate) {
        this.orderEntryDate = orderEntryDate;
    }

    public String getOrderEntryTime() {
        return orderEntryTime;
    }

    public void setOrderEntryTime(String orderEntryTime) {
        this.orderEntryTime = orderEntryTime;
    }

    public Date getOrderChangeDate() {
        return orderChangeDate;
    }

    public void setOrderChangeDate(Date orderChangeDate) {
        this.orderChangeDate = orderChangeDate;
    }

    public Date getOrderReceiptDate() {
        return orderReceiptDate;
    }

    public void setOrderReceiptDate(Date orderReceiptDate) {
        this.orderReceiptDate = orderReceiptDate;
    }

    public Date getOrderCancellDate() {
        return orderCancellDate;
    }

    public void setOrderCancellDate(Date orderCancellDate) {
        this.orderCancellDate = orderCancellDate;
    }

    public Date getCustomerRequestedArrivalDate() {
        return customerRequestedArrivalDate;
    }

    public void setCustomerRequestedArrivalDate(
            Date customerRequestedArrivalDate) {
        this.customerRequestedArrivalDate = customerRequestedArrivalDate;
    }

    public Date getPlannedArrivalDate() {
        return plannedArrivalDate;
    }

    public void setPlannedArrivalDate(Date plannedArrivalDate) {
        this.plannedArrivalDate = plannedArrivalDate;
    }

    public Date getPlannedSupplierShipDate() {
        return plannedSupplierShipDate;
    }

    public void setPlannedSupplierShipDate(Date plannedSupplierShipDate) {
        this.plannedSupplierShipDate = plannedSupplierShipDate;
    }

    public Date getOrderReleaseDate() {
        return orderReleaseDate;
    }

    public void setOrderReleaseDate(Date orderReleaseDate) {
        this.orderReleaseDate = orderReleaseDate;
    }

    public Date getFirmShipDate() {
        return firmShipDate;
    }

    public void setFirmShipDate(Date firmShipDate) {
        this.firmShipDate = firmShipDate;
    }

    public Date getFirmArrivalDate() {
        return firmArrivalDate;
    }

    public void setFirmArrivalDate(Date firmArrivalDate) {
        this.firmArrivalDate = firmArrivalDate;
    }

    public String getSoLineItemLeadTime() {
        return soLineItemLeadTime;
    }

    public void setSoLineItemLeadTime(String soLineItemLeadTime) {
        this.soLineItemLeadTime = soLineItemLeadTime;
    }

    public Date getProofOfDelivery() {
        return proofOfDelivery;
    }

    public void setProofOfDelivery(Date proofOfDelivery) {
        this.proofOfDelivery = proofOfDelivery;
    }

    public Date getCommittedGoodsIssueCSD() {
        return committedGoodsIssueCSD;
    }

    public void setCommittedGoodsIssueCSD(Date committedGoodsIssueCSD) {
        this.committedGoodsIssueCSD = committedGoodsIssueCSD;
    }

    public String getCtOrderEntryToShipDateBusiness() {
        return ctOrderEntryToShipDateBusiness;
    }

    public void setCtOrderEntryToShipDateBusiness(
    		String ctOrderEntryToShipDateBusiness) {
        this.ctOrderEntryToShipDateBusiness = ctOrderEntryToShipDateBusiness;
    }

    public String getCtOrderEntryToShipDateCalendar() {
        return ctOrderEntryToShipDateCalendar;
    }

    public void setCtOrderEntryToShipDateCalendar(
    		String ctOrderEntryToShipDateCalendar) {
        this.ctOrderEntryToShipDateCalendar = ctOrderEntryToShipDateCalendar;
    }

    public String getOrderReceiptToOrderRelease() {
        return orderReceiptToOrderRelease;
    }

    public void setOrderReceiptToOrderRelease(String orderReceiptToOrderRelease) {
        this.orderReceiptToOrderRelease = orderReceiptToOrderRelease;
    }

    public String getCustomerPurchaseOrderNumber() {
        return customerPurchaseOrderNumber;
    }

    public void setCustomerPurchaseOrderNumber(
            String customerPurchaseOrderNumber) {
        this.customerPurchaseOrderNumber = customerPurchaseOrderNumber;
    }

    public String getSohPurchaseOrderNumber() {
        return sohPurchaseOrderNumber;
    }

    public void setSohPurchaseOrderNumber(String sohPurchaseOrderNumber) {
        this.sohPurchaseOrderNumber = sohPurchaseOrderNumber;
    }

    public String getOrderingMethod() {
        return orderingMethod;
    }

    public void setOrderingMethod(String orderingMethod) {
        this.orderingMethod = orderingMethod;
    }

    public String getOrderingMethodDescription() {
        return orderingMethodDescription;
    }

    public void setOrderingMethodDescription(String orderingMethodDescription) {
        this.orderingMethodDescription = orderingMethodDescription;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Date getPurchaseOrderConfirmationDate() {
        return purchaseOrderConfirmationDate;
    }

    public void setPurchaseOrderConfirmationDate(
            Date purchaseOrderConfirmationDate) {
        this.purchaseOrderConfirmationDate = purchaseOrderConfirmationDate;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public Date getMoReleaseDate() {
        return moReleaseDate;
    }

    public void setMoReleaseDate(Date moReleaseDate) {
        this.moReleaseDate = moReleaseDate;
    }

    public String getRejectReasonDescription() {
        return rejectReasonDescription;
    }

    public void setRejectReasonDescription(String rejectReasonDescription) {
        this.rejectReasonDescription = rejectReasonDescription;
    }

    public String getGeographyIdentifier() {
        return geographyIdentifier;
    }

    public void setGeographyIdentifier(String geographyIdentifier) {
        this.geographyIdentifier = geographyIdentifier;
    }

    public String getShippingCondition() {
        return shippingCondition;
    }

    public void setShippingCondition(String shippingCondition) {
        this.shippingCondition = shippingCondition;
    }

    public String getShippingConditionDescription() {
        return shippingConditionDescription;
    }

    public void setShippingConditionDescription(
            String shippingConditionDescription) {
        this.shippingConditionDescription = shippingConditionDescription;
    }

    public String getShippingPoint() {
        return shippingPoint;
    }

    public void setShippingPoint(String shippingPoint) {
        this.shippingPoint = shippingPoint;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    public String getSalesOfficeCountry() {
        return salesOfficeCountry;
    }

    public void setSalesOfficeCountry(String salesOfficeCountry) {
        this.salesOfficeCountry = salesOfficeCountry;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public String getDeliveryBlockItem() {
        return deliveryBlockItem;
    }

    public void setDeliveryBlockItem(String deliveryBlockItem) {
        this.deliveryBlockItem = deliveryBlockItem;
    }

    public String getDeliveryBlockHeader() {
        return deliveryBlockHeader;
    }

    public void setDeliveryBlockHeader(String deliveryBlockHeader) {
        this.deliveryBlockHeader = deliveryBlockHeader;
    }

    public String getDeliveryBlockDescriptionHeader() {
        return deliveryBlockDescriptionHeader;
    }

    public void setDeliveryBlockDescriptionHeader(
            String deliveryBlockDescriptionHeader) {
        this.deliveryBlockDescriptionHeader = deliveryBlockDescriptionHeader;
    }

    public Date getCreditReleaseDate() {
        return creditReleaseDate;
    }

    public void setCreditReleaseDate(Date creditReleaseDate) {
        this.creditReleaseDate = creditReleaseDate;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardLast4Digit() {
        return creditCardLast4Digit;
    }

    public void setCreditCardLast4Digit(String creditCardLast4Digit) {
        this.creditCardLast4Digit = creditCardLast4Digit;
    }

    public String getTransactionorRelation() {
        return transactionorRelation;
    }

    public void setTransactionorRelation(String transactionorRelation) {
        this.transactionorRelation = transactionorRelation;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCarrierPhoneDescription1() {
        return carrierPhoneDescription1;
    }

    public void setCarrierPhoneDescription1(String carrierPhoneDescription1) {
        this.carrierPhoneDescription1 = carrierPhoneDescription1;
    }

    public String getCarrierPhoneDescription2() {
        return carrierPhoneDescription2;
    }

    public void setCarrierPhoneDescription2(String carrierPhoneDescription2) {
        this.carrierPhoneDescription2 = carrierPhoneDescription2;
    }

    public String getCarrierPhoneNumber1() {
        return carrierPhoneNumber1;
    }

    public void setCarrierPhoneNumber1(String carrierPhoneNumber1) {
        this.carrierPhoneNumber1 = carrierPhoneNumber1;
    }

    public String getCarrierPhoneNumber2() {
        return carrierPhoneNumber2;
    }

    public void setCarrierPhoneNumber2(String carrierPhoneNumber2) {
        this.carrierPhoneNumber2 = carrierPhoneNumber2;
    }

    public String getCarrierTrackingNumber() {
        return carrierTrackingNumber;
    }

    public void setCarrierTrackingNumber(String carrierTrackingNumber) {
        this.carrierTrackingNumber = carrierTrackingNumber;
    }

	public Integer getCarrierTrackingQuantity() {
		return carrierTrackingQuantity;
	}

	public void setCarrierTrackingQuantity(Integer carrierTrackingQuantity) {
		this.carrierTrackingQuantity = carrierTrackingQuantity;
	}

	public Date getCarrierPickUpDate() {
        return carrierPickUpDate;
    }

    public void setCarrierPickUpDate(Date carrierPickUpDate) {
        this.carrierPickUpDate = carrierPickUpDate;
    }

    public String getModeOfTransportation() {
        return modeOfTransportation;
    }

    public void setModeOfTransportation(String modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getShippingSource() {
        return shippingSource;
    }

    public void setShippingSource(String shippingSource) {
        this.shippingSource = shippingSource;
    }

    public String getSosDeliveryNumber() {
        return sosDeliveryNumber;
    }

    public void setSosDeliveryNumber(String sosDeliveryNumber) {
        this.sosDeliveryNumber = sosDeliveryNumber;
    }

    public String getSosOrderNumber() {
        return sosOrderNumber;
    }

    public void setSosOrderNumber(String sosOrderNumber) {
        this.sosOrderNumber = sosOrderNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getSoldToCustomerNumber() {
        return soldToCustomerNumber;
    }

    public void setSoldToCustomerNumber(String soldToCustomerNumber) {
        this.soldToCustomerNumber = soldToCustomerNumber;
    }

    public String getSoldToCustomerName() {
        return soldToCustomerName;
    }

    public void setSoldToCustomerName(String soldToCustomerName) {
        this.soldToCustomerName = soldToCustomerName;
    }

    public String getSoldToCustomerName2() {
        return soldToCustomerName2;
    }

    public void setSoldToCustomerName2(String soldToCustomerName2) {
        this.soldToCustomerName2 = soldToCustomerName2;
    }

    public String getSoldToCustomerName3() {
        return soldToCustomerName3;
    }

    public void setSoldToCustomerName3(String soldToCustomerName3) {
        this.soldToCustomerName3 = soldToCustomerName3;
    }

    public String getSoldToCustomerName4() {
        return soldToCustomerName4;
    }

    public void setSoldToCustomerName4(String soldToCustomerName4) {
        this.soldToCustomerName4 = soldToCustomerName4;
    }

    public String getSoldToHouseNumber() {
        return soldToHouseNumber;
    }

    public void setSoldToHouseNumber(String soldToHouseNumber) {
        this.soldToHouseNumber = soldToHouseNumber;
    }

    public String getSoldToStreet1() {
        return soldToStreet1;
    }

    public void setSoldToStreet1(String soldToStreet1) {
        this.soldToStreet1 = soldToStreet1;
    }

    public String getSoldToStreet2() {
        return soldToStreet2;
    }

    public void setSoldToStreet2(String soldToStreet2) {
        this.soldToStreet2 = soldToStreet2;
    }

    public String getSoldToDistrict() {
        return soldToDistrict;
    }

    public void setSoldToDistrict(String soldToDistrict) {
        this.soldToDistrict = soldToDistrict;
    }

    public String getSoldToCity1() {
        return soldToCity1;
    }

    public void setSoldToCity1(String soldToCity1) {
        this.soldToCity1 = soldToCity1;
    }

    public String getSoldToRegionCode() {
        return soldToRegionCode;
    }

    public void setSoldToRegionCode(String soldToRegionCode) {
        this.soldToRegionCode = soldToRegionCode;
    }

    public String getSoldToRegionName() {
        return soldToRegionName;
    }

    public void setSoldToRegionName(String soldToRegionName) {
        this.soldToRegionName = soldToRegionName;
    }

    public String getSoldToCountryCode() {
        return soldToCountryCode;
    }

    public void setSoldToCountryCode(String soldToCountryCode) {
        this.soldToCountryCode = soldToCountryCode;
    }

    public String getSoldToCountryName() {
        return soldToCountryName;
    }

    public void setSoldToCountryName(String soldToCountryName) {
        this.soldToCountryName = soldToCountryName;
    }

    public String getSoldToPostalCode() {
        return soldToPostalCode;
    }

    public void setSoldToPostalCode(String soldToPostalCode) {
        this.soldToPostalCode = soldToPostalCode;
    }

    public String getBillToCustomerNumber() {
        return billToCustomerNumber;
    }

    public void setBillToCustomerNumber(String billToCustomerNumber) {
        this.billToCustomerNumber = billToCustomerNumber;
    }

    public String getBillToCustomerName() {
        return billToCustomerName;
    }

    public void setBillToCustomerName(String billToCustomerName) {
        this.billToCustomerName = billToCustomerName;
    }

    public String getBillToCustomerName2() {
        return billToCustomerName2;
    }

    public void setBillToCustomerName2(String billToCustomerName2) {
        this.billToCustomerName2 = billToCustomerName2;
    }

    public String getBillToCustomerName3() {
        return billToCustomerName3;
    }

    public void setBillToCustomerName3(String billToCustomerName3) {
        this.billToCustomerName3 = billToCustomerName3;
    }

    public String getBillToCustomerName4() {
        return billToCustomerName4;
    }

    public void setBillToCustomerName4(String billToCustomerName4) {
        this.billToCustomerName4 = billToCustomerName4;
    }

    public String getBillToHouseNumber() {
        return billToHouseNumber;
    }

    public void setBillToHouseNumber(String billToHouseNumber) {
        this.billToHouseNumber = billToHouseNumber;
    }

    public String getBillToStreet1() {
        return billToStreet1;
    }

    public void setBillToStreet1(String billToStreet1) {
        this.billToStreet1 = billToStreet1;
    }

    public String getBillToStreet2() {
        return billToStreet2;
    }

    public void setBillToStreet2(String billToStreet2) {
        this.billToStreet2 = billToStreet2;
    }

    public String getBillToDistrict() {
        return billToDistrict;
    }

    public void setBillToDistrict(String billToDistrict) {
        this.billToDistrict = billToDistrict;
    }

    public String getBillToCity1() {
        return billToCity1;
    }

    public void setBillToCity1(String billToCity1) {
        this.billToCity1 = billToCity1;
    }

    public String getBillToRegionCode() {
        return billToRegionCode;
    }

    public void setBillToRegionCode(String billToRegionCode) {
        this.billToRegionCode = billToRegionCode;
    }

    public String getBillToRegionName() {
        return billToRegionName;
    }

    public void setBillToRegionName(String billToRegionName) {
        this.billToRegionName = billToRegionName;
    }

    public String getBillToCountryCode() {
        return billToCountryCode;
    }

    public void setBillToCountryCode(String billToCountryCode) {
        this.billToCountryCode = billToCountryCode;
    }

    public String getBillToPostalCode() {
        return billToPostalCode;
    }

    public void setBillToPostalCode(String billToPostalCode) {
        this.billToPostalCode = billToPostalCode;
    }

    public String getBillToEmail() {
        return billToEmail;
    }

    public void setBillToEmail(String billToEmail) {
        this.billToEmail = billToEmail;
    }

    public String getBillToTelephoneNumber() {
        return billToTelephoneNumber;
    }

    public void setBillToTelephoneNumber(String billToTelephoneNumber) {
        this.billToTelephoneNumber = billToTelephoneNumber;
    }

    public String getBillToCustomerContactName1() {
        return billToCustomerContactName1;
    }

    public void setBillToCustomerContactName1(String billToCustomerContactName1) {
        this.billToCustomerContactName1 = billToCustomerContactName1;
    }

    public String getBillToCustomerContactName2() {
        return billToCustomerContactName2;
    }

    public void setBillToCustomerContactName2(String billToCustomerContactName2) {
        this.billToCustomerContactName2 = billToCustomerContactName2;
    }

    public String getPayerCustomerNumber() {
        return payerCustomerNumber;
    }

    public void setPayerCustomerNumber(String payerCustomerNumber) {
        this.payerCustomerNumber = payerCustomerNumber;
    }

    public String getPayerCustomerName() {
        return payerCustomerName;
    }

    public void setPayerCustomerName(String payerCustomerName) {
        this.payerCustomerName = payerCustomerName;
    }

    public String getPayerCustomerName2() {
        return payerCustomerName2;
    }

    public void setPayerCustomerName2(String payerCustomerName2) {
        this.payerCustomerName2 = payerCustomerName2;
    }

    public String getPayerCustomerName3() {
        return payerCustomerName3;
    }

    public void setPayerCustomerName3(String payerCustomerName3) {
        this.payerCustomerName3 = payerCustomerName3;
    }

    public String getPayerCustomerName4() {
        return payerCustomerName4;
    }

    public void setPayerCustomerName4(String payerCustomerName4) {
        this.payerCustomerName4 = payerCustomerName4;
    }

    public String getPayerHouseNumber() {
        return payerHouseNumber;
    }

    public void setPayerHouseNumber(String payerHouseNumber) {
        this.payerHouseNumber = payerHouseNumber;
    }

    public String getPayerStreet1() {
        return payerStreet1;
    }

    public void setPayerStreet1(String payerStreet1) {
        this.payerStreet1 = payerStreet1;
    }

    public String getPayerStreet2() {
        return payerStreet2;
    }

    public void setPayerStreet2(String payerStreet2) {
        this.payerStreet2 = payerStreet2;
    }

    public String getPayerDistrict() {
        return payerDistrict;
    }

    public void setPayerDistrict(String payerDistrict) {
        this.payerDistrict = payerDistrict;
    }

    public String getPayerCity1() {
        return payerCity1;
    }

    public void setPayerCity1(String payerCity1) {
        this.payerCity1 = payerCity1;
    }

    public String getPayerRegionCode() {
        return payerRegionCode;
    }

    public void setPayerRegionCode(String payerRegionCode) {
        this.payerRegionCode = payerRegionCode;
    }

    public String getPayerRegionName() {
        return payerRegionName;
    }

    public void setPayerRegionName(String payerRegionName) {
        this.payerRegionName = payerRegionName;
    }

    public String getPayerCountryCode() {
        return payerCountryCode;
    }

    public void setPayerCountryCode(String payerCountryCode) {
        this.payerCountryCode = payerCountryCode;
    }

    public String getPayerCountryName() {
        return payerCountryName;
    }

    public void setPayerCountryName(String payerCountryName) {
        this.payerCountryName = payerCountryName;
    }

    public String getPayerPostalCode() {
        return payerPostalCode;
    }

    public void setPayerPostalCode(String payerPostalCode) {
        this.payerPostalCode = payerPostalCode;
    }

    public String getGlobalLocNum() {
        return globalLocNum;
    }

    public void setGlobalLocNum(String globalLocNum) {
        this.globalLocNum = globalLocNum;
    }

    public String getGlobalLocName() {
        return globalLocName;
    }

    public void setGlobalLocName(String globalLocName) {
        this.globalLocName = globalLocName;
    }

    public String getGin() {
        return gin;
    }

    public void setGin(String gin) {
        this.gin = gin;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getEndCustomerChmNumber() {
        return endCustomerChmNumber;
    }

    public void setEndCustomerChmNumber(String endCustomerChmNumber) {
        this.endCustomerChmNumber = endCustomerChmNumber;
    }

    public String getEndcustomerChmName() {
        return endcustomerChmName;
    }

    public void setEndcustomerChmName(String endcustomerChmName) {
        this.endcustomerChmName = endcustomerChmName;
    }

    public Date getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    public void setLastUpdateDatetime(Date lastUpdateDatetime) {
        this.lastUpdateDatetime = lastUpdateDatetime;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public String getShipToCustomerNumber() {
        return shipToCustomerNumber;
    }

    public void setShipToCustomerNumber(String shipToCustomerNumber) {
        this.shipToCustomerNumber = shipToCustomerNumber;
    }

    public String getShipToCustomerName() {
        return shipToCustomerName;
    }

    public void setShipToCustomerName(String shipToCustomerName) {
        this.shipToCustomerName = shipToCustomerName;
    }

    public String getShipToCustomerName2() {
        return shipToCustomerName2;
    }

    public void setShipToCustomerName2(String shipToCustomerName2) {
        this.shipToCustomerName2 = shipToCustomerName2;
    }

    public String getShipToCustomerName3() {
        return shipToCustomerName3;
    }

    public void setShipToCustomerName3(String shipToCustomerName3) {
        this.shipToCustomerName3 = shipToCustomerName3;
    }

    public String getShipToCustomerName4() {
        return shipToCustomerName4;
    }

    public void setShipToCustomerName4(String shipToCustomerName4) {
        this.shipToCustomerName4 = shipToCustomerName4;
    }

    public String getShipToHouseNumber() {
        return shipToHouseNumber;
    }

    public void setShipToHouseNumber(String shipToHouseNumber) {
        this.shipToHouseNumber = shipToHouseNumber;
    }

    public String getShipToStreet1() {
        return shipToStreet1;
    }

    public void setShipToStreet1(String shipToStreet1) {
        this.shipToStreet1 = shipToStreet1;
    }

    public String getShipToStreet2() {
        return shipToStreet2;
    }

    public void setShipToStreet2(String shipToStreet2) {
        this.shipToStreet2 = shipToStreet2;
    }

    public String getShipToDistrict() {
        return shipToDistrict;
    }

    public void setShipToDistrict(String shipToDistrict) {
        this.shipToDistrict = shipToDistrict;
    }

    public String getShipToCity1() {
        return shipToCity1;
    }

    public void setShipToCity1(String shipToCity1) {
        this.shipToCity1 = shipToCity1;
    }

    public String getShipToRegionCode() {
        return shipToRegionCode;
    }

    public void setShipToRegionCode(String shipToRegionCode) {
        this.shipToRegionCode = shipToRegionCode;
    }

    public String getShipToRegionName() {
        return shipToRegionName;
    }

    public void setShipToRegionName(String shipToRegionName) {
        this.shipToRegionName = shipToRegionName;
    }

    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    public String getShipToCountryName() {
        return shipToCountryName;
    }

    public void setShipToCountryName(String shipToCountryName) {
        this.shipToCountryName = shipToCountryName;
    }

    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    public void setShipToPostalCode(String shipToPostalCode) {
        this.shipToPostalCode = shipToPostalCode;
    }

    public String getShipToEmail() {
        return shipToEmail;
    }

    public void setShipToEmail(String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }

    public String getShipToTelephoneNumber() {
        return shipToTelephoneNumber;
    }

    public void setShipToTelephoneNumber(String shipToTelephoneNumber) {
        this.shipToTelephoneNumber = shipToTelephoneNumber;
    }

//  public String getSoldToFullAddress() {
//      return soldToFullAddress;
//  }
//
//  public void setSoldToFullAddress(String soldToFullAddress) {
//      this.soldToFullAddress = soldToFullAddress;
//  }
//
//  public String getBillToFullAddress() {
//      return billToFullAddress;
//  }
//
//  public void setBillToFullAddress(String billToFullAddress) {
//      this.billToFullAddress = billToFullAddress;
//  }
//
//  public String getShipToFullAddress() {
//      return shipToFullAddress;
//  }
//
//  public void setShipToFullAddress(String shipToFullAddress) {
//      this.shipToFullAddress = shipToFullAddress;
//  }

    

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalLineItemPrice() {
        return totalLineItemPrice;
    }

    public void setTotalLineItemPrice(String totalLineItemPrice) {
        this.totalLineItemPrice = totalLineItemPrice;
    }

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * @return the ctShipDateBus
     */
    public String getCtShipDateBus() {
        return ctShipDateBus;
    }

    /**
     * @param ctShipDateBus the ctShipDateBus to set
     */
    public void setCtShipDateBus(String ctShipDateBus) {
        this.ctShipDateBus = ctShipDateBus;
    }

    /**
     * @return the ctShipDateCalendar
     */
    public String getCtShipDateCalendar() {
        return ctShipDateCalendar;
    }

    /**
     * @param ctShipDateCalendar the ctShipDateCalendar to set
     */
    public void setCtShipDateCalendar(String ctShipDateCalendar) {
        this.ctShipDateCalendar = ctShipDateCalendar;
    }

    /**
     * @return the ctDeliveryDateBusiness
     */
    public String getCtDeliveryDateBusiness() {
        return ctDeliveryDateBusiness;
    }

    /**
     * @param ctDeliveryDateBusiness the ctDeliveryDateBusiness to set
     */
    public void setCtDeliveryDateBusiness(String ctDeliveryDateBusiness) {
        this.ctDeliveryDateBusiness = ctDeliveryDateBusiness;
    }

    /**
     * @return the ctDeliveryCalendar
     */
    public String getCtDeliveryCalendar() {
        return ctDeliveryCalendar;
    }

    /**
     * @param ctDeliveryCalendar the ctDeliveryCalendar to set
     */
    public void setCtDeliveryCalendar(String ctDeliveryCalendar) {
        this.ctDeliveryCalendar = ctDeliveryCalendar;
    }

    /**
     * @return the ctReceiptDeliCalendar
     */
    public String getCtReceiptDeliCalendar() {
        return ctReceiptDeliCalendar;
    }

    /**
     * @param ctReceiptDeliCalendar the ctReceiptDeliCalendar to set
     */
    public void setCtReceiptDeliCalendar(String ctReceiptDeliCalendar) {
        this.ctReceiptDeliCalendar = ctReceiptDeliCalendar;
    }

    /**
     * @return the ctReceiptToDeliDateBusi
     */
    public String getCtReceiptToDeliDateBusi() {
        return ctReceiptToDeliDateBusi;
    }

    /**
     * @param ctReceiptToDeliDateBusi the ctReceiptToDeliDateBusi to set
     */
    public void setCtReceiptToDeliDateBusi(String ctReceiptToDeliDateBusi) {
        this.ctReceiptToDeliDateBusi = ctReceiptToDeliDateBusi;
    }

   

    public Date getArDueDate() {
        return arDueDate;
    }

    public void setArDueDate(Date arDueDate) {
        this.arDueDate = arDueDate;
    }

    public String getArPaymentTerm() {
        return arPaymentTerm;
    }

    public void setArPaymentTerm(String arPaymentTerm) {
        this.arPaymentTerm = arPaymentTerm;
    }

    public String getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency;
    }

    public String getDocumentCurrency() {
        return documentCurrency;
    }

    public void setDocumentCurrency(String documentCurrency) {
        this.documentCurrency = documentCurrency;
    }

    public String getToltalAmountInLocCurrency() {
        return toltalAmountInLocCurrency;
    }

    public void setToltalAmountInLocCurrency(String toltalAmountInLocCurrency) {
        this.toltalAmountInLocCurrency = toltalAmountInLocCurrency;
    }

    public String getToltalAmountInDocCurrency() {
        return toltalAmountInDocCurrency;
    }

    public void setToltalAmountInDocCurrency(String toltalAmountInDocCurrency) {
        this.toltalAmountInDocCurrency = toltalAmountInDocCurrency;
    }

    public Date getCashClearanceDate() {
        return cashClearanceDate;
    }

    public void setCashClearanceDate(Date cashClearanceDate) {
        this.cashClearanceDate = cashClearanceDate;
    }

    public Date getArReceivingDate() {
        return arReceivingDate;
    }

    public void setArReceivingDate(Date arReceivingDate) {
        this.arReceivingDate = arReceivingDate;
    }

    public String getDisputeCategoryCode() {
        return disputeCategoryCode;
    }

    public void setDisputeCategoryCode(String disputeCategoryCode) {
        this.disputeCategoryCode = disputeCategoryCode;
    }

    public String getDisputeCategoryDesc() {
        return disputeCategoryDesc;
    }

    public void setDisputeCategoryDesc(String disputeCategoryDesc) {
        this.disputeCategoryDesc = disputeCategoryDesc;
    }

    public String getDisputeReasonCode() {
        return disputeReasonCode;
    }

    public void setDisputeReasonCode(String disputeReasonCode) {
        this.disputeReasonCode = disputeReasonCode;
    }

    public String getDisputeReasonDesc() {
        return disputeReasonDesc;
    }

    public void setDisputeReasonDesc(String disputeReasonDesc) {
        this.disputeReasonDesc = disputeReasonDesc;
    }

    public String getDisputeRootCauseCode() {
        return disputeRootCauseCode;
    }

    public void setDisputeRootCauseCode(String disputeRootCauseCode) {
        this.disputeRootCauseCode = disputeRootCauseCode;
    }

    public String getDisputeRootCauseDesc() {
        return disputeRootCauseDesc;
    }

    public void setDisputeRootCauseDesc(String disputeRootCauseDesc) {
        this.disputeRootCauseDesc = disputeRootCauseDesc;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getBillToAddress() {
        return billToAddress;
    }

    public void setBillToAddress(String billToAddress) {
        this.billToAddress = billToAddress;
    }

    public String getSoldToAddress() {
        return soldToAddress;
    }

    public void setSoldToAddress(String soldToAddress) {
        this.soldToAddress = soldToAddress;
    }

    public String getBillToCountryName() {
        return billToCountryName;
    }

    public void setBillToCountryName(String billToCountryName) {
        this.billToCountryName = billToCountryName;
    }

    public Date getCalculateArrivalDate() {
        return calculateArrivalDate;
    }

    public void setCalculateArrivalDate(Date calculateArrivalDate) {
        this.calculateArrivalDate = calculateArrivalDate;
    }

    public String getCustomerAccountGroup() {
        return customerAccountGroup;
    }

    public void setCustomerAccountGroup(String customerAccountGroup) {
        this.customerAccountGroup = customerAccountGroup;
    }


    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getNotFisca() {
        return notFisca;
    }

    public void setNotFisca(String notFisca) {
        this.notFisca = notFisca;
    }

    public String getShipAmount() {
        return shipAmount;
    }

    public void setShipAmount(String shipAmount) {
        this.shipAmount = shipAmount;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getRecyclingFees() {
        return recyclingFees;
    }

    public void setRecyclingFees(String recyclingFees) {
        this.recyclingFees = recyclingFees;
    }

    public Date getItemCrad() {
        return itemCrad;
    }

    public void setItemCrad(Date itemCrad) {
        this.itemCrad = itemCrad;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public Date getX1SttaSDttm() {
        return x1SttaSDttm;
    }

    public void setX1SttaSDttm(Date sttaSDttm) {
        x1SttaSDttm = sttaSDttm;
    }

    public Date getAfStatsDttm() {
        return afStatsDttm;
    }

    public void setAfStatsDttm(Date afStatsDttm) {
        this.afStatsDttm = afStatsDttm;
    }

    public Date getX4StatsDttm() {
        return x4StatsDttm;
    }

    public void setX4StatsDttm(Date statsDttm) {
        x4StatsDttm = statsDttm;
    }

    public Date getAeStatsDttm() {
        return aeStatsDttm;
    }

    public void setAeStatsDttm(Date aeStatsDttm) {
        this.aeStatsDttm = aeStatsDttm;
    }

    

    public Date getF1StatsDttm() {
        return f1StatsDttm;
    }

    public void setF1StatsDttm(Date statsDttm) {
        f1StatsDttm = statsDttm;
    }

    public Date getE1StatsDttm() {
        return e1StatsDttm;
    }

    public void setE1StatsDttm(Date statsDttm) {
        e1StatsDttm = statsDttm;
    }

    public Date getA1StatsDttm() {
        return a1StatsDttm;
    }

    public void setA1StatsDttm(Date statsDttm) {
        a1StatsDttm = statsDttm;
    }

    public Date getCtStatsDttm() {
        return ctStatsDttm;
    }

    public void setCtStatsDttm(Date ctStatsDttm) {
        this.ctStatsDttm = ctStatsDttm;
    }

    public Date getUvStatsDttm() {
        return uvStatsDttm;
    }

    public void setUvStatsDttm(Date uvStatsDttm) {
        this.uvStatsDttm = uvStatsDttm;
    }

 


    public Date getOaStatsDttm() {
        return oaStatsDttm;
    }

    public void setOaStatsDttm(Date oaStatsDttm) {
        this.oaStatsDttm = oaStatsDttm;
    }

    public String getSmatlHighLevel() {
        return smatlHighLevel;
    }

    public void setSmatlHighLevel(String smatlHighLevel) {
        this.smatlHighLevel = smatlHighLevel;
    }

    public String getSmatlItemCategory() {
        return smatlItemCategory;
    }

    public void setSmatlItemCategory(String smatlItemCategory) {
        this.smatlItemCategory = smatlItemCategory;
    }

    public String getSeries() {
        return series;
    }


    public void setSeries(String series) {
        this.series = series;
    }

    public Date getD1StatsDttm() {
        return d1StatsDttm;
    }

    public void setD1StatsDttm(Date statsDttm) {
        d1StatsDttm = statsDttm;
    }

	public String getCto() {
		return cto;
	}

	public void setCto(String cto) {
		this.cto = cto;
	}

//    public BigDecimal getTotalPurchaseAmount() {
//        return totalPurchaseAmount;
//    }
//
//    public void setTotalPurchaseAmount(BigDecimal totalPurchaseAmount) {
//        this.totalPurchaseAmount = totalPurchaseAmount;
//    }
}
