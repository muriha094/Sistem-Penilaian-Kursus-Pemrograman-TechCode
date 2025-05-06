/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kursus_pemrograman;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kursus_pemrograman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("LAPORAN HASIL BELAJAR"); 
        System.out.println("KURSUS PEMROGRAMAN TECHCODE");
        System.out.println("========================================");
        Scanner input = new Scanner (System.in);
        // Memasukkan identitas 
        System.out.print("ID Peserta         : ");
        String idpe = input.nextLine();
        System.out.print("Nama Peserta       : ");
        String nape = input.nextLine();
        System.out.print("Jenis Kursus       : ");
        String jeku = input.nextLine();
        System.out.print("Level Kursus       : ");
        String leku = input.nextLine();
        System.out.println("========================================");
        // Memasukkan nilai-nilai
        System.out.print("Tugas Harian       :");
        double v1 = input.nextDouble();
        System.out.print("Project            :");
        double v2 = input.nextDouble();
        System.out.print("Ujian Teori        :");
        double v3 = input.nextDouble();
        System.out.print("Ujian Praktek      :");
        double v4 = input.nextDouble();
        
        // Menghitung nilai akhir
        double nilaiakhir = (v1 * 0.15) + (v2 * 0.30) + (v3 * 0.20) + (v4 * 0.35);
        String keterangan;
        
        // Menentukan status kelulusan siswa
        if (nilaiakhir >= 70) {
            keterangan = "LULUS";
        }
        else {
            keterangan = "TIDAK LULUS";
        }
        
        // Menentukan Grade
        String huruf1;
        int nilaiBulat = (int) Math.round(nilaiakhir);

        if (nilaiBulat >= 90 && nilaiBulat <= 100) {
            huruf1 = "A";
        } else if (nilaiBulat >= 80) {
            huruf1 = "B";
        } else if (nilaiBulat >= 70) {
            huruf1 = "C";
        } else if (nilaiBulat >= 60) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }
        
        System.out.println("========================================");
        System.out.println("Nilai Akhir      :"+nilaiakhir);
        System.out.println("Status           :"+keterangan);
        System.out.println("Grade            :"+huruf1);
        System.out.println("========================================");
    }
    
}
