package PBO_Tugas6;

import java.util.Arrays;
import java.util.Scanner;

public class operasiArray {

    Scanner sc = new Scanner(System.in);
    int jumlah, terbesar, terkecil, indeksTerbesar, indeksTerkecil;
    int total, jumlahIndeksGanjil, jumlahIndeksGenap;
    double rataRata;
    String statusGanjil, statusGenap;
    int[] data, dataUrut;

    void input(){

        System.out.println("--OPERASI ARRAY SATU DIMENSI--");
        System.out.print("Masukkan jumlah elemen array : ");
        jumlah = sc.nextInt();

        data = new int[jumlah];
        for(int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan elemen indeks ke-" + i + " : ");
            data[i] = sc.nextInt();
        }
    }
    void hitung(){

        terbesar = data[0];
        terkecil = data[0];
        indeksTerbesar = 0;
        indeksTerkecil = 0;
        total = 0;
        jumlahIndeksGanjil = 0;
        jumlahIndeksGenap = 0;

        for(int i = 0; i < jumlah; i++) {
            // c) nilai terbesar & terkecil beserta indeks
            if(data[i] > terbesar) {
                terbesar = data[i];
                indeksTerbesar = i;
            }
            if(data[i] < terkecil) {
                terkecil = data[i];
                indeksTerkecil = i;
            }

            // d) jumlah seluruh elemen
            total += data[i];

            // e) & f) jumlah elemen indeks ganjil & genap
            if(i % 2 != 0) {
                jumlahIndeksGanjil += data[i];
            } else {
                jumlahIndeksGenap += data[i];
            }
        }

        // d) rata-rata
        rataRata = (double) total / jumlah;

        // g) cek hasil penjumlahan ganjil atau genap
        statusGanjil = (jumlahIndeksGanjil % 2 == 0) ? "GENAP" : "GANJIL";
        statusGenap = (jumlahIndeksGenap % 2 == 0) ? "GENAP" : "GANJIL";

        // h) urutkan elemen array
        dataUrut = Arrays.copyOf(data, jumlah);
        Arrays.sort(dataUrut);
    }
    void tampil(){

        input();
        if(jumlah <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0");
            return;
        }
        hitung();
        System.out.println();
        System.out.println("--HASIL OPERASI ARRAY--");
        System.out.println("Data Array               : " + Arrays.toString(data));
        System.out.println("Nilai Terbesar           : " + terbesar + " (indeks ke-" + indeksTerbesar + ")");
        System.out.println("Nilai Terkecil           : " + terkecil + " (indeks ke-" + indeksTerkecil + ")");
        System.out.println("Total Semua Elemen       : " + total);
        System.out.printf("Nilai Rata-Rata          : %.2f%n", rataRata);
        System.out.println("Jumlah Indeks Ganjil     : " + jumlahIndeksGanjil + " (" + statusGanjil + ")");
        System.out.println("Jumlah Indeks Genap      : " + jumlahIndeksGenap + " (" + statusGenap + ")");
        System.out.println("Array Setelah Diurutkan  : " + Arrays.toString(dataUrut));
    }
}