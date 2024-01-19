package com.workintech.burger;

public class DeluxeBurger extends Hamburger{
    private double defaultPrice ;


    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "White Bun");
        super.addHamburgerAddition1("cips" , 3.8);
        super.addHamburgerAddition2("drink" , 3.2);
        super.setPrice(19.10);

    }

    @java.lang.Override
    public void addHamburgerAddition1(String addName, double addPrice) {
        System.out.println("You can not add additional items to Deluxe Burger");
        setAddition1Price(0);
    }

    @java.lang.Override
    public void addHamburgerAddition2(String addName, double addPrice) {
        System.out.println("You can not add additional items to Deluxe Burger");
        setAddition2Price(0);
    }

    @java.lang.Override
    public void addHamburgerAddition3(String addName, double addPrice) {
        System.out.println("You can not add additional items to a Deluxe Burger");
        setAddition3Price(0);
    }

    @java.lang.Override
    public void addHamburgerAddition4(String addName, double addPrice) {
        System.out.println("You can not add additional items to a Deluxe Burger");
        setAddition4Price(0);
    }

    public double itemizeHamburger() {


        double totalPrice = super.getPrice();
        System.out.println("Name : " + getName() + " Meat : " +getMeat() + " BreadRollType : " +getBreadRollType()
                +" Total Price : " + totalPrice );

        return totalPrice;
    }
}
