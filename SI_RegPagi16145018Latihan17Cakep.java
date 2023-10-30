/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg16145018.latihan17.cakep;

import java.util.Scanner;

/**
 *
 * @author mjanw
 */
public class SI_RegPagi16145018Latihan17Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa Gaji Anda per bulan: Rp ");
        double gajiPokok = input.nextDouble();

        System.out.println("Status Anda? (Menikah/Belum? : ");
        String statusPerkawinan = input.next();
        // Menghitung tunjangan Menikah
        double tunjangan;
        if (statusPerkawinan.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        // Menampilkan hasil
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + tunjangan);
        System.out.println("Total Gaji : Rp " + totalGaji);
    }
    
}
