/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg16145018.latihan27.cakep;

import java.util.Scanner;

/**
 *
 * @author mjanw
 */
public class SI_RegPagi16145018Latihan27Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*public static void main(String[] args) {*/
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        String uppercase = sentence.toUpperCase();
        String lowercase = sentence.toLowerCase();

        System.out.println("----Hasil Formatting----");
        System.out.println("Huruf Besar : " + uppercase);
        System.out.println("Huruf Kecil : " + lowercase);
    }
}

