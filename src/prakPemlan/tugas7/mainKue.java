package prakPemlan.tugas7;

public class mainKue {
    public static void main(String[] args) {
        Kue[] kue = new Kue[20];
        kue[0] = new KuePesanan("Kue Bolu", 2000, 30);
        kue[1] = new KuePesanan("Kue Cucur", 1000, 0.5);
        kue[2] = new KuePesanan("Lemper", 3000, 2);
        kue[3] = new KuePesanan("Gethuk", 5000, 0.7);
        kue[4] = new KuePesanan("Bakpia", 5000, 5);
        kue[5] = new KuePesanan("Klepon", 500, 0.5);
        kue[6] = new KuePesanan("Serabi", 5000, 1);
        kue[7] = new KuePesanan("Bika Ambon", 3000, 40);
        kue[8] = new KuePesanan("Nagasari", 1000, 0.5);
        kue[9] = new KuePesanan("Lumpia", 3000, 2);
        kue[10] = new KueJadi("Risol", 5000, 2);
        kue[11] = new KueJadi("Pastel", 10000, 4);
        kue[12] = new KueJadi("Dadar Gulung", 2000, 3);
        kue[13] = new KueJadi("Lupis", 8000, 5);
        kue[14] = new KueJadi("Onde-onde", 5000, 7);
        kue[15] = new KueJadi("Mendut", 1000, 2);
        kue[16] = new KueJadi("Kue Cenil", 500, 2);
        kue[17] = new KueJadi("Kue Talam", 1500, 3);
        kue[18] = new KueJadi("Wajik", 3000, 6);
        kue[19] = new KueJadi("Kue Putu Ayu", 2500, 3);

        double totalHarga = 0;
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        double hargaTerbesar = 0;

        System.out.println("=================[ DAFTAR KUE ]=================");
        for (Kue value : kue) {
            // a. Tampilkan semua kue beserta jenis kuenya
            if (value instanceof KuePesanan) {
                System.out.println("Kue Pesanan: " + value);
            } else if (value instanceof KueJadi) {
                System.out.println("Kue Jadi: " + value);
            }

            // b. Hitung total harga dari semua jenis kue
            totalHarga += value.hitungHarga();

            // c. Hitung total harga dan total berat dari KuePesanan
            if (value instanceof KuePesanan) {
                totalHargaKuePesanan += value.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) value).getBerat();
            }

            // d. Hitung total harga dan total jumlah dari KueJadi
            if (value instanceof KueJadi) {
                totalHargaKueJadi += value.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) value).getJumlah();
            }

            // e. Tampilkan informasi kue dengan harga terbesar
            if (hargaTerbesar == 0){
                hargaTerbesar += value.hitungHarga();
            } else if (value.hitungHarga() >= hargaTerbesar){
                hargaTerbesar = value.hitungHarga();
            }

            value.toString();
        }

        System.out.println("\n" + "================================================");
        System.out.println("Total harga semua jenis kue     : Rp" + totalHarga
                  + "\n" + "Total harga Kue Pesanan         : Rp" + totalHargaKuePesanan
                  + "\n" + "Total berat Kue Pesanan         : " + totalBeratKuePesanan + "gr"
                  + "\n" + "Total harga Kue Jadi            : Rp" + totalHargaKueJadi
                  + "\n" + "Total jumlah Kue Jadi           : " + totalJumlahKueJadi
                  + "\n" + "Harga akhir terbesar            : Rp" + hargaTerbesar);
        System.out.println("================================================");
    }
}
