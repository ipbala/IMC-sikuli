package com.imc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateOrderPojo {
    @JsonProperty("OrderNumber")
    private String orderNumber;
    @JsonProperty("OrderType")
    private String orderType;
    @JsonProperty("OrderRef")
    private String orderRef;
    @JsonProperty("BillTo")
    private String billTo;
    @JsonProperty("Carrier")
    private String carrier;
    @JsonProperty("Brokerage")
    private String brokerage;
    @JsonProperty("Container")
    private String container;
    @JsonProperty("ChassisNumber")
    private String chassisNumber;
    @JsonProperty("ReleaseNumber")
    private String releaseNumber;
    @JsonProperty("Shipper")
    private String shipper;
    @JsonProperty("Consignee")
    private String consignee;
    @JsonProperty("Commodity")
    private String commodity;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DriverName")
    private String driverName;
    @JsonProperty("Truck")
    private String truck;
    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("Invoice")
    private String invoice;
    @JsonProperty("Freight")
    private double freight;
    @JsonProperty("FSC")
    private double fsc;
    @JsonProperty("Charges")
    private double charges;
    @JsonProperty("Total")
    private double total;
    @JsonProperty("TruckPay")
    private double truckPay;
    @JsonProperty("VendorPay")
    private double vendorPay;
    @JsonProperty("Profit")
    private double profit;

    public CreateOrderPojo() {}

    // Getters and setters for all fields
    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }
    public String getOrderType() { return orderType; }
    public void setOrderType(String orderType) { this.orderType = orderType; }
    public String getOrderRef() { return orderRef; }
    public void setOrderRef(String orderRef) { this.orderRef = orderRef; }
    public String getBillTo() { return billTo; }
    public void setBillTo(String billTo) { this.billTo = billTo; }
    public String getCarrier() { return carrier; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
    public String getBrokerage() { return brokerage; }
    public void setBrokerage(String brokerage) { this.brokerage = brokerage; }
    public String getContainer() { return container; }
    public void setContainer(String container) { this.container = container; }
    public String getChassisNumber() { return chassisNumber; }
    public void setChassisNumber(String chassisNumber) { this.chassisNumber = chassisNumber; }
    public String getReleaseNumber() { return releaseNumber; }
    public void setReleaseNumber(String releaseNumber) { this.releaseNumber = releaseNumber; }
    public String getShipper() { return shipper; }
    public void setShipper(String shipper) { this.shipper = shipper; }
    public String getConsignee() { return consignee; }
    public void setConsignee(String consignee) { this.consignee = consignee; }
    public String getCommodity() { return commodity; }
    public void setCommodity(String commodity) { this.commodity = commodity; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public String getTruck() { return truck; }
    public void setTruck(String truck) { this.truck = truck; }
    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public String getInvoice() { return invoice; }
    public void setInvoice(String invoice) { this.invoice = invoice; }
    public double getFreight() { return freight; }
    public void setFreight(double freight) { this.freight = freight; }
    public double getFsc() { return fsc; }
    public void setFsc(double fsc) { this.fsc = fsc; }
    public double getCharges() { return charges; }
    public void setCharges(double charges) { this.charges = charges; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public double getTruckPay() { return truckPay; }
    public void setTruckPay(double truckPay) { this.truckPay = truckPay; }
    public double getVendorPay() { return vendorPay; }
    public void setVendorPay(double vendorPay) { this.vendorPay = vendorPay; }
    public double getProfit() { return profit; }
    public void setProfit(double profit) { this.profit = profit; }
}