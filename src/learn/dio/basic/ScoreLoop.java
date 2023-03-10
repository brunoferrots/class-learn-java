package learn.dio.basic;

import java.util.Scanner;

public class ScoreLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        System.out.println("Digit a score: ");
        nota = input.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Score invalid, digit a number between 0 and 10");
            nota = input.nextInt();

        }
    }
}
