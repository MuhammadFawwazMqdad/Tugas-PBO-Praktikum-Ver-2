package PBO_Tugas6;

import java.util.Scanner;

class PekerjaThread extends Thread {

    String namaThread;

    PekerjaThread(String namaThread) {
        this.namaThread = namaThread;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(namaThread + " menjalankan tugas ke-" + i);
            try {
                Thread.sleep(250);
            } catch(InterruptedException e) {
                System.out.println(namaThread + " terganggu");
            }
        }
    }
}

public class banyakThread {

    Scanner sc = new Scanner(System.in);
    int jumlahThread;

    void input(){

        System.out.println("--PROGRAM MULTITHREADING DINAMIS--");
        System.out.print("Masukkan jumlah thread yang diinginkan : ");
        jumlahThread = sc.nextInt();
    }
    void tampil(){

        input();
        PekerjaThread[] daftarThread = new PekerjaThread[jumlahThread];

        for(int i = 0; i < jumlahThread; i++) {
            daftarThread[i] = new PekerjaThread("Thread-" + (i + 1));
            daftarThread[i].start();
        }

        for(int i = 0; i < jumlahThread; i++) {
            try {
                daftarThread[i].join();
            } catch(InterruptedException e) {
                System.out.println("Thread terganggu");
            }
        }
        System.out.println("Semua (" + jumlahThread + ") thread telah selesai dijalankan");
    }
}