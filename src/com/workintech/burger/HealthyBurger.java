package com.workintech.burger;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }
    public void addHealthyAddition1(String addName , double addPrice){
        this.healthyExtra1Name =addName;
        this.healthyExtra1Price = addPrice;
    }
    public void addHealthyAddition2(String addName , double addPrice){
        this.healthyExtra2Name = addName;
        this.healthyExtra2Price = addPrice;
    }

    @java.lang.Override
    public double itemizeHamburger() {
     double totalPrice = super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;

     if (healthyExtra1Name != null){
         System.out.println("Healthy Burger Additional Name1 : " +
                 this.healthyExtra1Name + " , Healthy Burger Additional1 Price : " + this.healthyExtra1Price);
     }
     if (healthyExtra2Name != null){
         System.out.println("Healthy Burger Additional Name2 : " +
                 this.healthyExtra2Name + " , Healthy Burger Additional2 Price : " + this.healthyExtra2Price);
     }
        System.out.println("Total Healthy Burger Price : " + totalPrice);

     return totalPrice;
    }
}
