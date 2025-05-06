# Sistem Penilaian Kursus Pemrograman TechCode

## Deskripsi Proyek
Proyek ini adalah aplikasi Java sederhana yang dibangun menggunakan Apache NetBeans untuk menghitung nilai akhir siswa kursus pemrograman dan menentukan status kelulusan beserta grade nilai berdasarkan berbagai komponen penilaian.

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-red.svg)](https://www.java.com)

## Fitur
- Input data peserta (ID Peserta, Nama Peserta, Jenis Kursus, Level Kursus)
- Input nilai untuk 4 komponen penilaian (Tugas Harian, Project, Ujian Teori, Ujian Praktek)
- Perhitungan nilai akhir berdasarkan bobot yang ditentukan:
  - Tugas Harian: 15%
  - Project: 30%
  - Ujian Teori: 20%
  - Ujian Praktek: 35%
- Penentuan status kelulusan (LULUS/TIDAK LULUS)
- Pemberian grade nilai (A/B/C/D/E)
- Output laporan hasil belajar yang terformat rapi

## Cara Penggunaan
1. Clone repositori ini ke komputer lokal Anda
2. Buka project menggunakan Apache NetBeans
3. Jalankan file `Kursus_pemrograman.java`
4. Ikuti instruksi untuk memasukkan data peserta dan nilai-nilai komponen penilaian
5. Program akan menampilkan laporan hasil belajar dengan nilai akhir, status kelulusan, dan grade

## Kriteria Penilaian

### Status Kelulusan
- **LULUS**: Nilai akhir ≥ 70
- **TIDAK LULUS**: Nilai akhir < 70

### Grade Nilai
- **A**: Nilai akhir ≥ 90
- **B**: Nilai akhir 80-89
- **C**: Nilai akhir 70-79
- **D**: Nilai akhir 60-69
- **E**: Nilai akhir < 60

## Contoh Output
```
LAPORAN HASIL BELAJAR
KURSUS PEMROGRAMAN TECHCODE
========================================
ID Peserta         : MHS25001
Nama Peserta       : Reza Rahardian
Jenis Kursus       : Java Programming
Level Kursus       : Intermediate
========================================
Tugas Harian       : 85.0
Project            : 92.0
Ujian Teori        : 88.0
Ujian Praktek      : 90.0
========================================
Nilai Akhir      : 89.35
Status           : LULUS
Grade            : B
========================================
```

## Teknologi yang Digunakan
- Java
- Apache NetBeans IDE

## Struktur Proyek
- `src/kursus_pemrograman/Kursus_pemrograman.java`: File utama program



