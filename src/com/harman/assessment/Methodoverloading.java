package com.harman.assessment;

public class Methodoverloading {
    public int addNumbers(int a,int b){
        return a-b;
    }
    public int addNumbers(int a,int b,int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        Methodoverloading p=new Methodoverloading();

        int result1=p.addNumbers(21,34);
        int result2=p.addNumbers(34,55,76);
        System.out.println(result1);
        System.out.println(result2);
    }
}
