import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Soal1 soal1 = new Soal1();
        Soal2 soal2 = new Soal2();
        Soal3 soal3 = new Soal3();
        Soal4 soal4 = new Soal4();
        Soal5 soal5 = new Soal5();
        Soal6 soal6 = new Soal6();
        Soal7 soal7 = new Soal7();
        Soal8 soal8 = new Soal8();

        int pilihan;

        do {
            System.out.println("===== Latihan Praktikum Perulangan =====");
            System.out.println("1. Bilangan terbesar dan terkecil");
            System.out.println("2. Total dan rata-rata");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Angka ganjil");
            System.out.println("5. Half Triangle dan Full Triangle");
            System.out.println("6. Tampilkan angka 11 dua kali");
            System.out.println("7. Perbedaan i++ dan ++i");
            System.out.println("8. Foreach array");
            System.out.println("0. Keluar");
            System.out.print("Pilih soal : ");
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1: soal1.jalankan(input); break;
                case 2: soal2.jalankan(input); break;
                case 3: soal3.jalankan(input); break;
                case 4: soal4.jalankan(input); break;
                case 5: soal5.jalankan(); break;
                case 6: soal6.jalankan(); break;
                case 7: soal7.jalankan(); break;
                case 8: soal8.jalankan(); break;
                case 0: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak tersedia!");
            }
            System.out.println();
        } while (pilihan != 0);

        input.close();
    }
}
