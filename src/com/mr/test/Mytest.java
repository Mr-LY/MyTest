package com.mr.test;

public class Mytest implements  Runnable{
    @Override
    public void run() {

    }

//    public static void main(String[] args) {
//        System.out.println("Helle World!");
//    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("For interlij Update!");
        
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

        System.out.println("ReCompile Ok!");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start Thread!");
            }
        }).start();
    }
}
