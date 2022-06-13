/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.no.pkg7;

import java.util.Scanner;

/**
 *
 * @author HP-MC
 */
public class UklNo7 {
    static Scanner rara = new Scanner(System.in);

    static String Kategori(int gaji) {
        String kategori = "";
        if (gaji > 10000000) {
            kategori = "C";
        } else if (gaji >= 2000000) {
            kategori = "B";
        } else if (gaji < 2000000) {
            kategori = "A";
        }
        return kategori;
    }
    
     static int gaji (String jalur, String kategori, int bulan) {
        int biaya = 0;
        if (jalur.equalsIgnoreCase("SBMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 5000000 + (500000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 15000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 30000000 + (1500000 * bulan);
            }
        } else if (jalur.equalsIgnoreCase("SNMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 7000000 + (50000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 17000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 35000000 + (2000000 * bulan);
            }
        } else if (jalur.equalsIgnoreCase("MANDIRI")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 10000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 25000000 + (2000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 50000000 + (3000000 * bulan);
            }
        }
        return biaya;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // input : id mahasiswa, pendapatan ortu, bulan bayar
        // output : id mahasiswa, nama mahasiswa, jalur masuk, kategori pendapatan, jumlah biaya yang dikeluarkan, alamat
        int id, gaji, bulan, biaya;
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "MANDIRI", "SBMPTN"};
        String alamat[] = {"Sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};

        System.out.print("Masukkan id mahasiswa    : ");
        id = rara.nextInt();
        System.out.print("Masukkan pendapatan ortu : ");
        gaji = rara.nextInt();
        System.out.print("Masukkan bulan bayar     : ");
        bulan = rara.nextInt();
        System.out.println("\n============================");

         System.out.println("Id mahasiswa           : " + id);
        System.out.println("Nama mahasiswa         : " + nama[id - 1]);
        System.out.println("Alur masuk             : " + jalur[id - 1]); // memanggil array
        System.out.println("Kategori pendapatan    : " + Kategori(gaji)); // memanggil fungsi
        // kategori fungsi
        System.out.println("Jumlah biaya           : " + gaji(jalur[id-1], Kategori(gaji),bulan));
        System.out.println("Alamat                 : " + alamat[id - 1]);

    }

    private static String biaya(String s, String kategori, int bulan) {
        return s;
    }
         
    }
    
    

