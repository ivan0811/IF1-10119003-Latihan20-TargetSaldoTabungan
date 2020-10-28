/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan20.targetsaldotabungan;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung target saldo tabungan
 */
public class TargetSaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    Locale locale = Locale.forLanguageTag("id");
    Double saldo, bunga, target;
    /**
     * @param args the command line arguments
     */
    
    private void masukkanSaldo(){
        System.out.print("Saldo Awal : Rp. ");
        saldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%) : ");
        bunga = scan.nextDouble();
        System.out.print("Saldo Target : Rp. ");
        target = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
    }
    
    private void hitungBunga(){
        bunga /= 100;             
    }
    
    private void tampilSaldo(){
        int num = 1;               
        while(saldo <= target){
            saldo = saldo + (saldo * bunga);                        
            System.out.print("Saldo di bulan ke-"+(num++)+" Rp. ");   
            System.out.printf(locale, "%,.0f%n", saldo);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here        
        TargetSaldoTabungan data = new TargetSaldoTabungan();
        data.masukkanSaldo();
        data.hitungBunga();
        data.tampilSaldo();
    }
    
}
