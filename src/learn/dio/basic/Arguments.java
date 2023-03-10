package learn.dio.basic;

import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String lastName = input.next();
        System.out.println("My name is " + name + " and last name " + lastName + "!");


    }
}