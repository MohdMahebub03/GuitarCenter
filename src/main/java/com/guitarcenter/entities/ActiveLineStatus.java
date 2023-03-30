package com.guitarcenter.entities;

import java.time.LocalDateTime;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="active_line_status")
public class ActiveLineStatus {
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey
	private ActiveLineStatusKey ALTKey;	
	private String BUNDLE_FULFILLMENT_MODE;
	private String BUNDLE_PARENT_ORDER_LINE_KEY;
	private String CHAINED_FROM_ORDER_HEADER_KEY;
	private String CHAINED_FROM_ORDER_LINE_KEY;
	private LocalDateTime CUSTOMER_PROMISE_DATE;
	private String CUSTOMER_ZIP_CODE;
	private String DEPENDENT_ON_LINE_KEY;
	private String DERIVED_FROM_ORDER_HEADER_KEY;
	private String DERIVED_FROM_ORDER_LINE_KEY;
	private String ENTERPRISE_KEY;
	private String ENTRY_TYPE;
	private String EXCHANGE_TYPE;
	private double EXTENDED_PRICE;
	private double FINAL_LINE_TOTAL_PER_STATUS_QTY;
	private String HJ_PICK_REQUEST_NO;
	private double INVENTORY_COST;
	private double INVOICED_LINE_TOTAL;
	private long INVOICED_QUANTITY;
	private String IS_FREE_GIFT_ITEM;
	private String IS_PRICE_INFO_ONLY;
	private String IS_RESTRICT_SHIP_FROM_STORE;
	private String IS_STORE_CLEARANCE;
	private String IS_WARRANTY;
	private String ITEM_ID;
	private String KIT_CODE;
	private String KIT_INFO;
	private String LINE_CREATEPROGID;
	private LocalDateTime LINE_CREATETS;
	private String LINE_CREATEUSERID;
	private String LINE_FULFILLMENT_TYPE;
	private String LINE_INFO;
	private String LINE_INVOICE_COMPLETE;
	private String LINE_MODIFYPROGID;
	private LocalDateTime LINE_MODIFYTS;
	private String LINE_MODIFYUSERID;
	private long LINE_NO;
	private String LINE_SHIP_NODE;
	private double LINE_TAX;
	private double LINE_TOTAL;
	private double LINE_TOTAL_PER_STATUS_QTY;
	private String LINE_TYPE;
	private double LIST_PRICE;
	private long ORDERED_QTY;
	private String ORDERED_STORE_ID;
	private String ORDER_CAPTURE_CHANNEL;
	private String ORDER_CREATEPROGID;
	private LocalDateTime ORDER_CREATETS;
	private String ORDER_CREATEUSERID;
	private String ORDER_DATE;
	private String ORDER_FULFILLMENT_TYPE;
	private String ORDER_LOS;
	private String ORDER_MODIFYPROGID;
	private LocalDateTime ORDER_MODIFYTS;
	private String ORDER_MODIFYUSERID;
	private String ORDER_NO;
	private String ORDER_PURPOSE;
	private String ORDER_RELEASE_CREATEPROGID;
	private LocalDateTime ORDER_RELEASE_CREATETS;
	private String ORDER_RELEASE_CREATEUSERID;
	private String ORDER_RELEASE_MODIFYPROGID;
	private LocalDateTime ORDER_RELEASE_MODIFYTS;
	private String ORDER_RELEASE_MODIFYUSERID;
	private double ORDER_TOTAL_AMOUNT;
	private String ORDER_TYPE;
	private long ORIGINAL_ORDERED_QTY;
	private double ORIGINAL_ORDER_TOTAL_AMOUNT;
	private long OTHER_CHARGES;
	private String PAYMENT_STATUS;
	private String PICKUP_STORE_ID;
	private String PICK_REQUEST_NODE;
	private String PICK_REQUEST_NODE_NAME;
	private String POS_SALES_TICKET_NO;
	private String PRODUCT_CLASS;
	private String PRODUCT_LINE;
	private long QTY_CANCELLED_IN_SPLIT;
	private long RELEASE_NO;
	private long RESCHEDULE_REQUEST_COUNT;
	private String SELLER_ORGANIZATION_CODE;
	private long SHIPPED_QUANTITY;
	private String STATUS;
	private String STATUS_NAME;
	private long STATUS_QTY_CHARGE;
	private double STATUS_QTY_PRICE;
	private double STATUS_QTY_TAX;
	private long STATUS_QUANTITY;
	private double UNIT_PRICE;
	public ActiveLineStatusKey getALTKey() {
		return ALTKey;
	}
	public void setALTKey(ActiveLineStatusKey aLTKey) {
		ALTKey = aLTKey;
	}
	public String getBUNDLE_FULFILLMENT_MODE() {
		return BUNDLE_FULFILLMENT_MODE;
	}
	public void setBUNDLE_FULFILLMENT_MODE(String bUNDLE_FULFILLMENT_MODE) {
		BUNDLE_FULFILLMENT_MODE = bUNDLE_FULFILLMENT_MODE;
	}
	public String getBUNDLE_PARENT_ORDER_LINE_KEY() {
		return BUNDLE_PARENT_ORDER_LINE_KEY;
	}
	public void setBUNDLE_PARENT_ORDER_LINE_KEY(String bUNDLE_PARENT_ORDER_LINE_KEY) {
		BUNDLE_PARENT_ORDER_LINE_KEY = bUNDLE_PARENT_ORDER_LINE_KEY;
	}
	public String getCHAINED_FROM_ORDER_HEADER_KEY() {
		return CHAINED_FROM_ORDER_HEADER_KEY;
	}
	public void setCHAINED_FROM_ORDER_HEADER_KEY(String cHAINED_FROM_ORDER_HEADER_KEY) {
		CHAINED_FROM_ORDER_HEADER_KEY = cHAINED_FROM_ORDER_HEADER_KEY;
	}
	public String getCHAINED_FROM_ORDER_LINE_KEY() {
		return CHAINED_FROM_ORDER_LINE_KEY;
	}
	public void setCHAINED_FROM_ORDER_LINE_KEY(String cHAINED_FROM_ORDER_LINE_KEY) {
		CHAINED_FROM_ORDER_LINE_KEY = cHAINED_FROM_ORDER_LINE_KEY;
	}
	public LocalDateTime getCUSTOMER_PROMISE_DATE() {
		return CUSTOMER_PROMISE_DATE;
	}
	public void setCUSTOMER_PROMISE_DATE(LocalDateTime cUSTOMER_PROMISE_DATE) {
		CUSTOMER_PROMISE_DATE = cUSTOMER_PROMISE_DATE;
	}
	public String getCUSTOMER_ZIP_CODE() {
		return CUSTOMER_ZIP_CODE;
	}
	public void setCUSTOMER_ZIP_CODE(String cUSTOMER_ZIP_CODE) {
		CUSTOMER_ZIP_CODE = cUSTOMER_ZIP_CODE;
	}
	public String getDEPENDENT_ON_LINE_KEY() {
		return DEPENDENT_ON_LINE_KEY;
	}
	public void setDEPENDENT_ON_LINE_KEY(String dEPENDENT_ON_LINE_KEY) {
		DEPENDENT_ON_LINE_KEY = dEPENDENT_ON_LINE_KEY;
	}
	public String getDERIVED_FROM_ORDER_HEADER_KEY() {
		return DERIVED_FROM_ORDER_HEADER_KEY;
	}
	public void setDERIVED_FROM_ORDER_HEADER_KEY(String dERIVED_FROM_ORDER_HEADER_KEY) {
		DERIVED_FROM_ORDER_HEADER_KEY = dERIVED_FROM_ORDER_HEADER_KEY;
	}
	public String getDERIVED_FROM_ORDER_LINE_KEY() {
		return DERIVED_FROM_ORDER_LINE_KEY;
	}
	public void setDERIVED_FROM_ORDER_LINE_KEY(String dERIVED_FROM_ORDER_LINE_KEY) {
		DERIVED_FROM_ORDER_LINE_KEY = dERIVED_FROM_ORDER_LINE_KEY;
	}
	public String getENTERPRISE_KEY() {
		return ENTERPRISE_KEY;
	}
	public void setENTERPRISE_KEY(String eNTERPRISE_KEY) {
		ENTERPRISE_KEY = eNTERPRISE_KEY;
	}
	public String getENTRY_TYPE() {
		return ENTRY_TYPE;
	}
	public void setENTRY_TYPE(String eNTRY_TYPE) {
		ENTRY_TYPE = eNTRY_TYPE;
	}
	public String getEXCHANGE_TYPE() {
		return EXCHANGE_TYPE;
	}
	public void setEXCHANGE_TYPE(String eXCHANGE_TYPE) {
		EXCHANGE_TYPE = eXCHANGE_TYPE;
	}
	public double getEXTENDED_PRICE() {
		return EXTENDED_PRICE;
	}
	public void setEXTENDED_PRICE(double eXTENDED_PRICE) {
		EXTENDED_PRICE = eXTENDED_PRICE;
	}
	public double getFINAL_LINE_TOTAL_PER_STATUS_QTY() {
		return FINAL_LINE_TOTAL_PER_STATUS_QTY;
	}
	public void setFINAL_LINE_TOTAL_PER_STATUS_QTY(double fINAL_LINE_TOTAL_PER_STATUS_QTY) {
		FINAL_LINE_TOTAL_PER_STATUS_QTY = fINAL_LINE_TOTAL_PER_STATUS_QTY;
	}
	public String getHJ_PICK_REQUEST_NO() {
		return HJ_PICK_REQUEST_NO;
	}
	public void setHJ_PICK_REQUEST_NO(String hJ_PICK_REQUEST_NO) {
		HJ_PICK_REQUEST_NO = hJ_PICK_REQUEST_NO;
	}
	public double getINVENTORY_COST() {
		return INVENTORY_COST;
	}
	public void setINVENTORY_COST(double iNVENTORY_COST) {
		INVENTORY_COST = iNVENTORY_COST;
	}
	public double getINVOICED_LINE_TOTAL() {
		return INVOICED_LINE_TOTAL;
	}
	public void setINVOICED_LINE_TOTAL(double iNVOICED_LINE_TOTAL) {
		INVOICED_LINE_TOTAL = iNVOICED_LINE_TOTAL;
	}
	public long getINVOICED_QUANTITY() {
		return INVOICED_QUANTITY;
	}
	public void setINVOICED_QUANTITY(long iNVOICED_QUANTITY) {
		INVOICED_QUANTITY = iNVOICED_QUANTITY;
	}
	public String getIS_FREE_GIFT_ITEM() {
		return IS_FREE_GIFT_ITEM;
	}
	public void setIS_FREE_GIFT_ITEM(String iS_FREE_GIFT_ITEM) {
		IS_FREE_GIFT_ITEM = iS_FREE_GIFT_ITEM;
	}
	public String getIS_PRICE_INFO_ONLY() {
		return IS_PRICE_INFO_ONLY;
	}
	public void setIS_PRICE_INFO_ONLY(String iS_PRICE_INFO_ONLY) {
		IS_PRICE_INFO_ONLY = iS_PRICE_INFO_ONLY;
	}
	public String getIS_RESTRICT_SHIP_FROM_STORE() {
		return IS_RESTRICT_SHIP_FROM_STORE;
	}
	public void setIS_RESTRICT_SHIP_FROM_STORE(String iS_RESTRICT_SHIP_FROM_STORE) {
		IS_RESTRICT_SHIP_FROM_STORE = iS_RESTRICT_SHIP_FROM_STORE;
	}
	public String getIS_STORE_CLEARANCE() {
		return IS_STORE_CLEARANCE;
	}
	public void setIS_STORE_CLEARANCE(String iS_STORE_CLEARANCE) {
		IS_STORE_CLEARANCE = iS_STORE_CLEARANCE;
	}
	public String getIS_WARRANTY() {
		return IS_WARRANTY;
	}
	public void setIS_WARRANTY(String iS_WARRANTY) {
		IS_WARRANTY = iS_WARRANTY;
	}
	public String getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(String iTEM_ID) {
		ITEM_ID = iTEM_ID;
	}
	public String getKIT_CODE() {
		return KIT_CODE;
	}
	public void setKIT_CODE(String kIT_CODE) {
		KIT_CODE = kIT_CODE;
	}
	public String getKIT_INFO() {
		return KIT_INFO;
	}
	public void setKIT_INFO(String kIT_INFO) {
		KIT_INFO = kIT_INFO;
	}
	public String getLINE_CREATEPROGID() {
		return LINE_CREATEPROGID;
	}
	public void setLINE_CREATEPROGID(String lINE_CREATEPROGID) {
		LINE_CREATEPROGID = lINE_CREATEPROGID;
	}
	public LocalDateTime getLINE_CREATETS() {
		return LINE_CREATETS;
	}
	public void setLINE_CREATETS(LocalDateTime lINE_CREATETS) {
		LINE_CREATETS = lINE_CREATETS;
	}
	public String getLINE_CREATEUSERID() {
		return LINE_CREATEUSERID;
	}
	public void setLINE_CREATEUSERID(String lINE_CREATEUSERID) {
		LINE_CREATEUSERID = lINE_CREATEUSERID;
	}
	public String getLINE_FULFILLMENT_TYPE() {
		return LINE_FULFILLMENT_TYPE;
	}
	public void setLINE_FULFILLMENT_TYPE(String lINE_FULFILLMENT_TYPE) {
		LINE_FULFILLMENT_TYPE = lINE_FULFILLMENT_TYPE;
	}
	public String getLINE_INFO() {
		return LINE_INFO;
	}
	public void setLINE_INFO(String lINE_INFO) {
		LINE_INFO = lINE_INFO;
	}
	public String getLINE_INVOICE_COMPLETE() {
		return LINE_INVOICE_COMPLETE;
	}
	public void setLINE_INVOICE_COMPLETE(String lINE_INVOICE_COMPLETE) {
		LINE_INVOICE_COMPLETE = lINE_INVOICE_COMPLETE;
	}
	public String getLINE_MODIFYPROGID() {
		return LINE_MODIFYPROGID;
	}
	public void setLINE_MODIFYPROGID(String lINE_MODIFYPROGID) {
		LINE_MODIFYPROGID = lINE_MODIFYPROGID;
	}
	public LocalDateTime getLINE_MODIFYTS() {
		return LINE_MODIFYTS;
	}
	public void setLINE_MODIFYTS(LocalDateTime lINE_MODIFYTS) {
		LINE_MODIFYTS = lINE_MODIFYTS;
	}
	public String getLINE_MODIFYUSERID() {
		return LINE_MODIFYUSERID;
	}
	public void setLINE_MODIFYUSERID(String lINE_MODIFYUSERID) {
		LINE_MODIFYUSERID = lINE_MODIFYUSERID;
	}
	public long getLINE_NO() {
		return LINE_NO;
	}
	public void setLINE_NO(long lINE_NO) {
		LINE_NO = lINE_NO;
	}
	public String getLINE_SHIP_NODE() {
		return LINE_SHIP_NODE;
	}
	public void setLINE_SHIP_NODE(String lINE_SHIP_NODE) {
		LINE_SHIP_NODE = lINE_SHIP_NODE;
	}
	public double getLINE_TAX() {
		return LINE_TAX;
	}
	public void setLINE_TAX(double lINE_TAX) {
		LINE_TAX = lINE_TAX;
	}
	public double getLINE_TOTAL() {
		return LINE_TOTAL;
	}
	public void setLINE_TOTAL(double lINE_TOTAL) {
		LINE_TOTAL = lINE_TOTAL;
	}
	public double getLINE_TOTAL_PER_STATUS_QTY() {
		return LINE_TOTAL_PER_STATUS_QTY;
	}
	public void setLINE_TOTAL_PER_STATUS_QTY(double lINE_TOTAL_PER_STATUS_QTY) {
		LINE_TOTAL_PER_STATUS_QTY = lINE_TOTAL_PER_STATUS_QTY;
	}
	public String getLINE_TYPE() {
		return LINE_TYPE;
	}
	public void setLINE_TYPE(String lINE_TYPE) {
		LINE_TYPE = lINE_TYPE;
	}
	public double getLIST_PRICE() {
		return LIST_PRICE;
	}
	public void setLIST_PRICE(double lIST_PRICE) {
		LIST_PRICE = lIST_PRICE;
	}
	public long getORDERED_QTY() {
		return ORDERED_QTY;
	}
	public void setORDERED_QTY(long oRDERED_QTY) {
		ORDERED_QTY = oRDERED_QTY;
	}
	public String getORDERED_STORE_ID() {
		return ORDERED_STORE_ID;
	}
	public void setORDERED_STORE_ID(String oRDERED_STORE_ID) {
		ORDERED_STORE_ID = oRDERED_STORE_ID;
	}
	public String getORDER_CAPTURE_CHANNEL() {
		return ORDER_CAPTURE_CHANNEL;
	}
	public void setORDER_CAPTURE_CHANNEL(String oRDER_CAPTURE_CHANNEL) {
		ORDER_CAPTURE_CHANNEL = oRDER_CAPTURE_CHANNEL;
	}
	public String getORDER_CREATEPROGID() {
		return ORDER_CREATEPROGID;
	}
	public void setORDER_CREATEPROGID(String oRDER_CREATEPROGID) {
		ORDER_CREATEPROGID = oRDER_CREATEPROGID;
	}
	public LocalDateTime getORDER_CREATETS() {
		return ORDER_CREATETS;
	}
	public void setORDER_CREATETS(LocalDateTime oRDER_CREATETS) {
		ORDER_CREATETS = oRDER_CREATETS;
	}
	public String getORDER_CREATEUSERID() {
		return ORDER_CREATEUSERID;
	}
	public void setORDER_CREATEUSERID(String oRDER_CREATEUSERID) {
		ORDER_CREATEUSERID = oRDER_CREATEUSERID;
	}
	public String getORDER_DATE() {
		return ORDER_DATE;
	}
	public void setORDER_DATE(String oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}
	public String getORDER_FULFILLMENT_TYPE() {
		return ORDER_FULFILLMENT_TYPE;
	}
	public void setORDER_FULFILLMENT_TYPE(String oRDER_FULFILLMENT_TYPE) {
		ORDER_FULFILLMENT_TYPE = oRDER_FULFILLMENT_TYPE;
	}
	public String getORDER_LOS() {
		return ORDER_LOS;
	}
	public void setORDER_LOS(String oRDER_LOS) {
		ORDER_LOS = oRDER_LOS;
	}
	public String getORDER_MODIFYPROGID() {
		return ORDER_MODIFYPROGID;
	}
	public void setORDER_MODIFYPROGID(String oRDER_MODIFYPROGID) {
		ORDER_MODIFYPROGID = oRDER_MODIFYPROGID;
	}
	public LocalDateTime getORDER_MODIFYTS() {
		return ORDER_MODIFYTS;
	}
	public void setORDER_MODIFYTS(LocalDateTime oRDER_MODIFYTS) {
		ORDER_MODIFYTS = oRDER_MODIFYTS;
	}
	public String getORDER_MODIFYUSERID() {
		return ORDER_MODIFYUSERID;
	}
	public void setORDER_MODIFYUSERID(String oRDER_MODIFYUSERID) {
		ORDER_MODIFYUSERID = oRDER_MODIFYUSERID;
	}
	public String getORDER_NO() {
		return ORDER_NO;
	}
	public void setORDER_NO(String oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}
	public String getORDER_PURPOSE() {
		return ORDER_PURPOSE;
	}
	public void setORDER_PURPOSE(String oRDER_PURPOSE) {
		ORDER_PURPOSE = oRDER_PURPOSE;
	}
	public String getORDER_RELEASE_CREATEPROGID() {
		return ORDER_RELEASE_CREATEPROGID;
	}
	public void setORDER_RELEASE_CREATEPROGID(String oRDER_RELEASE_CREATEPROGID) {
		ORDER_RELEASE_CREATEPROGID = oRDER_RELEASE_CREATEPROGID;
	}
	public LocalDateTime getORDER_RELEASE_CREATETS() {
		return ORDER_RELEASE_CREATETS;
	}
	public void setORDER_RELEASE_CREATETS(LocalDateTime oRDER_RELEASE_CREATETS) {
		ORDER_RELEASE_CREATETS = oRDER_RELEASE_CREATETS;
	}
	public String getORDER_RELEASE_CREATEUSERID() {
		return ORDER_RELEASE_CREATEUSERID;
	}
	public void setORDER_RELEASE_CREATEUSERID(String oRDER_RELEASE_CREATEUSERID) {
		ORDER_RELEASE_CREATEUSERID = oRDER_RELEASE_CREATEUSERID;
	}
	public String getORDER_RELEASE_MODIFYPROGID() {
		return ORDER_RELEASE_MODIFYPROGID;
	}
	public void setORDER_RELEASE_MODIFYPROGID(String oRDER_RELEASE_MODIFYPROGID) {
		ORDER_RELEASE_MODIFYPROGID = oRDER_RELEASE_MODIFYPROGID;
	}
	public LocalDateTime getORDER_RELEASE_MODIFYTS() {
		return ORDER_RELEASE_MODIFYTS;
	}
	public void setORDER_RELEASE_MODIFYTS(LocalDateTime oRDER_RELEASE_MODIFYTS) {
		ORDER_RELEASE_MODIFYTS = oRDER_RELEASE_MODIFYTS;
	}
	public String getORDER_RELEASE_MODIFYUSERID() {
		return ORDER_RELEASE_MODIFYUSERID;
	}
	public void setORDER_RELEASE_MODIFYUSERID(String oRDER_RELEASE_MODIFYUSERID) {
		ORDER_RELEASE_MODIFYUSERID = oRDER_RELEASE_MODIFYUSERID;
	}
	public double getORDER_TOTAL_AMOUNT() {
		return ORDER_TOTAL_AMOUNT;
	}
	public void setORDER_TOTAL_AMOUNT(double oRDER_TOTAL_AMOUNT) {
		ORDER_TOTAL_AMOUNT = oRDER_TOTAL_AMOUNT;
	}
	public String getORDER_TYPE() {
		return ORDER_TYPE;
	}
	public void setORDER_TYPE(String oRDER_TYPE) {
		ORDER_TYPE = oRDER_TYPE;
	}
	public long getORIGINAL_ORDERED_QTY() {
		return ORIGINAL_ORDERED_QTY;
	}
	public void setORIGINAL_ORDERED_QTY(long oRIGINAL_ORDERED_QTY) {
		ORIGINAL_ORDERED_QTY = oRIGINAL_ORDERED_QTY;
	}
	public double getORIGINAL_ORDER_TOTAL_AMOUNT() {
		return ORIGINAL_ORDER_TOTAL_AMOUNT;
	}
	public void setORIGINAL_ORDER_TOTAL_AMOUNT(double oRIGINAL_ORDER_TOTAL_AMOUNT) {
		ORIGINAL_ORDER_TOTAL_AMOUNT = oRIGINAL_ORDER_TOTAL_AMOUNT;
	}
	public long getOTHER_CHARGES() {
		return OTHER_CHARGES;
	}
	public void setOTHER_CHARGES(long oTHER_CHARGES) {
		OTHER_CHARGES = oTHER_CHARGES;
	}
	public String getPAYMENT_STATUS() {
		return PAYMENT_STATUS;
	}
	public void setPAYMENT_STATUS(String pAYMENT_STATUS) {
		PAYMENT_STATUS = pAYMENT_STATUS;
	}
	public String getPICKUP_STORE_ID() {
		return PICKUP_STORE_ID;
	}
	public void setPICKUP_STORE_ID(String pICKUP_STORE_ID) {
		PICKUP_STORE_ID = pICKUP_STORE_ID;
	}
	public String getPICK_REQUEST_NODE() {
		return PICK_REQUEST_NODE;
	}
	public void setPICK_REQUEST_NODE(String pICK_REQUEST_NODE) {
		PICK_REQUEST_NODE = pICK_REQUEST_NODE;
	}
	public String getPICK_REQUEST_NODE_NAME() {
		return PICK_REQUEST_NODE_NAME;
	}
	public void setPICK_REQUEST_NODE_NAME(String pICK_REQUEST_NODE_NAME) {
		PICK_REQUEST_NODE_NAME = pICK_REQUEST_NODE_NAME;
	}
	public String getPOS_SALES_TICKET_NO() {
		return POS_SALES_TICKET_NO;
	}
	public void setPOS_SALES_TICKET_NO(String pOS_SALES_TICKET_NO) {
		POS_SALES_TICKET_NO = pOS_SALES_TICKET_NO;
	}
	public String getPRODUCT_CLASS() {
		return PRODUCT_CLASS;
	}
	public void setPRODUCT_CLASS(String pRODUCT_CLASS) {
		PRODUCT_CLASS = pRODUCT_CLASS;
	}
	public String getPRODUCT_LINE() {
		return PRODUCT_LINE;
	}
	public void setPRODUCT_LINE(String pRODUCT_LINE) {
		PRODUCT_LINE = pRODUCT_LINE;
	}
	public long getQTY_CANCELLED_IN_SPLIT() {
		return QTY_CANCELLED_IN_SPLIT;
	}
	public void setQTY_CANCELLED_IN_SPLIT(long qTY_CANCELLED_IN_SPLIT) {
		QTY_CANCELLED_IN_SPLIT = qTY_CANCELLED_IN_SPLIT;
	}
	public long getRELEASE_NO() {
		return RELEASE_NO;
	}
	public void setRELEASE_NO(long rELEASE_NO) {
		RELEASE_NO = rELEASE_NO;
	}
	public long getRESCHEDULE_REQUEST_COUNT() {
		return RESCHEDULE_REQUEST_COUNT;
	}
	public void setRESCHEDULE_REQUEST_COUNT(long rESCHEDULE_REQUEST_COUNT) {
		RESCHEDULE_REQUEST_COUNT = rESCHEDULE_REQUEST_COUNT;
	}
	public String getSELLER_ORGANIZATION_CODE() {
		return SELLER_ORGANIZATION_CODE;
	}
	public void setSELLER_ORGANIZATION_CODE(String sELLER_ORGANIZATION_CODE) {
		SELLER_ORGANIZATION_CODE = sELLER_ORGANIZATION_CODE;
	}
	public long getSHIPPED_QUANTITY() {
		return SHIPPED_QUANTITY;
	}
	public void setSHIPPED_QUANTITY(long sHIPPED_QUANTITY) {
		SHIPPED_QUANTITY = sHIPPED_QUANTITY;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getSTATUS_NAME() {
		return STATUS_NAME;
	}
	public void setSTATUS_NAME(String sTATUS_NAME) {
		STATUS_NAME = sTATUS_NAME;
	}
	public long getSTATUS_QTY_CHARGE() {
		return STATUS_QTY_CHARGE;
	}
	public void setSTATUS_QTY_CHARGE(long sTATUS_QTY_CHARGE) {
		STATUS_QTY_CHARGE = sTATUS_QTY_CHARGE;
	}
	public double getSTATUS_QTY_PRICE() {
		return STATUS_QTY_PRICE;
	}
	public void setSTATUS_QTY_PRICE(double sTATUS_QTY_PRICE) {
		STATUS_QTY_PRICE = sTATUS_QTY_PRICE;
	}
	public double getSTATUS_QTY_TAX() {
		return STATUS_QTY_TAX;
	}
	public void setSTATUS_QTY_TAX(double sTATUS_QTY_TAX) {
		STATUS_QTY_TAX = sTATUS_QTY_TAX;
	}
	public long getSTATUS_QUANTITY() {
		return STATUS_QUANTITY;
	}
	public void setSTATUS_QUANTITY(long sTATUS_QUANTITY) {
		STATUS_QUANTITY = sTATUS_QUANTITY;
	}
	public double getUNIT_PRICE() {
		return UNIT_PRICE;
	}
	public void setUNIT_PRICE(double uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}
	
	public ActiveLineStatus() {
		
	}
	
}
