package prakPemlan.tugas1;

public class Buku {
    private String kategoriBuku, namaBuku, penulis, tahunTerbit, penerbit, ISBN, jumlahHal;

    public void setKategori(String kategoriBuku){
        this.kategoriBuku = kategoriBuku;
    }
    public String getKategori(){
        return kategoriBuku;
    }
    public void setNamaBuku(String namaBuku){
        this.namaBuku = namaBuku;
    }
    public String getNamaBuku(){
        return namaBuku;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public String getPenulis(){
        return penulis;
    }
    public void setTahun(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public String getTahun(){
        return tahunTerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public void setISBNBuku(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBNBuku (){
        return ISBN;
    }
    public void setHalaman(String jumlahHal) {
        this.jumlahHal = jumlahHal;
    }
    public String getHalaman(){
        return jumlahHal;
    }
    public void tampilkanKategori(){
        System.out.printf("============|KATEGORI BUKU %s|============\n", kategoriBuku);
    }
    public void tampilkan(){
        System.out.printf("1. Nama Buku      : %s \n", getNamaBuku());
        System.out.printf("2. Nama Penulis   : %s \n", getPenulis());
        System.out.printf("3. Tahun Terbit   : %s \n", getTahun());
        System.out.printf("4. Penerbit       : %s \n", getPenerbit());
        System.out.printf("5. ISBN           : %s \n", getISBNBuku());
        System.out.printf("6. Jumlah Halaman : %s \n", getHalaman());
        System.out.println();
    }
}
