package com.linecomparision;
public class welcomeMsg {
    void print() {
        System.out.println("welcome");
    }

    public static class display extends welcomeMsg {
        public void print() {
            System.out.println("welcome to employee wage calculation program");
        }
    }

    public static void main(String[] args) {
        welcomeMsg d = new display();
        d.print();
    }
}