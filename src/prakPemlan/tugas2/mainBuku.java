package prakPemlan.tugas2;

import java.util.Scanner;
public class mainBuku {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Buku[] bukuTeknologi = new Buku[5];
        Buku[] bukuFilsafat = new Buku[5];
        Buku[] bukuSejarah = new Buku[5];
        Buku[] bukuAgama = new Buku[5];
        Buku[] bukuPsikologi = new Buku[5];
        Buku[] bukuPolitik = new Buku[5];
        Buku[] bukuFiksi = new Buku[5];

        // nama buku, penulis, tahun terbit, penerbit, ISBN, jumlah halaman buku, sinopsis
        // TEKNOLOGI
        bukuTeknologi[0] = new Buku("Pengantar Teknologi Informatika Dan Komunikasi Data","Bagaskoro","2019","Deepublish","9786232099418","134", "");
        bukuTeknologi[1] = new Buku("Teknologi Informasi: Aplikasi dan Penerapannya","Janner Simarmata","2020","Yayasan Kita Menulis","9786236512920","130", "");
        bukuTeknologi[2] = new Buku("Cyber Society: Teknologi, Media Baru, dan Disrupsi Informasi","Catur Nugroho","2020","Prenada Media","9786232187412","176", "");
        bukuTeknologi[3] = new Buku("Teknologi Big Data: Sistem Canggih di Balik Google, Yahoo!, Facebook, IBM","Wayan M. Wijaya","2019","Nilacakra","9786025375873","244", "");
        bukuTeknologi[4] = new Buku("Roadmap Broadband Indonesia Menuju Era Teknologi 5G","Denny Kusuma Hendraningrat","2017","Elex Media Komputindo","9786020446998","196", "");

        // FILSAFAT
        bukuFilsafat[0] = new Buku("Filsafat Ilmu","C.A. van Peursen Kencana","2014","Universitas Brawijaya Press","9786022032656","169", "");
        bukuFilsafat[1] = new Buku("Etika Nikomakea","Aristoteles, Ratih Dwi Astuti (penerjemah)","2020","BASABASI","9786233050036","369", "");
        bukuFilsafat[2] = new Buku("Filsafat Periode Socrates","Frederick Copleston, Atollah Renanda Yafi (penerjemah)","2020","BASABASI","9786233050029","104", "");
        bukuFilsafat[3] = new Buku("Filsafat Moral: Pergumulan Etis Keseharian Hidup Manusia","Agustinus W. Dewantara","2017","Pt Kanisius","9789792152951","128", "");
        bukuFilsafat[4] = new Buku("Filsafat Pancasila Menurut Bung Karno","Ir. Sukarno","2019","Media Pressindo","9786025752803","338", "");

        // SEJARAH
        bukuSejarah[0] = new Buku("Geografi Sejarah Indonesia","Yulia Siska","2017","Garudhawaca","9786026581372","286", "");
        bukuSejarah[1] = new Buku("Sejarah Dunia yang Disembunyikan","Jonathan Black","2015","Pustaka Alvabet","9786029193671","636", "");
        bukuSejarah[2] = new Buku("Sejarah Terlengkap Peradaban Dunia","Rizem Aizid","2018","NOKTAH","9786025781018","604", "");
        bukuSejarah[3] = new Buku("Sejarah Lengkap Perang Dunia 1 (1914-1918)","Alfi Arifian","2020","Anak Hebat Indonesia","9786232443464","336", "");
        bukuSejarah[4] = new Buku("Perang Salib Timur dan Barat","Jati Pamungkas","2018","Anak Hebat Indonesia","9786234000108","244", "");

        // AGAMA
        bukuAgama[0] = new Buku("Mengenal Agama Manusia: Mempelajari dan Memahami Agama-agama Manusia Untuk Menciptakan Ketentraman dan Rasa Solidaritas","Jonar Situmorang","2021","PBMR ANDI","9789792995640","554", "");
        bukuAgama[1] = new Buku("Kristen Bertanya Muslim Menjawab","Ahmad Nurcholish","2020","PT Elex Media Komputindo","9786230013843","554", "");
        bukuAgama[2] = new Buku("Muslim Bertanya Kristen Menjawab","Christian W. Troll","2013","PT Elex Media Komputindo","9786020217154","226", "");
        bukuAgama[3] = new Buku("Memahami Yang Disalahpahami","Ardiansyah","2021","Elex Media Komputindo","9786230029493","200", "");
        bukuAgama[4] = new Buku("Buddha","Karen Armstrong","2004","Penguin Publishing Group","9780143034360","240", "");

