package PBO_Tugas6;

import java.util.Scanner;

public class daftarNilaiMahasiswa {

    Scanner sc = new Scanner(System.in);
    int jumlah;
    String[] nama, status;
    int[] nilai;

    void input(){

        System.out.println("--INPUT DATA NILAI MAHASISWA--");
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        sc.nextLine();

        nama = new String[jumlah];
        nilai = new int[jumlah];
        status = new String[jumlah];

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = sc.nextInt();
            sc.nextLine();
        }
    }
    void hitung(){

        for(int i = 0; i < jumlah; i++) {
            if(nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }
    }
    void tampil(){

        input();
        hitung();
        System.out.println();
        System.out.println("                  Daftar Nilai Mahasiswa");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-8s%-24s%-12s%s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("----------------------------------------------------------");
        for(int i = 0; i < jumlah; i++) {
            System.out.printf("%-8d%-24s%-12d%s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("----------------------------------------------------------");
    }
}