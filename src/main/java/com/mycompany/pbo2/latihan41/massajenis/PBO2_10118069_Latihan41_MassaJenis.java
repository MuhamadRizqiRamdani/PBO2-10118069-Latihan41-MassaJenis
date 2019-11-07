/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan41.massajenis;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Program untuk menghitung Massa Jenis
 */
public class PBO2_10118069_Latihan41_MassaJenis {
    private static int volume, MasssaJenis;
    
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("===== Massa Jenis Kubus =====");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());
        
        volume = kubus.hitungVolume(kubus.getSisi());
        MasssaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
        
        System.out.println("\n====== Hasil Perhitungan ======");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + MasssaJenis);        
    }

}

