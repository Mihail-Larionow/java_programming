package com.michel.shirttest;

/**
 *
 * @author mihai
 */
public class Shirt {
    private int shirtId, quantityInStock = 0;
    private String description;
    private char colorCode = 'U';
    private float price = 0.0f;
    
    public Shirt(int shirtId, float price, char colorCode, String description, 
            int quantityInStock){
        this.shirtId = shirtId;
        this.price = price;
        this.colorCode = colorCode;
        this.description = description;
        this.quantityInStock = quantityInStock;
    }
    
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtId);
        System.out.println("Shirt price: " + price);
        System.out.println("Shirt color code: " + colorCode);
        System.out.println("Shirt description: " + description);
        System.out.println("Shirt quantity in stock: " + quantityInStock);
    }
    
    
}
