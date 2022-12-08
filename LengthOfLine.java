package com.linecomparisionbasic;

import java.util.Scanner;

public class LengthOfLine {
    public static void lengthOfLine(){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
    float x1 = sc.nextInt();
        System.out.println("enter y1");
    float y1 = sc.nextInt();
        System.out.println("enter x2");
    float x2 = sc.nextInt();
        System.out.println("enter y2");
    float y2 = sc.nextInt();
    double LENGTH1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("lenth of the line is -" +LENGTH1);
}

    public static void main(String[] args) {
        lengthOfLine();
    }
}

