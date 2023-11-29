/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat52;

import java.util.Scanner;

/**
 *
 * @author mjanw
 */
public class PBOlat52 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // Input NIP Dosen
        System.out.print("NIm mahasiswa: ");
        String nipDosen = input.nextLine();

        // Output informasi Dosen
        System.out.println("Saya mahasiswa");
        System.out.println("Saya M. Abdul Aziz umur 19 tahun sedang belajar matakuliah PBO");

        // Menampilkan NIP Dosen yang diinputkan
        System.out.println("NIP Dosen: " + nipDosen);
    }
}