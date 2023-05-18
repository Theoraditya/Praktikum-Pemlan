package prakPemlan.tugas6;

public class Manusia {
    private String nama ;
    private boolean jenisKelamin ;
    private String NIK ;
    private boolean menikah ;
    Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama ;
        this.jenisKelamin = jenisKelamin ;
        this.NIK = NIK ;
        this.menikah = menikah ;
    }
    public String getNama() {
        return nama;
    }
    public String getNIK() {
        return NIK;
    }
    public boolean isJenisKelamin() {
        return jenisKelamin;
    }
    public boolean isMenikah() {
        return menikah;
    }
    public double getTunjangan(){
        if(isMenikah()){
            if(isJenisKelamin()){
                return 25 ;
            }
            else {
                return 20 ;
            }
        }
        else{
            return 15 ;
        }
    }
    public double getPendapatan(){
        return getTunjangan() ;
    }
    public String kelamin (){
        if(isJenisKelamin()){
            return("Laki-laki");
        }
        else{
            return ("Perempuan");
        }
    }
    public String toString(){
        return( "Nama          : " + getNama() +
                "\n" +
                "NIK           : " + getNIK() +
                "\n" +
                "Jenis Kelamin : " + kelamin() +
                "\n" +
                "Pendapatan    : $" + getPendapatan() +
                "\n" );
    }
}
