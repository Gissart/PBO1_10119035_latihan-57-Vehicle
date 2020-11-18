package com.tugasPBO;
/*
Nama        : Argya Aulia Fauzandika
NIM         : 10119035
Kelas       : PBO1 / IF1
Deskripsi   : menampilkan informasi sepeda dan skateboard
* */

public class Main {
    public static void main(String[] args){
        Bicyle bike = new Bicyle();
        bike.setBrand("Trek Bike");
        bike.setModel("7.4FX");
        bike.setMyGearCount(23);
        System.out.println("Brand  : "+bike.getBrand());
        System.out.println("Model  : "+bike.getModel());
        System.out.println("Jumlah Gear  : "+bike.getMyGearCount()+"\n");

        Skateboard skate = new Skateboard();
        skate.setBrand("Ally Skate");
        skate.setModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand   : "+skate.getBrand());
        System.out.println("Model   : "+skate.getModel());
        System.out.println("Panjangnya board  : "+skate.getMyBoardLength());
    }
}