        // PSIKOLOGI
        bukuPsikologi[0] = new Buku("Teori Psikologi Kepribadian Manusia","Nur Fatwikiningsih","2020","Penerbit Andi","9786230106866","352", "");
        bukuPsikologi[1] = new Buku("Psikologi Kepribadian: Menyelam Misteri Kepribadian Manusia","Lynn Wilcox","2018","DIVA PRESS","9786027696648","412", "");
        bukuPsikologi[2] = new Buku("Refleksi, Diskresi, dan Narasi: Sejarah Perjumpaan dengan Psikologi","A. Harimurti","2021","Sanata Dharma University Press","978623610326","337", "");
        bukuPsikologi[3] = new Buku("Psikologi Pengembangan","Rustam","2016","Pustaka Rumah Aloy","9786027479791","166", "");
        bukuPsikologi[4] = new Buku("Dinamika Kelompok: Pendekatan Psikologi Sosial","Daniel Purwoko Budi Susetyo","2021","SCU Knowledge Media","9786237635642","176", "");

        // POLITIK
        bukuPolitik[0] = new Buku("Politik Parole: Dari Supersemar hingga HTI dan Hal Kontemporer","Hartanto","2020","LPMI","9786239302160","289", "");
        bukuPolitik[1] = new Buku("Ilmu Politik Hukum Dari Masa Ke Masa","T. Mangaranap Sirait","2021","Deepublish","9786230230905","102", "");
        bukuPolitik[2] = new Buku("Komunikasi Politik dan Perilaku Golput","Roso Prajoko","2020","Penerbit Lakeisha","9786236573587","136", "");
        bukuPolitik[3] = new Buku("Opini Politik Kaum Muda","Muhammad Handy Dwi Wijaya","2022","Media Nusa Creative (MNC Publishing)","9786026931146","212", "");
        bukuPolitik[4] = new Buku("Sang Pangeran - Risalah Politik Abad Ke 15","Niccolo Machiavelli","2014","Elex Media Komputindo","9786020231877","295", "");

        // FIKSI
        bukuFiksi[0] = new Buku("Matahari Minor","Tere Liye","2022","Tere Liye","9786239987893","361", "");
        bukuFiksi[1] = new Buku("Harry Potter 7: Harry Potter dan Relikui Kematian","J.k. Rowling","2018","Gramedia Pustaka Utama","9786020379791","997", "");
        bukuFiksi[2] = new Buku("Murder On The Orient Express ( Pembunuhan Di Orient Express )","Agatha Christie","2017","Gramedia Pustaka Utama","9789792229806","360", "");
        bukuFiksi[3] = new Buku("Milea: suara dari Dilan","Pidi Baiq","2016","PT Mizan Pustaka","9786020851563","357", "");
        bukuFiksi[4] = new Buku("The Hunger Games","Suzanne Collins","2012","Gramedia Pustaka Utama","9789792250756","406", "");


        System.out.println("=================|PERPUSTAKAAN|=================");
        System.out.println("Kategori buku: ");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
        System.out.println("8. Total Buku yang ada");
        System.out.print("Pilihan anda: ");
        int pilih = in.nextInt();
        System.out.println();
        switch (pilih) {
            case 1: setBuku("TEKNOLOGI");
                break;
            case 2: setBuku("FILSAFAT");
                break;
            case 3: setBuku("SEJARAH");
                break;
            case 4: setBuku("AGAMA");
                break;
            case 5: setBuku("PSIKOLOGI");
                break;
            case 6: setBuku("POLITIK");
                break;
            case 7: setBuku("FIKSI");
                break;
            case 8: System.out.printf("Total buku ada: %d", bukuTeknologi.length + bukuFilsafat.length + bukuSejarah.length + bukuAgama.length + bukuPsikologi.length + bukuPolitik.length + bukuFiksi.length);
            default:
                if (pilih >= 9) {
                    System.out.println("PROGRAM BERAKHIR! anda memasukkan kode yang salah");
                } break;
        }
    }
    public static void setBuku(String pilihanKategori){
        Buku n = new Buku();
        n.setKategori(pilihanKategori);
        n.tampilkanKategori();
        for(int i = 0; i < bukuTeknologi.length; i++) {
            n.tampilkan();
        }
    }
}