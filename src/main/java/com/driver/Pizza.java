package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }else{
            this.price = 400;
            this.toppings = 120;
        }

        this.bill = "Base Price Of The Pizza: "+ this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded == false){
            this.price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingsAdded == false){
            this.price += this.toppings;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway == false){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillCreated == false) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            return this.bill;
        }
        return "";
    }
}
