
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 027
 */
public class KasirSederhana {
    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println("1. Soto Ayam (15.000)");
        System.out.println("2. Rawon Daging (17.000)");
        System.out.println("Mie Goreng (5.000)");
        System.out.println("Tahu Telor (8.000)");
        System.out.println("Sate Kambing (20.000)");
        
        int soto,rawon,mie,tahu,sate;
        soto=15000;
        rawon=17000;
        mie=5000;
        tahu=8000;
        sate=20000;
        
        int jumlahBeli,total,bayar,kembali;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah beli Soto:");
        int jSoto= input.nextInt();
        total=jSoto*soto;
        System.out.println("Jumlah beli Rawon");
        int jRawon= input.nextInt();
        total+=jRawon*rawon; 
        System.out.println("Jumlah beli Mie");
        int jMie= input.nextInt();
        total+=jMie*mie;
        System.out.println("Jumlah beli Tahu");
        int jTahu= input.nextInt();
        total+=jTahu*tahu;
        System.out.println("Jumlah beli Sate");
        int jSate= input.nextInt();
        total+=jSate*sate;
        System.out.println("Total Pembelian:"+total);
        System.out.println("Masukan Pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-total;
        System.out.println("jumlah kembalian: "+kembali);
        
        
                
    }
    
}
