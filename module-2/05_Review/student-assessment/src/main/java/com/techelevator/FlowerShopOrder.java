package com.techelevator;

public class FlowerShopOrder extends Module1CodingAssessment {

private String bouquetType;
private int roses;
private double subtotal = 0;



public FlowerShopOrder(String bouquet, int roses){
    this.bouquetType = bouquet;
    this.roses = roses;
}

public String getBouquet(){
    return bouquetType;
}

public int getRoses(){
    return roses;
}

public double getSubtotal(){
    return subtotal;
}

public void setSubtotal(double subtotal){
    this.subtotal = subtotal;
}
}
