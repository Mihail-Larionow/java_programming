package com.michel.guessinggame;

/**
 *
 * @author mihai
 */
public class GuessingGame {

    public static void main(String[] args) {
        
        int randomNum, guess;
        System.out.println("Лотерея! Для участия введите одно число от 1 до 5");
        randomNum = (int)(Math.random()*5+1);
        if(args.length != 1 || "help".equals(args[0]))
            System.out.println("Для участия в лотерее необходимо ввести одно число от 1 до 5");
        else{
            guess = Integer.parseInt(args[0]);
            if(guess > 5 || guess < 1)
                    System.out.println("Число должно быть не меньше 1 и не больше 5");
            else if(guess == randomNum)
                System.out.println("Поздравляем! Вы победили!");
            else System.out.println("Вы проиграли! Попробуйте в следущий раз!");
        }
    }
}
