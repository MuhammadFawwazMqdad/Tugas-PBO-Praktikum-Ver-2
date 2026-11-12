public class Soal7 {

    public void jalankan() {
        System.out.println("=== Soal 7: Perbedaan i++ dan ++i ===");

        // ---------- i++ (post-increment) ----------
        System.out.println("Menggunakan i++ (nilai dipakai dulu, baru ditambah)");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i++);
        }
        System.out.println("Nilai akhir i : " + i);

        System.out.println();

        // ---------- ++i (pre-increment) ----------
        System.out.println("Menggunakan ++i (ditambah dulu, baru nilai dipakai)");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + ++j);
        }
        System.out.println("Nilai akhir j : " + j);

        System.out.println();
        System.out.println("Kesimpulan:");
        System.out.println("- i++ menampilkan 0 sampai 4 (dicetak dulu, baru naik)");
        System.out.println("- ++i menampilkan 1 sampai 5 (naik dulu, baru dicetak)");
        System.out.println("- Nilai akhir keduanya sama, yang beda adalah nilai yang terbaca saat ekspresi dijalankan");
    }
}
