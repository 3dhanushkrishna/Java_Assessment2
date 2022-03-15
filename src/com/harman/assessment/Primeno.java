package com.harman.assessment;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lower num: ");
        Integer num = input.nextInt();
        System.out.println("Enter the higher num: ");
        Integer num2=input.nextInt();
        for(int n=num;n<=num2;n++){
            if(isPrime(n)){
                System.out.println(n);
            }

        }

    }
    public static boolean isPrime(int num){
        for(int i=2;i<=num/i;++i){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
