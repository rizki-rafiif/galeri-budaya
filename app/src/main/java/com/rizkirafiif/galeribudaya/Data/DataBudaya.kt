package com.rizkirafiif.galeribudaya.Data

import android.content.Context
import com.rizkirafiif.galeribudaya.db.DatabaseHelper

class DataBudaya(context: Context) {
    val dbHelper = DatabaseHelper.getInstance(context)

    fun executeDB(){
        dbHelper.deleteAll()
        dbHelper.insertData("1","senjata rencong", "senjata", "aceh"
            , "Menurut catatan sejarah, Rencong merupakan senjata tradisional yang digunakan di Kesultanan Aceh sejak masa pemerintahan Sultan Ali Mughayat Syah yang merupakan Sultan Aceh yang pertama. Kedudukan Rencong di Kesultanan Aceh sangatlah penting, Rencong selalu diselipkan di pinggang Sultan Aceh, selain itu para Ulee Balang dan masyarakat biasa juga menggunakan Rencong. Rencong emas milik Sultan Aceh dapat kita jumpai di Museum Sejarah Aceh"
            , ""
            , "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/COLLECTIE_TROPENMUSEUM_Dolk_met_rechthoekig_gebogen_hoornen_greep_en_houten_schede_TMnr_151-19.jpg/259px-COLLECTIE_TROPENMUSEUM_Dolk_met_rechthoekig_gebogen_hoornen_greep_en_houten_schede_TMnr_151-19.jpg"
            , "https://kebudayaan.kemdikbud.go.id/ditwdb/wp-content/uploads/sites/9/2019/02/Rencong.jpg"
            , "http://kebudayaan.kemdikbud.go.id/ditindb/wp-content/uploads/sites/9/2015/11/Rencong3.jpg"
            , ""
            , "")
        dbHelper.insertData("2","tari saman", "tarian", "aceh"
            , "Saman adalah salah satu kesenian tradisional yang tumbuh dan berkembang pada masyarakat Gayo di Kabupaten Gayo Lues, Aceh Tenggara, Aceh Timur (Kecamatan Serbejadi), Kabupaten Aceh Tamiang (Tamiang Hulu). Keberadaan saman pada masyarakat Gayo merupakan sebuah tradisi yang turun temurun dan menjadi bagian dalam kehidupan mereka."
            , ""
            , "http://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/56339-11.jpg"
            , "https://pesona-indonesia.info/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2020/02/Tari-saman.jpg.webp"
            , "https://awsimages.detik.net.id/community/media/visual/2021/11/23/tari-saman_169.jpeg?w=650&q=80"
            , ""
            , "")
        dbHelper.insertData("3","tari piring", "tarian", "aceh"
            , "Tarian ini ditarikan oleh 2 hingga 8 orang dan dilakukan secara berpasangan. Penari memakai cincin pada jari tengah di kedua tangannya dan masing-masing tangan memegang piring kecil (pisin). Penari terdiri dari laki-laki dan perempuan yang komposisinya seimbang. Penari bergerak dengan langkah yang mirip dengan langkah silat, langkah yang lebar dan rendah. Gerakan tariannya juga banyak melibatkan kontak mata diantara pasangan penari tersebut. Pring yang dipegang para penari diangkat dengan gerakan memutar-mutar tangan dan bahkan sesekali piring dilempar kemudian ditangkap kembali. Jika piring jatuh dan pecah, biasanya penari diberikan piring lain oleh seseorang yang merupakan bagian dari kelompok penari tersebut atau bahkan oleh penonton. Selama tarian berlangsung, para penari tak henti-hentinya mengetukan cincin di jari tengah mereka ke piring sehingga jalannya tarian pun menjadi semakin meriah."
            , ""
            , "https://asset.kompas.com/crops/L24Yf9OsnAq5gX8thjs9uhtlymQ=/85x43:598x384/750x500/data/photo/2021/12/21/61c1b92e7a7d9.jpg"
            , "https://1.bp.blogspot.com/-WGVG0CwtnJA/YRJfXYfDGmI/AAAAAAAADck/rTgxzos91kERzZrwOxJqiD8f6Pf3TBb8QCLcBGAsYHQ/w1200-h630-p-k-no-nu/03%2B-%2BTari%2BPiring.jpg"
            , "https://www.kabarsumbar.com/wp-content/uploads/2022/09/3.jpeg"
            , ""
            , "")
        dbHelper.insertData("4","senjata toho", "senjata", "sumatra utara"
            , "Toho adalah tombak dalam bahasa Nias. Ada dua jenis Toho yang digunakan masyarakat Nias, yaitu Toho Sondrami yang dipakai untuk berburu dengan ciri mata tombak yang memiliki kait dan Toho Bulusa atau Burusa yaitu tombak yang dipakai untuk berperang. Toho merupakan benda yang digunakan Raja Sirao Uwu Zih?n?, tokoh utama dalam kisah tentang asal-usul Orang Nias untuk menguji sembilan orang anaknya yang salah satu dari mereka, jika berhasil melewati ujian akan diangkat menjadi raja. Dalam cerita itu disebutkan, Raja Sirao menitahkan kepada sembilan anaknya ?barangsiapa yang dapat menari seperti burung Rajawali di ujung mata Toho yang runcing itu dialah yang berhak menjadi raja?. Toho yang menjadi media menguji anak-anak Raja Sirao menjadi senjata klasik yang sejarahnya muncul bersama munculnya sejarah masyarakat Nias. Toho masih digunakan untuk upacara adat, perhiasan dan pelengkap dalam seni pertunjukan Nias. Mata Toho dibuat dari besi tempa oleh para Sihambu atau pandai besi. Ada beberapa bentuk Toho yangn umumnya berbentuk pipih dengan kait sebagai pembedanya. Panjang mata Toho dihitung dari ujung sampai pangkal mata Toho yang tersambung dengan kayu Akhe yang keras namun cukup lentur kira-kira 1,5 meter. Pangkal kayu Akhe yang batang Toho juga dibuat runcing sebagai mata tombak alternatif yang dapat digunakan jika mata tombak besi tertahan. Dengan demikian akan seolah-olah ada dua mata tombak."
            , ""
            , "https://i0.wp.com/jejakmedan.com/wp-content/uploads/2020/08/Senjata-Toho.jpg?resize=1140%2C1556&ssl=1"
            , "https://seringjalan.com/wp-content/uploads/2021/05/Tari-Baluse--e1621566628240.jpg"
            , "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg7bcGQf1s7u7iwQAQasbhLqdYGOmzXGaoTv_vwyBVX0i6mEriFvzQmwiIMgKszLjvOOI&usqp=CAU"
            , ""
            , "")
        dbHelper.insertData("5","ulos", "pakaian", "sumatra utara"
            , "Dalam banyak catatan lama tertulis bahwa kain tradisional Indonesia mempunyai nilai budaya tinggi, terutama dari sudut estetis, bermakna simbolis dan memiliki falsafah yang mendasari pembuatannya. Jika kita menelaah sejarah kain tenun Indonesia, terutama teknik tenun ikat maka kita bisa melihat bahwa apa yang terjadi di Indonesia termasuk menarik karena ternyata teknik ini telah dikenal sejak jaman Prasejarah. Di daerah pedalaman Sumatera, sejak lama penduduk mengenal corak tenun yang rumit, semua itu dihasilkan dengan membuat alat tenun sendiri, mencari pohon untuk diambil serat nya dan mencelup dengan bahan pewarna alam yang diambil dari hutan disekitar mereka bermukim. Diperkirakan keakhlian ini telah dimiliki oleh masyarakat yang hidup pada masa perundagian atau perunggu mulai abad ke-8 sampai abad ke-2 SM. Beberapa sumber juga mengatakan bahwa wilayah sumatera mengenal tenun sejak ada hubungan dengan India, Cina, dan Arab. Dari merekalah teknologi menenun mulai diperoleh. Sedangkan perkembangan motif yang dimiliki adalah motif-motif yang merupakan hasil kreatifitas asli sukubangsa batak Toba yang dipengaruhi oleh unsur alam dan kehidupan manusianya. Ulos (lembar kain tenunan khas tradisional Batak) pada hakikatnya adalah hasil peradaban masyarakat Batak pada kurun waktu tertentu. Menurut catatan beberapa ahli ulos (baca: tekstil) sudah dikenal masyarakat Batak pada abad ke-14 sejalan dengan masuknya alat tenun tangan dari India."
            , ""
            , "https://www.indonesia.travel/content/dam/indtravelrevamp/en/trip-ideas/kain-tenun-ulos-khas-batak/image2.jpg"
            , "https://asset.kompas.com/crops/IAGjfto8M_jZLsn1FZ4MQrD2ccE=/0x0:2499x1666/750x500/data/photo/2020/10/16/5f890ce7a4ef5.jpg"
            , "https://cdn-cas.orami.co.id/parenting/images/kain_khas_batak-2.width-1000.jpg"
            , ""
            , "")
        dbHelper.insertData("6","kuah pliek", "makanan", "aceh"
            , "Ini adalah makanan khas Aceh yang paling disukai masyarakatnya terutama yang berada di daerah Timur Aceh, Aceh Pidie dan sekitarnya. Bahan utama dari kuah pliek ini adalah pliek u, yaitu sisa perahan kelapa pada pembuatan minyak kelapa bukan melalui pemanasan tetapi melalui fermentasi. Ciri makanan khas Aceh ini adalah pencampuran berbagai sayuran yang telah dipotong kecil-kecil termasuk cabai hijau."
            , ""
            , "https://cdn-cas.orami.co.id/parenting/images/Makanan_khas_ACEH_1.width-1000.jpg"
            , "https://img-global.cpcdn.com/recipes/6216ffb8df7ca75b/1200x630cq70/photo.jpg"
            , "http://assets.kompasiana.com/statics/crawl/555fd9400423bdfb688b4567.jpeg"
            , ""
            , "")
        dbHelper.insertData("7","silat pelintau", "non benda", "aceh"
            , "Silat Pelintau dikukuhkan pada tahun 1953 oleh Maha Guru OK Said bin Unus yang merupakan putra asli Tamiang. Sebelumnya, beliau sempat berkelana sejak usia 15 tahun untuk mencari ilmu silat, mulai dari Samosir hingga ke Siak sampai akhirnya kembali ke Tamiang untuk berguru kepada Tengku Lotan. Dahulu, Silat Pelintau diajarkan secara sembunyi-sembunyi dan diajarkan kepada pemuda-pemuda Tamiang agar dapat mempertahankan dari dari serangan musuh dan utamanya membantu usaha-usaha untuk mengusir para penjajah Belanda dari tanah Tamiang. Setelah dikukhkan pada tahun 1953, barulah Silat Pelintau ini dapat diajarkan secara terang-terangan.\n" +
                    "\n" +
                    "Nama Pelintau diambil dari Bahasa Tamiang asli yaitu “pelin” dan “tau”. “Pelin” berarti semua sedangkan “tau” artinya tahu. Sehingga “pelintau” berarti “semua tahu”. Pada permainan pencak silat ini terdapat urutan permainan yang harus ditampilkan, meski pada beberapa kesempatan, bebrapa permainan bisa dihilangkan sebagian.\n" +
                    "\n" +
                    "Pada penampilan Pencak Silat Pelintau, pemain juga dapat menampilkan Tari Piring  sebagai selingan. Tari Piring dimainkan oleh penari perempuan berjumlah 4 sampai 8 orang dan basanya ditampilkan pada saat-saat khusus seperti malam berinai. Sementara property yang digunakan adalah 2 buah piring kecil yang dipegan oleh masing-masing penari yang pada jarinya manisnya terdapat cincin untuk diketuk-ketukan pada piring.\n" +
                    "\n" +
                    "Dari segi penyajian langkah, silat ini memiliki 4 pola gerak;\n" +
                    "\n" +
                    "1. Gerak salam sembah, yaitu gerak untuk menghormati para guru dan hadirin lainnya sebagai symbol menjaga keharmonisan dalam permainan dan kesadaran sebagai makhluk biasa.\n" +
                    "\n" +
                    "2. Gerak titi batang, yaitu gerak pembukaan guna mendapatkan keseimbangan tubuh di samping digunakan sebagai posisi berkonsentrasi sebelum memantapkan langkah-langkah gerak selanjutnya.\n" +
                    "\n" +
                    "3. Gerak langkah tiga dan langkah empat, yaitu merupakan gerak langkah dasar untuk pemecahan gerak-gerak langkah selanjutnya. Gerak langkah selanjutnya memunculkan beberapa jurus dan variasi langkah.\n" +
                    "\n" +
                    "4. Gerak salam terakhir, yaitu gerak yang merepresentasikan permohonan maaf kepada guru dan hadirin serta kawan pemain.\n" +
                    "\n" +
                    "Silat Pelintau bagi masyarakat Tamiang adalah silat seni. Ada dua jenis silat seni dimaksud yang popular pada masyarakat Tamiang, yaitu silat rebas tebang dan silat songsong. Jenis silat seni inilah yang membedakan silat Tamiang dengan silat-silat lainnya. Pada silat songsong, gerakannya digunakan untuk menyambut tamu kehormatan dan biasanya pada kehidupan masyarakat sehari-hari ditampilkan pada kenduri pernikahan di halaman rumahn untuk menyambut pihak keluarga besan. "
            , ""
            , "https://pariwisataindonesia.id/wp-content/uploads/2020/12/pelintau-aceh-foto-mediaindonesiacom.jpg"
            , "https://pariwisataindonesia.id/wp-content/uploads/2020/12/pelintau-aceh-foto-docplayerinfo.jpg"
            , "https://1.bp.blogspot.com/-tCsY4-IobOU/XmzPbsH237I/AAAAAAAASoE/GgrmIwVAGacaI5Y0HU2yjJrKXYBBINtAACLcBGAsYHQ/s1600/IMG-20200314-WA0036.jpg"
            , ""
            , "")
        dbHelper.insertData("8","rumoh aceh", "benda", "aceh"
            , "Rumah adalah bagian dari kebutuhan pokok manusia di berbagai daerah. Keberadaan rumoh Aceh hingga bentuknya yang sekarang telah melalui perjalanan sejarah yang panjang. Tidak diketahui pasti tahun kapan rumoh Aceh dibuat oleh orang Aceh sebagai tempat tinggal. Namun Keberadaan rumoh Aceh pernah diungkapkan oleh Siegel (1979: 147) yang terkait dengan ukirannya setelah membaca Hikayat Peoecoeat Moehamat, yang menyebutkan bahwa menjelang abad ke-18 semakin banyak rumah adat Aceh dihias dengan corak-corak ukir. Selain itu dari beberapa catatan yang dibuat oleh para penjelajah seperti John Davis, Ibnu Batutah yang pernah ke Aceh terdapat catatan bahwa di Aceh terdapat rumah dengan model panggung yang mana dibangun delapan kaki atau lebih dari tanah dan disangga oleh tiang-tiang kayu dengan jalan lintas di bawahnya. Namun demikian, sering dengan berjalannya waktu, rumoh Aceh lambat laun mulai ditinggalkan oleh masyarakat. Banyak anggota masyarakat yang mulai membangun rumah dengan menggunakan model rumah pada zaman sekarang. Dalam tradisi masyarakat Aceh merupakan salah satu unsur penting membangun tempat tinggal (membuat rumah). Dalam sebuah keluarga Aceh, rumah merupakan tempat tinggal yang begitu esensial dan menjadi lambang otoritas seorang laki-laki selaku kepala keluarga. Oleh karena itu belumlah dianggap seseorang itu sempurna hidupnya bila belum memiliki rumah tempat tinggalnya. Letak denah rumoh Aceh biasanya dibangun menghadap ke utara dan ke selatan sehingga letaknya tepat membujur dari arah timur ke barat. Umumnya rumoh Aceh dibangun di atas tiang-tiang setinggi 2,5 sampai 5 meter dari tanah. Rumoh Aceh rata-rata memiliki tiga ruang induk, yaitu ruang depan, ruang tengah dan ruang belakang. Rumoh Aceh rata-rata dibangun dalam ukuran besar, sebab selain berfungsi sebagai tempat tinggal, rumoh Aceh juga berfungsi sebagai tempat kegiatan-kegiatan sosial, seperti musyawarah, kenduri, peresmian khitanan dan lain sebagainya. (Muhammad, 1980 : 5). Rumoh Aceh bukan sekadar tempat hunian, tetapi merupakan ekspresi keyakinan terhadap Tuhan dan adaptasi terhadap alam. Oleh karena itu, melalui Rumoh Aceh kita dapat melihat budaya, pola hidup, dan nilai-nilai yang diyakini oleh masyarakat Aceh. Adaptasi masyarakat Aceh terhadap lingkungannya dapat dilihat dari bentuk Rumoh Aceh yang berbentuk panggung, tiang penyangganya yang terbuat dari kayu pilihan, dindingnya dari papan, dan atapnya dari rumbia. Pemanfaatan alam juga dapat dilihat ketika mereka hendak menggabungkan bagian-bagian rumah, mereka tidak menggunakan paku tetapi menggunakan pasak atau tali pengikat dari rotan. Walaupun hanya terbuat dari kayu, beratap daun rumbia, dan tidak menggunakan paku, Rumoh Aceh bisa bertahan hingga 200 tahun."
            , ""
            , "https://cdnwpedutorenews.gramedia.net/wp-content/uploads/2021/11/16201233/1535_rumah-adat-aceh-krong-bade-foto-klipingco.jpg"
            , "https://asset.kompas.com/crops/DrnkIrWsOIbApoQza_kNjWwYvDo=/0x0:799x533/750x500/data/photo/2020/04/29/5ea8d35e45164.png"
            , "https://image.archify.com/blog/l/shutterstock_1791035183.jpg"
            , ""
            , "")
        dbHelper.insertData("9","kerawang gayo", "pakaian", "aceh"
            , "Potensi manusia menemukan potensi alam melahirkan kebudayaan di antaranya berupa ukiran yang motif-motifnya diambil dari flora dan fauna dan dinukil pada bahan-bahan yang ada di sekitar mereka. Manusia tidak dapat melepaskan dirinya dari alam, sebagaimana manusia tidak mungkin melepaskan did dari Tuhan dan manusia lainnya. Hubungan manusia dengan Tuhan mendorong, mengendalikan dan mendorong manusia untuk melakukan kebaikan kepada manusia dan alam. Manusia memerlukan kebutuhan rohani dan jasmani. Ukiran sebagai bagian dari kebudayaan adalah keindahan untuk memenuhi kebutuhan rohani manusia dan karena ukiran dibutuhkan rohani menyebabkan ukiran itu amat bernilai atau berharga yang dapat memenuhi kebutuhan jasmani di samping rohani.\n" +
                    "\n" +
                    "Alam hewani Nora) dan alam tumbuh-tumbuhan (fauna) menunjukkan dirinya kepada manusia Gayo untuk menemukan motif-motif ukir yang disebut kerawang Gayo. Motif-motif itu dinukil pada bahan-bahan yang ada di sekitar mereka yaitu pada kayu bangunan, tanah liat menghasilkan keramik, bahan anyaman tenunan kain dan logam.\n" +
                    "\n" +
                    "Motif pada kayu antara lain berbentuk: Emun berangkat (awan berarak), pucuk ni tuwis (pucuk rebung), ulen-ulen (bulan-bulan), mutik (putik), puter tali (jalinan tali), bunge ulen-ulen (bunga bulan), bunge ni terpuk (bunga kuncung), bunge ni pertik (bunga papaya), bunge lao (bunga matahari), bunge kemang (bunga yang sedang kembang), bur/baur (gunung), bintang bulan (bintang dan bulan), nege (naga), iken/gule (ikan) dan mata m itik (mata itik).\n" +
                    "\n" +
                    "Cara membuatnya, menggunakan pahat pada kayu yang dijadikan bahan bangunan rumah: Tulak kuyu (tolak angina bagian atas), pepir (tolak angina bagian bawah), penumpu ni bere dan penumpu ni kaso (les plang), penulangan (kindang), suyen (tiang), kite (tangga), penyokenen (ambang atas pintu), peger ni lepo (pagar beranda depan). Semua ukiran timbul, tidak ada yang tembus kecuali pada peger ni lepo dan tidak diwarnai.\n" +
                    "\n" +
                    "Penerapan motif ukiran pada kain sebagian menggunakan motif pada kayu dengan beberapa tambahan: ulen-ulen (bulan-bulan), emun berangkat (awan berarak), tapak Sulaiman (tapak Nabi Sulaiman), bintang (bintang), kekacang (bu\n" +
                    "\n" +
                    "Penempatan motif-motif itu pada kain berwarna merah muda, merah hati, kuning, hijau claim tua, putih dan hitam pada kain dasar putih. Cara membuatnya sebelum ada mesin jahit atau sulam, dilakukan dengan tangan, kemudian berkembang dengan tenun tradisional. Ketika pakaian sudah dipasarkan di daerah ini, pembuatan motif kerawang hilang dan timbul kembali ketika masa pendudukan Jepang, karena kain tidak ada lagi di pasar. Hasil praktis dari hash pekerjaan kerawang berupa:\n" +
                    "\n" +
                    "1. Upuh Ulen-ulen (pakaian bulan-bulan) di mana kerawang berupa bentuk bulan lebih dominan terletak di tengah-tengah pakaian.\n" +
                    "\n" +
                    "2. Upuh Jerak (pakaian ules) yang tersusun berbagai jenis kerawang secara harmonik dan tidak satu jenis kerawang pun yang lebih menonjol.\n" +
                    "\n" +
                    "3. Baju Tabur Kerlang yaitu baju yang jenis kerawangnya lebih banyak terdapat di bagian dada dan bahu.\n" +
                    "\n" +
                    "4. Baju Tabur Sede ialah baju yang kerawangnya merata hampir pada semua bagian pakaian baju.\n" +
                    "\n" +
                    "5. Ketawak yaitu tali pinggang agak lebar dari kain yang biasanya dipergunakan ketika melakukan akad nikah."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483947894.JPG"
            , "https://static.republika.co.id/uploads/images/inpicture_slide/perajin-usaha-mikro-kecil-dan-menengah-umkm-kain-bordir_210915143623-457.jpg"
            , "https://lintasgayo.co/wp-content/uploads/2016/03/pakaian_adat_gayo.jpg"
            , ""
            , "")
        dbHelper.insertData("10","holat", "makanan", "sumatra utara"
            , "Holat merupakan hidangan komplet khas Padang Bolak. Nama hidangan ini berasal dari kata holat yang berarti kelat, yaitu rasa yang terkandung dalam ‘bumbu’ utama untuk kuah siraman, potongan pakkat atau tunas rotan yang memang kelat. Bumbu utama Holat berasal dari kulit bagian dalam tanaman Balakka (Phyllantus emblica L.) yang diserut tipis lalu direndam air hangat lalu diperas dua-tiga kali penapisan untuk mendapatkan ‘kaldu’ yang dinamai Holat. Kaldu yang ditambahkan sekerat jahe, irisan bawang, garam dan serutan holat sisa penapisan, dijadikan kuah untuk ikan mas atau jurung (ikan endemik yang rasanya manis dari sungai-sungai di Padang Bolak) yang sudah dipanggang setengah matang agar rasa manis ikan tetap terasa. Hidangan sebagai lauk ini disajikan dengan topping potongan pakkat, taburan tepung beras sangrai dan gilingan halus cabai mentah. Kadang petai atau jengkol mentah turut disajikan tambul atau lauk sebagai pendamping."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201700451-penetapan-2_1530780702.jpg"
            , "https://awsimages.detik.net.id/community/media/visual/2022/06/01/holat-makanan-khas-dari-tapanuli-selatan-2.jpeg?w=1200"
            , "https://img-global.cpcdn.com/recipes/9d7b15b5a1cff033/680x482cq70/holat-khas-sumatera-utara-foto-resep-utama.jpg"
            , ""
            , "")
        dbHelper.insertData("11","tari serampang duabelas", "tarian", "sumatra utara"
            , "Indonesia adalah negara yang kaya akan budaya dan adat istiadat. Kekayaan tersebut merupakan aset bangsa yang sangat berpotensi dan bernilai tinggi di mata dunia. Indonesia secara spesifik memiliki beraneka ragam suku bangsa yang masing-masing memiliki budaya, adat istiadat dan tradisi yang berbeda yang terus diwariskan secara turun temurun, salah satunya adalah seni tari. Setiap suku bangsa mempunyai gerak khusus yang digunakan untuk mengekspresikan diri. Melayu dikenal sebagai suku bangsa yang memiliki ragam gerak yang rancak dan beragam, diantaranya adalah Tari Serampang XII.\n" +
                    "\n" +
                    "Tari Serampang XII merupakan tarian tradisional Melayu yang berkembang di bawah Kesultanan Serdang. Tarian ini diciptakan oleh Almarhum Guru Sauti. Sebelum bernama Serampang XII, tarian ini bernama Tari Pulau Sari, sesuai dengan judul lagu yang mengiringi tarian ini, yaitu lagu Pulau Sari.\n" +
                    "\n" +
                    "Penamaan Tari Serampang XII merujuk pada ragam gerak tarinya yang berjumlah 12, yaitu: pertemuan pertama, cinta meresap, memendam cinta, men a mabuk kepayang, isyarat tanda cinta, balasan isyarat, menduga, masih belum percaya, jawaban, pinang-meminang, mengantar pengantin, dan pertemuan kasih.\n" +
                    "\n" +
                    "Adapun tempo Tari Serampang XII adalah quick step atau 3/8. Tarian yang mendapat pengaruh dari tari dan lagu Portugis, namun ada juga yang menyebutkan bersala dari Spanyol. Oleh karena langkahnya hidup serta menggembirakan, dan Para penarinya dapat menunjukkan kesigapan, gaya dan keindahan seni tari, maka tarian ini diterima oleh masyarakat di sumatera Timur (Tari Melayu Tradisional, 2011:85).\n" +
                    "\n" +
                    "Tari Serampang XII berkisah tentang cinta suci dua anak manusia yang muncul sejak pandangan pertama dan diakhiri dengan pernikahan yang direstui oleh kedua orang tua sang dara dan pemuda. Oleh karena menceritakan proses bertemunya dua hati tersebut, maka tarian ini biasanya dimainkan secara berpasangan, laki-laki dan perempuan. Namun demikian, pada awal perkembangannya tarian ini hanya dibawakan oleh laki-laki karena kondisi masyarakat pada waktu itu melarang perempuan tampil di depan umum, apalagi memperlihatkan lenggak-lenggok tubuhnya."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483949184.jpg"
            , "https://ilmuseni.com/wp-content/uploads/2017/04/musik-pengering-tari-serampang-dua-belas-1280x720.jpg"
            , "https://cdnwpedutorenews.gramedia.net/wp-content/uploads/2022/09/25190053/tari-serampang-dua-belas1.png"
            , ""
            , "")
        dbHelper.insertData("12","rumah adat karo", "benda", "sumatra utara"
            , "Beberapa rumah adat di Indonesia memiliki bentuk-bentuk khusus yang membedakan antara satu daerah dengan daerah yang lainnya. Hal ini menandakan bahwa rumah tersebut dibangun tidak semata-mata mengikuti iklim atau cuaca yang ada pada daerahnya; tetapi lebih kepada pemahaman dan pengetahuan budaya dari masyarakatnya. Oleh karena itu, rumah adat dapat dikatakan sebagai refleksi dari kebudayaan masyarakat empunya budaya. Rumah adat di Kabupaten Karo juga memiliki kriteria seperti yang telah disebutkan. Masyarakat Karo biasanya menyebut rumah adat mereka dengan nama Rumah adat Karo atau Siwaluh jabu.\n" +
                    "\n" +
                    "Siwaluhjabu, artinya satu rumah yang dihuni oleh delapan keluarga. Siwaluh jabu memiliki bentuk yang unik dan megah. Dikatakan \"unik\" karena sama sekali dibuat tanpa bantuan sebatang paku. Selain itu, dinding rumahnya tidak berdiri tegak lurus, melainkan dengan sudut kemiringan 120°. Megah karena memiliki dimensi yang tinggi dan besar. Panjangnya sekitar 17 meter, lebarnya sekitar 12 meter, dan tingginya sekitar 12 meter. Semua dimensi itu didukung oleh 20 tiang fondasi kayu yang hanya berdiri di atas umpak batu. Di antara pertemuan antara tiang-tiang fondasi dan umpak batu diberi ijuk agar kayu fondasi tetap kering. Selain itu, fungsi ijuk juga sebagai halangan agar hewan melata (ular) tidak bisa merayap melalui tiang-tiang kayu untuk memasuki rumah.\n" +
                    "\n" +
                    "Kemegahan Siwaluh jabu juga dapat dilihat pada bagian atapnya, yang memiliki hiasan dari anyaman bambu yang diberi bentuk-bentuk khusus sebagai simbol dari kesatuan hidup masyarakat setempat. Bagian hiasan ini disebut oleh masyarakat Karo sebagai ayo, sedangkan atap berbentuk segitiga tempat diletakkannya ayo disebut dengan /ambe-lambe. Dari segi usia bangunan, rata-rata Siwaluh jabu didirikan pada tahun 1880-an. Faktor usia bangunan inilah yang membuat rumah adat Karo semakin lama semakin berkurang, karena biaya perbaikannya yang sangat mahal."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483945898.jpg"
            , "https://blogpictures.99.co/rumah-adat-batak-karo-1.jpeg"
            , "https://www.romadecade.org/wp-content/uploads/2021/10/Rumah-Adat-Karo.jpg"
            , ""
            , "")
        dbHelper.insertData("13","berahoi", "non benda", "sumatra utara"
            , "Tradisi berahoi dikategorikan sebagai tradisi lisan yaitu suatu tradisi upacara ritual dalam mengirik padi berahoi dilakukan dengan nyanyian, pantun, dan rentak kaki pengirik secara serentak dan musikal. Tari dan nyanyi berahoi menggambarkan kegiatan pertanian agraris masyarakat Melayu Langkat yang menggunakan sistem yang \"tetap\" berdasarkan urutan-urutan yang \"konsisten\" dan teratur dengan lingkaran (siklus) tajak, semai, tanam, dan panen. Pertama, sistem tradisi membuka banjar dilaksanakan dengan upacara membuka tanah yang disebut penotauan (penataan tanah). Upacara penotauan ini pada masa dahulu bersifat sakral dan magis yang melibatkan peran seorang pawang atau datu. Kedua, menyediakan persyaratan untuk upacara njamu sawah atau njamu ladang (menjamu bendang/sawah). Ketiga, pawang bendang mempersiapkan bahan-bahan ramuan. Keempat, menyelenggarakan upacara perjamuan dengan beberapa persyaratan tertentu. Kelima, merawat tanaman padi muda, dan keenam, mengirik padi sebagai kegiatan bersama.\n" +
                    "\n" +
                    "Di Bohorok Langkat, pada zaman dahulu ada prosesi ritual ngerbah hutan jika melakukan penebangan pohon untuk membersihkan arealnya yang dijadikan lahan pertanian yaitu mempersiapkan bahan-bahan dan ramuan serta seperangkat alat yang memiliki kekuatan tuah, berarti memberikan persembahan kepada penguasa hutan (makhluk halus), melaksanakan upacara pemotongan hewan (ayam, lambing, dan kerbau), penepungtawaran bibit padi, pemeliharaan dan pengawasan padi yang mulai bunting untuk berbuah, pemotongan padi dengan menggunakan tuai (ani-ani), dan mengirik padi secara bergotong royong. Budaya pertanian Melayu bersifat kampung dan tradisional tidak dapat dilepaskan dari kepercayaan dan adat yang berkaitan dengan masyarakat pendukung pertanian itu sendiri.\n" +
                    "\n" +
                    "Selain sebagai karya tradisi lisan, tradisi berahoi termasuk hasil kreasi tradisi masyarakat yang dikategorikan sebagai folklor karena is mengandung ungkapan berbentuk metrik, pantun, pepatah, lagu rakyat yang diujarkan secara lisan, mantra kepercayaan rakyat atau supertisi, dan sebagai tradisi, pertunjukan dan tari.\n" +
                    "\n" +
                    "Seorang warga masyarakat yang berhajat menyelenggarakan tradisi berahoi mengundang anak-anak beru yang tua dan muda dan menyerahkan secara langsung kepada anak beru untuk menyelenggarakan tradisi berahoi. Tugas yang diterima oleh anak beru adalah mengundang kawan-kawan sebaya, yakni anak beru yang muda mengundang para pemuda, sedangkan anak beru yang tua mengundang orang tua-tua baik lelaki maupun perempuan.\n" +
                    "\n" +
                    "Sebelum waktu berahoi, ahli bait mengutus anak beru mendatangi orang-orang yang sedang berahoi ditempat lain. Pada kesempatan itu utusan ahli bait mengundang para pemuda yang sedang beristirahat satu ronde dalam berahoi. Setepak sirih disorongkan oleh anak beru sang ahli bait sewaktu datang mengundang untuk mengerik padi pada malam dan waktu yang ditentukan ke rumah ahli bait yang menyelenggarakan berahoi.\n" +
                    "\n" +
                    "Pada waktu tiga hari lagi mendekati hari pelaksanaan tradisi berahoi, para famili dekat berdatangan ke rumah ahli bait. Mereka bergotong royong membersihkan tempat berahoi, membuat teratak, menungkati rumah dan membuat selang. Pada kegiatan lain, kaum ibu mengambil kayu api.\n" +
                    "\n" +
                    "Pada zaman dahulu, kegiatan tradisi berahoi ini merupakan arena pertemuan bagi pemuda dan gadis Melayu untuk saling memulai perkenalan dan mencari jodoh. Menurut penjelasan informan (Bapak Adenan, usia 75 tahun, 2 Januari 2013) pada kegiatan tradisi berahoi permainan berbalas pantun berikat (pantun berkait) dilantunkan pemuda ketika saat istirahat. Permainan berbalas pantun sebagai seni bertutur masyarakat Melayu Bahorok (Langkat) ini dipakai sebagai cara berkomunikasi antar muda-mudi dan dijadikan peluang untuk mengajuk hati, biasanya dilakukan sambil berlagu dan berahoi pada masa istirahat setelah letih bekerja atau mengirik padi. Arena (gelanggang) berahoi biasanya dibuat di halaman rumah. Para pemuda dan beberapa orang tua bergotong royong mengirik padi dan membersihkan bulir-bulir padi yang terpisah dari tangkai (yang disebut ruman). Anak-anak gadis Melayu berada di pelataran rumah panggung dan dari atas mereka melihat dan mengintip sejumlah pemuda di bawah yang sedang berahoi. Apabila masa istirahat (sehabis satu ronde), para pemuda membungkus rokok daun beserta tembakau dan melempar ke atas pelataran, tempat anak-anak gadis duduk bercengkrama, bersendagurau. Para anak gadis menyambut lemparan bungkusan yang dilemparkan si pemuda tadi dan mulai melinting (menggulung rokok). Setelah ronde kedua, berahoi dimulai, maka rokok yang sudah digulung sang gadis diberikan kembali kepada si pemuda."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483949213.jpg"
            , "https://t-2.tstatic.net/tribunmedanwiki/foto/bank/images/tari-berahoi.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("14","rumah gudang", "benda", "sumatra barat"
            , "Kaedah kreativitas pada Rumah Gadang diwujudkan melalui simbol yang terbalut oleh makna-makna yang mengidentifikasi dan mengarahkan tingkah laku masyarakat pemilik budayanya. Atapnya yang memiliki gonjong dan bentuk rumah yang besar seperti kapal yang berada dua meter di atas permukaan tanah, memberi makna kemegahan budaya masyarakat Minangkabau. Sela in itu, Rumah Gadang memiliki fungsi yang lekat dalam kehidupan sehari-hari warga masyarakatnya yang juga dijadikan \"alat\" untuk memahami karakter empunya budayanya, seperti yang tertulis dalam sastra klasik Minangkabau.\n" +
                    "\n" +
                    "Rumah Gadang dapat dibedakan berdasarkan jumlah ruang yang ada di dalamnya. Jumlah ruang ini juga mempengaruhi besaran bangunan (terutama panjang bangunan) pada masing-masing kategori Rumah Gadang. Ada tiga jenis Ru mah Gadang, yaitu :\n" +
                    "\n" +
                    "1) Rumah Gadang baanjuang kecil, terdiri atas 5 ruang di dalamnya\n" +
                    "\n" +
                    "2) Rumah Gadang bagonjong, terdiri atas 7 ruang di dalamnya\n" +
                    "\n" +
                    "3) Rumah Gadang baanjuang besar, terdiri atas 9 ruang di dalamnya\n" +
                    "\n" +
                    "Rumah gadang yang baanjuang adalah rumah gadang yang pada bagian sisi bangunannya memiliki ruang tambahan seperti bentuk anjung-anjung, yaitu punggung di buritan perahu; atau panggung di kapal tempat memberi aba-aba. Dalam pembahasan mengenai rumah gadang, bagian anjung-anjung adalah bagian rumah yang merupakan tambahan yang berada di sisi kanan-kiri rumah, yang lantainya lebih tinggi dari lantai rumah.\n" +
                    "\n" +
                    "Pada bagian tampak sisi anjung-anjung terdapat barmacam-macam bentuk ukiran. Setiap nama ukiran pada rumah gadang melambangkan suatu gejala hid up dalam masyarakat, apakah gejala itu merupakan gambaran kehidupan alam maupun melambangkan nilai-nilai kehidupan dalam masyarakat (Syamsidar, ed., 1991 : 78). Seperti yang tertulis dalam Tombo Alam Minangkabau, disebutkan bahwa setiap tindakan orang di dalam rumah gadang juga harus berdasarkan adatnya seperti yang tercermin di dalam ukiran-ukiran dalam rumah adat tersebut.\n" +
                    "\n" +
                    "Tindakan orang di dalam rumah gadang harus berdasarkan adatnya, salah satu contohnya adat menaiki anak tangga yang berada di depan rumah gadang. Menurut aturan adat yang berlaku di Nagari Sumpur, ada istilah \"Bajanjang naik, batanggao turun;' artinya, dalam menaiki tangga tidak boleh ada anak tangga yang dilompati (tidak diinjak) atau anak tangga harus diinjak secara berurutan. Sela in itu ada juga hubungan antara tata ruang rumah gadang dengan adat menerima tamu. Contohnya, jika tamu sudah masuk ke dalam rumah, maka posisi duduknya tidak boleh menghadap pintu kamar, karena dikhawatirkan hal-hal yang bersifat pribadi yang ada di balik pintu itu terlihat oleh orang luar. Justru ninik mamak yang harus menghadap pintu kamar, agar dapat memperingatkan jika ada sesuatu yang tidak pantas yang terjadi di balik pintu kamar itu."
            , ""
            , "https://img.inews.co.id/media/822/files/inews_new/2021/07/24/rumah_gadang.jpg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483946099.jpg"
            , "https://courtina.id/ot/wp-content/uploads/2020/12/rumah-gadang.jpg"
            , ""
            , "")
//        dbHelper.insertData("","", "", ""
//            , ""
//            , ""
//            , ""
//            , ""
//            , ""
//            , ""
//            , "")
        //dbHelper.close()
    }
}