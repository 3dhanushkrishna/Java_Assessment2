package com.harman.assessment;

import java.util.Scanner;

public class Assignmentoperator {
    public static void main(String[] args) {
        Addition addobj = new Addition();
        Multiplication mulobj = new Multiplication();
        Divisible8 divobj = new Divisible8();
        Integer x,y,z,addresult,mulresult,divresult;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = input.nextInt();
        System.out.println("Enter the value of y: ");
        y = input.nextInt();
        System.out.println("Enter the value of z: ");
        z = input.nextInt();
        addresult = addobj.Add2numbers(x,y);
        System.out.println(addresult);
        mulresult = mulobj.Mul2numbers(x,y);
        System.out.println(mulresult);
        divresult=divobj.Divisibleby8(z);



    }
}
