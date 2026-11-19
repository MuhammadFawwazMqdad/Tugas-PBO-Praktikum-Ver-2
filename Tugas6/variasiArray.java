package PBO_Tugas6;

import java.util.Arrays;

public class variasiArray {

    int[] array1 = new int[3];

    int array2[];

    int[] array3 = {10, 20, 30, 40};

    void hitung(){

        // Mengisi nilai variasi 1
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        // Instansiasi dan pengisian variasi 2
        array2 = new int[]{5, 15, 25};
    }
    void tampil(){

        hitung();
        System.out.println("--VARIASI SYNTAKS ARRAY INTEGER--");
        System.out.println("Variasi 1 (int[] a = new int[3])     : " + Arrays.toString(array1));
        System.out.println("Variasi 2 (int a[]; a = new int[]{}) : " + Arrays.toString(array2));
        System.out.println("Variasi 3 (int[] a = {10, 20, ...})  : " + Arrays.toString(array3));
    }
}