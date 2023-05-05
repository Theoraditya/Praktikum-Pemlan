package prakPemlan.tugas4;

public class Jaket {
    Byte pilihan;
    int harga, jumlah;
    final int jaketA = 100000, jaketB = 125000, jaketC = 175000;
    public Jaket (Byte pilihan, int jumlah){
        this.pilihan = pilihan;
        this.jumlah = jumlah;
    }
    void hargaJA(){
        if (jumlah>100)
            harga = jumlah * 95000;
        else
            harga = jaketA;
    }
    void hargaJB(){
        if (jumlah>100)
            harga = jumlah * 120000;
        else
            harga = jaketB;
    }
    void hargaJC(){
        if (jumlah>100)
            harga = jumlah * 160000;
        else
            harga = jaketC;
    }

    void setPesanan(){
        String tipeJaket = null;
        if (pilihan == 1)
            tipeJaket = "Jaket A";
        else if (pilihan == 2) {
            tipeJaket = "Jaket B";
        } else if (pilihan == 3) {
            tipeJaket = "Jaket C";
        }
        System.out.println("BUKTI PEMBAYARAN");
        System.out.println("Jenis jaket        : " + tipeJaket);
        System.out.println("Jumlah pesanan     : " + jumlah + " buah");
        System.out.println("Harga satuan       : Rp" + harga);
        System.out.println("Total harga        : Rp" + harga * jumlah);
        System.out.println("==================================================");
        System.out.println("=================[ TERIMA KASIH ]=================");
        System.out.println("==================================================");
    }
    void display(){
        if (pilihan == 1) {
            hargaJA();
            setPesanan();
        }
        else if (pilihan == 2) {
            hargaJB();
            setPesanan();
        }
        else if (pilihan == 3) {
            hargaJC();
            setPesanan();
        }
        else System.out.println("ERROR : Kode yang anda masukkan tidak ada di katalog");
    }
}