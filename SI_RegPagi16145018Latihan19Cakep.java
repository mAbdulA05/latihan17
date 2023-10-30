/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg16145018.latihan19.cakep;

/**
 *
 * @author mjanw
 */
public class SI_RegPagi16145018Latihan19Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoAwal = 2500000;
        // Bunga per bulan dalam persen
        double bungaPerBulan = 15.0;
        // Lama bulan
        int lamaBulan = 6;

        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        System.out.println("Bunga/Bulan(%): " + bungaPerBulan);
        System.out.println("Lama (bulan): " + lamaBulan);
        

        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = ((bungaPerBulan / 100.0) * saldoAwal);
            saldoAwal += bunga;
            System.out.println("Saldo bulan " + bulan + ": Rp. " + saldoAwal);
            
    }
    }
    
}
