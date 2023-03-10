package learn.dio.basic;

import java.util.Scanner;

public class NumberAmount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, counter = 0, numberAmount, numberEven = 0, numberUneven = 0;

        System.out.println("Enter the number you want : ");
        numberAmount = input.nextInt();

        do {
            System.out.println("Enter a number : ");
            number = input.nextInt();

            if ((number % 2) == 0) {
                numberEven++;
            } else {
                numberUneven++;
            }

            counter++;
        } while (counter < numberAmount);

        System.out.println("The total number of even is : " + numberEven + ", and " + " number of uneven is : " + numberUneven);
    }
}
