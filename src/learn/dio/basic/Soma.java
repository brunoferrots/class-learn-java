package learn.dio.basic;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, soma = 0, greater = 0, counter = 0;

        do {
            System.out.println("Digit a number : ");
            number = input.nextInt();

            if (number > greater) {
                greater = number;
            }

            soma = soma + number;

            counter += 1;
        } while (counter < 5);

        System.out.println("The greater number it's : " + greater + "\n" + "and media it's : " + (soma/counter));
    }
}
