package PBO_Tugas6;

public class arrayMultiTipe {

    // Menggunakan tipe Object[] agar dapat menampung berbagai tipe data
    Object[] data = {19, 0.2, 'C', "Java", true};

    void tampil(){

        System.out.println("--ARRAY MULTI TIPE DATA (OBJECT)--");
        System.out.println("Sintaks : Object[] data = {19, 0.2, 'C', \"Java\", true};");
        System.out.println();
        for(int i = 0; i < data.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + data[i] + " (" + data[i].getClass().getSimpleName() + ")");
        }
    }
}