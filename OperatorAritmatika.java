 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 027
 */
public class OperatorAritmatika {
    public static void main(String[] args) {
        int bilangan1 =13;
        int bilangan2 =5;
        int hasilPenjumlahan = bilangan1+bilangan2;
        int hasilPengurangan = bilangan1-bilangan2;
        int hasilPembagian = bilangan1/bilangan2;
        int hasilPerkalian = bilangan1*bilangan2;
        int hasilModulus = bilangan1%bilangan2;
        
//        System.out.println("Hasil Penjumlahan:"+hasilPenjumlahan);
//        System.out.println("Hasil Pengurangan:"+hasilPengurangan);
//        System.out.println("Hasi Pembagian:"+hasilPembagian);
//        System.out.println("Hasil Perkalian:"+hasilPerkalian);
//        System.out.println("Hasil Sisa Bagi Hasil:"+hasilModulus);

        double nilaiMatematika = 90.5;
        double nilaiProduktif = 97.89;
        double nilaiInformatika = 99.5;
        double nilaiPKN = 95.85;
        double nilaiRata = (nilaiMatematika+nilaiProduktif+nilaiInformatika+nilaiPKN)/4;
//        System.out.println("Nilai Rata-Rata:"+nilaiRata );
                
        double beratBadan = 50;
        double tinggiBadan = 150 ;
        double bmi = beratBadan/tinggiBadan*2;
        System.out.println("BMI:"+bmi);
    }
} 
