package com.code;

public class Dog {

        String color;
        String name;
        String breed;

        public Dog(){

        }
        public Dog(String col){
            this.color = col;
        }

        public void wagTail(){
            System.out.println("Dog wag their tail");
        }
        public void barking(){
            System.out.println("Dog is barking");
        }
        public void eat(){
            System.out.println("Dog Eating");
        }
        public void printCol(){
            System.out.println(color);
        }
}
