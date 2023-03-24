package prakPemlan.tugas2;

public class Buku {
    private String namaBuku, penulis, tahunTerbit, penerbit, ISBN, jumlahHal, sinopsis;

    public Buku (String namaBuku, String penulis, String tahunTerbit, String penerbit, String ISBN, String jumlahHal, String sinopsis){
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.ISBN = ISBN;
        this.jumlahHal = jumlahHal;
        this.sinopsis = sinopsis;
    }

    public int hitungKata(String jmlSinopsis){
        boolean Spasi = true;
        int jmlKata = 0;
        for(int i = 0; i < jmlSinopsis.length(); i++){
            if(jmlSinopsis.charAt(i) == ' ')
                Spasi = true;
            else{
                if(Spasi) jmlKata++;
                Spasi = false;
            }
        }
        return jmlKata;
    }
    void tampilkan(){
        System.out.printf("1. Nama Buku         : %s \n", namaBuku);
        System.out.printf("2. Nama Penulis      : %s \n", penulis);
        System.out.printf("3. Tahun Terbit      : %s \n", tahunTerbit);
        System.out.printf("4. Penerbit          : %s \n", penerbit);
        System.out.printf("5. ISBN              : %s \n", ISBN);
        System.out.printf("6. Jumlah Halaman    : %s \n", jumlahHal);
        System.out.printf("7. Sinopsis          : %s \n", sinopsis);
        System.out.printf("Jumlah Kata Sinopsis : %s \n", hitungKata(sinopsis));
        System.out.println();
    }
}
