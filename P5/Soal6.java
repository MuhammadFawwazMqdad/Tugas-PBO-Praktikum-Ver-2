public class Soal6 {

    public void jalankan() {
        System.out.println("=== Soal 6: Tampilkan angka 11 sebanyak dua kali ===");

        int i;
        for (i = 0; i < 10; i++) {
            // bagian yang dilengkapi:
            // i % 5 == 0 hanya benar saat i = 0 dan i = 5, jadi tercetak 2x
            if (i % 5 == 0) {
                System.out.println(11);
            }
        }
    }
}
