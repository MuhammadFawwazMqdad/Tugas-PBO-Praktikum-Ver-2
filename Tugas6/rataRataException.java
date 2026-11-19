package PBO_Tugas6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class rataRataException {

    Scanner sc = new Scanner(System.in);
    int jumlah;
    double[] bilangan;
    double total, rataRata;

    void input(){

        System.out.println("--RATA-RATA BILANGAN (EXCEPTION HANDLING)--");
        while(true) {
            try {
                System.out.print("Masukkan jumlah bilangan : ");
                jumlah = sc.nextInt();
                if(jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }
                break;
            } catch(InputMismatchException e) {
                System.out.println("Error : Input harus berupa bilangan bulat!");
                sc.nextLine();
            }
        }

        bilangan = new double[jumlah];
        for(int i = 0; i < jumlah; i++) {
            while(true) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + " : ");
                    bilangan[i] = sc.nextDouble();
                    break;
                } catch(InputMismatchException e) {
                    System.out.println("Error : Input bukan bilangan! Silakan masukkan angka.");
                    sc.nextLine();
                }
            }
        }
    }
    void hitung(){

        total = 0;
        for(int i = 0; i < jumlah; i++) {
            total += bilangan[i];
        }
        rataRata = total / jumlah;
    }
    void tampil(){

        input();
        hitung();
        System.out.println();
        System.out.println("--HASIL PERHITUNGAN RATA-RATA--");
        System.out.println("Data Bilangan : " + Arrays.toString(bilangan));
        System.out.println("Total         : " + total);
        System.out.printf("Rata-Rata     : %.2f%n", rataRata);
    }
}