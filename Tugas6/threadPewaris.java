package PBO_Tugas6;

class ThreadAnak extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread anak berjalan -> hitungan ke-" + i);
            try {
                Thread.sleep(300);
            } catch(InterruptedException e) {
                System.out.println("Thread terganggu");
            }
        }
    }
}

public class threadPewaris {

    void tampil(){

        System.out.println("--PROGRAM PEWARISAN CLASS THREAD--");
        ThreadAnak t1 = new ThreadAnak();
        t1.start();

        try {
            t1.join();
        } catch(InterruptedException e) {
            System.out.println("Thread utama terganggu");
        }
        System.out.println("Eksekusi thread selesai");
    }
}