package PBO_Tugas6;

import java.util.Scanner;

public class TampilData {

    Scanner sc = new Scanner(System.in);
    int input;

    void input(){

        System.out.println("--MENU TUGAS--");
        System.out.println("--PILIH TUGAS--");
        System.out.println("Nomor 1");
        System.out.println("Nomor 2");
        System.out.println("Nomor 3");
        System.out.println("Nomor 4");
        System.out.println("Nomor 5");
        System.out.println("Nomor 6");
        System.out.println("Nomor 7");
        System.out.println("Nomor 8");
        System.out.println("Nomor 9");
        System.out.println("Nomor 10");
        System.out.println("Ketik 0 untuk keluar");
        System.out.print("Input : ");
        input = sc.nextInt();
    }
    void tampil(){

        do{
            input();
            if(input == 1) {
                new variasiArray().tampil();
            } else if(input == 2) {
                new ubahArrayMobil().tampil();
            } else if(input == 3) {
                new operasiArray().tampil();
            } else if(input == 4) {
                new daftarNilaiMahasiswa().tampil();
            } else if(input == 5) {
                new penjumlahanMatriks().tampil();
            } else if(input == 6) {
                new rataRataException().tampil();
            } else if(input == 7) {
                new threadPewaris().tampil();
            } else if(input == 8) {
                new banyakThread().tampil();
            } else if(input == 9) {
                new perulanganArray().tampil();
            } else if(input == 10) {
                new arrayMultiTipe().tampil();
            } else if(input == 0) {
                System.out.println("Sip ah nuhun bos");
            } else {
                System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        }while(input != 0);
    }
}