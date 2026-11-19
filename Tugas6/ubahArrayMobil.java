package PBO_Tugas6;

import java.util.Arrays;
import java.util.Scanner;

public class ubahArrayMobil {

    Scanner sc = new Scanner(System.in);
    String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
    String mobilBaru;
    int indeksUbah = -1;

    void input(){

        System.out.println("--UBAH NILAI ARRAY MOBIL--");
        System.out.println("Data awal array : " + Arrays.toString(mobil));
        System.out.print("Masukkan nilai pengganti Suzuki : ");
        mobilBaru = sc.nextLine();
    }
    void hitung(){

        for(int i = 0; i < mobil.length; i++) {
            if(mobil[i].equals("Suzuki")) {
                indeksUbah = i;
                mobil[i] = mobilBaru;
                break;
            }
        }
    }
    void tampil(){

        input();
        hitung();
        System.out.println();
        System.out.println("--HASIL PERUBAHAN ARRAY--");
        if(indeksUbah != -1) {
            System.out.println("Indeks yang diubah : " + indeksUbah);
            System.out.println("Nilai indeks baru  : " + mobil[indeksUbah]);
            System.out.println("Data array terbaru : " + Arrays.toString(mobil));
        } else {
            System.out.println("Data Suzuki tidak ditemukan");
        }
    }
}