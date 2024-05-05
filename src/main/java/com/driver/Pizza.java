package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isAddExtraCheese;
    private  boolean isAddExtraToppings;
    private boolean isTakeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;

        }else if(!isVeg){
            this.price = 400;
        }

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isAddExtraCheese){
            price += 80;
        }

        isAddExtraCheese = true;
        // your code goes here

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isAddExtraToppings && isVeg){
            price += 70;

        }
        if(!isAddExtraToppings && !isVeg){
            price += 120;
        }
        isAddExtraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            price += 20;

        }
        isTakeaway= true;
    }

    public String getBill(){

        // your code goes here
        StringBuilder bill = new StringBuilder();
        if(isVeg){
            bill.append("Base Price Of The Pizza: ").append("300").append("\n");
        }else {
            bill.append("Base Price Of The Pizza: ").append("400").append("\n");
        }

        if(isAddExtraCheese){
            bill.append("Extra Cheese Added: 80\n");
        }
        if(isAddExtraToppings && isVeg){
            bill.append("Extra Toppings Added: 70\n");
        }else{
            bill.append("Extra Toppings Added: 120\n");
        }
        if(isTakeaway){
            bill.append("Paperbag Added: 20\n");
        }
        bill.append("Total Price: ").append(price).append("\n");
        return bill.toString();
    }
}
