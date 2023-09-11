/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 027
 */ import java.util.Scanner;
public class KategoriNilai {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama:");
        String nama  = input.nextLine();
        System.out.println("Masukan Nilai:");
        int Nilai = input.nextInt();
       
        if(Nilai >= 96 && Nilai <= 100){
        System.out.println("A");
        System.out.println("Sangat Baik");
        }else if (Nilai >= 91 && Nilai <= 95){
            System.out.println("A-");
            System.out.println("Sangat Baik");
        }else if (Nilai >= 86 && Nilai <= 90){
            System.out.println("B+");
            System.out.println("Baik");
        }else if (Nilai >= 81 && Nilai <= 85){
            System.out.println("B");
            System.out.println("Baik");
        }else if (Nilai >= 75 && Nilai <= 80){
            System.out.println("B-");
            System.out.println("Baik");
        }else if (Nilai >= 70 && Nilai <= 74){
            System.out.println("C+");
            System.out.println("Cukup");
        }else if (Nilai >= 65 && Nilai <= 69){
            System.out.println("C");
            System.out.println("Cukup");
        }else if (Nilai >= 60 && Nilai <= 64){
            System.out.println("C-");
            System.out.println("Cukup");
        }else if (Nilai >= 55 && Nilai <= 59){
            System.out.println("D+");
            System.out.println("Baik");
        }else if (Nilai >= 0 && Nilai <= 54){
            System.out.println("D");
            System.out.println("Baik");
        }
    }
}
