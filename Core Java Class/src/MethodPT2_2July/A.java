package MethodPT2_2July;

public class A {
    int stockPrice =10;
    static int saticstockprice=40;
    void m1(){
        System.out.println("inside m1 method");
    }
    static void m2(){
        System.out.println("inside static m2 method");
        saticstockprice=4000;
        //stockPrice=10;
        //why we cant non static instance variable
        //ans: these methods are associated with class not with object.(static)
        // we cant access non static members because non static members are associated with
        // object not with Class. so we need to know below
        //ob1 has stockprice                         ob2 has stockprice
        //so to get which stockprice we need to change. because memory is not allocated to
        //non staic members while class loading

    }
}
