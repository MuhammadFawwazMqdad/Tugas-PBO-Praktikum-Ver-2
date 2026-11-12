import java.util.Scanner;

public class Soal4 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 4: Angka Ganjil ===");

        System.out.print("Masukkan banyak angka : ");
        int banyakAngka = input.nextInt();

        int ganjil = 1;
        int total = 0;

        for (int i = 1; i <= banyakAngka; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2; // lompat ke bilangan ganjil berikutnya
        }

        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }
}
