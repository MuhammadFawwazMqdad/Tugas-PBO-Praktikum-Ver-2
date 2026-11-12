import java.util.Scanner;

public class Soal2 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 2: Total dan Rata-rata ===");

        System.out.print("Masukkan jumlah bilangan : ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0!");
            return;
        }

        int total = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int bilangan = input.nextInt();
            total += bilangan;
        }

        double rataRata = (double) total / jumlah;

        System.out.println("Total jumlah bilangan : " + total);
        System.out.println("Rata-rata             : " + rataRata);
    }
}
