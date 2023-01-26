package com.saurabhjava;

class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    Invoice(String partNumber, String partDescription, int quantity, double price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setQuantity(Integer quantity){
        if(quantity>0)
        this.quantity = quantity;
        else this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if(price>0)
        this.price = price;
        else
            this.price = 0;
    }

    public double getPrice() {
        return price;
    }
    public double getTotalAmount() {
        return price*quantity;
    }
}
public class D5Q2 {
    public static void main(String[] args) {
        Invoice one = new Invoice("001","Cricket Bat",2,1500.5);
        System.out.println("Part Number : " + one.getPartNumber()+ ", Part Description: " + one.getPartDescription() + ", Total quantity is  " +one.getQuantity()+ ", Price of per item is" + one.getPrice()
        + ", Total Amount will be " + one.getTotalAmount()

        );
    }
}
