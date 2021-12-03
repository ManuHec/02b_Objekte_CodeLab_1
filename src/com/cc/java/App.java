package com.cc.java;

public class App {

    public static void main(String[] args) {

        Konto konto1 = new Konto(10000);

        // konto1.getkontostand();
        System.out.println(" Der aktuelle Kontostand beträgt:" + " " + konto1.getkontostand());

        Konto konto2 = new Konto(10000);
        System.out.println(" Ihr neuer Kontostand beträgt:" + " " + 10000 * 2 + konto2.getKonto2());

        Konto konto3 = new Konto(10000);
        System.out.println(" Ihr neuer Kontostand beträgt:" + " " + 10000 * 3 + konto3.getKonto3());

        Konto konto4 = new Konto(10000);
        System.out.println(" Ihr neuer Kontostand beträgt:" + " " + 10000 * 10 + konto4.getKonto4());

    }

}
