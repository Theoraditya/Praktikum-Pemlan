package prakPemlan.tugas6;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============[DATA CIVITAS FILKOM UB]==============");
        // Laki-laki telah menikah
        Manusia manusia1 = new Manusia("Jamal", "306413", true, true);
        System.out.println(manusia1);
        System.out.println("====================================================");

        //Perempuan telah menikah
        Manusia manusia2 = new Manusia("Ayu", "306424", false, true);
        System.out.println(manusia2);
        System.out.println("====================================================");

        //Belum menikah
        Manusia manusia3 = new Manusia("Rafan", "307434", true, false);
        System.out.println(manusia3);
        System.out.println("====================================================");

        //Ipk < 3
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("2251503001111035", 2.5, "Akmal", "317409", false, false);
        System.out.println(mhs1);
        System.out.println("====================================================");

        //Ipk 3 – 3.5
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("225150207111033", 3.2, "Aji", "317490", true, false);
        System.out.println(mhs2);
        System.out.println("====================================================");

        //Ipk 3.5 – 4
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("225150701111030", 3.8, "Theo", "317307", false, false);
        System.out.println(mhs3);
        System.out.println("====================================================");

        //Lama bekerja 2 tahun, anak 2
        Pekerja pekerja1 = new Pekerja(1000, 2020, 3, 11, 2, "Ramadhan", "306765", true, true);
        System.out.println(pekerja1);
        System.out.println("====================================================");

        //Lama bekerja 9 tahun
        Pekerja pekerja2 = new Pekerja(1000, 2013, 5, 28, 0, "Kidut", "306879", false, false);
        System.out.println(pekerja2);
        System.out.println("====================================================");

        //Lama bekerja 20 tahun, anak 10
        Pekerja pekerja3 = new Pekerja(1000, 2002, 1, 1, 10, "Deo", "306565", false, true);
        System.out.println(pekerja3);
        System.out.println("====================================================");

        //Lama bekerja 15 tahun dengan gaji $7500
        Manager manager1 = new Manager("HRD", 7500, 2007, 1, 2, 0, "Vajar", "306878", true, false);
        System.out.println(manager1);
        System.out.println("====================================================");
    }
}
