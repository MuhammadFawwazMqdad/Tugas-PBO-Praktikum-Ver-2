package PBO_Tugas6;

public class perulanganArray {

    int[] age = {12, 4, 5, 2, 6};

    void tampil(){

        System.out.println("--DUA MACAM PERULANGAN ARRAY--");

        // Macam 1: Perulangan for biasa menggunakan indeks
        System.out.print("1. Perulangan for biasa : ");
        for(int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println();

        // Macam 2: Perulangan for-each
        System.out.print("2. Perulangan for-each  : ");
        for(int nilai : age) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}