package main;

import SingletonDemo.BillPughSolution;

public class Main {
    public static void main(String[] args) {
        BillPughSolution instance = BillPughSolution.getInstance();
        BillPughSolution instance2 = BillPughSolution.getInstance();
        System.out.println(instance2==instance);



    }
}
