package com.coding;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(21);
//        list.add(34);
//        list.add(56);
//        list.add(65);
//        list.add(78);
//        System.out.println(list);
//        list.set(2,98);
//        System.out.println(list);

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

    }
}
