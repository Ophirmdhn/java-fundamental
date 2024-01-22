package com.ophi;

public class Variable {

    public static void main(String[] args) {
        // Inisialisasi variable
        String firstName = "Ophi";
        String lastName = "Ramadhan";
        String fullName; // Valuenya bisa di isi nanti
        int age = 20;

        fullName = firstName + " " + lastName;

        System.out.println("nama : " + fullName + "\n" + "umur : " + age);

        // Menggunakan var
        var nama = "Ophai"; // Otomatis mendeteksi tipe data, valuenya tidak boleh kosong.
        var umur = 16;

        System.out.println("nama : " + nama + "\n" + "umur : " + umur);

        // Menggunakan final (valuenya tidak bisa diubah)
        final String address = "Privasi";
    }
}
