package com.workintech.burger;

public class Hamburger {
    private String name ;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String addName , double addPrice){
        this.addition1Name = addName;
        this.addition1Price = addPrice;
    }
    public void addHamburgerAddition2(String addName , double addPrice){
        this.addition2Name=addName;
        this.addition2Price = addPrice;
    }
    public void addHamburgerAddition3(String addName , double addPrice){
        this.addition3Name=addName;
        this.addition3Price=addPrice;
    }
    public void addHamburgerAddition4(String addName , double addPrice){
        this.addition4Name=addName;
        this.addition4Price = addPrice;

    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public void setAddition2Name(String addition2Name) {
        this.addition2Name = addition2Name;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;


        System.out.println("Burger name : " + this.name + " , Burger meat : "
                +this.meat + " , Burger price : " + this.price + " , Burger bread type : " +this.breadRollType );

        if (this.addition1Name !=null){
            System.out.println("Addition name 1 : " + this.addition1Name + " Addition price1 :" + this.addition1Price);
            totalPrice +=addition1Price;
        }
        if (this.addition2Name !=null){
            System.out.println("Addition name 2 : " + this.addition2Name + " Addition price2 :" + this.addition2Price);
            totalPrice += addition2Price;
        }
        if (this.addition3Name != null){
            System.out.println("Addition name 3 : " + this.addition3Name + " Addition price3 :" + this.addition3Price );
            totalPrice +=addition3Price;
        }
        if (this.addition4Name != null){
            System.out.println("Addition name 4 : " + this.addition4Name + " Addition price4 :" + this.addition4Price);
            totalPrice +=addition4Price;
        }
        System.out.println("Total price : " + totalPrice);
        return totalPrice;
    }
}
