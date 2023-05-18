package prakPemlan.tugas6;

public class Manager extends Pekerja {
    private String departemen ;
    Manager(String departemen,double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, NIK, jenisKelamin, menikah);
        this.departemen = departemen ;
    }
    public String getDepartemen() {
        return departemen;
    }
    public double getGaji2() {
        return super.getGaji()*0.1;
    }
    public double getTunjangan() {
        return super.getTunjangan() + getGaji2();
    }
    public String toString() {
        return ( super.toString() + "Departemen    : " + getDepartemen());
    } }