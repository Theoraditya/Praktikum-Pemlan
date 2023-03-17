package prakPemlan.tugas1;

public class Buku {
    private String kategoriBuku, namaBuku, penulis, tahunTerbit, penerbit, ISBN, jumlahHal;

    public void setKategori(String kategoriBuku){
        this.kategoriBuku = kategoriBuku;
    }
    public void setNamaBuku(String namaBuku){
        this.namaBuku = namaBuku;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void setTahun(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public void setISBNBuku(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setHalaman(String jumlahHal) {
        this.jumlahHal = jumlahHal;
    }

    public void tampilkanKategori(){
        System.out.printf("============|KATEGORI BUKU %s|============\n", kategoriBuku);
    }
    public void tampilkan(){
        System.out.printf("1. Nama Buku      : %s \n", namaBuku);
        System.out.printf("2. Nama Penulis   : %s \n", penulis);
        System.out.printf("3. Tahun Terbit   : %s \n", tahunTerbit);
        System.out.printf("4. Penerbit       : %s \n", penerbit);
        System.out.printf("5. ISBN           : %s \n", ISBN);
        System.out.printf("6. Jumlah Halaman : %s \n", jumlahHal);
        System.out.println();
    }
}
