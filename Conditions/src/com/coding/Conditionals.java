package com.coding;

public class Conditionals {
    public static void main(String[] args) {
        int salary = 25900;
        if(salary > 12000){
            salary = salary + 2500;
        }else {
            salary = salary + 800;
        }
        System.out.println(salary);
    }
}
