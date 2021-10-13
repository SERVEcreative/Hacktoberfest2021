package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation1 operation1=new Operation1();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("enter your choice ");
            System.out.println(" choice 1 for task 1 ");
            System.out.println(" choice 2 for task  2");
            System.out.println(" choice 3 for task 3 ");
            System.out.println(" choice 4 for task 4 ");
            System.out.println(" choice 5 for task 5 ");
            System.out.println(" choice 6 for task 6 ");
            System.out.println(" any except above lead to program end");

            int choice;
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                operation1.ArrayIndexOutOfBoundsException();
                 break;
                case 2:
                operation1.illegalArgument(700);
                break;
                case 3:
                operation1.string();
                break;
                case 4:
                operation1.createArray(5);
                break;
                case 5:
                operation1.displayString(null);
                break;
                case 6:
                    operation1.illegalAcessExecption();
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
