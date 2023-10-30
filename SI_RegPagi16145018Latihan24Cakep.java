/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg16145018.latihan24.cakep;

import java.util.Scanner;

/**
 *
 * @author mjanw
 */
public class SI_RegPagi16145018Latihan24Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //*public static void main(String[] args) {*/
   Scanner input = new Scanner(System.in);

        String repeat;
        do {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan nilai pertama: ");
            int value1 = input.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int value2 = input.nextInt();

            if (value1 > value2) {
                System.out.println("Hasil " + value1 + " Lebih besar dari " + value2);
            } else if (value1 < value2) {
                System.out.println("Hasil " + value1 + " Lebih kecil dari " + value2);
            } else {
                System.out.println("Hasil " + value1 + " Sama dengan " + value2);
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak) : ");
            repeat = input.next();
        } while (repeat.equalsIgnoreCase("Ya"));
    }
}

