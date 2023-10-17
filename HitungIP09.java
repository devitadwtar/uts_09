package Latihan;

import java.util.Scanner;

/**
 * HitungIP09
 */
public class HitungIP09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner (System.in);
        
        String nama, matKul, kategori;
        int  SKS, Remidi;
        double nilai, IP; 
        char ulang;

        do {
        System.out.println("=== Program Hitung IP ===");
        System.out.print("Masukkan nama : ");
         nama = sc09.nextLine();
        System.out.print("Masukkan nama mata kuliah : ");
        matKul = sc09.nextLine();
        System.out.print(" Nilai A, B+, B, C+, C, D, E : ");
         kategori = sc09.nextLine();
        System.out.print("Masukkan jumlah SKS : ");
        SKS = sc09.nextInt();

        nilai = sc09.nextDouble()
         IP = (nilai * SKS)/ SKS;
        Remidi = sc09.nextInt();
    
        kategori = sc09.nextLine();
        if (kategori.equalsIgnoreCase("A")){
            nilai = 4.0;
        } else if (kategori.equalsIgnoreCase("B+")){
            nilai = 3.5;
        } else if (kategori.equalsIgnoreCase("B")){
            nilai = 3.0;
        } else if (kategori.equalsIgnoreCase("C+")){
            nilai = 2.5;
        } else if (kategori.equalsIgnoreCase("C")){
            nilai = 2.0; 
        } else if (kategori.equalsIgnoreCase("D")){
            nilai = 1.0; 
        } else if (kategori.equalsIgnoreCase("E")){
            nilai = 0.0; 
        } else {
            nilai = 0.0;
        }

         System.out.println("Apakah lanjut input nilai (y/t)? ");
        ulang = sc09.next().charAt(0);
        

        }while(ulang != 't');
         System.out.println("===== Hasil Perhitungan IP =====");
         System.out.print("Nama : " + nama);
         System.out.print("Indeks Prestasi : " + IP);
         System.out.print("Mata Kuliah: " + matKul);
         System.out.print("Jumlah SKS : " + SKS);


         System.out.println("Jumlah MK yang harus diperbaiki: " + Remidi);

         System.out.println("=====Jangan patah semangat =====");

         sc09.close();
    }
}