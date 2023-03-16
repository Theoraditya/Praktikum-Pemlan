package prakPemlan.tugas1;

import java.util.Scanner;

public class mainBuku {
    public static void main(String[] args) {
        int pilih;
        Scanner in = new Scanner (System.in);
        String [][] teknologi = {{"Pengantar Teknologi Informatika Dan Komunikasi Data","Bagaskoro","2019","Deepublish","9786232099418","134"},
                                {"Teknologi Informasi: Aplikasi dan Penerapannya","Janner Simarmata","2020","Yayasan Kita Menulis","9786236512920","130"},
                                {"Cyber Society: Teknologi, Media Baru, dan Disrupsi Informasi","Catur Nugroho","2020","Prenada Media","9786232187412","176"},
                                {"Teknologi Big Data: Sistem Canggih di Balik Google, Yahoo!, Facebook, IBM","Wayan M. Wijaya","2019","Nilacakra","9786025375873","244"},
                                {"Roadmap Broadband Indonesia Menuju Era Teknologi 5G","Denny Kusuma Hendraningrat","2017","Elex Media Komputindo","9786020446998","196"}};

        String [][] filsafat  = {{"Filsafat Ilmu","C.A. van Peursen Kencana","2014","Universitas Brawijaya Press","9786022032656","169"},
                                {"Etika Nikomakea","Aristoteles, Ratih Dwi Astuti (penerjemah)","2020","BASABASI","9786233050036","369"},
                                {"Filsafat Periode Socrates","Frederick Copleston, Atollah Renanda Yafi (penerjemah)","2020","BASABASI","9786233050029","104"},
                                {"Filsafat Moral: Pergumulan Etis Keseharian Hidup Manusia","Agustinus W. Dewantara","2017","Pt Kanisius","9789792152951","128"},
                                {"Filsafat Pancasila Menurut Bung Karno","Ir. Sukarno","2019","Media Pressindo","9786025752803","338"}};

        String [][] sejarah   = {{"Geografi Sejarah Indonesia","Yulia Siska","2017","Garudhawaca","9786026581372","286"},
                                {"Sejarah Dunia yang Disembunyikan","Jonathan Black","2015","Pustaka Alvabet","9786029193671","636"},
                                {"Sejarah Terlengkap Peradaban Dunia","Rizem Aizid","2018","NOKTAH","9786025781018","604"},
                                {"Sejarah Lengkap Perang Dunia 1 (1914-1918)","Alfi Arifian","2020","Anak Hebat Indonesia","9786232443464","336"},
                                {"Perang Salib Timur dan Barat","Jati Pamungkas","2018","Anak Hebat Indonesia","9786234000108","244"}};

        String [][] agama     = {{"Mengenal Agama Manusia: Mempelajari dan Memahami Agama-agama Manusia Untuk Menciptakan Ketentraman dan Rasa Solidaritas","Jonar Situmorang","2021","PBMR ANDI","9789792995640","554"},
                                {"Kristen Bertanya Muslim Menjawab","Ahmad Nurcholish","2020","PT Elex Media Komputindo","9786230013843","554"},
                                {"Muslim Bertanya Kristen Menjawab","Christian W. Troll","2013","PT Elex Media Komputindo","9786020217154","226"},
                                {"Memahami Yang Disalahpahami","Ardiansyah","2021","Elex Media Komputindo","9786230029493","200"},
                                {"Buddha","Karen Armstrong","2004","Penguin Publishing Group","9780143034360","240"}};

        String [][] psikologi = {{"Teori Psikologi Kepribadian Manusia","Nur Fatwikiningsih","2020","Penerbit Andi","9786230106866","352"},
                                {"Psikologi Kepribadian: Menyelam Misteri Kepribadian Manusia","Lynn Wilcox","2018","DIVA PRESS","9786027696648","412"},
                                {"Refleksi, Diskresi, dan Narasi: Sejarah Perjumpaan dengan Psikologi","A. Harimurti","2021","Sanata Dharma University Press","978623610326","337"},
                                {"Psikologi Pengembangan","Rustam","2016","Pustaka Rumah Aloy","9786027479791","166"},
                                {"Dinamika Kelompok: Pendekatan Psikologi Sosial","Daniel Purwoko Budi Susetyo","2021","SCU Knowledge Media","9786237635642","176"}};

        String [][] politik   = {{"Politik Parole: Dari Supersemar hingga HTI dan Hal Kontemporer","Hartanto","2020","LPMI","9786239302160","289"},
                                {"Ilmu Politik Hukum Dari Masa Ke Masa","T. Mangaranap Sirait","2021","Deepublish","9786230230905","102"},
                                {"Komunikasi Politik dan Perilaku Golput","Roso Prajoko","2020","Penerbit Lakeisha","9786236573587","136"},
                                {"Opini Politik Kaum Muda","Muhammad Handy Dwi Wijaya","2022","Media Nusa Creative (MNC Publishing)","9786026931146","212"},
                                {"Sang Pangeran - Risalah Politik Abad Ke 15","Niccolo Machiavelli","2014","Elex Media Komputindo","9786020231877","295"}};

        String [][] fiksi     = {{"Matahari Minor","Tere Liye","2022","Tere Liye","9786239987893","361"},
                                {"Harry Potter 7: Harry Potter dan Relikui Kematian","J.k. Rowling","2018","Gramedia Pustaka Utama","9786020379791","997"},
                                {"Murder On The Orient Express ( Pembunuhan Di Orient Express )","Agatha Christie","2017","Gramedia Pustaka Utama","9789792229806","360"},
                                {"Milea: suara dari Dilan","Pidi Baiq","2016","PT Mizan Pustaka","9786020851563","357"},
                                {"The Hunger Games","Suzanne Collins","2012","Gramedia Pustaka Utama","9789792250756","406"}};

            System.out.println("===============|PERPUSTAKAAN|===============");
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
            pilih = in.nextInt();
            System.out.println();
            switch (pilih) {
                case 1: setBuku(teknologi, "TEKNOLOGI");
                break;
                case 2: setBuku(filsafat, "FILSAFAT");
                break;
                case 3: setBuku(sejarah, "SEJARAH");
                break;
                case 4: setBuku(agama, "AGAMA");
                break;
                case 5: setBuku(psikologi, "PSIKOLOGI");
                break;
                case 6: setBuku(politik, "POLITIK");
                break;
                case 7: setBuku(fiksi, "FIKSI");
                break;
                case 8: System.out.printf("Total buku ada: %d", teknologi.length + filsafat.length + sejarah.length + agama.length + psikologi.length + politik.length + fiksi.length);
                default:
                    if (pilih > 9) {
                    System.out.println("PROGRAM BERAKHIR");
                } break;
            }
    }
    public static void setBuku(String[][]data, String pilihanKategori){
        atributBuku n = new atributBuku();
        n.setKategori(pilihanKategori);
        n.tampilkanKategori();
        for(int i = 0; i < data.length; i++) {
            n.setNamaBuku(data[i][0]);
            n.setPenulis(data[i][1]);
            n.setTahun(data[i][2]);
            n.setPenerbit(data[i][3]);
            n.setISBNBuku(data[i][4]);
            n.setHalaman(data[i][5]);
            n.tampilkan();
        }
    }
}
