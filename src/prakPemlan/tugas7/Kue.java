package prakPemlan.tugas7;

abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return nama + " ==> Rp" + hitungHarga();
    }
}

class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }
    public double getBerat () {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return harga * berat;
    }
}

class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }
    public double getJumlah() {
        return jumlah;
    }
    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }
}
