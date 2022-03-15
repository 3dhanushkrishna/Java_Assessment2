package com.harman.assessment;

import java.util.Scanner;

public class ChildInheritance extends Inheritance{
    public static void main(String[] args) {
        ChildInheritance clac = new ChildInheritance();
        Scanner input = new Scanner(System.in);

        int x,y,mulresult,divresult;
        System.out.println("enter the first num: ");
        x=input.nextInt();
        System.out.println("enter the second num: ");
        y=input.nextInt();
        mulresult=clac.Mul2numbers(x,y);
        System.out.println(mulresult);
        divresult=clac.Div2numbers(x,y);
        System.out.println(divresult);

    }
}
