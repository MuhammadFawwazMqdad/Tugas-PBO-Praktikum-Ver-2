package PBO_Tugas6;

import java.util.Scanner;

public class penjumlahanMatriks {

    Scanner sc = new Scanner(System.in);
    int baris, kolom;
    int[][] matriksA, matriksB, hasil;

    void input(){

        System.out.println("--PROGRAM PENJUMLAHAN MATRIKS--");
        System.out.print("Masukkan jumlah baris : ");
        baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        kolom = sc.nextInt();

        matriksA = new int[baris][kolom];
        matriksB = new int[baris][kolom];
        hasil = new int[baris][kolom];

        System.out.println("--INPUT MATRIKS A--");
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.print("Matriks A [" + i + "][" + j + "] : ");
                matriksA[i][j] = sc.nextInt();
            }
        }

        System.out.println("--INPUT MATRIKS B--");
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.print("Matriks B [" + i + "][" + j + "] : ");
                matriksB[i][j] = sc.nextInt();
            }
        }
    }
    void hitung(){

        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
    }
    void tampil(){

        input();
        hitung();
        System.out.println();
        System.out.println("--HASIL PENJUMLAHAN MATRIKS--");
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}