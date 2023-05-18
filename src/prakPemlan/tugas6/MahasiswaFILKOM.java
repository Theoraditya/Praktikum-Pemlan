package prakPemlan.tugas6;

public class MahasiswaFILKOM extends Manusia {
    private String NIM ;
    private double IPK ;
    MahasiswaFILKOM(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah ) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM ;
        this.IPK = IPK ;
    }

    public double getIPK() {
        return IPK;
    }
    public String getNIM() {
        return NIM;
    }
    public double getBeasiswa(){
        if(getIPK() >= 3.0 && 3.5 >= getIPK()){
            return getTunjangan() + 50 ;
        }
        else if (getIPK() > 3.5){
            return getTunjangan() + 75 ;
        }
        else{
            return getTunjangan() ;
        }
    }
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa() - getTunjangan();
    }
    public String getStatus(){
        String newProdi = "";
        String angkatan = getNIM().substring(0,2);
        String prodi = getNIM().substring(6,7);
        switch (Integer.parseInt(prodi)) {
            case 2 -> newProdi = "Teknik Informatika";
            case 3 -> newProdi = "Teknik Komputer";
            case 4 -> newProdi = "Sistem Informasi";
            case 6 -> newProdi = "Pendidikan Teknologi Informasi";
            case 7 -> newProdi = "Teknologi Informasi";
        }
        return (newProdi + ", " + "20" + angkatan);
    }
    public String toString() {
        return (super.toString() +
                "NIM           : " + getNIM() +
                "\n" +
                "IPK           : " + getIPK() +
                "\n" +
                "Status        : " + getStatus()
        );
    } }
