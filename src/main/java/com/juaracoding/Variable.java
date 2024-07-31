package com.juaracoding;

public class Variable {

    public static void main(String[] args) {

        // tipe data number
        byte age = 127;
        short stock = 9999;
        float price = 10000.55f;
        double totalPrice = 3000000000.99d;
        long total = 4000000000L;
        int cartProduct = 1000;

        // char
        char gender = 'L';
        char predikat = 'A';

        // escape character
        System.out.println("\"JuaraCoding\nIndonesia");

        // boolean
        boolean isActive = true;
        boolean isLogin = true;

        // String
        String productName = "Headset";
        System.out.println("Product Name: " + productName);

        // buatkan output menampilkan profile user

        // String
        String name = "Reza Maulana";
        System.out.println("name: " + name);
        String handphone = "0123456789";
        System.out.println("handphone: " + handphone);
        String email = "reza@gmail.com";
        System.out.println("email: " + email);
        String password = "bungaterakhir";
        System.out.println("password: " + password);
        String umur = "31";
        System.out.println("umur: " + umur);
        String jeniskelamin = "L";
        System.out.println("jeniskelamin: " + jeniskelamin);

        String pathImage = "C:\\Users\\Asus\\Pictures\\112234.jpg";
        System.out.println(pathImage);

        // Implicit Casting / Automatic Casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);

        // Explicit Casting / Manual Casting
        char data3 = '+';
        byte dataByte = (byte) data3;
        System.out.println(dataByte);

        int stok = 9999; // android
        short dataShort = (short) stok; // java backend
        System.out.println(dataShort);

        // Passing by Value
        String address = "jakarta";
        String duplicateAddress = address;
        duplicateAddress = "Bandung";
        System.out.println(duplicateAddress);

        //



    }

}






