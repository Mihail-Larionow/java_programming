package com.michel.shirttest;

/**
 *
 * @author mihai
 */
public class ShirtTest {

    public static void main(String[] args) {
        Shirt myShirt;
        myShirt = new Shirt(1, 199.9f, 'R', 
                "The best shirt", 9);
        myShirt.displayShirtInformation();
    }
}
