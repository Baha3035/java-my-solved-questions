package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int smallest = 0;
        int large = 0;
        int num;
        System.out.println("enter the number");//how many number you want to enter
        Scanner input = new Scanner(System.in);
        smallest = num; //assume first entered number as small one
        // i starts from 2 because we already took one num value
        char choice;
        do {
                num = input.nextInt();
                //comparing each time entered number with large one
                if (num > large) {
                    large = num;
                }
                //comparing each time entered number with smallest one
                if (num < smallest) {
                    smallest = num;
                }
            System.out.print("Do you want to continue y/n? ");
            choice = input.next().charAt(0);
            }while(choice=='y' || choice == 'Y');
            System.out.println("the largest is:" + large);
            System.out.println("Smallest no is : " + smallest);
    }
}