/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 027
 */
public class Operator {
    public static void main(String[] args) {
         //analisi sebagai stock
         int pensil=8 , penggaris=6;
         double harga_pensil , harga_penggaris;
         harga_pensil = 1500;
         harga_penggaris = 1000;
         double total,  bayar;
         
         /*operator penugasan (pembelian yang mengurangi stock)*/
         pensil-=2;
         penggaris-=3;
         /*Operator Aritmatika (total barang tersedia)*/
         total=pensil+penggaris;
         
         System.out.println("jumlah barang yang tersedia="+pensil+ "+" +penggaris+
                 "=" +total);
         bayar= (total*harga_penggaris)+(total*harga_pensil);
         //total aset yang dimiliki
         System.out.println("total aset yang dimiliki = Rp"+bayar);
         
                 
         
         
    }
    
    
}
