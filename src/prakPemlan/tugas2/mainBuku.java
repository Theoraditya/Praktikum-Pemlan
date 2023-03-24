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
        bukuTeknologi[0] = new Buku("Pengantar Teknologi Informatika Dan Komunikasi Data","Bagaskoro","2019","Deepublish","9786232099418","134", "Buku ajar ini disusun dan dibuat berdasarkan pengalaman penulis selama memberikan mata kuliah yang berkaitan dengan teknologi informasi di tempat penulis mengajar. Materi pembelajaran ini dimulai dari bagaimana manusia menyampaikan informasi kepada orang lain menggunakan teknologi dari teknologi yang sangat sederhana yang mereka ciptakan atau sepakati bersama sesuai abad dimana mereka berada sampai dengan teknologi seperti yang kita kenal sekarang ini dimana teknologi informasi saat ini tidak bisa lepas dari perkembangan komputer dan teknologi komunikasi.");
        bukuTeknologi[1] = new Buku("Teknologi Informasi: Aplikasi dan Penerapannya","Janner Simarmata","2020","Yayasan Kita Menulis","9786236512920","130", "Penerapan teknologi informasi untuk setiap organisasi terkait dengan strategi dan tujuan masing-masing organisasi. Penerapan teknologi informasi harus selaras dengan strategi bisnis dan tujuan organisasi yang dapat dicapai dengan adanya pengelolaan teknologi informasi yang baik. Penerapan TI tidak hanya hanya pada sektor bisnis, tetapi pada sektor publik khususnya dalam memberikan pelayanan kepada masyarakat mutlak harus dibutuhkan.");
        bukuTeknologi[2] = new Buku("Cyber Society: Teknologi, Media Baru, dan Disrupsi Informasi","Catur Nugroho","2020","Prenada Media","9786232187412","176", "Globalisasi yang menurut McLuhan akan menghasilkan suatu Desa Global mendapatkan sanggahan dari Manuel Castells. Bagi Castells yang terjadi adalah masyarakat yang saling terhubung (network society). Untuk itu, globalisasi tidak sampai mampu merevolusi budaya, sebagaimana yang disampaikan oleh McLuhan. Masyarakat jaringan merupakan fenomena baru yang hadir abad ke-20, yang merupakan masyarakat di mana struktur-struktur organisasi dan elemen-elemen berjalan dengan logika jaringan. Masyarakat jaringan adalah di mana individu-individu saling terhubung dengan individu lain yang keberadaannya entah di mana.");
        bukuTeknologi[3] = new Buku("Teknologi Big Data: Sistem Canggih di Balik Google, Yahoo!, Facebook, IBM","Wayan M. Wijaya","2019","Nilacakra","9786025375873","244", "Big data merupakan kumpulan data yang berukuran besar yang dianalisis oleh mesin pengolah sehingga menghasilkan informasi yang berguna bagi mereka yang menggunakannya. Google, Facebook dan lainnya mengelola dan memanfaatkan data tak berstruktur yang berupa Consumer Generated Media (CGM) maupun klik stream dengan volume yang sangat besar. Karena dalam jumlah yang besar dan kompleks big data memiliki tiga karakteristik yakni volume, variety, dan velocity.");
        bukuTeknologi[4] = new Buku("Roadmap Broadband Indonesia Menuju Era Teknologi 5G","Denny Kusuma Hendraningrat","2017","Elex Media Komputindo","9786020446998","196", "Perkembangan teknologi, khususnya teknologi seluler berkembang sangat cepat. Diawali dari teknologi 1G yang kemudian berkembang menjadi teknologi 2G dan 3G, dan kini teknologi 4G juga telah hadir di Indonesia. Namun demikian, tren peningkatan kebutuhan layanan data berkapasitas besar (multimedia) dan berkecepatan tinggi akan mendorong kehadiran teknologi generasi selanjutnya di Indonesia. Di sisi lain, teknologi generasi 4,5G (LTE-Advanced Pro) dan generasi kelima (5G) sudah mulai dikembangkan.");

        // FILSAFAT
        bukuFilsafat[0] = new Buku("Filsafat Ilmu","C.A. van Peursen Kencana","2014","Universitas Brawijaya Press","9786022032656","169", "Filsafat ilmu merupakan ‘induk’ dari ilmu pengetahuan yang mendasari logika, bahasa, dan matematika. Filsafat ilmu merupakan mata kuliah yang wajib bagi program Magister dan Doktor. Bagi mahasiswa program sarjana, filsafat ilmu diperlukan agar memiliki wawasan mendasar mengenai ilmu pengetahuan. Buku ini disusun dengan pertimbangan menjadi bahan bacaan untuk mahasiswa program sarjana. Dengan demikian, kedalaman materi lebih sederhana dan disesuaikan dengan perkembangan wawasan mahasiswa.");
        bukuFilsafat[1] = new Buku("Etika Nikomakea","Aristoteles, Ratih Dwi Astuti (penerjemah)","2020","BASABASI","9786233050036","369", "Etika Nikomakea merupakan karya Aristoteles tentang etika yang melatari diskusi filsafat selama ratusan tahun. Karya ini mulai banyak dibaca pada abad kedua belas. Ia kemudian sampai ke tangan Winston Churchill hingga Leo Srauss, dan memberi pengaruh besar terhadap mazhab-mazhab pemikiran yang berkembang, khususnya Stoisisme dan Epikureanisme.");
        bukuFilsafat[2] = new Buku("Filsafat Periode Socrates","Frederick Copleston, Atollah Renanda Yafi (penerjemah)","2020","BASABASI","9786233050029","104", "Pada periode Socrates, kehidupan politik Yunani sedang tumbuh intensif, khususnya di Athena yang demokratis. Warga bebas memainkan peran apa pun, dalam hal apa pun, dan jika ingin terjun ke dalam politik, mereka mengikuti semacam pendidikan. Namun pendidikan dengan cara lama sudah tak cukup untuk memenuhi itu. Bentuk ideal aristokrat lama, entah lebih unggul dari cita-cita baru atau tidak, tak mampu memenuhi tuntutan demokrasi yang sedang berkembang. Ada sesuatu yang lebih dibutuhkan, dan kebutuhan ini dipenuhi oleh kaum Sofis.");
        bukuFilsafat[3] = new Buku("Filsafat Moral: Pergumulan Etis Keseharian Hidup Manusia","Agustinus W. Dewantara","2017","Pt Kanisius","9789792152951","128", "“Every man has by nature desire to know.” Setiap manusia dari kodratnya ingin tahu. Demikian kalimat pembuka buku monumental dari Aristoteles, Metaphysics (980a25). Manusia dari kodratnya merupakan makhluk berpikir, ingin mengenal, menggagas, merefleksikan dirinya, sesamanya, Tuhannya, hidup kesehariannya, lingkungan dunia kehadirannya, asal dan tujuan keberadaannya, dan segala sesuatu yang berpartisipasi dalam kehadirannya. Keinginan rasional ini merupakan bagian kodrati keberadaan dan kehadiran manusia. Karakter rasional kehadiran manusia merupakan suatu kewajaran, kenormalan, ke-natural-an.");
        bukuFilsafat[4] = new Buku("Filsafat Pancasila Menurut Bung Karno","Ir. Sukarno","2019","Media Pressindo","9786025752803","338", "Pancasila sebagai Ideologi dan pandangan hidup bangsa, merupakan mahakarya  Ir.Soekarno  yang  telah  mengalami  pengendapan  selama beberapa dekade. Buku ini merupakan kumpulan berbagai pokok pikiran Bung  Karno  mengenai  subtantif  Pancasila,  yang  telah  beliau  pikirkan sejak  menjadi  tapol  di  era  kolonial.  Intinya,  Pancasila  adalah  titik keseimbangan  antara  ilmu  dan  amal,  antara  nasionalisme  dan internasionalisme, antara asas demokrasi dan musyawarah/mufakat, serta antara pembangunan dan keadilan sosial.");

        // SEJARAH
        bukuSejarah[0] = new Buku("Geografi Sejarah Indonesia","Yulia Siska","2017","Garudhawaca","9786026581372","286", "Buku ini berusaha menjawab berbagai pertanyaan yang sering muncul di benak guru dan mahasiswa berkenaan dengan apa itu geografi? Adapun muatan buku ini disajikan secara berturut-turut dalam sepuluh bab, di antaranya berisi mater : Konsep Dasar Geografi Sejarah, Sejarah Perkembangan Geografi, Geografi Fisik, Geografi Manusia, Tata Wilayah dan Kependudukan, Dinamika dan Struktur Sosial Politik Dalam Lingkup Budaya, Perubahaan SOsial, Migrasi Penduduk Masa Kolonial Belanda, Konflik Teritorial, dan Konflik Sosial di Indonesia.");
        bukuSejarah[1] = new Buku("Sejarah Dunia yang Disembunyikan","Jonathan Black","2015","Pustaka Alvabet","9786029193671","636", "Sejarah Dunia yang Disembunyikan adalah salah satu buku dari sekian banyaknya buku yang menceritakan tentang sejarah, buku ini sangat menarik dan wajib untuk ditambahkan kedalam koleksi buku semua orang karena topiknya yang menarik dan universal. Buku ini memberi pengetahuan menarik sejarah dunia yang mungkin tidak diketahui semua orang dan bahkan mungkin saja sengaja disembunyikan oleh pihak-pihak yang tidak ingin sejarah tersebut diketahui oleh orang banyak.");
        bukuSejarah[2] = new Buku("Sejarah Terlengkap Peradaban Dunia","Rizem Aizid","2018","NOKTAH","9786025781018","604", "Buku ini menyajikan pembahasan secara detail dan komprehensif mengenai peradaban-peradaban besar manusia dari masa sebelum Masehi hingga modern. Total terdapat sembilan peradaban besar dunia yang disajikan di dalam buku ini, yakni peradaban Mesopotamia, peradaban Mesir Kuno, peradaban India Kuno, peradaban Tiongkok Kuno, peradaban Mesoamerika, peradaban Persia, peradaban Yunani Kuno, peradaban Romawi Kuno, dan Peradaban Islam.");
        bukuSejarah[3] = new Buku("Sejarah Lengkap Perang Dunia 1 (1914-1918)","Alfi Arifian","2020","Anak Hebat Indonesia","9786232443464","336", "Perang Dunia I (WW1) adalah kontes gladiator terbesar sepanjang sejarah umat manusia yang melibatkan para hegemon Eropa serta koloninya. Vladimir Lenin, sang tokoh komunis Rusia yang dijuluki ‘virus’ oleh para hegemon Eropa menyebut perang ini sebagai ”perangnya bangsawan”, bukan ”perang rakyat”. ");
        bukuSejarah[4] = new Buku("Perang Salib Timur dan Barat","Jati Pamungkas","2018","Anak Hebat Indonesia","9786234000108","244", "Perang Salib merupakan peperangan yang paling bersejarah di dunia karena melibatkan faktor paling rumit dan paling pribadi dalam diri manusia yaitu religiusitas. Perang Salib adalah peperangan yang terjadi antara pasukan Kristen dari berbagai kerajaan di Eropa melawan pasukan Islam yang bertujuan untuk merebut \"Kota Suci\" Yerusalem dari kekuasaan Islam (Sinclair, 1995: 57).");

        // AGAMA
        bukuAgama[0] = new Buku("Mengenal Agama Manusia: Mempelajari dan Memahami Agama-agama Manusia Untuk Menciptakan Ketentraman dan Rasa Solidaritas","Jonar Situmorang","2021","PBMR ANDI","9789792995640","554", "Tidak mudah mempelajari dan memahami agama-agama yang ada di di dunia ini. Dalam dunia akademis, bahkan ada bidang khusus yang mempelajari hal ini, yaitu ilmu perbandingan agama. Berbicara tentang perbandingan agama bagaikan sedang mengarungi samudra yang sangat luas, yang terlihat tidak berujung.");
        bukuAgama[1] = new Buku("Kristen Bertanya Muslim Menjawab","Ahmad Nurcholish","2020","PT Elex Media Komputindo","9786230013843","554", "Buku ini menyampaikan secara dialogis mengenai pertanyaan-pertanyaan umat Kristiani terhadap umat Muslim yang berkenaan dengan dogma dalam agama Islam. Materinya disarikan dari kumpulan pertanyaan dan diskusi yang dialami oleh penulisnya, aktivis lintas agama, Ahmad Nurcholish. Diharapkan, karya ini bisa memberi penjelasan yang dibutuhkan oleh umat Kristiani mengenai hal-hal dalam agama Islam yang selama ini mungkin hanya diketahui samar-samar atau malah disalahpahami.");
        bukuAgama[2] = new Buku("Muslim Bertanya Kristen Menjawab","Christian W. Troll","2013","PT Elex Media Komputindo","9786020217154","226", "Buku ini menyampaikan secara dialogis mengenai pertanyaan-pertanyaan umat Kristiani terhadap umat Muslim yang berkenaan dengan dogma dalam agama Islam. Materinya disarikan dari kumpulan pertanyaan dan diskusi yang dialami oleh penulisnya, aktivis lintas agama, Ahmad Nurcholish. Diharapkan, karya ini bisa memberi penjelasan yang dibutuhkan oleh umat Kristiani mengenai hal-hal dalam agama Islam yang selama ini mungkin hanya diketahui samar-samar atau malah disalahpahami.");
        bukuAgama[3] = new Buku("Memahami Yang Disalahpahami","Ardiansyah","2021","Elex Media Komputindo","9786230029493","200", "Dalam pembahasan pertama, buku ini mencoba mencari titik temu agama-agama, yang di dalam Al-Quran disebut ‘kalimat al-sawa’ (kalimat yang sama), yang mana umat Islam harus memahami agama-agama lain, khususnya agama Abrahamik (Yahudi, Kristen, dan Islam) untuk menciptakan sebuah keharmonisan antar umat beragama. Bukan hanya Yahudi, umat Islam juga perlu mengetahui ajaran agama Kristen serta doktrinnya. Al-Quran banyak menyebutkan mengenai Kristen dan tentang Nabi Isa. ");
        bukuAgama[4] = new Buku("Buddha","Karen Armstrong","2004","Penguin Publishing Group","9780143034360","240", "Sidharta Gautama, begitulah namanya dikenal. Lahir di abad ke-6 sebelum masehi. Kegelisahannya akan hidup menggiringnya untuk mengembara, 29 tahun usianya waktu itu. Malam yang hening dan dingin menjadi pengiring langkahnya ketika meninggalkan Kapilawastu, istana tempat ayahnya Suddodana bertahta.");

        // PSIKOLOGI
        bukuPsikologi[0] = new Buku("Teori Psikologi Kepribadian Manusia","Nur Fatwikiningsih","2020","Penerbit Andi","9786230106866","352", "Di Indonesia maupun Negara di seluruh belahan dunia saat ini menghadapi beragam isu-isu sosial berkaitan dengan bullying, transgender, terorisme, bom bunuh diri, kenakalan remaja, tindak kriminalitas, maupun perilaku-perilaku menyimpang lainnya.");
        bukuPsikologi[1] = new Buku("Psikologi Kepribadian: Menyelam Misteri Kepribadian Manusia","Lynn Wilcox","2018","DIVA PRESS","9786027696648","412", "Buku ini adalah salah satu pegangannya. Melalui lembar demi lembarnya, kita diajak untuk memahami integritas pribadi kita ke arah yang positif, dengan menggunakan metode psikoterapi Barat dan Islam (metode sufi). Proses konseling yang diajukan bersifat konseptual, komparatif, dan praktis. Sehingga, ada kalanya psikoterapi Barat dan Islam bisa dijalankan secara beriringan atau berdasarkan prosedur masing-masing.");
        bukuPsikologi[2] = new Buku("Refleksi, Diskresi, dan Narasi: Sejarah Perjumpaan dengan Psikologi","A. Harimurti","2021","Sanata Dharma University Press","978623610326","337", "Dalam usia 25 tahun dan situasi dunia yang demikian ambang, barangkali menjadi kesempatan komunitas Psikologi Universitas Sanata Dharma - atau katakanlah paguyuban widyani yang (asumsinya) berisi cendekiawan - untuk mempraktikan diskresi dan merefleksikan dirinya dengan jeli melalui pertanyaan.");
        bukuPsikologi[3] = new Buku("Psikologi Pengembangan","Rustam","2016","Pustaka Rumah Aloy","9786027479791","166", "Psikologi perkembangan yang juga disebut psikologi terkait rentang-hidup adalah pendekatan ilmiah yang bertujuan untuk menjelaskan pertumbuhan, perubahan dan konsistensi sepanjang umur. Psikologi perkembangan melihat bagaimana pemikiran, perasaan, dan perilaku berubah sepanjang hidup seseorang.");
        bukuPsikologi[4] = new Buku("Dinamika Kelompok: Pendekatan Psikologi Sosial","Daniel Purwoko Budi Susetyo","2021","SCU Knowledge Media","9786237635642","176", "Dinamika kelompok sebagai fenomena interaksi dan interdependensi antara anggota kelompok yang satu dan anggota kelompok yang lain secara timbal balik atau secara keseluruhan penting diketahui untuk lebih memahami bagaimana antarindividu dan antarkelompok berinteraksi dalam kelompok-kelompok sosial.");

        // POLITIK
        bukuPolitik[0] = new Buku("Politik Parole: Dari Supersemar hingga HTI dan Hal Kontemporer","Hartanto","2020","LPMI","9786239302160","289", "Pada dasarnya rezim politik selalu mengeksploitasi tubuh warga negaranya, untuk menciptakan ketaatan dan pelangengan kekuasaan, melalui berbagai pratik-pratik diskursif sebagaimana hal ini disebut dengan Politik Parole.");
        bukuPolitik[1] = new Buku("Ilmu Politik Hukum Dari Masa Ke Masa","T. Mangaranap Sirait","2021","Deepublish","9786230230905","102", "Buku yang berjudul Ilmu Politik Hukum dari Masa ke Masa, berisi/membahas hukum buatan manusia lahir hidup dan lalu mati, “Leges humanae nascuntur vivunt et moriuntur (Man-made laws born alive and then die)”. Karenanya, embrio pembentukan kebijakan hukum dan penegakan walau belum bersifat ilmiah sudah ada dari masa kuno, kemudian bertransformasi secara ilmiah ke masa modern, sehingga membuat ilmu politik hukum semakin berkembang.");
        bukuPolitik[2] = new Buku("Komunikasi Politik dan Perilaku Golput","Roso Prajoko","2020","Penerbit Lakeisha","9786236573587","136", "Roso Prajoko adalah seorang Dosen, Penulis, dan Peneliti serta tenaga ahli politik di DPRD Kabupaten Karanganyar. Saat ini dia mengajar di kampus Universitas Boyolali untuk mata kuliah. Dasar-dasar jurnalistik, Penyiaran dan Etika pers. Lahir di Sragen 17 Juli 1973 menamatkan S1 di Fakultas Ilmu Sosial dan Ilmu Politik Universitas 17 Agustus Semarang.");
        bukuPolitik[3] = new Buku("Opini Politik Kaum Muda","Muhammad Handy Dwi Wijaya","2022","Media Nusa Creative (MNC Publishing)","9786026931146","212", "Negara demokrasi, merupakan kebebasan individu atau kelompok untuk berpendapat dalam sistem sosial,sistem budaya, sistem ekonomi bahkan sistem politik. Terutama kaum muda Indonesia, kaum muda adalah generasi penerus bangsa yang nantinya sebagai pemegang nasib bangsa ini, maka generasi mudalah yang menentukan semua apa yang dicita-citakan bangsa dan Negara ini.");
        bukuPolitik[4] = new Buku("Sang Pangeran - Risalah Politik Abad Ke 15","Niccolo Machiavelli","2014","Elex Media Komputindo","9786020231877","295", "Sebuah risalah politik yang disusun oleh Machiavelli, dikenal juga sebagai pendiri negara politik sekuler modern, yang mempengaruhi pemerintahan negara-negara berabad-abad sesudahnya.");

        // FIKSI
        bukuFiksi[0] = new Buku("Matahari Minor","Tere Liye","2022","Tere Liye","9786239987893","361", "Novel ini menceritakan Seli dan Raib setelah kejadian di SagaraS, dimana Ali tidak mengikuti mereka lagi. Lalu Seli menceritakan tentang bagaimana ia mendapatkan kekuatan petir juga persahabatannya. Lalu ia juga menceritakan kehidupannya setelah kejadian itu.");
        bukuFiksi[1] = new Buku("Harry Potter 7: Harry Potter dan Relikui Kematian","J.k. Rowling","2018","Gramedia Pustaka Utama","9786020379791","997", "Setelah kematian Dumbledore, Voldemort berupaya mengambil kendali Kementerian Sihir. Sementara itu, Harry akan berusia tujuh belas tahun dan akan kehilangan perlindungan mendiang ibunya. Anggota Orde Phoenix mengungsikan keluarga Dursley, dan bersiap untuk memindahkan Harry ke The Burrow dengan menerbangkannya ke sana, menggunakan teman-teman Harry sebagai umpan. Pelahap Maut menyerang mereka di tengah perjalanan, dan dalam pertempuran, \"Mad-Eye\" Moody dan Hedwig tewas sedangkan George Weasley terluka. Voldemort datang untuk membunuh Harry, tetapi tongkat Harry menangkis sendiri serangan Voldemort.");
        bukuFiksi[2] = new Buku("Murder On The Orient Express ( Pembunuhan Di Orient Express )","Agatha Christie","2017","Gramedia Pustaka Utama","9789792229806","360", "Detektif Belgia ternama, Hercule Poirot (Kenneth Branagh) mencoba memecahkan misteri pembunuhan yang terjadi pada pengusaha Amerika Ratchett (Johnny Depp) dalam kereta mewah yang melintasi benua Eropa. 13 orang penumpang dalam kereta itu mungkin adalah sang pelaku pembunuhan. Sang detektif harus memecahkan misteri ini sebelum pembunuhan terjadi lagi.");
        bukuFiksi[3] = new Buku("Milea: suara dari Dilan","Pidi Baiq","2016","PT Mizan Pustaka","9786020851563","357", "Tidak ada kisah yang lebih Indah dari kisah cinta di SMA.Sama halnya dengan kisah cinta Dilan dan Milea.Dari yang awalnya benci hingga saling mencintai. Dari yang awalnya manis hingga menjadi rumit.Menjelang reuni akbar,Dilan memutuskan untuk menceritakan kembali masa masa itu.");
        bukuFiksi[4] = new Buku("The Hunger Games","Suzanne Collins","2012","Gramedia Pustaka Utama","9789792250756","406", "Setelah mengakhiri persaingan Hunger Games, Katniss Everdeen, Gale, Finnick dan Beetee bergabung dan berjuang bersama demi menyelamatkan Peeta dan para penduduk dari cengkraman presiden Snow.");


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
            case 1: {
                System.out.println("============|KATEGORI BUKU TEKNOLOGI|============");
                bukuTeknologi[0].tampilkan();
                bukuTeknologi[1].tampilkan();
                bukuTeknologi[2].tampilkan();
                bukuTeknologi[3].tampilkan();
                bukuTeknologi[4].tampilkan();
                break;
            }
            case 2: {
                System.out.println("============|KATEGORI BUKU FILSAFAT|============");
                bukuFilsafat[0].tampilkan();
                bukuFilsafat[1].tampilkan();
                bukuFilsafat[2].tampilkan();
                bukuFilsafat[3].tampilkan();
                bukuFilsafat[4].tampilkan();
                break;
            }
            case 3: {
                System.out.println("============|KATEGORI BUKU SEJARAH|============");
                bukuSejarah[0].tampilkan();
                bukuSejarah[1].tampilkan();
                bukuSejarah[2].tampilkan();
                bukuSejarah[3].tampilkan();
                bukuSejarah[4].tampilkan();
                break;
            }
            case 4: {
                System.out.println("============|KATEGORI BUKU AGAMA|============");
                bukuAgama[0].tampilkan();
                bukuAgama[1].tampilkan();
                bukuAgama[2].tampilkan();
                bukuAgama[3].tampilkan();
                bukuAgama[4].tampilkan();
                break;
            }
            case 5: {
                System.out.println("============|KATEGORI BUKU PSIKOLOGI|============");
                bukuPsikologi[0].tampilkan();
                bukuPsikologi[1].tampilkan();
                bukuPsikologi[2].tampilkan();
                bukuPsikologi[3].tampilkan();
                bukuPsikologi[4].tampilkan();
                break;
            }
            case 6: {
                System.out.println("============|KATEGORI BUKU POLITIK|============");
                bukuPolitik[0].tampilkan();
                bukuPolitik[1].tampilkan();
                bukuPolitik[2].tampilkan();
                bukuPolitik[3].tampilkan();
                bukuPolitik[4].tampilkan();
                break;
            }
            case 7: {
                System.out.println("============|KATEGORI BUKU FIKSI|============");
                bukuFiksi[0].tampilkan();
                bukuFiksi[1].tampilkan();
                bukuFiksi[2].tampilkan();
                bukuFiksi[3].tampilkan();
                bukuFiksi[4].tampilkan();
                break;
            }
            case 8: System.out.printf("Total buku ada: %d", bukuTeknologi.length + bukuFilsafat.length + bukuSejarah.length + bukuAgama.length + bukuPsikologi.length + bukuPolitik.length + bukuFiksi.length);
            default:
                if (pilih >= 9) {
                    System.out.println("PROGRAM BERAKHIR! anda memasukkan kode yang salah");
                } break;
        }
        System.out.println();
        System.out.print("Apakah anda ingin copy buku? (1/0) ");
        int copy = in.nextInt();
        if (copy == 1){
            System.out.println("Pilih kategori yang diinginkan");
            System.out.println("Kategori buku: ");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.print("Pilihan anda: ");
            int pilihan = in.nextInt();
            switch (pilihan) {
                case 1: {
                    System.out.print("Pilih buku Teknologi yang ingin dicopy (1/2/3/4/5)");
                    System.out.println();
                    int pilihBuku = in.nextInt();
                    switch (pilihBuku){
                        case 1: {
                            bukuTeknologi[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuTeknologi[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuTeknologi[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuTeknologi[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuTeknologi[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Pilih buku Filsafat yang ingin dicopy (1/2/3/4/5)");
                    int pilihBuku = in.nextInt();
                    System.out.println();
                    switch (pilihBuku){
                        case 1: {
                            bukuFilsafat[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuFilsafat[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuFilsafat[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuFilsafat[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuFilsafat[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Pilih buku Sejarah yang ingin dicopy (1/2/3/4/5)");
                    int pilihBuku = in.nextInt();
                    System.out.println();
                    switch (pilihBuku){
                        case 1: {
                            bukuSejarah[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuSejarah[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuSejarah[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuSejarah[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuSejarah[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Pilih buku Agama yang ingin dicopy (1/2/3/4/5)");
                    int pilihBuku = in.nextInt();
                    System.out.println();
                    switch (pilihBuku){
                        case 1: {
                            bukuAgama[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuAgama[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuAgama[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuAgama[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuAgama[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.print("Pilih buku Psikologi yang ingin dicopy (1/2/3/4/5)");
                    int pilihBuku = in.nextInt();
                    System.out.println();
                    switch (pilihBuku){
                        case 1: {
                            bukuPsikologi[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuPsikologi[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuPsikologi[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuPsikologi[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuPsikologi[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.print("Pilih buku Politik yang ingin dicopy (1/2/3/4/5)");
                    int pilihBuku = in.nextInt();
                    System.out.println();
                    switch (pilihBuku){
                        case 1: {
                            bukuPolitik[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuPolitik[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuPolitik[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuPolitik[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuPolitik[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.print("Pilih buku Fiksi yang ingin dicopy (1/2/3/4/5)");
                    int pilihBuku = in.nextInt();
                    System.out.println();
                    switch (pilihBuku){
                        case 1: {
                            bukuFiksi[0].tampilkan();
                            break;
                        }
                        case 2: {
                            bukuFiksi[1].tampilkan();
                            break;
                        }
                        case 3: {
                            bukuFiksi[2].tampilkan();
                            break;
                        }
                        case 4: {
                            bukuFiksi[3].tampilkan();
                            break;
                        }
                        case 5: {
                            bukuFiksi[4].tampilkan();
                            break;
                        }
                    }
                    break;
                }
            }
        }
        else {
            System.out.println("TERIMA KASIH..");
        }
    }
}