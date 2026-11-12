public class Soal5 {

    public void jalankan() {
        System.out.println("=== Soal 5: Half Triangle dan Full Triangle ===");

        int baris = 5;

        // ---------- Half Triangle ----------
        System.out.println("Half Triangle");
        for (int i = 1; i <= baris; i++) {
            for (int spasi = 1; spasi <= baris - i; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // ---------- Full Triangle ----------
        System.out.println("Full Triangle");
        int tengah = (baris + 1) / 2;   // baris paling lebar
        int lebarMaks = 2 * tengah - 1; // jumlah bintang di baris tengah

        for (int i = 1; i <= baris; i++) {
            int jumlahBintang;
            if (i <= tengah) {
                jumlahBintang = 2 * i - 1;
            } else {
                jumlahBintang = 2 * (baris - i + 1) - 1;
            }

            int jumlahSpasi = (lebarMaks - jumlahBintang) / 2;

            for (int spasi = 1; spasi <= jumlahSpasi; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= jumlahBintang; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
