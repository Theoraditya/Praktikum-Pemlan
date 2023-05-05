package prakPemlan.tugas4;

import java.util.Scanner;

public class mainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("================[ TOKO LABKOMDAS ]================");
        System.out.println("PILIH TIPE JAKET");
        System.out.println("1. Jaket A ===> Rp100.000,00");
        System.out.println("2. Jaket B ===> Rp125.000,00");
        System.out.println("3. Jaket C ===> Rp175.000,00");
        System.out.println("NB: membeli jaket lebih dari 100 buah dapat diskon Rp5.000,00 per buah");
        System.out.print("Masukkan kode tipe jaket pilihan      : ");
        Byte pilihan = in.nextByte();
        System.out.print("Jumlah jaket yang dipesan             : ");
        int jumlah = in.nextInt();
        System.out.println("==================================================");
        Jaket pesanan = new Jaket(pilihan, jumlah);
        pesanan.display();
    }
}