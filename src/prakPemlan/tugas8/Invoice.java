package prakPemlan.tugas8;

class Invoice implements Payable {
    private String namaProduk;
    private Integer jumlah;
    private Double harga;

    public Invoice(String namaProduk, Integer jumlah, Double harga) {
        this.namaProduk = namaProduk;
        this.jumlah= jumlah;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public Double getHarga() {
        return harga;
    }

    @Override
    public double getPayableAmount() {
        return jumlah * harga;
    }
}
