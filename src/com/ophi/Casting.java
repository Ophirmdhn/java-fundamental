package com.ophi;

public class Casting {
    public static void main(String[] args) {

        // Koversi otomatis, dari kecil ke besar
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;

        // Koversi Manual, urutannya bebas
        int angka = 100;
        byte angka2 = (byte) angka;
        double angka3 = (double) angka2;

        System.out.println(angka3);
    }
}
