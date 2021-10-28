package com.niit.furniture;

class Furniture implements IFurniture {
    final float officeDiscountPercentage = 0.1f;
    final float homeDiscountPercentage = 0.05f;
    final float gardenDiscountPercentage = 0.025f;
    String color;
    int price;
    float discountPercentage;
    String furnitureType;

    Furniture(String color, int price, float discountPercentage, String furnitureType) {
        System.out.println("Before discount is applied");
        this.color = color;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.furnitureType = furnitureType;
        System.out.println(color + "\t" + price + "\t" + furnitureType);
    }

    public void discountPercentage(int price, float discountPercentage) {
        this.price = price;
        this.discountPercentage = discountPercentage;
        price -= (price * discountPercentage);
        this.price = price;
    }

    public void displayFurnitureDetails() {
        System.out.println("After discount is applied");
        System.out.println(color + "\t" + price + "\t" + furnitureType);
    }
}