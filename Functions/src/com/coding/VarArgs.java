package com.coding;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,9,78,12,45,57);
        multiple(23, 45, "sfdsfesg", "fesgrewgrefv","sfergerfd", "ergferfvdvdf");

    }

    static void multiple(int a, int b, String ...s){
        System.out.println(a+ b+ Arrays.toString(s));
    }
    //variable length Aargument.
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
