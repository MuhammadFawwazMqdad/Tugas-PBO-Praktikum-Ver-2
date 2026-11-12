import java.util.Scanner;

public class Soal3 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 3: Floyd's Triangle ===");

        System.out.print("Masukkan banyak baris : ");
        int banyakBaris = input.nextInt();

        int angka = 1;

        for (int baris = 1; baris <= banyakBaris; baris++) {
            // jumlah angka tiap baris = nomor barisnya
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
