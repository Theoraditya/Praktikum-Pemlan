package prakPemlan.tugas6;

import java.time.LocalDate;
public class Pekerja extends Manusia{
    private double gaji ;
    private LocalDate tahunMasuk ;
    private int jumlahAnak ;
    Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji ;
        this.tahunMasuk = LocalDate.of(tahun,bulan,hari) ;
        this.jumlahAnak = jumlahAnak ;
    }
    public double getGaji() {
        return gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public double getBonus(){
        if(2022 - tahunMasuk.getYear() <= 5){
            return 0.05 * getGaji();
        }
        else if (2022 - tahunMasuk.getYear() <= 10){
            return 0.1 * getGaji();
        }
        else {
            return 0.15 * getGaji();
        }
    }
    public double getTunjangan() {
        return super.getTunjangan() + getJumlahAnak() * 20;
    }
    public double getPendapatan() {
        return getTunjangan() + getBonus() + getGaji();
    }
    public String toString() {
        return (super.toString() +
                "Tahun Masuk   : " + getTahunMasuk().getDayOfMonth() + " "
                + getTahunMasuk().getMonthValue() + " " + getTahunMasuk().getYear() +
                "\n" +
                "Jumlah Anak   : " + getJumlahAnak() +
                "\n" +
                "Gaji          : $" + getGaji() +
                "\n"
        );
    } }
