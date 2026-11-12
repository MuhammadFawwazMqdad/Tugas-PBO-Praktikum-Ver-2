import java.util.Scanner;

public class Soal1 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 1: Bilangan Terbesar dan Terkecil ===");

        int terbesar = 0;
        int terkecil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int bilangan = input.nextInt();

            if (i == 1) {
                // bilangan pertama jadi acuan awal
                terbesar = bilangan;
                terkecil = bilangan;
            } else {
                if (bilangan > terbesar) {
                    terbesar = bilangan;
                }
                if (bilangan < terkecil) {
                    terkecil = bilangan;
                }
            }
        }

        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}
