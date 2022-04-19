package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("What digit of the Fibonacci sequence do you want?");
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
