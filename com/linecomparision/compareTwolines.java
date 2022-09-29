package com.linecomparision;

import java.util.Scanner;

public class compareTwolines {
    public static int comparelines() {
        float x1, y1, x2, y2;
        float x3, y3, x4, y4;
        double length1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        x1 = sc.nextInt();
        System.out.println("enter y1");
        y1 = sc.nextInt();
        System.out.println("enter x2");
        x2 = sc.nextInt();
        System.out.println("enter y2");
        y2 = sc.nextInt();
        double LENGTH1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("enter x3");
        x3 = sc.nextInt();
        System.out.println("enter y3");
        y3 = sc.nextInt();
        System.out.println("enter x4");
        x4 = sc.nextInt();
        System.out.println("enter y4");
        y4 = sc.nextInt();
        double LENGTH2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
        if (LENGTH1 == LENGTH2) {
            System.out.println("lines are equal");
        } else if (LENGTH1 < LENGTH2) {
            System.out.println("lines 1 less than line 2");
        } else if (LENGTH1 > LENGTH2) {
            System.out.println("line 1 is greater than line 2");
        } else {
            System.out.println("lines are not equal");
        }
        return 0;
    }

    public static void main(String[] args) {
        comparelines();
    }


    }



