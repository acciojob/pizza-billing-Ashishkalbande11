package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheeseAdded;
    private  boolean isExtraToppingsAdded;
    private boolean isExtraPeperAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;

        }else{
            this.price = 400;
        }
        this.isExtraPeperAdded = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded && isVeg){
            price += 80;
        }
        if(!isExtraCheeseAdded && !isVeg){
            price += 120;
        }
        isExtraCheeseAdded = true;
        // your code goes here

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            price += 70;

        }
        isExtraToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isExtraPeperAdded){
            price += 20;
            isExtraPeperAdded = true;
        }
    }

    public String getBill(){

        // your code goes here
        StringBuilder bill = new StringBuilder();
        if(isVeg){
            bill.append("Base Price Of The Pizza: ").append("300").append("\n");
        }else {
            bill.append("Base Price Of The Pizza: ").append("400").append("\n");
        }

        if(isExtraCheeseAdded && isVeg){
            bill.append("Extra Cheese Added: ").append("80").append("\n");
        }
        if(isExtraCheeseAdded && !isVeg){
            bill.append("Extra Cheese Added: ").append("120").append("\n");
        }
        if(isExtraToppingsAdded){
            bill.append("Extra Toppings Added: ").append("70").append("\n");
        }
        if(isExtraPeperAdded){
            bill.append("Extra Peper Added: ").append("20").append("\n");
        }
        bill.append("Total Bill: ").append(getPrice());
        return bill.toString();
    }
}
