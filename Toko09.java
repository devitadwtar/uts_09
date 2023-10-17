package Latihan;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * Toko09
 */
public class Toko09 {

    public static void main(String[] args) {

        Scanner sc09 = new Scanner(System.in);
        System.out.println("===== Selamat datang di Devita store =====");
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc09.nextLine();

        System.out.print("Apakah pelanggan adalah member (y/n)? ");
        boolean isMember = sc09.nextLine().equalsIgnoreCase("y");

        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;
        int totalItemBarang = 0;

        boolean tambahProduk = true;
        while (tambahProduk) {
            System.out.print("Masukkan nama produk: ");
            String namaProduk = sc09.nextLine();

            System.out.print("Masukkan kuantitas produk: ");
            int kuantitas = sc09.nextInt();

            System.out.print("Masukkan harga satuan produk: ");
            double hargaSatuan = sc09.nextDouble();

            System.out.print("Apakah ada diskon untuk produk ini (persentase, jika tidak ketik 0)? ");
            double diskonProduk = sc09.nextDouble();

            totalItemBarang += kuantitas;
            double subTotal = kuantitas * hargaSatuan;

            double diskon = subTotal * (diskonProduk / 100);
            totalDiskon += diskon;

            totalHargaSebelumDiskon += subTotal;

            System.out.print("Tambah produk lagi (y/n)? ");
            sc09.nextLine();
            tambahProduk = sc09.nextLine().equalsIgnoreCase("y");
        }

        double diskonMember = 0;
        if (isMember) {
            if (totalHargaSebelumDiskon >= 200000) {
                diskonMember = totalHargaSebelumDiskon * 0.1;
            } else {
                diskonMember = totalHargaSebelumDiskon * 0.05;
            }
        }

        double totalAkhir = totalHargaSebelumDiskon - totalDiskon - diskonMember;

        System.out.println("===Toko Devita===");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Tipe Pelanggan: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total Item Barang: " + totalItemBarang);
        System.out.println("Total Harga Sebelum Diskon: " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Diskon Member: " + diskonMember);
        System.out.println("Total Akhir: " + totalAkhir);
        System.out.println("Terima kasih telah berbelanja di toko kami");

        sc09.close();
    }
}