package com.niit.furniture;

class FurnitureDemo {
    public static void main(String[] args) {
        FurnitureType ft = FurnitureType.HOME;
        switch (ft) {
            case HOME:
                BookShelf b = new BookShelf();
                b.discountPercentage(b.price, b.homeDiscountPercentage);
                b.displayFurnitureDetails();
                break;
            case OFFICE:
                Table t = new Table();
                t.discountPercentage(t.price, t.officeDiscountPercentage);
                t.displayFurnitureDetails();
                break;
            case GARDEN:
                sofa s = new sofa();
                s.discountPercentage(s.price, s.gardenDiscountPercentage);
                s.displayFurnitureDetails();
                break;
            default:
                break;
        }
    }
}