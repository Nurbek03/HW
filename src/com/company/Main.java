package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myFavouriteFood = "";
        int num = 2;
        String word = "Food";
        Scanner s = new Scanner(System.in);

        System.out.println(num +word);

        System.out.println(myFavouriteFood +word);

        System.out.println("Вы сохранили положительное число");

        {
            System.out.println("Введите ваше имя");
            String string = s.nextLine();
            System.out.println("Привет " + string);
        }
    }
}
