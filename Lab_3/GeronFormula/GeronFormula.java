package com.michel.geronformula;

import java.util.Scanner;

/**
 *
 * @author mihai
 */
public class GeronFormula {

    public static void main(String[] args) {
        float a1 = 15, a2 = 15, a3 = 15;
        Scanner cin = new Scanner(System.in);
        System.out.println("Введите длины трех сторон треугольника: ");
        if(cin.hasNextFloat() == true){
            a1 = cin.nextFloat();
        }
        if(cin.hasNextFloat() == true){
            a2 = cin.nextFloat();
        }
        if(cin.hasNextFloat() == true){
            a3 = cin.nextFloat();
        }
        float p = (a1+a2+a3)/2;
        double S=Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
        System.out.printf(
                "Для\u0020сторон\u0020%.2f,\u0020%.2f\u0020и\u0020%.2f\u0020площадь\u0020равна\u0020%.2f", 
                a1, a2, a3, S);
    }
}
