package com.cc.java;

public class App {

    public static void main(String[] args) {

        Konto konto1 = new Konto(10000);

        // konto1.getkontostand();
        System.out.println(konto1.getkontostand());

        Konto konto2 = new Konto(10000 * 2);
        System.out.println(konto2.getkontostand());

        Konto konto3 = new Konto(10000 * 3);
        System.out.println(konto3.getkontostand());

        Konto konto4 = new Konto(10000 * 10);
        System.out.println(konto4.getkontostand());

    }

}
