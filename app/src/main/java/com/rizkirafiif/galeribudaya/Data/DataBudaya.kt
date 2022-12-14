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
        dbHelper.insertData("3","tari piriang (tari piring)", "tarian", "sumatra barat"
            , "Tari Piring termasuk salah satu tari tradisional khas Minangkabau yang berumur ratusan tahun. Awalnya, tari ini dilakukan sebagai ritual guna mengucapkan rasa syukur masyarakat setempat kepada dewa-dewa karena mendapatkan hasil panen yang melimpah ruah. Ritual dilakukan oleh beberapa gadis cantik dengan membawa sesaji dalam bentuk makanan yang diletakkan di dalam piring. Para gadis tersebut didandani dengan pakaian yang bagus lalu mereka membawa makanan dalam piring sembari melangkah dengan gerakan yang dinamis. Setelah Islam masuk ke Minangkabau, tradisi Tari Piring tetap dilangsungkan. Akan tetapi, tari tersebut hanya ditampilkan sebagai sarana hiburan bagi masyarakat banyak pada acara-acara keramaian (pesta), seperti: pesta adat, pesta pernikahan, dan lain-lain. Beberapa tahun terakhir ini, pemerintah Sumatra Barat mengambil satu kebijakan untuk menjadikan Tari Piring sebagai salah satu aset untuk menarik para wisatawan berkunjung ke Sumatra Barat.Tarian ini dimainkan dengan menggunakan piring sebagai media utama. Para penari Tari Piring memainkan piring dengan cekatan tanpa terlepas dari genggaman sembari bergoyang dengan gerakan yang mengalir lembut dan teratur. Di samping itu, para penari juga sering melakukan tarian di atas pecahan kaca. Mereka menari, melompat-lompat, dan berguling-guling sembari membawa piring di atas pecahan kaca. Uniknya, para penari tersebut tidak terluka sedikitpun dan piring yang mereka bawa tidak jatuh."
            , ""
            , "https://asset.kompas.com/crops/L24Yf9OsnAq5gX8thjs9uhtlymQ=/85x43:598x384/750x500/data/photo/2021/12/21/61c1b92e7a7d9.jpg"
            , "https://1.bp.blogspot.com/-WGVG0CwtnJA/YRJfXYfDGmI/AAAAAAAADck/rTgxzos91kERzZrwOxJqiD8f6Pf3TBb8QCLcBGAsYHQ/w1200-h630-p-k-no-nu/03%2B-%2BTari%2BPiring.jpg"
            , "https://www.kabarsumbar.com/wp-content/uploads/2022/09/3.jpeg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483674061.jpg"
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
        dbHelper.insertData("15","randang (rendang)", "makanan", "sumatra barat"
            , "Rendang atau rondang dalam bahasa Minangkabau adalah salah satu makanan tradisional khas Minangkabau yang sangat terkenal di seluruh penjuru Nusantara. Randang sangat dikenal, baik di dalam maupun di luar negeri sebagai masakan dari Padang se hingga seringkali penyebutan rendang adalah rendang padang, bukan rendang Minangkabau. Padahal, daerah penghasil rondang itu sendiri adalah seluruh daerah yang ada di Sumatera Barat, tidak hanya di kota Padang. Rendang atau rondang adalah istilah yang digunakan secara umum di Minangkabau untuk menyatakan salah satu makanan atau masakan sebagai lauk ketika makan nasi. Randang memiliki sebutan yang berbeda-beda dalam masing-masing subsuku bangsa di Minangkabau. Ada yang menyebutnya rondang, andang, dan ondang, tergantung dialek masing-masing daerah. Penyebutan randang sebagai rendang Padang dilakukan oleh orang di luar Sumatera Barat (di rantau) karena orang selain lebih mengenal orang Minangkabau sebagai orang Padang juga karena Padang adalah ibukota Provinsi Sumatera Barat. Apabila disebut rondang, secara otomatis dalam pikiran seseorang yang terbayang adalah sebuah olahan masakan berbahan dasar daging dan santan yang dipadu dengan bumbu rempah-rempah. Randang tersebut memiliki beberapa warna, yakni merah kecoklatan, coklat, sampai coklat kehitaman.\n" +
                    "\n" +
                    "Sejarah randang diketahui telah ada pada tahun 1550 Masehi. Randang juga disebut dalam banyak kesusasteraan Melayu klasik seperti Hikayat Amir Hamzah yang membuktikannya sebagai masakan Melayu sejak 1550-an''. Buzurjumhur Hakim pun pergi pula ke kedai orang merendang daging kambing, lalu ia berkata: \"Beri apalah daging kambing rendangini barang segumpal:' Sahut orang merendang itu, \"Berilah harganya dahulu:' Meskipun demikian Randang diketahui telah ada di Sumatera Barat sebelum agama Islam masuk ke Sumatera Barat. Jika demikian, maka randang dianggap sudah ada sebelum masuknya Islam ke Sumatera Barat Artinya, randang sudah ada jauh sebelum abad VII Masehi karena Islam masuk ke Sumatera Barat pada tahun 674 Masehi dengan bukti adanya masyarakat Arab di daerah pesisir Pulau Sumatera. Akan tetapi bukti fisik keberadaan randang tersebut belum dapat ditemukan.\n" +
                    "\n" +
                    "Pengertian randong diambil dari kata morandong, yakni suatu proses pengolahan lauk berbahan dasar santan yang dimasak sampai kandungan airnya berkurang, bahkan sampai kering sehingga apabila disebut randong itu artinya olahan masakan yang kering tanpa mengandung air.\n" +
                    "\n" +
                    "Campuran santan dan bumbu yang telah kering menghasilkan warna coklat kehitaman yang enak. Akan tetapi, di beberapa daerah di Sumatera Barat, olahan randong tidak selalu berwarna coklat kehitaman. Bentuk akhirnya terbagi menjadi dua jenis, yakni randong kering dan randong basah (kolio). Rondong kering adalah rondong yang sudah berwarna coklat kehitaman, sedangkan randong basah adalah rondong yang masih berwarna merah kecoklatan sampai coklat.\n" +
                    "\n" +
                    "Randang juga dapat diartikan sebagai makanan yang \"diawetkan\" melalui proses pemanasan beberapa kali. Randang tercipta karena pada waktu dulu orang yang memasak daging yang banyak dengan santan dan bumbu tertentu sehingga tak habis dalam sehari, kemudian malam harinya dihangatkan, dan tidak habis juga. Agar tidak basi dan tidak terbuang, kembali keesokan harinya dihangatkan sampai pada akhirnya bumbu randang itu kering. Oleh karena itu, randang yang sebenarnya adalah kering air. Keringnya suatu randang menjadikannya tahan dan awet. Jadi, randang adalah sebuah olahan masakan dengan cara dirandang yakni dimasak dengan api sangai (api sangat kecil yang diatur agar jangan sampai menghanguskan) sampai kering yang proses memasaknya dilakukan secara tradisional, yakni dimasak di atas tungku dengan menggunakan kayu bakar. Pada awalnya dimasak dengan api besar, lalu dilanjutkan dengan menggunakan api sangai yang berasal dari pembakaran sabut kelapa. Proses memasak dari santan yang banyak mengandung air atau gulai, kemudian berkurang air menjadi ka/io, dan dilanjutkan dengan memasak kering air itulah yang disebut randang."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483945991.jpg"
            , "https://asset.kompas.com/crops/qoZw5itTDfNAU86nkWh56hcmSMc=/0x0:0x0/750x500/data/photo/2015/12/16/0556233randang-itammp.jpg"
            , "https://cdn-2.tstatic.net/tribunnews/foto/bank/images/rendang_20181004_110845.jpg"
            , "https://img-global.cpcdn.com/recipes/3e328461099bcec8/680x482cq70/randang-padang-rendang-sapi-asli-padang-foto-resep-utama.jpg"
            , "")
        dbHelper.insertData("16","tari toga", "tarian", "sumatra barat"
            , "Tani Toga yang artinya \"Tari Larangan\" adalah tari tradisional kuno Kerajaan Siguntur, kerajaan yang masih berhubungan dengan Kerajaan Minangkabau di Pagaruyung dan konon masih berhubungan dengan Kerajaan Malayu Dharmasraya di zaman Hindu-Buddha. Karena masih berhubungan dengan Minangkabau dan Malayu, beberapa gerak tari ini mirip dengan tari minang dan melayu.\n" +
                    "\n" +
                    "Menurut Pewaris Kerajaan Siguntur, Tani Toga merupakan tari resmi kerajaan sejak zaman Kerajaan Dharmasraya yang berpusat di Siguntur pada abad ke-14. Tari ini masih dipakai ketika Kerajaan Hindu-Buddha itu beralih ke Islam yang salah satu di antaranya menjadi Kerajaan Siguntur sejak abad ke-15 atau tahun 1673 dengan raja Islam pertama Sutan Abdul Jalil Sutan Syah Tuanku Bagindo Ratu.\n" +
                    "\n" +
                    "Waktu itu Tari Toga menjadi tari resmi kerajaan dan ditampilkan pada upacara penobatan raja (batagak gala), pesta perkawinan keluarga raja, upacara turun mandi anak raja, perayaan kemenangan pertempuran, dan gelanggang mencari jodoh putri raja.\n" +
                    "\n" +
                    "Ketika Belanda berhasil masuk ke Siguntur pada 1908 dan raja-raja di Siguntur dan sekitarnya terpaksa mengakui kedaulatan Pemerintahan Kolonial Belanda, raja kehilangan kedaulatannya. Banyak benda kerajaan yang diambil, termasuk tambo (riwayat kerajaan yang tertulis) dan aktivitas kesenian kerajaan, termasuk Tari Toga, pun vakum sudah.\n" +
                    "\n" +
                    "\"Tari Toga nyaris hilang, tan itu sudah lama tidak dimainkan dan hanya diingat dengan cerita turun-temurun, saya mengumpulkan informasi lagi dan menghidupkan kembali pada 1989,\" kata Tuan Putri Marhasnida, salah seorang pewaris Kerajaan Siguntur kepada PadangKini.com. Marhasnida adalah adik sepupu raja sekarang, Sultan Hendri Tuanku Bagindo Ratu.\n" +
                    "\n" +
                    "Ketika dirintis Marhasnida pada 1980-an, para penari dan pendendang sudah banyak yang meninggal. Untunglah ada seorang kakek yang usianya sudah lebih 80 tahun. Ia bekas pendendang yang masih hidup. Sang kakek masih hafal semua dendang Tani Toga karena sejak tidak lagi berdendang, is sering melantunkan dendangnya ketika Batobo. Batobo adalah membersihkan kebun atau menyabit di sawah bersama-sama, 30 sampai 60 orang. Si pendendang selalu Batobo agar orang-orang tak bosan bekerja seharian, ia disuruh berdendang sambil bekerja.\n" +
                    "\n" +
                    "\"Itulah sebabnya syair tetap diingat, sedangkan tarinya masih ada seorang nenek yang sudah bungkuk mengingatnya, dari ingatan itulah saya susun kembali dan melatih remaja di keluarga Kerajaan Siguntur untuk menarikan Tani Toga,\" kata sarjana pendidikan seni Institut Kejuruan dan Ilmu Pendidikan (IKIP) Padang (kini Universitas Negeri Padang) yang kini menjadi guru kesenian di SMP Negeri II Pulau Punjung, Dharmasraya itu.\n" +
                    "\n" +
                    "Tari Toga modifikasi Marhasnida ini kemudian ditampilkan di Radio Republik Indonesia (RRI) Padang pada 1990 dan dimainkan dalam berbagai acara Kerajaan Siguntur, termasuk menyambut peserta \"Arung Sejarah Bahari Ekspedisi Pamalayu\" yang diselenggarakan Balai Pelestarian Sejarah dan Nilai Tradisional Padang, akhir Desember 2007."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483949490.jpg"
            , "https://cdn.antaranews.com/cache/730x487/2019/09/12/pkk2.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("17","tato mentawai", "non benda", "sumatra barat"
            , "Tato Mentawai adalah seni rupa masyarakat adat Mentawai Kepulauan Mentawai. Dalam masyarakatnya Mentawai tato merupakan peninggalan masyarakat prasejarah dari kebudayaan Neolithik. Penatoan dimulai dari telapak tangan, tangan, kaki, lalu ke seluruh tubuh. Pertama-tama, pada badan si anak dibuat gambar sketsa dengan menggunakan lidi. Setelah itu, dimasukkan zat pewarna ke dalam lapisan kulit dengan cara menusukkan jarum sambil dipukul perlahan. Jarum yang digunakan terbuat dari tulang hewan atau kayu karai yang diruncingkan. Adapun pewarna yang digunakan adalah campuran arang tempurung kelapa dan daun pisang. Setelah pewarna tadi masuk ke lapisan kulit, selesailah penatoan. Bahan pewarna tadi akan terserap permanen di kulit."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483949889.jpg"
            , "https://cdns.klimg.com/newshub.id/news/2014/11/17/19627/657x328-5-hal-menarik-tentang-tatto-mentawai-yang-perlu-kamu-ketahui-141117z.jpg"
            , "https://jernih.co/wp-content/uploads/tato-mentawai.jpg"
            , "https://www.vantage.id/wp-content/uploads/2022/02/Tato-Mentawai-foto-suratkabar.id_-800x400.jpg"
            , "")
        dbHelper.insertData("18","songket silungkang", "pakaian", "sumatra barat"
            , "Identifikasi dan Defenisi \n" +
                    "\n" +
                    "Songket adalah hasil kerajinan yang berupa bahan (kain) yang dibuat dari benang (kapas, sutra, dan sebagainya) dengan cara memasuk-masukan pakan secara melintang pada  lunsing. Songket Berasal dari istilah sungkit, dalam bahasa Melayu dan Indonesia berarti “mengait” atau “mencungkil”. Hal ini berkaitan dengan metode pembuatannya, mengaitkan dan mengambil benang dengan jumlah tertentu.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Sejarah \n" +
                    "\n" +
                    "Banyak sekali informasi mengenai sejarah pertenunan Silungkang Sampai sekarang tidak ada kepastian tahun berapa penduduk Silungkang memiliki kepandaian bertenun? Banyak sekali informasi yang masih simpang siur mengenai asal usul sejarah tenun songket ini. Ada yang mengatakan bahwa bertenun sudah dibawa dari nenek moyang Silungkang dari daerah asal ke Silungkang (Munir Taher). Dimana kah daerah asal itu, apakah dari Taratak Boncah yang datang dari Pariangan Padang Panjang, sebuah nagari kecil yang selalu dirujuk sebagai daerah asal oleh berbagai nagari lain di Sumatera Barat, termasuk nagari Silungkang. Jika dikatakan bahwa perpindahan penduduk terjadi pada abad ke 6, maka tentu nenek moyang orang Silungkang sudah membawa kepandaian menenun dari negeri asal, apakah dari nagari Taratak Boncah atau dari nagari Priangan, Padang Panjang sebagai perpindahan awal. Nagari Priangan ini adalah nagari tempat para pedagang India bermukim untuk sementara menunggu produksi emas yang datang dari nagari Saruaso (Dobbin, 1977;1983). Kalau memang demikian, tentu saja hasil tenun awal sangat sederhana.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Aspek Sosial \n" +
                    "\n" +
                    "Silungkang adalah bagian dari Wilayah Minangkabau yang manganut sistem kekerabatan berdasarkan keturanan ibu matrilineal yaitu garis keturunan ibu. Kerena sistem pewarisan harta pusaka tinggi menurut keturan ibu, sedangka laki-laki sebagi penjaga harta pusaka, hal ini membuat laik-laki Minangkabau untuk merantau. Sesuai dengan ungkapan “karatau madang di hulu, babuah babungo balun, marantau bujang dahulu, dirumah paguno balun”."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201900831-penetapan-1_1566287445.jpg"
            , "https://www.tribunsumbar.com/wp-content/uploads/2019/09/IMG-20190909-WA0002.jpg"
            , "https://static.republika.co.id/uploads/images/inpicture_slide/koleksi-terbaru-shafira-menggunakan-sarung-majalaya-dan-songket-silungkang-_160309100304-896.jpg"
            , ""
            , "")

        dbHelper.insertData("19","joget sonde", "tarian", "riau"
            , "Tari Tradisi Joget Sonde merupakan tarian yang berasal dari Desa Sonde yang ada di Kecamatan Rangsang, Pesisir Kabupaten Kepulauan Meranti yang dikoreografi (diciptakan) oleh Cik Minah yang merupakan masyarakat asli Suku Akit dari Desa Sonde, Kecamatan Rangsang Pesisir, Kabupaten Kepulauan Meranti. Pada awalnya Joget Sonde ini diciptakan untuk mengungkapkan kebahagiaan si koreografer dan hanya sebagai sebuah tarian bergembira dan tarian hiburan. Karena tari ini terciptanya di Desa Sonde maka diberilah nama dengan sebutan Tari Joget Sonde. Sejarah Desa Sonde itu sendiri adalah pada zaman dahulu pohon sonde hanya terdapat di daerah kampung tersebut, di mana getah pohon sonde tersebut bisa dijual dengan harga yang tinggi. Karena banyak orang yang pergi mengambil kayu sonde dan daerah tersebut tidak memiliki nama maka masyarakat setempat memberi nama Sonde.Tari Tradisi Joget Sonde dalam kehidupan masyarakat Sonde, Kecamatan Rangsang Pesisir mempunyai peranan yang sangat penting sebagai sarana hiburan. Tari ini dapat membangun solidaritas yang tinggi dalam lingkungan masyarakat karena mengajarkan kepada generasi mudanya bagaimana bekerja sama dan membina rasa kekeluargaan antar masyarakat. Tari Tradisi Joget Sonde dipertunjukkan pertama kali di pada tahun 1960-an dalam acara pesta perkawinan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483591908.jpg"
            , "https://kebudayaan.kemdikbud.go.id/ditwdb/wp-content/uploads/sites/9/2016/11/20160123_2120101.jpg"
            , "https://www.riautelevisi.com/foto_berita/22joget-sonde.jpg"
            , ""
            , "")
        dbHelper.insertData("20","nyanyi panjang", "non benda", "riau"
            , "Nyanyi Panjang merupakan jenis sastra lisan bercorak naratif (cerita) yang dipertunjukan oleh tukang nyanyi panjang dengan cara dinyanyikan atau lagukan. Nyanyi Panjang mengandung arti Nyanyi yang bermakna pertunjukan dan Panjang yang bermakna waktu yang diperlukan untuk penyampaiannya. Oleh karena itu, Nyanyi Panjang adalah suatu cerita yang dinyanyikan atau dilagukan dengan penyampaian yang memakan waktu panjang atau lama, biasanya lebih dari satu malam untuk satu cerita. Cerita-cerita tersebut disampaikan oleh tukang cerita (kadangkala dipanggil dengan sebutan tukang Nyanyi Panjang) dengan menggunakan lagu dan irama tertentu yang sesuai dengan judul cerita tersebut.Nyanyi Panjang merupakan cerita tokoh yang mempunyai kekuatan supranatural yang didapatkan melalui berbagai cara. Nyanyi Panjang ini murni hasil kreatifitas masyarakat dan menjadi milik bersama, kemudian diwarisakan secara turun temurun dengan cara berguru pada tukang cerita. Tidak ada buku rujukan yang mereka jadikan pegangan. Karena itu, Nyanyi Panjang termasuk kategori kelisanan primer. Dalam pertunjukan Nyanyi Panjang, ada empat unsur yang saling berkaitan dan mempengaruhi yaitu: tukang cerita, cerita, suasana pertunjukan dan penonton."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483591165.jpg"
            , "https://1001indonesia.net/asset/2022/12/Nyanyi-Panjang-1.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("21","rumah lontiok", "benda", "riau"
            , "Orang Kampar meyakini bahwa nenek moyang mereka datang ke daerah Kampar melalui jalur laut dan kemudian menyusuri Sungai Kampar hingga ke hulu yang dahulu dikenal dengan nama lauik ombun (laut embun). Nenek moyang tersebut juga diyakini sebagai komunitas yang hidup bergantung dari laut dan sungai. Pada awalnya mereka belum memiliki rumah atau tempat tinggal di darat, melainkan tinggal di dalam sampan kajang. Setelah beberapa lama menjalani hidup di dalam sampan, muncul dorongan untuk memiliki sebuah tempat tinggal yang lebih besar dan lebih nyaman. Maka kemudian mereka membuat tempat tinggal di darat dengan menggunakan kayu dan bahan-bahan yang disediakan oleh alam. Pada saat membuat tempat tinggal tersebut, para nenek moyang ini tidak ingin melupakan asal usul mereka yang pernah hidup di sampan. Maka dibuatlah sebuah tempat tinggal yang atapnya dibuat melentik ke atas sehingga menyerupai sampan kajang yang pernah mereka tinggali. Rumah-rumah lontiok ini dibuat dipinggir Sungai Kampar dan menghadap ke sungai. Lama kelamaan jenis rumah ini semakin banyak dibangun dan terbentuklah kampung-kampung yang didasarkan atas hubungan persukuan (klan). Rumah Lontiok merupakan rumah tradisi Orang Ocu di Kabupaten Kampar. Rumah ini tidak hanya digunakan sebagai rumah tinggal tetapi juga digunakan sebagai tempat pelaksanaan perayaan dan upacara adat setempat. Rumah lontiok dibuat berbentuk persegi panjang. Tiang pada dinding rumah lontiok dibuat sedikit condong, karena meniru tajuk sampan. Pada bagian depan rumah ada yang dibuat anjungan dan ada pula yang tidak. Anjungan ini berfungsi untuk melindungi bagian tangga rumah dari hujan dan panas, sehingga apabila hujan tiba, lantai rumah tidak langsung terkena air hujan. Atap rumah lontiok dibuat berbentuk atap kajang dan dibuat lontiok (lentik) pada kedua ujung atapnya sehingga terlihat berbentuk haluan dan buritan sampan. Bagian dalam rumah terbagi dalam tiga ruangan yang disebut bawah, tonga dan biliok. Pada zaman dahulu, tahapan membuat rumah lontiok dimulai dengan berunding. Perundingan dilakukan secara bertingkat dan dimulai dari perundingan di dalam keluarga luas menurut garis keturunan matrilineal atau yang disebut sapowuik (satu perut). Setelah dicapai kata mufakat, maka dilanjutkan perundingan ditingkat persukuan. Perundingan ini bertujuan untuk meminta bantuan anggota persukuan dan sekaligus meminta izin mendirikan rumah lontiok kepada penghulu suku. Setelah dicapai kata mufakat, maka dilakukanlah pencarian kayu di hutan. Mengambil kayu untuk pertama kali tidak boleh dilakukan sembarangan. Pengambilan harus dilakukan oleh orang yang dituakan dalam powuik, setelah itu barulah dilanjutkan oleh anggota keluarga/persukuan yang lainnya."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/Rumah%20Lontiok.jpg"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1632745495/u6fcfrgbatjvqz2m7rhd.jpg"
            , "https://katasumbar.com/wp-content/uploads/2021/09/IMG_20210921_131211_resize_9.jpg"
            , ""
            , "")
        dbHelper.insertData("22","tenun siak", "pakaian", "riau"
            , "Perkembangan Tenun Siakbermula ketika Siak diperintah oleh Sultan Said Syarif Ali, sekitar tahun 1800, ketika usaha kerajinan tenun ini mulai dikenal luas. Menurut sejarah pada masa lalu ada seorang bernama Encik Siti binti E. Wan Karim yang berasal dari Trengganu, yang tenunannya menggunakan benang sutera, katun dan emas. Tenunan itu sangat disenangi oleh kalangan istana. la kemudian mengembangkan motif tradisional dan membuat ciptaan baru sehingga dikenal dan disukai kembali setelah usaha kerajinan tenun ini agak terlupakan. Hingga kini, penenun Siak dianggap lebih teguh mengembangkan corak asli Melayu, yaitu pucuk rebung, awan larat, bunga cengkih, tampuk manggis, semut beriring, siku keluang, dan itik pulang petang.\n" +
                    "\n" +
                    "Pakaian Melayu yang lengkap di buat dari bahan tenunan. Kata tenun, menurut Kamus Besar Bahasa Indonesia, berarti 'hasil kerajinan yang berupa bahan (kain) dibuat dari benang (kapas, sutra, dan sebagainya) dengan cara memasuk-masukkan pakan secara melintang pada lungsi (benang yng membujur)'. Berdasarkan pada pengertian tersebut, kata menenun diartikan sebagai 'membuat barang-barang tenun (dari benang, kapas, sutera, dan sebagainya)'. Selanjutnya, dijelaskan tenunan adalah 'hasil menenun, barang-barang yang ditenun'. Prinsip dasar pekerjaan menenun adalah mempersatukan benang yang melintang dengan benang yang membujur dengan cara-cara tertentu.\n" +
                    "\n" +
                    "Hasil tenunan ini dihiasi dengan berbagi corak. Corak tesebut ada yang berasal dari kelompok mayarakat itu sendiri dan ada pula yang datang atau diambil dari mayarakat lain melalui berbagai cara dan proses. Bagi orang Melayu Riau, corak tak hanya menjadi hiasan semata, tetapi juga merupakan lambang yang mengandung makna dan falsafah tertentu yang sarat berisi nilai-nilai luhur budaya tempatan. Dengan demikian, kedudukan corak menjadi semakin kokoh dan berfungsi pula sebagai penyebarluasan nilai-nilai luhur yang dimaksud.\n" +
                    "\n" +
                    "Corak dasar Melayu Riau umum bersumber dari alam, yakni terdiri atas flora, fauna, dan benda-benda angkasa. Benda-benda itulah yang direka-reka dalam bentuk-bentuk tertentu, baik menu rut bentuk asalnya seperti bunga kundur, bunga hutan, maupun dalam bentuk yang sudah diabstrakkan atau dimodifikasi sehingga tak lagi menampakkan wujud asalnya, tetapi hanya menggunakan namanya saja seperti itik pulang petang, semut beriring dan lebah bergantung. Diantara corak-corak tersebut, yang terbanyak dipakai adalah yang bersumber pada tumbuh-tumbuhan. Hal ini terjadi karena orang Melayu umumnya beragama Islam sehingga corak hewan dikhawatirkan menjurus kepada ha I-ha I yang berbau \"keberhalaan\".\n" +
                    "\n" +
                    "Nama-nama corak tersebut antara lain; bunga kundur, bunga melati, bunga setaman, kuntum takjadi, kuntum merekah, daun sirih, daun keladi, tampuk manggis, buah hutan, buah delima, kaluk pakis (kaluk paku), akar berpilin, pucuk rebung, itik pulang petang, semut beriring, balam dua setengger, ikan sekawan, bintang bertabur, awan /arat, segi empat, segi limo dan lain-lain. Masing-masing corak mengandung makna dan falsafah tertentu. Nilai-nilainya mengacu kepada sifat-sifat asal dari setiap benda atau makhluk yang dijadikan corak, yang dipadukan dengan nilai-nilai kepercayaan dan budaya tempatan, kemudian disimpai dengan nilai-nilai luhur agama Islam. Nilai ketaqwaan kepada Allah tertuang dalam motif bintang-bintang. Nilai-nilai kerukunan tertuang dalam corak balam dua setengger, akar berpilin dan kembang setaman, semut beriring, itik pulang petang, ikan sekawan dan sebagainya. Nilai kasih sayang tertuang dalam hampir semua corak bunga-bungaan; seperti bunga kundur, bunga melati, kembang setaman dan lain-lain. Nilai kesuburan tertuang dalam corakpucuk rebung dengan segala variasinya. Nilai tahu diri tertuang dalam corak kaluk paku, awan larat dan lainnya."
            , ""
            , "https://i1.wp.com/web.siakkab.go.id/wp-content/uploads/2019/10/71926911_1111862795671404_235814135709827072_n.jpg?resize=720%2C393&ssl=1"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201300013-penetapan-3_1530864153.jpg"
            , "https://www.melayupedia.com/foto_berita/2021/11/2021-11-15-kain-tenun-siak-yang-melambangkan-kearifan-lokal.jpg"
            , ""
            , "")
        dbHelper.insertData("23","gulai belacan", "makanan", "riau"
            , "Makanan khas Riau lain yang juga tak kalah populer adalah gulai belacan.\n" +
                    "\n" +
                    "Ini adalah sajian gulai yang menggunakan olahan udang berkuah kental yang terbuat dari santan.\n" +
                    "\n" +
                    "Kuah gulainya memiliki cita rasa khas yang terbuat dari campuran kemiri, lada, dan juga asam jawa.\n" +
                    "\n" +
                    "Biasanya, Moms akan menemukan olahan gulai belacan dari udang air tawar atau udang laut.\n" +
                    "\n" +
                    "Keduanya adalah hidangan nikmat untuk dikombinasikan dengan kuah kental bercita rasa khas dan disantap dengan nasi putih yang hangat."
            , ""
            , "https://cdn-cas.orami.co.id/parenting/images/makanan_khas_riau_-_gulai_belacan.width-1000.jpg"
            , "https://img-global.cpcdn.com/recipes/25fbdfeba9fe5d3c/1200x630cq70/photo.jpg"
            , "https://asset.kompas.com/crops/H1mnflx4Yj2I0eCQ3mPJPg3ydoU=/0x272:750x772/750x500/data/photo/2022/11/16/637438e9afa56.jpg"
            , ""
            , "")
        dbHelper.insertData("24","aksara kagangara (aksara incung)", "non benda", "jambi"
            , "Aksara Incung terdapat di alam kerinci meliputi Kota Sungai Penuh dan Kabupaten Kerinci, Provinsi Jambi dan merupakan satu-satunya suku yang memiliki aksara sendiri di Sumatera Tengah. Hal ini dibuktikan dengan adanya naskah-naskah kuno berumur ratusan tahun lebih yang telah menggunakan aksara incung. Pada umumnya dipakai saat acara penobatan para pemangku adat. Saat ini masih dapat ditemui beberapa orang budayawan dan tokoh masyarakat yang masih dapat membaca dan memahami aksara incung tersebut, diantaranya adalah : Depati H. Amiruddin Gusti, Depati H. Alimin, Iskandar Zakaria, dan Depati Hasril Meizal. Sampai saat ini naskah-naskah kuno yang beraksara incung (Ka-Ga-Nga) masih disimpan oleh masyarakat adat suku kerinci, dan bahasa yang dipakai dalam naskah tersebut adalah bahasa kerinci kuno yaitu bahasa Lingua Franca suku kerinci masa lalu. Dalam naskah aksara incung terdapat kata-kata dan ungkapan yang sulit untuk dimengerti bila dihubungkan dengan bahasa dan dialek yang digunakan masyarakat pengguna bahasa kerinci sekarang, karena aksara incung tersebut tidak menurut dialek desa tempatan yang ada di Kerinci, oleh karena itulah maka aksara incung pada hakekatnya disebut sebagai bagian dari sastra Indonesia lama/kuno. Diperkirakan masih terdapat 250 lebih naskah beraksara incung yang masih tersebar di Kerinci."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483950654.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("25","tari piring tujuh", "tarian", "jambi"
            , "Tari Piring Tujuh sudah hidup dan berkembang di Desa Teluk kayu PutihKecamatan VII Koto Kabupaten Tebo diperkirakan sejak tahun 1800 an. Menurut Ibu Sofia (berumur 65 tahun) yang biasa dipanggil nenek putih (karena beliau identik dengan tari piring tujuh dari desa Teluk Kayu Putih), beliau sudah melihat ibunya menarikan tarian ini, bahkan neneknya pun adalah penari tari Piring Tujuh ini. Beliau menyatakan bahwa dirinya adalah keturunan ke 3 dari pewarisan tari Piring Tujuh dan sekarang karena faktor usia dan kesehatan, nenek putih menurunkan tari Piring Tujuh kepada anaknya yang bernama Yusmanidar.Tari Piring Tujuh adalah sebuah tari tradisi yang sudah diwariskan melalui 4 generasi. Generasi pewaris terakhir adalah IbuYusmanidar. Dalam pelaksanaannya tari ini menggunakan piring sebanyak tujuh buah yang disusun lurus berbanjar. Selanjutnya piring tersebut dijadikan alas pijakan penari dalam bergerak. Artinya piring dijadikan alas menari dan dipijak, bukan menjadi properti tari. Properti tari yang digunakan adalah kipas sebanyak 2 buah, piring disusun di atas tikar pandan.Tari Piring Tujuh berfungsi sebagai hiburan pada saat pesta pernikahan ataupun acara-acara adat di Desa Teluk Kayu Putih. Adapun alat musik iringannya menggunakan gendang, kelintang, gong dan nyanyian atau lagu Putra."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485147106.jpg"
            , "https://www.gapuranews.com/wp-content/uploads/2016/03/Tari-Piring-Tujuh-Tarian-Melayu-Jambi.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("26","kompangan/hadrah", "non benda", "jambi"
            , "Kesenian Kompangan ini diperkirakan sudah ada sekitar tahun 1930-an dengan gaya khas Jambi. Mulai muncul di Kelurahan Tengah, Kecamatan Pelayangan, Kota Seberang. Tokoh sentral Kompangan adalah Bapak H. Burhanudin.Kompangan adalah seni pertunjukan untuk sebutan beberapa orang yang memainkan alat musik rebana. Lagu-lagu yang dilantunkan adalah syair-syair Islami. Awal penamaan untuk pertunjukan kesenian ini adalah kesenian rebana, kemudian berubah istilah menjadi kompangan. Cara memainkan pertunjukan seni ini adalah dengan menggunakan alat musik rebana yang dipukul-pukul dengan pola tertentu, serta dimainkan oleh 8 hingga 20 orang laki-laki."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485146833.jpg"
            , "https://1001indonesia.net/asset/2022/07/Kompangan-Jambi.jpg"
            , "https://v-images2.antarafoto.com/alat-musik-kompangan-o7mrf1-prv.jpg"
            , ""
            , "")
        dbHelper.insertData("27","ubat ramuan orang rimbo", "makanan", "jambi"
            , "Orang Rimbo yang memiliki pengetahuan mendasar mengenai hutan berikut segala sumber daya alam yang ada didalamnya, termasuk kemampuan pengetahuan dan pengobatan tradisional milik Orang Rimba ini. Orang Rimbo memiliki pengetahuan mengenai obat-obatan dengan sangat baik, yang disebut dengan ubat ramuon. Mereka bisa membedakan mana tumbuhan, cendawan, buah-buahan dan hewan beracun dan tidak beracun. Tumbuhan obat yang dipakai oleh Suku Anak Dalam secara turun temurun memiliki khasiat obat yang baik.\n" +
                    "\n" +
                    "Dan banyak penelitian telah dilakukan untuk melihat, membuktikan khasiat obat yang berasal dari ubat ramuon dan telah bertahun-tahun dimanfaatkan oleh Orang Rimbo. Ada berbagai jenis tumbuhan untuk ubat ramuan hasil penelitian dari Tim gabungan yang terdiri dari IPB, LIPI,UI dan KKI-Warsi tahun 1999 yang telah dimanfaatkan oleh Orang Rimba. Diantaranya hasil penelitian IPB tersebut antara lain menyebutkan bahwa telah ditemukan 137 ramuan yang berasal dari tumbuhan hutan atau ubat ramuon, diolah dengan cara yang sederhana, misalnya ada yang direbus lalu diminum airnya, dibakar atau dilayukan di atas perapian, dilumatkan atau digiling untuk diborehkan pada bagian tubuh yang sakit. Jika ramuon tidak lagi menyembuhkan, maka tindakan selanjutnya adalah dilakukan pengobatan secara magik dengan bantuan dukun Orang Rimba (malim), untuk memohon kesembuhan kepada Dewo-Dewo agar bisa mengusir roh jahat yang tengah mengganggu kehidupan mereka sehingga mendatangkan penyakit. Doa dilantunkan dalam bahasa rimbo yang sulit dimengerti dan kegiatan ini biasa disebut dengan istilah dedekiron. Ketika kegiatan dedekiron berlangsung, maka tidak bisa dilihat orang luar, karena bila dilihat oleh orang luar Dewa penyembuhan tidak mau datang. Sebuah keyakinan Orang Rimbo terhadap alam yang mestinya tetap mendapatkan ruang penghargaan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/Ubat%20Ramuon%20Orang%20Rimbo.jpg"
            , "http://kebudayaan.kemdikbud.go.id/ditwdb/wp-content/uploads/sites/9/2017/10/22.-Ubot-Ramuon.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("28","cawot", "pakaian", "jambi"
            , "Cawat atau cawot adalah pakaian sehari-hari yang digunakan oleh Orang Rimbo. Pakaian atau cawat ini sangat sederhana, begitu juga dengan cara pemasangannya. Cawat berasal dari kain (biasanya kain panjang), yang berfungsi sebagai penutup organ vital manusia, terutama untuk laki-laki rimba. Cara pemakaiannya yang sangat sederhana, yaitu diikatkan diantara paha hingga ke pinggang, sehingga menutupi bagian tubuh yang menurut mereka harus ditutup.\n" +
                    "\n" +
                    "Orang Rimba melakukan aktivitas kehidupannya di dalam rimba, mulai dari berburu, meramu, mencari buah-buahan dan sebagainya, dalam melakukan aktifitas tersebut, tentunya membutuhkan ruang gerak yang luas. Cawat sangat mendukung ruang gerak tersebut. Pada awalnya, pakaian atau cawot belum menggunakan kain, akan tetapi terbuat dari daun-daun hutan saja. kemudian diganti menggunakan tikar pandan hutan, karung goni, kulit kayu dan terakhir barulah mereka mengenal kain.\n" +
                    "\n" +
                    "Kain biasa disebut dengan koin. Awalnya koin diperoleh dengan cara barter, baik dengan orang dusun maupun orang transmigrasi yang sekitar tahun 1970-an sampai di Kabupaten Sarolangun. Sebenarnya cawat yang dibuat dengan menggunakan kain tersebut amatlah sangat sederhana, akan tetapi bagi masyarakat rimba hal tersebut memegang peranan penting. Dengan cawatlah mereka menutupi anggota tubuhnya dan itu sudah dijalankan dari generasi ke generasi berikutnya. Bagi orang luar mungkin pemakaian kain yang digunakan untuk menutupi tubuh mereka sangatlah minim, karena tidak menutupi seluruh badannya layaknya seperti pakaian yang biasa digunakan orang pada umumnya. Namun Orang Rimbo memiliki keyakinan dan merasa bahwa alam sudah dapat melindungi mereka. Sebuah keyakinan yang sangat mendasari Orang Rimba, karena alam dan rimba adalah nadi kehidupan mereka.\n" +
                    "\n" +
                    "Selain dipakai untuk membuat cawot, maka kain pun memiliki nilai penting bagi masyarakat rimba. Ada dua makna dan fungsi kain dalam kehidupan Orang Rimbo. yaitu sebagai fungsional praktikal dan secara kultural sosial. Bila secara fungsional praktikal, maka makna kain tersebut dilihat secara fungsinya, yaitu untuk melindungi tubuh dari situasi kondisi dan cuaca bahkan bahaya yang datang dari luar. Sedangkan makna secara kultural sosial, bahwa pemaknaan kain bagi Orang Rimbo adalah untuk kepentingan dan kelangsungan adat budaya mereka. Akan tetapi seiring perubahan zaman dan pandangan miring yang mereka terima mengenai cawot sebagai pakaiannya, sudah banyak dari Orang Rimbo yang mengenakan celana dan baju seperti yang dipakai masyarakat umumnya, terkadang kalau ke pasar atau ke desa mereka memakai celana dan baju, akan tetapi ketika kembali ke hutan Orang Rimbo akan melepas kembali pakaian tersebut dan menggantinya dengan cawot. Dapat juga dikatakan bahwa pemakaian cawot bagi para laki-laki rimba adalah menjadi bagian dari usaha untuk tetap menjaga adat nenek moyangnya. Sebuah perbedaan yang semestinya dihormati dan dihargai."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/Cawot.jpg"
            , "https://pariwisataindonesia.id/wp-content/uploads/2022/01/Prada-Budi-mengenakan-cawot.png"
            , "https://pariwisataindonesia.id/wp-content/uploads/2022/01/Cawot-khas-suku-anak-dalam.png"
            , ""
            , "")
        dbHelper.insertData("29","sebelik sumpah", "benda", "jambi"
            , "Perhiasan Sebelik Sumpah adalah sejenis perhiasan yang biasa digunakan oleh Orang Rimbo yang mendiami hutan di kawasan Taman Nasional Bukit Dua Belas. Sebelik Sumpah adalah sejenis buah yang berasal dari jenis pohon yang tumbuh dan hidup di hutan terutama di kawasan Taman Nasional Bukit Dua Belas. Nama latin pohon itu sendiri ataupun nama daerahnya tidak diketahui, akan tetapi masyarakat rimba menyebut dengan nama pohon sibaleik sumpah.\n" +
                    "\n" +
                    "Pohon Sibaleik Sumpah adalah sejenis pohon besar dan tinggi dan buah dari Sebelik Sumpah berbentuk bulat, apabila telah tua akan jatuh sendiri ke tanah. Buah tersebut kemudian dibelah dan isi atau biji buah tersebut berbentuk bulat lonjong berwarna coklat. Kemudian isi biji buah Sebelik Sumpah dibuang dengan memotong kedua sisi ujung biji buah Sebelik sumpah tersebut. Seterusnya buah Sebelik  sumpah dirangkai dengan tali atau dironce dan disusun. Susunan biji buah tersebut  dijadikan perhiasan atau (manik) bagi Orang Rimbo. Selain dijadikan kalung biasanya juga dijadikan gelang. Bahkan uniknya Perhiasan yang terbuat dari Buah Sebelik  Sumpah ini sekarang menjadi barang barter bagi warga Rimba, karena hanya mereka yang menggunakan perhiasan yang terbuat dari Buah Sebelik Sumpah, dikatakan Sebelik Sumpah karena pada dahulunya ada orang yang menyumpahi seorang anak dari kelompok orang Rimba yang akan dibawa turun mandi, anak tersebut dipakaikan perhiasan yang berasal dari buah Sebelik Sumpah, ternyata sumpah itu berbalik ke diri orang itu sendiri. \n" +
                    "\n" +
                    "Mereka percaya bahwa sebelik sumpah mempunyai kekuatan dan mampu menolak dan menangkal bala. Pohon sebelik sumpah sangatlah keramat dan Orang Rimbo sangat menghargai kekuatan pohon tersebut, bahkan untuk mengambil buah sebelik sumpah dilakukan dengan merayunya terlebih dahulu. Rayuan puitis tersebut disenandungkan secara terus menerus sampai pohon sebelik sumpah luluh dan memberikan izin untuk dipanjat dan diambil buahnya. Sebuah keselarasan dan keunikan dalam menghargai alam."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/Sebelik%20Sumpah.jpg"
            , "https://puan.my.id/wp-content/uploads/2018/02/sebelik_sumpah.jpg"
            , "https://asset.kompas.com/crops/ww_IDeRXwMcI6fe4EQMstSbe69M=/116x0:701x390/750x500/data/photo/2013/05/02/1417175-ita-beteguh-14-780x390.jpg"
            , ""
            , "")
        dbHelper.insertData("30","benteng-bentengan musi rawas", "non benda", "sumatra selatan"
            , "Benteng-bentengan adalah permainan rakyat daerah Musi Rawas, Sumatera Selatan. Permainan ini tidak memakai senjata dan peralatan kecuali tanda-tanda yang menyimbolkan benteng. Benteng-bentengan artinya dalam permainan ini permainan ini adalah pemain akan aman dan tidak akan diganggu apabila berada dan memegang benteng. Biasanya permainan benteng-bentengan dimainkan kapan saja, yaitu pagi, siang, dan sore hari. Benteng-bentengan juga sering dilakukan pada malam hari, permainan ini dilakukan di kampung-kampung dan di kota-kota saat diwaktu luang. Lama permainan tidak dapat diketahui atau ditentukan sebelumnya. Oleh karena itu yang lazim dimainkan pada waktu istirahat di rumah atau sekolah, maka selama waktu istrahat itulah biasanya lama permainan. Dalam seminar hasil terungkap ternyata banyak jenis permainan tradisional benteng-bentengan ini, tetapi yang bisa diulis hanya satu yang ditemui di lapangan. Permainan ini bermanfaat untuk melatih anak-anak dalam menjaga kedisiplinan individu dan kebersamaan satu sama lain karena permainan benten-bentengan ini secara tidak langsung mendidik anak-anak supaya dapat waspada, kemudian norma dan aturan-aturan yang ada dalam permainan benteng-bentengan ini akan dibawa secara tidak langsung ketengah-tengah kehidupan dalam komunitas kelompok masyarakatnya.\n" +
                    "\n" +
                    "Permainan ini telah diwarisi dari generasi sebelumnya tanpa dapat mengetahui dengan tepat bilamana permainan ini mulai diciptakan. Permainan ini masih terus dimainkan sampai sekarang di daerah pedesaan dan perkotaan. Walaupun ini adalah salah satu permainan tradisional namun peminatnya tidak berkurang dari waktu kewaktu terutama di kalangan anak-anak."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201900887-penetapan-1_1566290755.jpg"
            , "https://kissparry.files.wordpress.com/2017/03/bentengan-iniadalahblogkuwp-e1489512675480.jpg"
            , "https://kissparry.files.wordpress.com/2017/03/bentengan-arena-mazmuzi-bp.jpg"
            , ""
            , "")
        dbHelper.insertData("31","dulmuluk", "non benda", "sumatra selatan"
            , "Teater Dulmuluk adalah teater tradisional Sumatera Selatan yang lahir di Kota Palembang. Awai mula terbentuknya teater ini adalah berupa pembacaan syair oleh Wan Bakar yang membacakan tentang syair Abdul Muluk di sekitar rumahnya di Tangga Takat 16 Ulu pada tahun 1854. Agar lebih menarik pembacaan syair kemudian disertai dengan peragaan oleh beberapa orang ditambah iringan musik gambus dan terbangan.\n" +
                    "\n" +
                    "Dulmuluk berawal dari Kitab Kejayaan Kerajaan Melayu yang selesai ditulis pada 2 juli 1845, yang berjudul Syair Abdul Muluk. Ada dua pendapat oleh penulis kitab ini yaitu Raja Ali Haji bin Raja Achmad dari Pulau Penyengat oleh Indra Sakti (Riau) - versi DR. Philipus Pieter Voorda Van Eysinga (seorang hakim di Batavia) dan versi Von de wall menyebut Saleha, sepupu raja Ali Haji. Kitab ini kemudian dipentaskan dalam bentuk teaterikal.\n" +
                    "\n" +
                    "Acara itu menarik minat masyarakat untuk datang berkumpul. Pada tahun 1860 syair \"Kejayaan Kerajaan Melayu\" juga diterbitkan di Singapura dalam bahasa Melayu oleh Syaidina dan Haji M. Yahya. Pada tahun 1893, Dr. Philipus mencetak kembali dengan menggunakan bahasa Latin, diterbitkan oleh Tijschrift Van Nederlands India di Roterdam. Kemudian muncul sebuah buku yang diterbitkan oleh De Burg Amsterdam dengan judul \"Syair Abdul Muluk'; yang banyak mengalami perubahan-perubahan seperti: Berbahan menjadi Berhan, Siti Arohal Bani menjadi Siti Roha, Abdul Roni menjadi Abdul Gani dan sebagainya. Perubahan tersebut karena penyesuaian ejaan waktu itu.\n" +
                    "\n" +
                    " Teater Tradisional Dulmuluk mempunyai beberapa ciri ciri yang membuatnya berbeda dengan teater tradisional lainnya, ciri tersebut ialah sebagai berikut:\n" +
                    "\n" +
                    "• Dialognya seringkali mengunakan pantun atau syair.\n" +
                    "\n" +
                    "• Peranan wanita diperankan oleh laki-laki, atau tepatnya hanya laki-laki yang bermain.\n" +
                    "\n" +
                    "• Di awal dan di akhir pertunjukan dulmuluk terdapat nyanyian dan tarian yang bernama \"Beremas''.\n" +
                    "\n" +
                    "• Dalam pertunjukan dulmuluk, menampilkan kuda dulumuluk sebagai ciri tersendiri.\n" +
                    "\n" +
                    "• Adanya tarian dan nyanyian didalam pertunjukan dulmuluk yang digunakan sebagai simbol, contohnya seperti saat sedih, senang, marah, atau pun mengungkapkan isi hati biasanya diungkapkan sambil berdendang dan menari.\n" +
                    "\n" +
                    "• Cerita dulmuluk hanya menceritakan dua syair, yaitu syair Raja Abdul-muluk dan syair Zubaidah Siti.\n" +
                    "\n" +
                    "Dalam tata pementasan para pelakon dulmuluk sebelum pertunjukan dimulai berkumpul di suatu tempat khusus yang disebut kebung untuk berpakaian dan bersolek sesuai watak-watak tokoh yang akan diperankan. Sebelum pertunjukan dilakukan doa selamat dengan menyiapkan seperangkat hidangan yang terdiri dari nasi gemuk, sebutir telur dan seekor ayam panggang dan dupa/ kemenyan yang dibakar dipedupaan. Setelah dibacakan doa, nasi dan lauk dibagi rata sebagai penyempurna syarat upacara. Salah satu pemain sebagai pemeran utama bernama Sultan Abdul Muluk. Seorang anggota yang menjadi pimpinan menyanyikan lagu bekisoh dari dalam kebung. Setelah itu seorang demi seorang pelakon keluar dari kebung untuk melaksanakan upacara Beremas atau salam pembuka kepada penonton, setelah selesai pemain kembali masuk kebung. Selanjutnya adegan demi adegan berlangsung sesuai jalan cerita. Setiap pemain seni pertunjukan Dulmuluk dituntut kemampuannya untuk dapat bernyanyi sesuai dengan tuntutan perannya."
            , ""
            , "https://haluansumatera.com/content/uploads/2016/11/pentas-kesenian-panggung-bangsawan-teather-dul-muluk-dulmuluk-drama-khas-palembang-sumatera-selatan.jpg"
            , "http://kikomunal-indonesia.dgip.go.id/storage/app/uploads/public/5fd/74f/2bb/5fd74f2bbb990453534717.jpg"
            , "https://bisniswisata.co.id/wp-content/uploads/2019/06/dulmuluk.jpg"
            , ""
            , "")
        dbHelper.insertData("32","tari gending sriwijaya", "tarian", "sumatra selatan"
            , "Gending Sriwijaya merupakan tarian tradisional untuk masyarakat Sumatera Selatan untuk menyambut tamu kehormatan dengan diiringi lagu Gending Sriwijaya. Penari berjumlah 9 orang ditambah 2 orang pembawa tombak dan satu orang pembawa payung yang berdiri di belakang penari. Barisan penari yang terdepan sambil membawa tepak yang berisi sirih pinang menari berjalan menuju ke tempat orang yang dihormati. Setelah sampai di depannya, maka tepak berisi sirih pinang itu dipersembahkan kepada orang yang dihormati. Setelah orang tersebut memakan sirih maka penari-penari menghaturkan sembah kehormatan sambil surut ke belakang diiringi gending. Ini menandakan berakhirnya tarian tersebut."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483950209.jpg"
            , "http://assets.kompasiana.com/items/album/2021/07/13/tari-gending-sriwijaya-formasi-lengkap-60ed07df676aa70e921621e2.jpg"
            , "https://cdnwpedutorenews.gramedia.net/wp-content/uploads/2022/09/20134237/image001-19.png"
            , ""
            , "")
        dbHelper.insertData("33","pempek", "makanan", "sumatra selatan"
            , "Makanan tradisional pempek adalah asli makanan orang Palembang. Bahannya berupa adonan campuran ikan dan sagu dilepekan kemudian dibentuk sesuai bentuk-bentuk tertentu. Kata dilepekan ini yang selanjutnya dijadikan sebagai nama makanan tersebut yaitu pempek. Pempek biasanya disajikan bersama Cuko pedas yang memiliki rasa yang khas. Pempek yang terkenal sekarang terdiri dari beberapa jenis yaitu pempek kapal selam, adaan, lenjer, kulit dan lain-lain."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483950336.jpg"
            , "https://suarakampus.com/wp-content/uploads/2021/01/pempek.jpg"
            , "https://img.inews.co.id/media/822/files/inews_new/2022/02/26/pempek_palembang.jpg"
            , "https://asset.kompas.com/crops/UlNzTgTGP7jQqHkUpgyyGnRAtVE=/92x0:938x564/750x500/data/photo/2020/02/25/5e552581b5371.jpg"
            , "https://t-2.tstatic.net/palembang/foto/bank/images/ilustrasi-penampakan-pempek-yang-terbuat-dari-bahan-dasar-ikan-gabus.jpg")
        dbHelper.insertData("34","tikar purun pedamaran", "benda", "sumatra selatan"
            , "Tikar purun atau tikar Pedamaran merupakan salah satu kerajinan anyaman tradisional yang sampai saat ini masih banyak dipakai di kalangan masyarakat Sumatera Selatan. Kerajinan anyaman menurut J.J. Hoeigman (Wikepedia, 2008) merupakan wujud kebudayaan yang termasuk dalam artefak (wujud kebudayaan fisik yang dapat diraba, dilihat dan didokumentasikan) yang telah ada pada masa kolonial Belanda di Kabupaten Ogan Komering Ilir yaitu abad ke -19 (1870). Belanda membagi wilayah Sumatera Selatan menjadi 9 Afdeeling di bawah Keresidenan Palembang dan Kabupaten Ogan Komering Ilir adalah Afdeeling ke � 8 dengan nama Afdeeling Komering Ilir. Tikar purun yang sebagian besar bermotif geometris memiliki daya tahan yang cukup tinggi karena dibuat dari tanaman purun yang batangnya berserat. Tanaman purun yang memiliki kemiripan dengan pandan merupakan jenis tumbuhan rumput yang hidup liar di dekat air atau rawa. Tanaman ini banyak tumbuh di daerah rawa-rawa di Kabupaten Ogan Ilir dan Kabupaten Ogan Komering Ilir, Sumatera Selatan. Kerajinan tikar purun ini sebagian besar dikerjakan oleh kalangan ibu-ibu rumah tangga atau kaum hawa, sedangkan kaum pria biasanya merantau untuk mencukupi penghasilan rumah tangga. Para wanita biasanya telah didoktrin dari kecil oleh ibu-ibunya untuk belajar membuat kerajinan tikar purun. Dengan kata lain, kerajinan tikar purun berlangsung secara turun-temurun. Keunikan tikar purun ini adalah digunakan masyarakat Sumatera Selatan sejak dilahirkan ke dunia hingga meninggal dunia. Keunikannya yang lain adalah dalam proses pembuatannya yaitu para pengrajinnya harus kaum perempuan, dianyam sambil bernyanyi, dan memakai pupur (bedak) tebal yang terbuat dari beras ketika menganyam tikar purun ini."
            , ""
            , "https://cdn-2.tstatic.net/tribunnews/foto/bank/images/kota-tikar_20150622_004509.jpg"
            , "https://www.mongabay.co.id/wp-content/uploads/2016/09/1-1.jpg"
            , "https://image.akurat.co/uploads/gallery/2021/11/big/gal_6193183df1a435-38540717-91670202.jpg"
            , ""
            , "")
        dbHelper.insertData("35","tanjak palembang", "pakaian", "sumatra selatan"
            , "Tanjak / Mahkota adalah salah satu perlengkapan Pakaianan Adat kesultanan Palembang Darussalam sekitar tahun 1850 yang dipakai oleh para bangsawan/kesultanan pada saat itu. Dengan berakhirnya Kesultanan Palembang Darussalm , Tanjak masih tetap dipakai oleh masyarakat Palembang hingga saat ini terutama dalam acara-acara Palembang.\n" +
                    "\n" +
                    "Tanjak dibuat dari kain persegi 4 yang dilipat sedemikian rupa hingga membentuk tanjak / Mahkota. Motif kain tanjak yang pertama kali dipakai adalah motif kerak mutung , dalam perkembangannya motif batik gribik dan jufri juga dipakai untuk pembuatan Tanjak. \n" +
                    "\n" +
                    "Menurut sejarahnya, sesuai dengan perkembangan pada masa itu,  Tanjak terdiri dari 3 macam yaitu :\n" +
                    "\n" +
                    "1. Tanjak Meler yang terbuat dari kain tenunan tradisional Palembang sekitar tahun 1870\n" +
                    "\n" +
                    "2. Tanjak Kepundang yang terbuat dari kain tenunan  Palembang sekitar tahun 1900\n" +
                    "\n" +
                    "3. Tanjak Bela Mumbang yaitu Tanjak khusus untuk penutup kepala Pangeran Nato Dirajo dan keturunannya \n" +
                    "\n" +
                    " Untuk Tanjak  yang sekarang masih sering digunakan/dipakai  masyarakat Palembang untuk  acara-acara adat , dengan ciri sebagai berikut :\n" +
                    "\n" +
                    "- Dikening 3 susun  lipatan \n" +
                    "\n" +
                    "- Dilipatan segitiga ada lipatan sedikit kedepan sebelah kiri\n" +
                    "\n" +
                    "- Tinggi kain Tanjak tidak lebih dari setepa (5 Jari)\n" +
                    "\n" +
                    "- Kain yang dipakai bermotif Kerak mutung, Gribik dan Jufri"
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201900883-penetapan-1_1566290679.jpg"
            , "https://statik.tempo.co/data/2018/11/25/id_799468/799468_720.jpg"
            , "https://media.suara.com/pictures/970x544/2020/11/13/39816-tanjak-palembang-tokopedia.jpg"
            , ""
            , "")
        dbHelper.insertData("36","tempoyak palembang", "makanan", "sumatra selatan"
            , "Tempoyak merupakan makanan olahan dari buah durian yang difermentasikan. Caranya dengan mengasinkan daging buah durian yang sudah matang yang dilepas dari bijinya, ditambah dengan garam dan disimpan dalam toples/wadah selama kurang lebih 3 hari.\n" +
                    "\n" +
                    "Pengolahan durian menjadi tempoyak didasari oleh hasil durian yang berlimpah pada masa lalu. Untuk memanfaatkan keberlimpahan ini, orang-orang Sumsel kemudian mengolahnya menjadi makanan yang tahan lama, yaitu durian yang difermentasikan. Tempoyak merupakan makanan khas rumpun bangsa melayu diantaranya Palembang.\n" +
                    "\n" +
                    "Tempoyak ini kemudian dapat diolah menjadi beberapa makanan atau sebagai pelengkap masakan. Makanan turunan tempoyak berupa :\n" +
                    "\n" +
                    "1. Sambel tempoyak mentah\n" +
                    "\n" +
                    "2. Sambal tempoyak tumis\n" +
                    "\n" +
                    "3. Iwak masak tempoyak\n" +
                    "\n" +
                    "4. Pindang Patin Tempoyak\n" +
                    "\n" +
                    "5. Brengkes Tempoyak"
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201900886-penetapan-1_1566290732.jpg"
            , "https://t-2.tstatic.net/jogja/foto/bank/images/tempoyak-ikan_20180429_233456.jpg"
            , "https://awsimages.detik.net.id/community/media/visual/2019/10/15/b7a07d7d-0158-4f16-b6fe-e510281167ce.png?w=650&q=90"
            , ""
            , "")
        dbHelper.insertData("37","rumah ulu", "benda", "sumatra selatan"
            , "Rumah Ulu adalah rumah tradisional Sumatera Selatan yang dibuat berdasarkan tata letak sungai dan alirannya, yang dikenal dengan sifat Kun Komering. Rumah Ulu banyak terdapat di Kabupaten Ogan Komering Ulu. Bentuk Rumah Ulu terbilang sederhana, namun bila dicermati memiliki tata ruang dan teknik pembuatan yang unik. Dikatakan unik dalam pembuatannya karena sama sekali dibuat tanpa menggunakan paku. Pada penataan ruangnya juga memiliki keunikan sendiri. Lantainya memiliki tiga undakan yang berfungsi sebagai pengatur hierarki tamu di dalam rumah. Rumah Ulu yang tersebar di beberapa Kabupaten Ogan Komering Ulu memiliki bentuk yang hampir sama karena hampir sama hanya perbedaan pada perletakan pintu masuk utamanya, yang tergantung dari posisi rumah yang berbentuk panggung dan letak tanah yang ada pada lingkungannya."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483950512.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("38","tradisi melemang adat perkawinan bengkulu", "non benda", "bengkulu"
            , "Pada masyarakat di Kabupaten Kaur Provinsi Bengkulu,  tradisi melemang ini biasa juga disebut masak lemang. Tradisi melemang oleh masyarakat setempat biasanya dilakukan pada bulan Ramadhan (puasa), lebaran (Idul Adha), upacara perkawinan (bimbang), panen padi dan lainnya yang telah berlangsung sejak dahulu.\n" +
                    "\n" +
                    "Adapun yang akan kami angkat pada pengusulan Warisan Budaya tak benda ini tentang Fungsi Lemang Pada Adat Perkawinan Suku Besemah di Padang Guci .\n" +
                    "\n" +
                    "Tradisi melemang pada masyarakat Kaur adalah lemang tidak hanya sebagai hidangan dalam acara-acara tertentu melainkan juga menjadi persyaratan dalam Adat Perkawinan (Bimbang), khususnya oleh masyarakat Besemah di Padang Guci, dan masyarakat Semende di Muara Sahung. Lemang menjadi bawaan wajib bagi pihak pengantin laki-laki (lanang) ketika merintis ikatan perkawinan dengan seorang gadis (betine). Jika tidak ada lemang, maka perkawinan itu dianggap belum lengkap secara adat,  karenanya pihak laki-laki akan membuat lemang (masak lemang) untuk dibawa ke rumah pengantin perempuan. Dijadikannya lemang sebagai persyaratan adat dalam upacara perkawinan pada masyarakat Besemah sudah berlangsung sejak dahulu (turun temurun) dan masih bertahan hingga sekarang."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201900881-penetapan-1_1566290586.jpg"
            , "https://radarkaur.disway.id/upload/large/ec8b2dbc71c3333c58e2f60d51f328d6.jpg"
            , "https://www.rmolsumsel.id/uploads/images/2022/08/image_750x500_62f1d1dcdefae.jpg"
            , ""
            , "")
        dbHelper.insertData("39","tari kejai", "tarian", "bengkulu"
            , "Tari Kejei merupakan kesenian rakyat Rejang yang dilakukan pada setiap musim panen raya datang. Tarian tersebut dimainkan oleh para muda-mudi di pusat-pusat desa pada malam hari di tengah-tengah penerangan lampion. Kekhasan tari ini adalah alat-alat musik pengiringnya terbuat dari bambu, seperti kulintang, seruling dan gong. Tarian dimainkan sekelompok orang yang membentuk lingkaran dengan berhadap-hadapan searah menyerupai jarum jam. Tari ini adalah tarian sakral yang diyakini masyarakat mengandung nilai-nilai mistik, sehingga hanya dilaksanakan masyarakat Rejang Lebong dalam acara menyambut para biku, perkawinan dan adat marga. Pelaksanaan tari ini disertai pemotongan kerbau atau sapi sebagai syaratnya."
            , ""
            , "https://3.bp.blogspot.com/-eHlZS0Y8H4I/VfG5MAQjPuI/AAAAAAAAAYU/v3aTsZy--do/s1600/tari%2Bkejei.JPG"
            , "https://pariwisataindonesia.id/wp-content/uploads/2022/01/Tari-Kejei-1-e1611574605162.png"
            , "https://asset.kompas.com/crops/iBL-S7lL2UWzNJW0MPP31PORNeY=/0x26:739x519/750x500/data/photo/2022/02/06/61ff99ad75b08.jpeg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/Tari%20Kejai.jpg"
            , "")
        dbHelper.insertData("40","kain lantung", "pakaian", "bengkulu"
            , "Untuk mencari dan membedakan dengan jenis pohon lainnya, pencari pohon lantung memiliki keahlian tersendiri. Kulit pohonnya yang tebal dan memiliki serat, dengan lebar sekitar 1 (satu) sampai 3 (tiga) centimeter dan panjang pohon sekitar 5 (lima) sampai 7 (tujuh) meter. Pohon lantung yang baik biasanya berumur 4 (empat) sampai 5 (lima) tahun, semakin tua umurnya semakin baik kualitas kulit yang akan dibuat kain lantung tersebut.Peralatan yang digunakan dalam mengambil kulit lantung tersebut yakni parang, dan pisau. Parang digunakan untuk memotong pohon lantung tersebut. Setelah pohon lantung rebah, lalu dibersihkan daunan dan ranting yang melekat pada pohon lantung tersebut. Langkah selanjutnya adalah memarut pohon lantung dan mengambil kulitnya dengan bantuan pisau. Pisau ditorehkan ke batang pohon dan mengelupaskan kulit pohon lantung. Kulit lantung yang dikelupaskan biasanya berukuran 1 meter x 50 centimeter, dan ada juga berdasarkan pesanan.Sebetulnya, kulit lantung lantung yang telah sampai dirumah belum bisa begitu saja dipergunakan sebagai kain. Sipembuat kain lantung harus terlebih dahulu memisahkan kulit lantung yang dibawa dari hutan tersebut dan kemudian memukulnya dengan Perikai. Perikai adalah sejenis alat pukul yang terbuat dari tanduk kerbau atau jenis kayu keras dengan ukuran panjang dan besarnya lebih 40 x 10 centimeter. Alat ini biasanya dibuat sendiri oleh pembuat kain lantung. Bahannya biasanya mereka ambil dari pohon yang berada dalam hutan yang ada disekitar mereka ataupun waktu mereka mencari kulit lantung tersebut."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485149031.jpg"
            , "https://1001indonesia.net/asset/2022/07/Kain-Lantung-Bengkulu-1.jpg"
            , "https://pariwisataindonesia.id/wp-content/uploads/2022/01/Kain-Lantung-1600x790.png"
            , ""
            , "")
        dbHelper.insertData("41","serunai bengkulu", "benda", "bengkulu"
            , "Serunai atau Sunai adalah alat musik tradisional tiup aerophone, tergolong dalam end blown flute yang berfungsi sebagai pembawa melodi yang dikembangkan (improvisasi) dan dimainkan oleh satu orang. Alat musik ini diyakini berasal dari suku bangsa Pekal yang ada di Kecamatan Malin Deman Kabupaten Mukomuko dan berkembang hingga ke seluruh wilayah Kabupaten Mukomuko.\n" +
                    "\n" +
                    "Serunai atau Sunai terbuat dari bambu kapa  atau telang kapa yang hidup di tepi sungai karena karena tekstur bambu tersebut lebih tipis, mudah untuk diolah, dan menghasilkan suara yang lebih nyaring. Bambu yang dipakai harus dari satu jenis dan tidak boleh dicampur dengan jenis lain.. Bambu yang dipilih selanjutnya dipotong menjadi 9 ruas dan dibentuk sesuai dengan ukuran masing-masing sehingga bisa disambung menjadi satu. Serunai yang telah selesai dan diberi lubang selanjutnya dilakukan ritual dengan membakar kemeyan dan membaca mantra agar menghasilkan suara yang baik dan terhindar dari gangguan roh halus. Selesai bambu serunai lalu dipasang anak sunai yang terbuat dari daun kelapa dan bulu ayam sebagai penghasil suara. Suara yang dihasilkan sunai belum bisa dibuat dalam tangga nada karena suara yang dihasilkan sangat khas dan hanya terdiri 6 variasi suara yang dihasilkan dengan menutup dan membuka 5 lubang pada serunai. Tidak adanya standar suara yang dihasilkan, maka mempelajari serunai tidak bisa dilakukan dengan teori tetapi dengan praktik. Dengan cara ini, setiap pemain harus memiliki kemahiran dalam menghafal jenis suara yang dihasilkan pada saat lubang ditutup atau dibuka sehingga mampu membuat variasi suara sesuai lagu. \n" +
                    "\n" +
                    "kemahiran yang harus dimiliki pemain Serunai atau Sunai:\n" +
                    "\n" +
                    "1. mampu memilih bambu yang baik untuk dijadikan bahan Serunai atau Sunai\n" +
                    "\n" +
                    "2. mampu membuat Serunai atau Sunai dengan standar suara yang khas Serunai atau Sunai\n" +
                    "\n" +
                    "3.mampu menghafal jenis suara yang dihasilkan sehingga dapat dikombinasikan dalam mengiringi lagu \n" +
                    "\n" +
                    "4. mampu mengolah pernafasan selama memainkan Serunai atau Sunai \n" +
                    "\n" +
                    "5. mampu tampil dengan baik pada saat pertunjukan"
            , ""
            , "https://kebudayaan.kemdikbud.go.id/ditwdb/wp-content/uploads/sites/9/2019/09/56.-Serunai-Bengkulu.jpg"
            , "https://assets.promediateknologi.com/crop/0x0:0x0/750x500/photo/2022/03/24/3177613703.jpg"
            , "https://i0.wp.com/tambahpinter.com/wp-content/uploads/2020/06/serunai-kuningan.jpeg"
            , ""
            , "")
        dbHelper.insertData("42","rumah uemak potong jang", "benda", "bengkulu"
            , "Uemak Potong Jang atau Rumah Tradisional Rejang asli dapat dikatakan sudah punah. Umeak berarti rumah, Potong berarti buatan, dan Jang maksudnya Rejang. Jadi, Umeak Potong Jang = rumah buatan rejang. Rumah ini juga biasa disebut Umeak-An, rumah yang kuno/lama. Menurut orang tua yang masih ingat detail rumah asli ini, rumah yang masih ada sekarang sudah dipengaruhi oleh potongan Meranjat (suku bangsa yang ada di Kabupaten Ogan Komering Ulu, Sumatera Selatan). Perbedaan rumah asli dan yang dipengaruhi Meranjat terletak pada bubungan. Umeak Potong Jang memiliki bubungan melintang, sehingga tritisan atap/ cucuran menghadap ke depan dan belakang. Sedangkan yang dipengaruhi Meranjat, memiliki bubungan membujur sehingga tritisan menghadap ke samping. Umeak Potong Jang memiliki bubungan jembatan dengan teblayeaa (pelayaran) di kiri dan kanan. Atap depan dan belakang makin menurun. Suatu hal yang jelas, keberadaan umeak jang dalam kehidupan masyarakat Rejang tidak terlepas dari kebutuhan alamiah manusia akan tempat bernaung. agar dapat aman dari gangguan binatang dan terik matahari serta hujan. Untuk itu, leluhur orang Rejang dahulunya telah mendesain bentuk rumahnya sedemikian rupa sesuai dengan kondisi, kemampuan dan pola fikir mereka tentang rumah yang baik menurut. Dengan kata lain, pembuatan umeak jang sesungguhnya merupakan aplikasi dari cita rasa masyarakat Rejang tentang tempat tinggal dan cara beradaptasi dengan lingkungan, fisik maupun sosialnya."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485149122.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("43","warahan lampung", "non benda", "lampung"
            , "Warahan adalah sastra tutur yang disampaikan oleh satu orang yang awalnya tidak disertai musik. Dalam perkembangannya warahan diiring alat musik tradisional yang disebut gambus lunik. Warahan berasal dari wakha yang dalam bahasa Lampung berarti cerita atau berita. Sastra tutur ini oleh orang pesisir (sai batin) disebut wawarahan dan orang Lampung pepaduan menyebutnya warahan. Pada masa lalu saat warahan dipertunjukkan, pewarah menuturkan cerita di tengah penonton hanya dengan alat penerang lampu semprong. Bahasa yang digunakan adalah bahasa Lampung dengan dialek bahasa yang tergantung sekali pada asal sang Pewarah.Cerita yang disajikan dalam warahan seagian besar cerita pelipur lara dan cerita ini juga tergantung sekali pada daerah tempat asal warahan. Warahan dari daerah pedalaman memiliki cerita \"Labu Handah\", \"Suhai Lambai\", dan \"Kaluba\", sementara warahan daerah pesisir mengenal cerita seperti \"Botan Subing\", \"Ichaw\", dan \"Maligai\". Cerita ini juga berkembang pada cerita-cerita heroik, seperti \"Raden Jambat\" dan cerita rakyat seperti \"Putri Bungsu\", \"Si Ahmad yang Patuh\", dan \"Batu Betangkup\"."
            , ""
            , "https://assets.promediateknologi.com/crop/0x0:0x0/x/photo/2022/03/28/3154923818.jpg"
            , "https://asset.kompas.com/crops/zJKqoxa1LTyEicJFbqoOek_Buks=/0x0:0x0/750x500/data/photo/2010/08/15/0146037p.jpg"
            , "https://kebudayaan.kemdikbud.go.id/ditwdb/wp-content/uploads/sites/9/2016/11/festival-seni-07-pentas_25.jpg"
            , ""
            , "")
        dbHelper.insertData("44","tari melinting", "tarian", "lampung"
            , "Tari melinting adalah salah satu tari tradisional Lampung Timur. Gerakan Tari Melinting dalam satu pementasan merupakan perpaduan antara penari laki-laki dengan penari wanita. Musik pengiring tarian adalah Kolintang yang terbuat dari perunggu. Menurut salah satu tokoh adat Melinting, nama tari Melinting berkaitan dengan asal-usul tari yang berasal dari daerah Melinting, yang telah sejak dulu (zaman Belanda) tarian ini sudah dikenal orang dan belum ada satu daerah pun yang mengaku memiliki tarian ini. Hal itu disebabkan setiap daerah di Lampung memiliki tariannya masing-masing, seperti halnya di Marga Sekampung, memiliki tarian yang dikenal dengan nama tari sekampung."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1484029843.jpg"
            , "https://www.selasar.com/wp-content/uploads/2020/09/tari-melinting.jpg"
            , "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Tari_Melinting_2.jpg/1280px-Tari_Melinting_2.jpg"
            , ""
            , "")
        dbHelper.insertData("45","gulai taboh", "makanan", "lampung"
            , "Kabupaten Pesisir Barat merupakan daerah pesisir pantai yang memiliki hasil laut dan perkebunan yang melimpah. Sektor perkebunan selain penghasil damar juga kelapa dan sektor pertanian banyak menghasilkan bermacam-macam ikan laut. Karena itulah penduduk di sini banyak memanfaatkan kelapa dan ikan laut sebagai bahan masakan sehari hari, salah satunya adalah Gulai Taboh. Gulai Taboh merupakan santan yang dimasak dengan aneka isian yang beragam mulai dari ikan, udang, kacang-kacangan hingga tangkil (buah melinjo). Aneka isian dalam Gulai Taboh bisa divariasikan dengan aneka sayuran lainnya seperti labu kuning, ubi jalar ataupun aneka sayuran yang bisa cocok untuk dimasak dengan santan. Gulai Taboh menjadi menu wajib dalam setiap upacara-upacara adat masyarakat Lampung. Maka tak mengherankan jika menu yang satu ini menjadi menu andalan dari setiap perhelatan akbar."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485399763.jpg"
            , "https://thumb.tvonenews.com/thumbnail/2022/04/07/624e97ce1852a-taboh-iwa-tapa-gulai-khas-lampung-yang-bisa-menjadi-referensi-sajian-berbuka-puasa_665_374.jpg"
            , "https://www.batiqa.com/upload/news/l/lampung-gulai-taboh_tj8ky.jpg"
            , ""
            , "")
        dbHelper.insertData("46","kain tapis", "pakaian", "lampung"
            , "Makna dan Simbol dalam Kain Tapis\n" +
                    "\n" +
                    "Awai mula kain tapis dibuat sebagai bentuk penghormatan kepada leluhur, misalnya saja adanya motif kapal, kapal digambarkan sebagai wahana atau kendaraan roh dalam perjalanan menuju alam setelah meninggal (alam baka). Serta dikaitkan dengan bentuk pemujaan terhadap tokoh leluhur atau nenek moyang. Selanjutnya penggunaan kain tapis dalam perkembangannya dimanfaatkan pada acara-acara adat sepanjang lingkaran hidup yang terkait dengan ritual keagamaan. Ritual tersebut adalah sarana untuk menghubungkan manusia dengan alam roh. Penggunaan kain tapis sangat erat kaitannya dengan penggunaan secara praktis dan fungsi simbolis yang kemudian diberi makna ritual. Muatan simbol pada kain ta pis adalah sebagai penghubung dari berbagai makna pelaksanaan upacara adat di sepanjang lingkaran hidup manusia.\n" +
                    "\n" +
                    "Makna simbolis yang terkandung dalam motif kain tapis selalu berkaitan dengan lingkungannya, secara filosofis erat kaitannya dengan kehidupan masyarakat Lampung baik masyarakat Lampung pesisir/saibatin maupun masyarakat Lampung pepadun. Sebagai contoh motif tapis dengan motif kapal. Kapal dianggap sebagai kendaraan yang membawa perjalanan kehidupan manusia mulai dari kelahiran, masa anak-anak, masa remaja, dewasa, masa perkawinan, sampai pada masa kematian. Motif ini dianggap sebagai simbol perjalanan hidup manusia.\n" +
                    "\n" +
                    "Sementara itu fungsi praktis kain tapis sangat terkait dengan salah satu perlengkapan dalam upacara adat. Berbagai tata cara penggunaan dan letak kain mengisyaratkan bahwa kain Tapis sangat menentukan kesempurnaan dalam persyaratan kesucian dan keagungan sebuah upacara adat. Kain Tapis juga mencerminkan status sosial seseorang dalam masyarakat adat, apakah dia sebagai tokoh adat, tokoh masyarakat, dan mencerminkan tingkat kepenyimbangan. Karena jenis kain tapis tertentu hanya dimiliki dan dipergunakan oleh kalangan terbatas, seperti pada kelompok pemimpin adat/penyimbang.\n" +
                    "\n" +
                    "Fungsi praktis kain Tapis pada umumnya karena dikenakan oleh kaum wanita saat pada acara-acara adat; kemudian dikenakan oleh para penari; sebagai mas kawin pada upacara perkawinan; sebagai hadiah pada upacara perkawinan maupun khitanan; penutup dan pembungkus makanan; alas kepala dan alas tempat duduk dalam berbagai upacara adat; sapu tangan pengantin wanita; serta penutup punggung mempelai (kain nampan). Sedangkan pada kain pelepai dan tatibin dipergunakan atau dibentangkan pada dinding sewaktu ada upacara: khitanan anak penyimbang; perkawinan; kematian; dipakai sebagai gendongan bayi saat upacara cukuran bayi; ngelamo; dan pada saat bayi diberi gelar adat."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483948702.jpg"
            , "https://lh3.googleusercontent.com/-zv-474uOxB8/YBqZl9JNSUI/AAAAAAAAIXY/udYD62kpX7UX9xLaaZpe7YEq16Xo749TQCLcBGAsYHQ/w1200-h630-p-k-no-nu/1612355988058399-0.png"
            , "https://bisniswisata.co.id/wp-content/uploads/2019/10/TAPIS.jpg"
            , ""
            , "")
        dbHelper.insertData("47","rumah lamban pesagi", "benda", "lampung"
            , "Rumah Lamban Pesagi adalah rumah adat orang Lampung. Arti kata lamban adalah rumah dan pesagi adalah persegi, karena denahnya berbentuk segi empat. Lamban pesagi merupakan rumah panggung dengan atap perisai yang memiliki teritis panjang berbentuk pelana. Teritis yang berupa kanopi pada pintu masuk utama disangga konsol miring yang panjangnya sampai ke lantai rumah. Terdapat tangga dari papan yang dilengkapi dengan railing sederhana. Struktur panggung terputus dengan struktur dinding rumah. Posisi dinding lebih menjorok keluar sedikit dan ditopang oleh balok-balok atas struktur panggung. Dinding rumah cenderung tertutup dan hanya memiliki sedikit bukaan berupa jendela. Tiang-tiang panggung diletakkan pada pondasi umpak yang berbentuk segi empat. Kolong rumah panggung digunakan untuk kandang atau gudang."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483951289.JPG"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1550139326/dpfmyx4ay1beytwggj30.jpg"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1550138609/hzf1hwmzlbzgo189z3ae.jpg"
            , ""
            , "")
        dbHelper.insertData("48","adu kerito surong", "non benda", "kepulauan bangka belitung"
            , "Olahraga tradisional Adu Kerito Surong bukan sekedar olahraga rekreatif, melainkan juga olahraga yang mempertontonkan keterampilan, kekuatan raga, ketangkasan, kebersamaan, dan kemampuan menjaga keseimbangan. Olahraga tradisional Adu Kerito Surong senyatanya berkembang di seluruh pelosok Pulau Bangka, terutama di Kabupaten Bangka Tengah. Di kabupaten ini olahraga tradisional Kerito Surong berkembang di Desa Sungai Selan, Desa Namang, Desa Simpang Katis, Desa Dul, dan desa-desa yang umumnya masih menggunakan alat angkutan tradisional berupa Kerito Surong.Secara historis Kerito Surong pada awalnya berkembang di wilayah sekitar tambang timah di Muntok pada zaman Belanda. Para penggunanya adalah masyarakat keturunan Cina. Pada waktu itu Kerito Surong bukan hanya menjadi alat pengangkut timah, tetapi juga digunakan sebagai alat transportasi untuk mengangkut berbagai barang, termasuk manusia. Selanjutnya, penduduk asli (masyarakat Melayu Bangka) menggunakannya sebagai alat angkut dalam kegiatan sehari-hari, terutama untuk mengangkut hasil pertanian (lada, kolang-kaling, mangga, dan juga kayu bakar). Tetapi yang lebih sering, alat angkut ini digunakan untuk mengangkut hasil panen lada ke tempat perendaman (sungai). Sehabis panen lada masyarakat Melayu Bangka bersuka ria, dan menggunakan Kerito Surong sebagai pemainan untuk menghibur diri. Olahraga tradisional Adu Kerito Surong ini diangkat melalui kegiatan sehari-hari petani lada yang membuat suasana panen lada menjadi semarak dan penuh warna."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485145109.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("49","perang ketupat", "non benda", "kepulauan bangka belitung"
            , "Setiap tahun yaitu pada pertengahan bulan Syaban Tahun Hijriyah dilaksanakan Upacara Tradisional Desa Tempilang yaitu Upacara Adat Perang Ketupat. Upacara tradisional ini dilaksanakan dalam 5 (lima) tahapan: Penimbongan; Ngancak; Perang Ketupat; Nganyot Perae; Taber Kampung. Perang ketupat dilaksanakan setiap tahun sekali secara turun temurun, untuk menghalau bahaya yang disebut dengan tradisi tolak bala. Selanjutnya berkembang atau berubah saling melempar ketupat antar warga yang bertujuan untuk membersihkan diri dan kampung setempat. Seluruh peserta tidak boleh marah atau dendam walaupun terasa sakit atau terkena bagian yang tidak semestinya. Ketupat yang jadi alat untuk melempar berisi tepung beras dan enak dimakan. Tradisi ini biasanya dilaksanakan di Pantai Pasir Kuning Kecamatan Tempilang Kabupaten Bangka Barat."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483950913.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("50","tari gajah menunggang", "tarian", "kepulauan bangka belitung"
            , "Tarian Gajah Menunggang berasal dari Suku Laut (Suku Sekak) yang bermukim di pesisir Pantai Pulau Lepar, Kabupaten Bangka Selatan. Tarian ini merupakan gambaran bagaimana keadaan perahu-perahu yang dibawa gelombang laksana menunggang gajah. Secara filosofis Tari Gajah Menunggang memiliki makna yang mendalam pada tradisi Orang Sekak, antara lain:\n" +
                    "Menggambarkan rasa kegembiraan mereka dalam melaksanakan sesuatu yang berat dengan harapan akan dapat selesai apabila dikerjakan dengan bersama-sama, walaupun dalam mengarungi lautan sekalipun.\n" +
                    "Menggambarkan bagaimana perahu mereka melawan gelombang.\n" +
                    "Menggambarkan bagaimana cara mereka merubah haluan dalam keadaan yang diperlukan.\n" +
                    "Menggambarkan rasa gembira setelah selesai upacara dan mereka merasa bahagia."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483602580.jpg"
            , "https://cdn-2.tstatic.net/belitung/foto/bank/images/mnri-spmn-glng.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("51","kopiah resam", "pakaian", "kepulauan bangka belitung"
            , "Kopiah resam adalah peci yang terbuat dari tumbuhan resam (Dicranopteris linearissyn.Gleichenia linearis) dan digunakan oleh masyarakat bangka umat muslim dalam kegiatan sehari-hari seperti ibadah solat, menghadiri pesta, kegiatan adat, dan kegiatan lainnya. Belum ditemukan penjelasan tentang asal muasal tentang kopiah resam ini, tapi menurut narasumber pembuat resam, pengetahuan tentang resam telah diwariskan dari generasi-generasi terdahulu.Tanaman resam merupakan jenis Pteridophyta (paku-pakuan/pakis) yang biasa tumbuh di tempat-tempat teduh, lembab, dan subur di daerah tropis dan subtropis. Nama latin spesies ini adalah Dicranopteris linearis. Resam dikenal sebagai tumbuhan invasif, masuk dalam jenis gulma (tanaman pengganggu), karena mendominasi permukaan tanah menyebabkan tumbuhan lain terhambat pertumbuhannya. Habitatnya adalah tebing teduh dan lembap mulai pada ketinggian 200m hingga 1500m di atas permukaan laut dengan tinggi tanaman dapat mencapai 1,5 meter. Paku-pakuan ini tumbuh melilit dan bercabang, akarnya tumbuh di dekat permukaan tanah dan keluar batang keras yang tumbuh keatas. Tumbuhan ini mudah dikenal karena peletakan daunnya yang menyirip berjajar dua dan tangkainya bercabang mendua (dikotom). Persebaran tumbuhan ini dapat diidentifikasi di daerah tropis dan subtropis, tersebar di asia dan pasifik."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485146436.jpg"
            , "https://wonderful.pangkalpinangkota.go.id/wp-content/uploads/2021/04/kopiah-resam-780x470.jpg"
            , "https://gelorasriwijaya.co/wp-content/uploads/2020/03/20200326_184049.jpeg"
            , ""
            , "")
        dbHelper.insertData("52","kue bludar/bluder", "makanan", "kepulauan bangka belitung"
            , "Beludar atau Bluder dikenal di Indonesia sebagai roti dari Belanda. Masyarakat di Indonesia mengadopsi teknik pengolahan roti dalam budaya kulinernya dan setiap daerah memiliki perbedaan dalam pembuatan Beludar atau Bluder. Masyarakat Muntok Kabupaten Bangka Barat Kepulauan Bangka Belitung membuat Bluder dengan tekstur yang mirip dengan bolu, tidak seperti roti yang memiliki tekstur lebih elastis dan berongga. Sedangkan Bluder di daerah seperti Jakarta atau di daerah Jawa Barat memiliki tekstur yang benar-benar mirip dengan roti. Setiap hari kue Bluder dijual di kios-kios kue di Muntok. Pada mulanya kue ini dimasak dengan menggunakan gendok sehingga terdapat aroma arang yang bercampur dengan santan kelapa pada kue, namun alat ini kini dianggap tidak praktis lagi untuk membuat kue bluder dalam jumlah yang banyak. Dalam wawancara dengan informan Ibu Rosmiyati, warga Jalan Tanjung Kalian Muntok, selaku pembuat kue Bluder yang telah memulai usahanya sejak tahun 1968, dalam sehari beliau membuat Bluder sebanyak hampir 300 kue. Begitu banyaknya peminat Bluder, dalam sehari beliau dua kali membuat kue Bluder ini. Dalam proses memasak kue Bluder, Ibu Rosmiyati dibantu oleh asistennya. Selain meningkatkan perekonomian, beliau juga telah membantu warga sekitar dengan menyediakan lahan pekerjaan, sehingga dapat mengurangi angka pengangguran di masyarakat Muntok. Peralatan memasak : 1. Oven 2. Saringan 3. Iseran 4. Baskom 5. Cetakan kue 6. Loyang 7. Parutan kelapa Bahan-bahan : - 1 kg gandum - 1 butir telur - Santan dari 1 butir kelapa - 4 ons gula - ons mentega - 1 bungkus fermipan - bungkus soda kue - Vanili secukupnya - Air Cara membuat : 1. Campur santan dengan 1 sendok gula dan sendok garam, sisihkan 2. Olesi cetakan kue dengan mentega, sisihkan 3. Semua bahan gandum, telur, santan, gula, mentega, fermipan, soda kue, vanili, dan air dicampur. Diaduk rata menggunakan yangn, kurang lebih 10 menit, hingga menghasilkan tekstur adonan yang kental. 4. Kemudian adonan ditutup, dan didiamkan selama 3-4 jam. 5. Tuang adonan dalam cetakan 6. Taburi wijen di atas adonan 7. Panggang kurang lebih selama 20 menit Kue Bluder siap dinikmati. - Fungsi dari kue bludar itu sendiri dapat digolongkan sebagai berikut : 1. Fungsi sosial Yang dilihat dalam fungsi ini adalah, kue bludar disuguhkan untuk kepentingan acara-acara keluarga, dimana tuan rumah dapat menghidangkan kue bludar sebagai makanan pendamping. Dalam penyajiannya, kue bludar sebagai suguhan kepada tamu atau keluarga, guna menunjukkan nilai dalam tata pergaulan serta tata kesopanan. 2. Fungsi kenikmatan Kue Bludar yang disuguhkan bukan untuk dinikmati sebagai makanan yang mengenyangkan, melainkan sebagai makanan yang ingin dinikmati saja. Dimakan bukan untuk penyambung kehidupan, namun makanan yang dinikmati pada saat bersantai yang biasanya disajikan dengan pendamping minuman seperti teh ataupun kopi. Tata cara dan tahap pelaksanaan memasak, waktu yang dibutuhkan Tata cara dan tahap pelaksanaan memasak Adapun bahan-bahan untuk membuat kue bludar, yaitu : - 1 kg gandum - 1 butir telur - Santan dari 1 butir kelapa - 4 ons gula - ons mentega - 1 bungkus fermipan - bungkus soda kue - Vanili secukupnya - Wijen secukupnya - Air Bahan-bahan untuk membuat Bluder., Terlebih dahulu campur santan dengan 1 sendok gula dan sendok teh garam, aduk rata lalu sisihkan. Kemudian semua bahan yaitu gandum, telur, santan, gula, mentega, fermipan, soda kue, vanili, dan air dicampur. Diaduk rata menggunakan tangan, kurang lebih 10 menit, hingga menghasilkan tekstur adonan yang kental. Selanjutnya adonan ditutup dengan kain bersih, dan didiamkan selama 3-4 jam. Berikutnya tuang adonan ke dalam cetakan yang sebelumnya sudah diolesi mentega. Lalu taburi wijen di atas adonan. Setelah semua adonan dimasukkan ke dalalam cetakan, lalu panggang adonan beludar kurang lebih selama 20 menit, dengan menggunakan oven bakar. Kue Beludar dapat dinikmati pada saat bersantai, yang biasanya disajikan dengan pendamping minuman seperti teh ataupun kopi"
            , ""
            , "https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2021/06/02/1230976360.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("54","upacara adat nujuh jerami", "non benda", "kepulauan bangka belitung"
            , "Upacara Nujuh Jerami merupakan ritual yang diselenggarakan setiap tahun berdasarkan penanggalan Cina, yaitu pada 13 hari bulan yang bertepatan dengan bulan purnama. Dalam penanggalan masehi, biasanya jatuh pada setiap bulan April. Upacara ini dirayakan oleh komunitas Orang Lom di Dusun Air Abik dan Dusun Pejam. Ritual ini diselenggarakan sebagai bentuk rasa syukur warga adat, baik di pedalaman hutan maupun di pemukiman luar atas keberhasilan panen padi (beras merah).Menurut cerita tetua adat, awal cerita Nujuh Jerami bermula dari salah seorang leluhur mereka yang mendapat mimpi agar mengorbankan kedua anaknya. Perintah itupun dilaksanakan dengan mengorbankan kedua anaknya, setelah dikorbankan masing-masing di buang ke laut dan ke daratan sebagai tumbal. tumbal anak yang dibuang ke laut mereka anggap menjelma sebagai ikan dan yang di daratan menjadi tanaman padi. Dalam pemahaman masyarakat Lom ikan dan padi merupakan dua hal yang tidak dapat dipisahkan.Sejak saat itu masyarakat Lom menyelenggarakan ritual persembahan sebagai ucapan rasa syukur yang mereka sebut sedekah Gebong atau sedekah kampung."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485146067.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("55","tari merawai", "tarian", "kepulauan riau"
            , "Di Kabupetan Lingga terdapat komunitas orang laut yang hidup di atas perahu kecil yakni sampan, suka berpindah tempat dan animisme. Pada masa sekarang sebagian besar telah menetap di suatu tempat dan telah beragama. Sebagian ada yang memeluk agama Islam, Kristen, Budha dan Konghucu. Orang laut hidup sangat sederhana, mereka yang masih hidup di atas sampan hanya ditutupi kajang sebagai pelindung dari terik panas dan hujan. Untuk menafkahi hidup, mereka mencari ikan dengan peralatan sederhana, seperti tempuling, tombak dan serampang. Secara fisik Orang Laut asli berkulit lebih gelap dan berambut keriting. Orang Laut juga menggunakan bahasa Melayu dengan dialek tersendiri.\n" +
                    "\n" +
                    "Orang Laut masuk kelompok ras Melayu tua atau proto Melayu. Kedatangan Orang Laut di Kepulauan Riau diperkirakan sekitar tahun 2500-1500 PSM. Paska tahun 1500 SM terjadinya migrasi bangsa deutro Melayu yang mengakibatkan terdesaknya bangsa proto Melayu ke wilayah pantai. Kelompok yang terdesak ini yang dikenal dengan Orang Laut. Menurut dongeng, dibandingkan dengan orang Melayu, Orang Laut terlebih dahulu tinggal di Kepulauan Lingga. Menurut dongeng, pada zaman dahulu di Pulau Lingga hanya ada gunung Daik dan sebuah gunung di Desa Mentuda.  Pada masa itu Orang Laut  tinggal di atas gunung Daik. Di Gunung Daik Orang Laut membuat suluh yang digunakan sebagai penerang saat mencari hasil laut di malam hari. Setelah sekian lama Orang Laut tinggal di gunung Daik, terbentuklah daratan. Setelah terbentuk daratan, datang orang-orang Melayu bermukim di Pulau Lingga. Sejak itu pulau Lingga dan sekitarnya menjadi tempat tinggal orang-orang Melayu.\n" +
                    "\n" +
                    "Orang Laut di Lingga pada masa yang lalu berada dibawah pemerintahan raja-raja Melayu. Di zaman Melaka mereka berada di bawah pemerintahan Maharaja Lingga. Setelah itu terjadi peralihan kekuasaan, setelah Kerajaan Melaka runtuk di tahun 1511 dan selanjutnya berdirinya Kerajaan Johor, sepertinya pada masa itu kekuasaan Maharaja Lingga telah berakhir dan digantikan oleh penguasa dari Jambi keturunan Megat Mata Merah. Dikirakan di awal berdirinya Kerajaan Johor, Megat Raden Kuning anak Megat Mata Merah yang berasal dari Jambi berpindah ke Lingga. Megat Raden Kuning menetap di Daik dan menjadi penguasa Kepulauan Lingga di bawah takluk Johor. Pada masa kini masih dapat ditemukan Makam Megat Raden Kuning berada di Bukit Nyiur di Daik. Megat Raden Kuning yang menjadi penguasa Lingga menjadi pemimpin kelompok Orang Laut. Orang Laut taat setia kepada Megat Raden Kuning dan keturunannya sebagai penguasa wilayah Lingga. Keturunan Megat Raden Kuning selanjutnya bergelar Megat dan menjadikan Pulau Mepar sebagai pusat pemerintahan. Sebagai penguasa Lingga di bawah Sultan Johor, Pahang, Riau dan Lingga, keturunan Megat Raden Kuning bergelar Orang Kaya Lingga.\n" +
                    "\n" +
                    "            Walaupun Orang Laut masyarakat yang tertinggal dan hidup sangat sederhana, namun mereka mempunyai juga seni tari tradisional. Sebagai masyarakat maritim, seni tari tradisional Orang Laut berhubungan dengan kehidupan mereka sebagai nelayan tradisional. Tarian tradisional yang hidup dan berkembang di tengah kehidupan Orang Laut yakni Tari Merawai. Rawai di Lingga merupakan alat tangkap ikan yang menggunakan tali dengan cara direntangkan dipasang banyak mata kail. Tari Merawai mengisahkan kehidupan Orang Laut yang bersama-sama menggunakan satu sampan pergi mencari ikan dengan menggunakan rawai.\n" +
                    "\n" +
                    "Tari Merawai telah lama berkembang di Lingga. dalam sebuah buku terbitan  tahun 1960-an dapat ditemukan daerah Lingga mempunyai seni tradisional Tari Merawai. Sayangnya sebagian lembar buku ini telah hilang sehingga tidak diketahui judulnya. Buku ini berasal dari Rumah Cagar Budaya Datuk Laksamana Lingga dan diserahkan ke Museum Linggam Cahaya. Mengenai Tari Merawai dalam buku ini di halaman 63 dinyatakan “Tari Merawai dan tari zafin terdapat di Daik dan Tambelan, zafin umumnya terdapat di seluruh daerah.” Tari Merawai yang dinyatakan terdapat di Daik di dalam buku ini sebenarnya bukan bermaksud Tari Merawai bagian dari seni tari tradisional di Daik, tetapi pada masa itu Tari Merawai pernah menjadi bagian dari seni pertunjukan di Daik. Mahmud Ustman warga Daik yang sekarang menetap di Kelurahan Dabo mantan pensiunan Pegawai Negeri Sipil, yang berumur lebih dari 80 tahun, menurutnya Tari Merawai merupakan tarian Orang Laut Lingga. Pada tahun 1950-an beliau pernah menjadi panitia perayaan hari kemerdekaan Republik Indonesia di Daik. Pada waktu itu diadakan acara di lapangan Hang Tuah Daik dan diantara seni budaya yang ditampilkan yakni Tari Merawai. Pada masa itu Tari Merawai ditampilkan oleh Orang Laut dari Desa Duara sebelah Utara Lingga dan sekarang bagian dari wilayah Kecamatan Lingga Utara. Tari Merawai pada masa itu ada yang menyebutnya dengan joget mantang.\n" +
                    "\n" +
                    "Tari Merawai pernah juga berkembang di masyarakat Orang Laut di Pulau Lipan, Desa Penuba, Kecamatan Selayar. Salah satu pelaku seni Tari Merawai yang ada di Pulau Lipan yakni seorang laki-laki Orang Laut yang bernama Anis. Menurut Anis, dia belajar seni Tari Merawai dari bapaknya. Pada tahun 1992, Anis bersama-sama 28 Orang Laut Pulau Lipan dibawa oleh Imran Nuh berangkat ke Pekanbaru untuk menampilkan seni Tari Merawai dalam acara pentas seni Suku Terasing di Pekanbaru. Pada waktu itu, agar lebih menarik, Imrah Nuh menjadi koreografer Tari Merawai. Pada tanggal 4-8 Juli 1999, diadakan Perkampungan Penulisan Melayu Serumpun di Daik. Kegiatan ini diikuti oleh beberapa peserta dari negara ASEAN, seperti dari Brunai Darussalam, Thailand, Singapura, Malaysia dan Indonesia. Dari Malaysia diikuti peserta dari Gabungan Penulis Nasional Malaysia (GAPENA), dan dari Korea Selatan diikuti oleh seorang peneliti. Dalam kegiatan ini ditampilkan berbagai seni pertunjukan budaya Melayu, yang diantaranya seni Tari Merawai yang ditampilkan oleh masyarakat Orang Laut dari Pulau Lipan.\n" +
                    "\n" +
                    "Dalam tarian merawai, terdapat beberapa penari yang meniru gerak orang-orang yang merawai di atas satu sampan. Gerak yang ditiru dalam bentuk tarian yaitu:\n" +
                    "\n" +
                    "1.      Tukang rawai\n" +
                    "\n" +
                    "2.      Tukang kayuh\n" +
                    "\n" +
                    "3.      Tukang timba\n" +
                    "\n" +
                    "4.      Tukang kemudi\n" +
                    "\n" +
                    "Tarian dilakukan berbaris, berkeliling mengitari panggung. Baris pertama menirukan orang melempar pancing kiri dan kanan, baris kedua menirukan orang berkayuh sampan, baris ketiga menirukan orang menimba air dan baris terakhir paling belakang, beradegan seperti orang mengemudi sampan. Sambil menari berkeliling mengitari panggung atau tempat diiringi dengan  nyanyian oleh seorang penyanyi yang diiring dengan musik tambur dan gong. Tarian dilakukan berulang-ulang mengikuti nyanyian yang dilantunkan oleh penari.  Naynyian menggunakan dialek bahasa Melayu tempatan yang menceritakan adegan tari merawai. Lirik nyanyian yang dilantunkan sebagai berikut:\n" +
                    "\n" +
                    "Ade satu si tukang ghawai\n" +
                    "\n" +
                    "Ada satu si tukang kayoh\n" +
                    "\n" +
                    "Ada satu si tukang timbe\n" +
                    "\n" +
                    "Ada satu si tukang kemudi\n" +
                    "\n" +
                    "Keghiuk keghesau, keghiuk keghesau\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Seni Tari Merawai merupakan indentitas Orang Laut yang hidup di laut dan hidup dengan mata pencaharian sebagai nelayan tradisional dengan peralatan yang sederhana. Seni rawai, menunjukkan Orang Laut hidup berkelompok saling bantu membantu antar sesama. Tari Merawai ditampilkan oleh Orang Laut untuk menghibur diri mereka dan mengingatkan kehidupan mereka sebagai masyarakat maritim yang hidup dan bertahan di laut. Seni Tari Merawai yang bermula dari seni budaya Orang Laut, selanjutnya mendapat tempat di tengah-tengah penggiat seni budaya Melayu di Kepulauan Riau. Pada tahun 2001, seni Tari Merawai pernah tampil di Melaka dalam acara satu acara seni budaya. Tari Merawai ditampilkan dengan koreografer Imran Nuh dan penarinya para penari bukan dari kelompok Orang Laut tetapi para penari orang Melayu Daik. Beberapa sanggar yang dibentuk oleh orang Melayu di Lingga, pernah juga menampilkan tari kreasi rawai di bebeberapa acara seni budaya Melayu yang diadakan pemerintah Kabupaten Lingga."
            , ""
            , "http://kebudayaan.kemdikbud.go.id/bpnbkepri/wp-content/uploads/sites/39/2019/05/44974726_711301249226708_9142434653766942720_n-696x392.jpg"
            , "https://disbud.kepriprov.go.id/wp-content/uploads/2020/06/TARI-MERAWAI-2-1024x576.jpg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/2018008784-pencatatan-1_1561695410.jpg"
            , ""
            , "")
        dbHelper.insertData("56","tari jaipong", "tarian", "jawa barat"
            , "Jaipongan adalah sebuah genre seni tari yang lahir dari kerjasama antara dua orang seniman asal Bandung dan Karawang bernama Gugum Gumbira H. Suwanda. Perhatian mereka berdua pada kesenian rakyat yang salah satunya adalah Ketuk tilu menjadikannya mengetahui dan mengenal betul perbendaharan pola-pola gerak tari tradisi yang ada pada Keliningan/Bajidoran atau Ketuk Tilu. Gerak-gerak bukaan, pencugan, nibakeun dan beberapa ragam gerak mincid dari beberapa kesenian di atas cukup memiliki inspirasi untuk mengembangkan tari atau kesenian yang kini dikenal dengan nama Jaipongan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1484189524.jpg"
            , "https://bandungklik.com/wp-content/uploads/2021/12/Festival-Tari-Jaipong-Kreasi-Galuh-Pakuan-Seri-V-1.jpeg"
            , "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhs-kEm5b-X8bl1K83rqMWiLpn1eTR2Vw4OPismrTrlZ0N6euu6knWtSF5FoqYe7cMa7Bj8VCSU5FVqtZrzxcaDDDkWvVouGEo36I4O65Jto-FLbp6wvGbRZvX-Xxw6dTcrxAng-cVH-cyo2wrmEMeiUjWzGnm2ZuaQ_SzgITKiCp2mjFkjTQTtk_5B/w640-h360/Tari%20Jaipong%20-%20by%20tegaraya.com%202.jpg"
            , "https://awsimages.detik.net.id/community/media/visual/2022/08/03/kesenian-jawa-barat-tari-jaipong-yang-mendunia_169.jpeg?w=1200"
            , "")
        dbHelper.insertData("57","tari gambyong", "tarian", "jawa tengah"
            , "Tari gambyong adalah tradisi kecil yang berkembang menjadi bagian tradisi besar. Tari ini pada mulanya merupakan tari tldhk yang hidup berkembang di lingkungan rakyat, dan kemudian berkembang menjadi tarian istana atau keraton. Istilah gambyong atau tari gambyong mulai digunakan dalam Serat Centhini yang ditulis pada abad XVIII. Akan tetapi, diperkirakan tari gambyong merupakan perkembangan dari tari tldhk atau tayub.Serat Sastramiruda menyebutkan bahwa tari tayub telah dikenal sejak zaman Kerajaan Jenggala (kira kira abad XII), sedangkan tari tldhk dikenal sejak zaman Demak (abad XV), yang disebut dengan taldhk barangan atau taldhk mengamen, yang dipertunjukkan dengan iringan rebana dan kendang serta diawali dengan vokal."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483932551.jpg"
            , "https://cdn-2.tstatic.net/tribunnews/foto/bank/images/tari-gambyong-3423423.jpg"
            , "https://asset.kompas.com/crops/aZUwBaQzxPdrcs_soqTlxUlad1c=/29x29:705x480/780x390/data/photo/2021/02/08/60211aa458180.jpg"
            , ""
            , "")
        dbHelper.insertData("58","tari bedhaya semang", "tarian", "di yogyakarta"
            , "Di tanah Jawa sebelum ada Bedhaya sanga, awalnya ada bedhaya yang ditarikan oleh tujuh orang putri. Bedhaya ini digambarkan sebagai kehidupan para dewa ketika mereka menciptakan tujuh bidadari yang mengelilingi Suralaya. Tari Bedhaya adalah tarian dengan komposisi tari yang dibawakan oleh sembilan penari putri. Tarian ini dibuat pada masa Sultan Agung di Kerajaan Mataram, dan Kemudian pada masa Kasultanan Yogyakarta berdiri, Sultan Hamengku Buwana I menciptakan tari Bedhaya yang diberi nama Bedhaya Semang. Arti kata semang memiliki arti khawatir, was-was atau ragu-ragu, yang berkaitan dengan keraguan hati Panembahan Senopati ketika Ratu Kidul menemuinya dalam semadi dan mempersembahkan sebuah tarian kepada Panembahan Senopati. kesembilan penari bedhaya tersebut mempunyai peran-peran yang berbeda namun memakai riasan yang sama karena melambangkan bahwa setiap orang terlahir dengan wujud dan keadaan yang sama. Di dalam pertunjukan tari Bedhaya pemegang peran utama adalah batak dan endhel yang melambangkan peperangan antara akal dan pikiran jiwa manusia dengan nafsu manusia."
            , ""
            , "https://www.mymagz.net/wp-content/uploads/sites/8/2018/02/25a.jpg"
            , "https://asset.kompas.com/crops/iETfqV-tazKTUAJapNvxISXSEfY=/20x0:620x400/750x500/data/photo/2022/02/23/6215a3ddb6855.jpeg"
            , "https://koropak.co.id/storage/img/cover/kisah-bedhaya-semang-dan-tujuh-bidadari.jpg"
            , ""
            , "")
        dbHelper.insertData("59","tari seblang", "tarian", "jawa timur"
            , "Tari seblang merupakan tari tradisional Banyuwangi. Hingga saat ini ada dua desa yang seringkali mempergelarkan tari seblang yaitu desa Olehsari dan desa Bakungan. Jarak antara desa Olehsari dengan desa Bakungan tidak jauh karena masih dalam satu kecamatan namun dua desa ini memiliki tradisi berbeda meski namanya sama. Yaitu seblang, sehingga muncul nama Seblang Olehsari dan Seblang Bakungan namun secara subtansi, kedua ritual itu memiliki satu kesamaan arah dan tujuan yang ingin dicapai keduanya mencerminkan ritual masyarakat agraris yang menempatkan Dewi Sri sebagai simbol kesuburan dewi yang diyakini sebagai penjaga kesuburan tanah pertanian."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1484189596.jpg"
            , "https://cdn1-production-images-kly.akamaized.net/EqSt6oxfsALHEVCWdvH0D0vrooI=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/556216/original/100914bfoto_tari.jpg"
            , "https://t-2.tstatic.net/tribunnewswiki/foto/bank/images/Tari-Seblang-2.jpg"
            , ""
            , "")
        dbHelper.insertData("60","tari cokek", "tarian", "banten"
            , "Cokek adalah suatu bentuk pernyataan musik khas Betawi (Jakarta), berupa kesenian nyanyi dan tali dilakukan oleh pemain-pemain wanita. Pada jaman dulu yang menari adalah perempuan belia yang menjadi budak. Mereka (penari) menjalin rambutnya berkepang dan mengenakan baju kurung. Fungsi Tari Cokek Tani Cokek Betawi merupakan salah satu bentuk tari pergaulan masyarakat setempat sebagai perpaduan antara nilai-nilai kebudayaan Betawi dengan masyarakat luar. Tani Coken dipertunjukkan terutama dalam merayakan kenduri atau perayaan hari besar orang Cina, seperti pada perayaan keluarga, perayaan pernikahan, atau hiburan lainnya. Sebagai seni hiburan yang bersifat pergaulan, tari cokek cukup populer dan berkembang di Jakarta dan daerah sekitarnya seperti Bekasi dan Tangerang. Sekarang tari Cokek tidak hanya didominasi oleh warga keturunan Cina saja, melainkan juga warga pribumi yang berbaur dengan warga keturunan Cina baik sebagai pemain dalam grup seni maupun sebagai penonton."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485402892.jpg"
            , "https://assets.pikiran-rakyat.com/crop/111x0:1174x720/x/photo/2021/11/09/4050674173.jpg"
            , "https://museumnusantara.com/wp-content/uploads/2022/04/cintaindonesia.web_.id_-1.jpg"
            , ""
            , "")
        dbHelper.insertData("61","tari legong kraton", "tarian", "bali"
            , "Pada mulanya tari legong itu merupakan satu jenis tari tapi dalam pertumbuhan selanjutnya gerak-gerak tarinya diposisikan berdasarkan salah satu tarian yang ada dalam gambuh. Jika dilihat dari perbendaharaan gerak, nampaknya gerak-gerak sukar (intricate) yang terdapat dalam pegambuhan, disempurnakan, dihaluskan, distilisasikan, disesuaikan dengan gamelannya yang dinamis, sehingga menjadilah ia Legong seperti yang ada sekarang. Tari Legong adalah sebuah tarian klasik Bali yang memiliki perbendaharaan gerak yang sangat komplek yang diikat oleh struktur tabuh pengiring yang konon merupakan pengaruh dari Gambuh. Adakalanya tarian ini ditarikan oleh 2 (dua) orang gadis atau lebih dimana biasanya salah satu diantaranya ada berperan sebagai Condong,yaitu peran yang pertama kali tampil di pentas guna memulai tari Legong ini. Adapula tari Legong yang dibawakan oleh satu atau dua pasang penari tanpa menampilkan tokoh Condong. Diantara ciri khas Legong adalah pemakaian kipas oleh para penarinya (kecuali Condong)."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485418195.jpg"
            , "https://indonesiakaya.com/wp-content/uploads/2020/10/IMG_8856_Tari_Legong_Keraton_biasanya_mengangkat_cerita_raja-raja_bali_atau_kisah_dari_epos_Ramayana_2.jpg"
            , "https://asset-a.grid.id//crop/0x0:0x0/700x465/photo/bobofoto/original/909_penari-legong.jpg"
            , "https://museumnusantara.com/wp-content/uploads/2021/01/steemitcom-1.jpg"
            , "")
        dbHelper.insertData("62","tari sireh", "tarian", "nusa tenggara barat"
            , "Tari sireh merupakan hasil karya cipta nenek moyang dan leluhur masyarakat dusun Buani meskipun secara pasti tidak dapat diketahui siapa nama penciptanya karena tarian ini sudah diwariskan secara turun-temurun sebagai warisan leluhur beberapa generasi sebelumnya, meskipun tidak ada sumber tertulis yang menyebutkan kapan tarian ini diciptakan dan oleh siapa penciptanya, namun secara lisan telah dijelaskan secara turun-temurun kepada tokoh tokoh masyarakat.\n" +
                    "\n" +
                    "Dari hal tersebut di atas dapat dipaparkan disini bahwa tari Sireh ini berasal dari tradisi memasak atau memakan daun sirih beserta seluruh kelengkapan tersebut. Ada sebuah kisah pada zaman dahulu bahwa beberapa orang perempuan saling berkunjung ke rumah tetangga di sekitar dusun Buani terdekat. Pada saat berkunjung atau bertamu, mereka diterima dan dijamu oleh tuan rumah. Umumnya tuan rumah menyuguhkan pabuan yang berisi daun sirih beserta seluruh kelengkapannya.\n" +
                    "\n" +
                    "Dalum suatu pementasan tari tentunya memiliki durasi menari tertentu. Demikian halnya tari streh memiliki durasi pementasan tari, yang biasanya tergantung permintaan dari si pemesan tarian tersebut. Lama waktu pementasan sangat fleksibel, mulai dari durasi 5 menit, 20 menit, 30 menit dan sebagainya yang disesuaikan dengan situasi dan kondisi di lapangan.\n" +
                    "\n" +
                    "Tari sireh di dusun Buani, desa Bentek, kecamatan Gangga memiliki pembabakan tari dalam setiap pementasan, pembabakan tersebut mulai dari tarian pembuka, isi dan tarian penutup. Adapun pembabakan dalam tari sireh adalah sebagai berikut:\n" +
                    "\n" +
                    "Tarian pembuka dalam tari streh disebut dengan igelan menembak menggunakan Tarian numparg tampik Saat awal masuknya penari di panggung, jumlah penari di bagi dua. Satu baris terdiri dari tiga orang penari di sebelah kanan dan tiga orang lagi disebelah kanan melangkah masuk ke tengah panggung dengan bebaris beiringan sambil melompat kecil, dengan kaki kanan di depan sambil melompat dan tangan kanan kanan digerakan ke atas secara bergantian dengan tangan kiri sambil menggoyang pinggul serta tangan kiri mengibaskan selendang ke atas sampai tiga kali hitungan langkah lompatan. Ini menceritakan tentang para penari masuk ke rumah tetangganya untuk dijamu makan sireh atau memamaq. Mereka disuguhkan pebuan yang berisi daun sirih beserta seluruh kelengkapannya. Pada saat mereka menikmati suguhan daun sirih tersebut ternyata buah pinang yang dikonsumsi tersebut merupakan buah pinang Jol jol-Pusing) artinya buah pinang yang bisa membuat siapapun yang mengkonsumsinya menjadi pusing. Ciri khas pada bagian ini adalah gerakan tangan menumpang dan menampik yaitu gerakan tangan kanan digerakkan ke atas secara bergantian dengan tangan kiri.\n" +
                    "\n" +
                    "Tarian ini disebut dengan iklan penengah dengan menggunakan Tarian parade dan kejedot. Pada tahapan isi, diceritakan bahawa penari dalam kondisi pusing, seperti orang mabuk tersebut mereka akhirnya bertingkah  tidak wajar yakni, melakukan tari-tarian sambil melelakaq/bersyair/bernyanyi. mereka juga menggunakan bongot/udeng seperti layaknya laki-laki. setelah sekian lama menari karena pusing, akhirnya mereka sedikit demi sedkit mereka mlai sadar digambarkan dalam Tarian Kejerot. pada bagian isi dalam Tari Sireh ini para menggerakan pinggulnya kekanan dan kekiri, dan gerakan tangan kanan dan kiri sambil memegang selendang yang digerakan ke depan atau ke atas dengan cara bergantian. dikombinasikan dengan gerakan kepala, dengan cara menggoyangkan kepala ke kanan dan ke kiri disertai gerakan memutar tangan.\n" +
                    "\n" +
                    "Ciri khas pada Tarian parade adalah gerakan pinggul yang dilakukan dengan cepat, kemudian diikuti gerakan kedeser yaitu gerakan kaki para penari untuk berpindah tempat secara cepat dari kiri ke kanan, sedangkan pada tari kajerot ciri khas gerakanya adalah pada gerakan pundak yang dilakukan oleh penari. Penari menggerakan pundak kanan dan kiri keatas dan kebawah secara bergantian.\n" +
                    "\n" +
                    "Tarian penutup pada tari sireh disebut dengan igelan penutup dengan menggunakan tarian gending halus. Diceritakan pada bagian ini para penari seolah telah tersadar sepenuhnya akibat mabuk dari buah jol tersebut. Penari lalu memunculkan sifat asli n'ereka yang lemah lembut dan gemulai yang dimunculkan dalam bagian ini. Ciri khas pada baian ini adalah dengan tempo musik yang lebih lambat dan lembut, gerakan didominasi gerakan yang lebih pelan. Penari merntangkan tangan kanan sambil mengerak-gerakananya sambil bergeser perlahan dan akhirnya ditutup dengan mencakupkan kedua tangan di dada."
            , ""
            , "https://dmm0a91a1r04e.cloudfront.net/7eGzpXdD1IMqVgsMUC7RUO4JSCc=/1024x630/https%3A%2F%2Fkompas.id%2Fwp-content%2Fuploads%2F2019%2F09%2F6ac19d48-21dd-4105-a8a8-e96496704ae7_jpg.jpg"
            , "https://kebudayaan.kemdikbud.go.id/ditwdb/wp-content/uploads/sites/9/2019/10/Tari-Sireh-194-1024x683.jpg"
            , "https://cdn.medcom.id/images/content/2019/09/04/1060022/MW3uN2LiSD.jpg"
            , ""
            , "")
        dbHelper.insertData("63","tari likurai", "tarian", "nusa tenggara timur"
            , "Likurai dalam bahasa Tetun (bahasa daerah yang paling banyak digunakan di Kabupaten Belu) mempunyai arti menguasai bumi. Liku artinya menguasai dan Rai artinya Tanah atau Bumi. Lambang tarian ini adalah wujud penghormatan kepada para pahlawan yang telah menguasai atau menaklukan bumi. Tarian adat ini ditarikan oleh feto-feto kebas (wanita-wanita cantik) dengan mempergunakan gendang-gendang kecil yang berbentuk lonjong terbuka di salah satu sisinya dan dijepit di bawah ketiak sambil dipukul dengan irama gembira dengan gerakan berlenggak-lenggok diikuti dengan derap kaki yang cepat sesuai dengan irama pukulan.Tarian Likurai dahulunya merupakan suatu tarian perang, yaitu tarian yang ditarikan oleh para wanita baik wanita berusia muda maupun yang berusia tua ketika menyambut atau menyongsong para pahlawan yang pulang dari medan perang. Konon ketika para pahlawan yang pulang perang dengan membawa kepala musuh yang telah dipenggal (sebagai bukti keperkasaan), maka para feto (wanita tua dan muda) terutama mereka yang berdarah bangsawan menjemput para meo (pahlawan) dengan menarikan Tari Likurai dan didampingi oleh beberapa mane (laki-laki) sambil menari (haksoke) dengan menghentakan kaki."
            , ""
            , "https://asset.kompas.com/crop/0x15:1000x682/750x500/data/photo/2019/06/26/1518495107.jpg"
            , "https://asset.kompas.com/crop/0x0:1024x683/750x500/data/photo/2019/06/26/2273295624.jpg"
            , "https://ultimagz.com/wp-content/uploads/21368.jpg"
            , ""
            , "")
        dbHelper.insertData("64","tari pinggan sekadau", "tarian", "kalimantan barat"
            , "Tari Pingan merupakan kesenian yang dikenal secara umum, hidup dan berkembang ditengah masyarakat Dayak Mualang di Kecamatan Belitang Hilir, di Kabupaten Sekadau Kalimantan Barat.\n" +
                    "\n" +
                    "Tari Pinggan mempunyai peranan penting dalam kehidupan masyarakat Dayak Mualang. Tari Pingan merupakan sebuah penggambaran kehidupan dan transformasi budaya masyarakat Dayak Mualang sehingga kesenian tersebut dapat dikatakan sebagai ciri khas yang sesuai dengan adat dan budaya Dayak Mualang. Hal ini terkait erat dengan sistem religi dan adat istiadat sebagai perwujudan norma-norma dan aturan yang menyangkut kehidupan dan penghargaan kepada para leluhur, sehingga Tari Pingan tidak dapat dipisahkan dengan kehidupan masyarakat Dayak Mualang.\n" +
                    "\n" +
                    "Tari Pinggan juga digunakan sebagai alat integrasi masyarakat dan berfungsi penting sebagai penyatuan masyarakat berdasarkan kesamaan latar belakang kehidupan dan budaya yang ada pada orang-orang Dayak Mualang. Pengertian Pingan adalah wadah sejenis piring yang terbuat dari tanah liat atau dari batu. Namun sejalan perkembangannya dipakai pingan keramik warisan dari leluhur yang disebut pingan retak seribu. Saat ini keberadaan pingan tua semangkin sedikit, maka piring beling digunakan untuk mengganti Pingan tua yang digunakan untuk Tari Pingan. Adapun piring beling yang digunakan sebagai pengganti pada umumnya berwarna putih polos, berdiameter kurang lebih 10 - 15 inci. Oleh sebab itu selanjutnya Tari Pingan dikenal dengan nama Tari Piring.\n" +
                    "\n" +
                    "Fungsi kesenian Tari Pingan bagi masyarakat adalah sebuah pemberian yang dianggap penting terkait dengan yang mereka butuhkan untuk menunjang kehidupan, baik yang berkaitan dengan sistem kepercayaan, ekonomi, sosial dan budaya. Tari Pingan merupakan simbol penghormatan terhadap para leluhur. Hal ini karena bagi masyarakat Dayak Mualang arti penting sebuah Tari Pingan bukan saja terletak pada nilai estetik semata, namun mencakup pula keharmonisan hubungan manusia dengan alam (lingkungan), roh para leluhur, makhluk halus, dan hubungan manusia dengan Petara.\n" +
                    "\n"
            , ""
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1564978680/cvyooo5c5ggwyrxxdwh2.jpg"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1564978719/wtazh4cm6vwvsntgjm6m.jpg"
            , "https://seringjalan.com/wp-content/uploads/2020/05/Tari-Pingan-1024x621.jpg"
            , ""
            , "")
        dbHelper.insertData("65","tari baksa kambang", "tarian", "kalimantan selatan"
            , "Tari Baksa Kambang adalah seni tari klasik yang hidup dan berkembang di lingkungan Keraton Banjar. Tari Baksa Kambang hanya digelar di lingkungan istana Kesultanan Banjar yang biasanya ditarikan oleh putri-putri keraton untuk menghibur keluarga dan tamu undangan kerajaan, seperti raja dan pangeran. Namun dalam perkembangannya, lambat laun tarian ini menyebar ke masyarakat Banjar. Para gadis remaja Banjar, yang dalam istilah lokal disebut galuh-galuh, kini telah memiliki keterampilan untuk menarikannya.Penarinya adalah wanita. Tari ini merupakan tari tunggal dan dapat dimainkan oleh beberapa penari wanita. Tarian ini bercerita tentang seorang gadis remaja yang sedang merangkai bunga. Sering dimainkan di lingkungan istana. Dalam perkembangannya tari ini beralih fungsi sebagai tari penyambutan tamu. Tari Baksa Kembang termasuk jenis tari klasik, yang hidup dan berkembang di keraton Banjar, yang ditarikan oleh putri-putri keraton. Lambat laun tarian ini menyebar ke rakyat Banjar dengan penarinya galuh-galuh Banjar. Tarian ini dipertunjukkan untuk menghibur keluarga keraton dan menyambut tamu agung seperti raja atau pangeran. Setelah tarian ini memasyarakat di Tanah Banjar, berfungsi untuk menyambut tamu pejabat-pejabat negara dalam perayaan hari-hari besar daerah atau nasional. Disamping itu, tarian Baksa Kembang dipertunjukkan pada perayaan pengantin Banjar atau hajatan misalnya tuan rumah mengadakan selamatan."
            , ""
            , "https://cdn-2.tstatic.net/banjarmasin/foto/bank/images/tari-baksa-kembang-tarian-tradisional-penyambut-tamu-agung.jpg"
            , "https://toriqa.com/wp-content/uploads/2021/07/Tari-Baksa-Kembang-1.jpg"
            , "https://infopublik.id/resources/album/bulan-januari-2020/a111_compressed.jpg"
            , ""
            , "")
        dbHelper.insertData("66","tari gong", "tarian", "kalimantan timur"
            , "Tari gong di Desa Ujoh Bilang Kecamatan Long Bagun merupakan bentuk tari tunggal yang ditarikan oleh seorang wanita. Tari Gong adalah tari yang di tarikan di atas Gong oleh seorang penari perempuan yang menunjukkan kepandaiannya menari dengan lemah lembut gerak tubuh dan tangannya membuat penonton terbawa dalam suasana tenang.\n" +
                    "\n" +
                    "Bentuk Tari Gong di Desa Ujoh Bilang Ulu didukung unsur-unsur gerak, kostum,musik, property, waktu dan tempat pertunjukan. Instrumen yang digunakan dalam mengiringi  tari Gong menggunakan musik Sapeq Daak Tubun Situn. Busana yang digunakan penari Gong adalah baju manik, Taah/Rok manik, bulu burung enggang, Tajog/ Bulu burung Enggang yang diletakkan di atas topi, teilbeg, kalung, anting.\n" +
                    "\n" +
                    "Tari Gong biasanya ditarikan di dalam ruangan seperti Lamin Adat, Gedung Kesenian,atau di luar Gedung, di halaman  lamin, lapangan, tergantung pada kebutuhan penyelenggara acara. Tari Gong berfungsi sebagai tari untuk penyambutan tamu agung, resepsi pernikahan, tari menyambut kelahiran bayi kepala suku, tari ini mempunyai fungsi sebagai hiburan yang dinikmati oleh penonton tanpa ada respons dari penonton untuk menari Bersama. \n" +
                    "\n" +
                    "Fungsi Tari Gong adalah sebagai sarana ritual, hiburan, dan presentasi  estetis. Fungsi Tari Gong pada umumnya sebagai sarana hiburan yang dipentaskan pada saat acara pernikahan, dan acara-acara seni. Tari Gong sebagai sarana ritual kesakralan upacara Dangai. \n" +
                    "\n" +
                    "Tari Gong  adalah suatu karya tari yang menarik untuk di teliti karena kecuali unik juga terlihat mewah dan berat untuk dikenakan, untuk bahan tata busananya terbuat dari manik-manik dan penari dituntut untuk bisa menjaga keseimbangan dalam bergerak  di atas Gong, gerak tari yang lemah   lembut dengan bentuk gerak yang sederhana.\n" +
                    "\n" +
                    "Penelitian ini disusun melalui pendekatan deskriptif analisis dan tahap-tahap yang digunakan dalam memperoleh data yaitu studi pustaka, observasi, wawancara analisis data (seleksi data, deskripsi data, interpretasi data, penyimpulan data dan Penyusunan laporan).  Kemenarikan lain dari Tari Gong ini adalah  gerakan sederhana tapi mempunyai bentuk beraneka ragam dan mempunyai fungsi sebagai sarana ritual ,  sarana hiburan dan sarana tontonan.\n" +
                    "\n" +
                    "Tari Gong merupakan bentuk tari yang ditarikan oleh seorang wanita dengan memakai pakaian tradisional khas suku Dayak, dan bulu burung enggang yang dikenakan di kedua belah tangan penari, dan menari di atas Gong . Bentuk pertunjukkan ditekankan pada elemen gerak, musik tari, rias dan busana, property, waktu dan tempat pertunjukan.Tari Gong Sebagai sarana ritual ditarikan seusai prosesi upacara Dangai sebagai sarana ungkapan syukur masyarakat atas panen yang berlimpah. Fungsi Tari Gong sebagai sarana hiburan  untuk memeriahkan acara perkawinan dan penyambutan tamu, sedangkan fungsi tari Gong sebagai sarana tontonan untuk menambah uang kas sanggar tari dan memperkenalkan budaya Dayak melalui pariwisata.\n" +
                    "\n" +
                    "Tari Gong adalah tarian tradisional suku Dayak di Kalimantan Timur yang menggunakan Gong sebagai media menarinya. Tarian ini dimainkan oleh seorang gadis  yang menari di atas Gong dengan penuh keanggunan , nama Tari gong sendiri diambil dari situ. Tari Gong ini sering disebut dengan nama Kancet Ledo oleh Masyarakat Dayak.\n" +
                    "\n" +
                    "Gerakan dalam Tari Gong  menggambarkan kelembutan seorang gadis yang, gerakan dalam tarian ini memang tidak begitu banyak seperti tarian yang lain bahkan banyak bentuk gerak yang dilakukan secara berulang. Gerakan pada tarian ini lebih focus pada gerakan tangan saat melambai, gerakan tubuh, dan juga gerakan kaki saat melangkah dan berpijak di Gong. Semua gerakan itu dimainkan penuh dengan kelembutan. Tarian ini memang terlihat sederhana, namun kelenturan dan keseimbangan sangat dibutuhkan dalam menari."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201901032-penetapan-1_1566354608.jpg"
            , "https://asset.kompas.com/crops/kqt9Is8D6jSrFK9bAxdEiUJE1Uw=/0x0:0x0/750x500/data/photo/2020/11/11/5fab8d926a5f2.jpg"
            , "https://t-2.tstatic.net/tribunnewswiki/foto/bank/images/Tari-Gong-1.jpg"
            , ""
            , "")
        dbHelper.insertData("67","jugit demaring (tari klasik kesultanan bulungan)", "tarian", "kalimantan utara"
            , "Menurut legenda, tari jugit ini diciptakan oleh dua orang seniman sekaligus laksamana kesultanan Bulungan yaitu Datuk Maulana dan Datuk Mahubut. Umumnya orang hanya mengenal tari jugit hanya satu variasi bentuk, sebenarnya tidak, tari Jugit mempunyai dua bentuk yang memang mirip tapi memiliki perbedaan yang sangat kompleks. Tari pertama disebut Tari Jugit Paman dan yang kedua di sebut Tari Jugit Demaring. Dimasa lalu, tari ini begitu sakral, tari jugit Paman hanya di peruntukan untuk raja, artinya tarian ini tidak akan pernah dapat dilihat di luar Istana, dan memang itulah aturannya, berbeda dengan tari jugit Demaring, walaupun milik keraton, namun ia boleh di persembahkan di luar Istana, karena itu biasanya dalam setiap penyambutan tamu di luar istana, misalnya di dermaga istana atau dalam Biduk Bebandung atau kapal layar Kesultanan, tari Jugitlah demaring yang dipersembahkan.Dari segi warna baju keduanya memiliki perbedaan, dalam tarian Jugit Paman penari harus menggunakan kombinasi warna merah di atas dan kuning di bawah. Sebaliknya penari Jugit Demaring menggunakan kombinasi baju kuning di atas dan hijau di bawah. Gerak tangan dan kecepatannya juga berbeda, dalam Tari Jugit Paman biasanya tempo atau gerakan cenderung lebih cepat sedang dalam tarian Jugit Demaring lebih lambat geraknya."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485175467.jpg"
            , "https://4.bp.blogspot.com/-GccHiQ5C6Wc/WCaH1aJU1PI/AAAAAAAAQSo/Y70xl9nWKrg0dJjQ8ElFJo4aHqMX4cJVACLcB/s1600/jugit%2Bpaman.jpg"
            , "https://cdn-2.tstatic.net/kaltara/foto/bank/images/tarian-jugid-demaring-asli-bulungan-dibawakan-oleh-gadis-dari-sanggar-tari-setara.jpg"
            , ""
            , "")
        dbHelper.insertData("68","tari maengket", "tarian", "sulawesi utara"
            , "Maengket adalah suatu tarian yang telah menjadi tradisi di Minahasa, dilakukan oleh kelompok orang yang menyanyi sambil menari bahkan saling berpegangan tangan dan KALTIM dipimpin oleh seseorang (kapen yang akan mengangkat suara/lagu pertama (tumutuur) serta tambur sebagai alat pengiringnya.\n" +
                    "\n" +
                    "Maengket berasal dari kata - engket yang artinya pasang, nyalakan, buka jalan, kaitkan, dan sebagainya. Apabila dilekatkan awalan ma- sebagai pembentuk kata kerja dapat diartikan sebagai kegiatan tarian. Kegiatan dimaksud berkaitan upacara dengan tujuan menerangi, membuka jalan dan mempersatukan masyarakat pendukungnya. Hal ini dilakukan dalam situasi kegiatan panen padi (maowey/makamberu), selamatan rumah baru (marambak) dan pergaulan muda mudi (lalaya'an). Versi yang lain yaitu yang dikemukakan oleh L. Ogi dalam bahasa tombulu menjelaskan bahwa maengket terjadi dari kata maha - engket, maha memiliki arti sedang melakukan pekerjaan dan kata engket berarti angkat, jengket atau sambung menyambung. Sehingga bila kedua kata ini disatukan maka memiliki pengertian melakukan angkat suara sambil berjengket dengan menyanyi sambung menyambung atau berbalasan. Sementara Posumah menjelaskan bahwa maengket terdiri dari kata ma, mah yang berarti pergi atau sementara atau sedang mau; dan kata engketyang dapat berarti bersama bergerak menari dan menyanyi lagu disatukan tanpa ada mahtuur atau tumutu'ur (pemimpin lagu). Jadi maengket sama dengan pergi berkumpul bernyanyi bersama-sama sambil menari, berpegangan tangan, membentuk lingkaran atau mapurengkey dengan gerakan maju selangkah, mundur selangkah, tangan diayunkan mengikuti ritme lagu yang dinyanyikan bersama. Sementara ada anggapan bahwa Maengket merupakan salah satu jenis tari dengan tipe setiap memulai menyanyi harus dimulai dari seseorang yang mengangkat suara kemudian diikuti oleh yang lainnya. Dengan demikian terdapat beberapa versi pendapat mengenai Maengket namun pada intinya Maengket adalah seni bernyanyi sambil menari dengan mengungkapkan sastra daerah yang dilakukan oleh sekelompok orang.\n" +
                    "\n" +
                    "Keberadaan tarian maengket penggunaannya tergantung dari maksud acara, tempat serta waktu. Jenis tarian ini dulu dibagi dalam 16 macam nyanyian yang menjadi tema atau judul yakni:\n" +
                    "\n" +
                    "• Marojor asal kata rojor yang berarti lurus, besar, bagus.\n" +
                    "\n" +
                    "• Maowei Makamberu berarti menyanyi sementara menuai (memetik) padi, mengumpul padi baru dan menceraikan padi itu dengan hampa-hampa jerami.\n" +
                    "\n" +
                    "• Marambak asal kata rambak yang berarti sentak menyentakkan kaki ke lantai.\n" +
                    "\n" +
                    "• Mareindeng asal kata reindeng (leindeng) yang berarti bunyi nyaring dan merdu.\n" +
                    "\n" +
                    "• Mawinson asal kata winson yang berarti ikut berulang ulang\n" +
                    "\n" +
                    "• Masambo asal kata ambo yang berarti capai\n" +
                    "\n" +
                    "• Mapurengkei asal kata rengkei (lengkei) yang berarti tinggi\n" +
                    "\n" +
                    "• Matolok (malolok) asal kata lulu yang berarti orang katik (pendek), wanita\n" +
                    "\n" +
                    "• Masama, masawuna, masawona asal kata sawo memiliki arti kuah, permaian, waktu isi biji padi masih cair.\n" +
                    "\n" +
                    "• Masiserap asal kata serap yang berarti bulan\n" +
                    "\n" +
                    "• Maurei asal kata urei (orei) artinya ikat berkas\n" +
                    "\n" +
                    "• Makarei asal kata kerei memiliki arti bersihkan\n" +
                    "\n" +
                    "• Maweso asal kata weso yang berarti tarik\n" +
                    "\n" +
                    "• Maijap asal kata ijap (riap) berarti sinar gilang gemilang\n" +
                    "\n" +
                    "• Marani asal kata rani (kasuai) berarti licin\n" +
                    "\n" +
                    "• Matambak asal kata tambak berarti ingat.\n" +
                    "\n" +
                    "Ke enam belas macam nyanyian maengket ini dilagukan secara puisi, namun yang berkembang dalam tarian Maengket sekarang ini hanya 2 (dua) macam yakni Makamberu, Marambak kemudian ditambah bentuk Lalayaan sehingga menjadi 3 tema nyanyian atau lagu yang biasa disebut tiga babak (maengket sebagai bentuk seni pertunjukan). Lalayaan berasal dari kata lumaya yang berarti bergembira. Terna Lalayaan dimasukkan dalam tarian Maengket sesudah Makamberu dan Marambak karena dalam mengakhiri aktivitas atau kegiatan panen padi kemudian naik rumah baru diakhiri dengan ungkapan kegembiraan.\n" +
                    "\n" +
                    "Dari catatan-catatan tersebut dapatlah disimpulkan dengan batasan yang sederhana bahwa Tari Maengket adalah sekelompok orang yang menyanyi sambung-menyambung dengan gerakan mengikuti irama (menari) yang dipimpin oleh seorang kapel yang mengungkapkan kegembiraan, ucapan syukur pada saat panen padi (maowey kamberu), naik rumah baru (marambak) dan pergaulan muda-mudi (lalayaan).\n" +
                    "\n" +
                    "Kapan munculnya Tari Maengket di Minahasa belum ada keterangan yang pasti namun menurut sejarah maengket sudah ada sejak abad ke 7. Kini mata budaya ini sudah berkembang dan dilestarikan orang Minahasa sampai sekarang dalam bentuk seni pertunjukan. Banyak pendapat yang ada mengenai asal-usul tari Maengket namun umumnya mengemukakan bahwa maengket adalah bagian dari suatu upacara ritual/sakral yang lahir dari suatu tradisi budaya gotong royong masyarakat di Minahasa dalam kegiatan agraris yaitu bercocok tanam. Budaya gotong royong ini dikenal dengan istilah mapalus. Mapalus merupakan suatu sistem kerja sama dengan dasar tolong-menolong antara beberapa orang atau sejumlah warga suatu masyarakat untuk kepentingan umum. Adapun bentuk kegiatan mapalus sampai sekarang ini dapat ditemukan ada yang terorganisir dan ada yang tidak terorganisir."
            , ""
            , "https://1001indonesia.net/asset/2022/01/Tari-Maengket.jpg"
            , "https://perpustakaan.id/wp-content/uploads/2019/12/Tari-Maengket.jpg"
            , "https://www.selasar.com/wp-content/uploads/2020/10/tentang-tari-maengket.jpg"
            , ""
            , "")
        dbHelper.insertData("69","tari raigo", "tarian", "sulawesi tengah"
            , "Sulawesi Tengah kaya akan tradisi yang tersebar di 12 etnik yang tersebar di seluruh wilayahnya, dan satu di antara banyak kesenian tersebut adalah kesenian Raigo. Raigo sebagai tarian tradisional dipercaya oleh masyarakat pendukungnya lahir dan berkembang lewat proses mitos yang diwujudkan dalam bentuk ritus dengan gerakan dan ungkapan yang bernilai sakral sehingga sering menyertai pelaksanan upacara adat khususnya dalam upacara syukur panen padi dan beberapa upacara tradisional lainnya. Raigo hidup dan berkembang dalam masyarakat Sulawesi Tengah khususnya pada suku bangsa Kulawi dengan sebutan Raego, Kaili menyebut Rego dan Bada menyebut Raigo. Tarian yang menggambarkan suatu kemenangan dalam usaha, kegembiraan serta pengungkapan rasa syukur atas hasil panen yang menggembirakan kemudian ditarikan dalam gerakan dan ungkapan dalam bahasa daerah yang berisikan pemujaan terhadap sang pencipta.\n" +
                    "\n" +
                    "Tarian raigo terdapat dalam beberapa jenis salah satunya adalah raigo mpae (raigo = tari dan mpae = padi) atau juga disebut raego vunja karena keterkaitannya dengan upacara vunja. Jadi raigo mpae atau raigo vunja adalah suatu tarian tradisional Sulawesi Tengah dalam rangkaian upacara vunja menurut irama yang menurut irama yang digerakkan oleh orang-orang yang sedang mengembangkan suatu daya dan semangat yang mempunyai arti sosial dan juga kepercayaan terhadap Sang Pencipta. Tarian ini bukan hanya semata-mata sebuah bentuk kesenian (hiburan) namun tarian ini tidak dapat terlepas dari beberapa pelaksanaan upacara adat di wilayah Kulawi atau pun di Lembah Bada. Untuk mendukung pelaksanaan tarian ini, maka tercipta pula lantunan syair-syair dalam vokal yang berisi pesan moral kepada yang mendengarkannya serta beberapa kelengkapan pendukung lainnya yang juga memiliki makna simbolik terhadap upacara ritualnya.\n" +
                    "\n" +
                    "Perwujudan raego melalui syair-syairnya serta fungsi dan kedudukannya pada masyarakat, merupakan bagian dari ungkapan budaya yang dilatarbelakangi oleh emosi religi dan upacara adat yang dapat ditemukan di semua suku di Indonesia. Oleh karena tidak semua suku memiliki sarana komunikasi dalam bentuk tulisan, maka kesinambungan pewarisannya hanya tertumpu pada informasi lisan yang tidak sistematis sehingga memiliki kelemahan dan keutuhannya dari generasi ke generasi. Pada umunya pelaksanaan berbagai upacara adat, khususnya yang berkaitan dengan raigo pada Suku Kulawi, masih terus dilaksanakan para orang tua (totua ngata) sampai anak-anak muda. Kenyataan ini menjadikan masyarakat luar dapat mendengarkan syair-syair raego melalui vokal yang saling sahut menyahut sekaligus menjadi pengiring bagi tarian itu sendiri. Syair-syair tersebut memiliki makna terhadap pelaksanaan upacara adat serta melihat lebih dalam fungsi dan kedudukannya pada masyarakat setempat. Suku Kulawi sebagai pemilik budaya Raigo tidak mengenal tulisan, sehingga pewarisan budaya hanya dapat dilakukan secara lisan dan peniruan tingkah laku yang keseluruhannya mengandalkan ingatan belaka. Tidak semua lapisan masyarakat Suku Kulawi memiliki kesempatan untuk memperoleh bekal pengetahuan dan keterampilan dalam pelaksanaan raigo. Dengan demikian, hanya beberapa anggota masyarakat berusia lanjut yang menjadi pelaku upacara ini. Anggapan bahwa raego hanya diperuntukan untuk para totuangata (orang yang sudah berumur), menyebabkan pengetahuan dan keterampilan melakukan tarian ini hanya terbatas pada generasi yang mengalami tarian ini (pelaku) yang jumlahnya sangat kurang dan tidak lagi merata pada semua lapisan masyarakat di daerah Kulawi.\n" +
                    "\n" +
                    "Secara garis besar tidak ada perbedaan esensil, dengan pola tarian keliling tapi syair yang dinyanyikan berbeda digolongkan berdasarkan upacara adat yang sedang dilakukan. Macam tarian Raigo adalah sebagai berikut:\n" +
                    "\n" +
                    "- Raigo vunca, tarian raigo yang dilakukan pada upacara sesudah panen.\n" +
                    "\n" +
                    "- Raigo tarade, tarian yang dilaksanakan pada upacara panen dengan hasil yang sangat memuaskan.\n" +
                    "\n" +
                    "- Raigo potinowu, raigo yang dilaksanakan pada upacara membayar mahar oleh calon pengantin pria kepada calon pengantin wanita.\n" +
                    "\n" +
                    "- Raigo pobalai, merupakan tarian raigo yang diadakan pada upacara perkawinan, apabila kedua mempelai masih ada hubungan kekeluargaan.\n" +
                    "\n" +
                    "- Raigo puncumania, raigo yang dilaksanakan pada upacara khitanan.\n" +
                    "\n" +
                    "- Raigo bobongka ombo, dilaksanakan pada upacara tujuh hari kematian bangsawan.\n" +
                    "\n" +
                    "- Raigo popowata, diadakan pada upacara kematian saat menunggu jenazah.\n" +
                    "\n" +
                    "- Raigopoparoma, diadakan pada upacara kematian menjelang hari terakhir.\n" +
                    "\n" +
                    "- Raigo mpainu, raigo yang diselenggarakan pada upacara mandi bagi pahlawan yang akan berangkat ke medan perang.\n" +
                    "\n" +
                    "- Raigo pantaka, diadakan pada upacara penyambutan para pahlawan dari medan perang.\n" +
                    "\n" +
                    "- Raigo popatunahou, diadakan pada upacara mendirikan rumah baru.\n" +
                    "\n" +
                    "- Raigo pangkasuwia, diadakan untuk penyambutan tamu.\n" +
                    "\n" +
                    "Lagu-lagu pengiring tarian raigo biasanya dinyanyikan dalam tempo con brio, deice, sesuai dengan tema gembira dan pada pengiring perang yang disebut inolu, dinyanyikan dalam tempo de Marcia, forte atau presto yang sesuai dengan tema heroik dan patriotik. Setiap lagu memiliki ciri yang sama, yaitu pengulangan kata dan syair hingga beberapa kali. Perbedaan antara lagu dan lainnya terletak pada melodi dan tempo berwarna tinggi yang tetap sama bentuknya. Eksklamasi hanya terdapat pada lagu-lagu perang sebagai selingan yang tidak boleh ditinggalkan antara syair lagu."
            , ""
            , "https://cdn-2.tstatic.net/palu/foto/bank/images/Tari-Raego.jpg"
            , "https://cdn.antaranews.com/cache/800x533/2018/09/TARI-SANREGO.jpg"
            , "https://www.indonesia.go.id/assets/upload/headline//1566893347_Raego_Paduan_Suara.jpg"
            , "https://static.republika.co.id/uploads/images/inpicture_slide/warga-memperagakan-gerakan-tari-raego-raigo-atau-rego-saat_220721214824-701.jpg"
            , "")
        dbHelper.insertData("70","tari salonreng", "tarian", "sulawesi selatan"
            , "Pada awal perkembangan agama Islam, masyrakat Gowa dan Tallo masih menarikan tarian yang disebut sere` atau jaga. Tarian tersebut berfungsi didalam upacara untuk mengusir garring pua atau wabah penyakit yang menular dan pa`repatunuba riring yang berarti ancaman bahaya kelaparan. Tercatat didalam Lontarak bahwa dalam tahun 1636-1665, Kerajaan Gowa dihinggapi garring pua, berupa penyakit sampar. Untuk mengantisipasi penyakit tersebut Raja Gowa mengadakan upacara besar-besaran, memandikan dan mengarak keliling kalompoang. Dalam upacara itu terdapat Tari Salonreng yang berfungsi sebagai tarian upacara, salah satunya untuk melepas nazar (palappasa tija` atau palappasa nasara).\n" +
                    "\n" +
                    "Tari Salonreng tidak diketahui muasalnya secara tertulis, hanya diketahui lewat cerita leluhur yang bersifat mitos. Didalam lontarak sendiri tidak dijelaskan secara rinci mengenai Tari Salonreng. Namun menurut beberapa anrong guru Pakarena dan Pasalonreng, tari tersebut sudah ada pada zaman manusia menganut paham animisme. Tarian itu merupakan tari pemujaan terhadap dewa-dewa, penguasa langit dan bumi. Tari Salonreng (salonreng artinya selendang) ini dipercaya berasal dari sebuah mitos dari jaman Kerajaan Gowa.\n" +
                    "\n" +
                    "Saat ini tarian ini dilaksanakan untuk melepas hajat seperti berhasilnya panen atau sembuh dari penyakit dan terhindar dari malapetaka. Prosesi Tarian ini dilaksanakan dengan mengelilingi satu ekor kerbau yang akan dijadikan persembahan dengan berbagai gerakan sambil menabur beras kemudian bermain pencak silat dengan menggunakan tombak dan diakhiri dengan Mangaru yang kemudian dilanjutkan dengan acara pemotongan kerbau sebagai rasa syukur dan memohon kepada Tuhan Yang Maha Kuasa untuk keselamatan.\n" +
                    "\n" +
                    "Tari ini dimainkan oleh 6 wanita dengan mengenakan baju bodo dan 6 pria menggunakan passapu dan dilengkapi dengan tombak, keris serta bakul yang berisi padi, gula merah, pinang, daun sirih dan beras. Alat musik yang digunakan untuk mengiringi tarian ini adalah dua buah gendang dan sebuah suling dengan lagu-lagu yang membangkitkan semangat. Tarian ini dapat dijumpai di Dusun Tanete, Desa Bonto Somba, Kecamatan Tompobulu."
            , ""
            , "https://jadesta.kemenparekraf.go.id/imgpost/34525.jpg"
            , "https://jadesta.kemenparekraf.go.id/imgpost/27271.jpg"
            , "https://asset.kompas.com/crops/au8vYFnnnrHrBqjG92AafYU2gkU=/288x374:5343x3744/490x326/data/photo/2022/02/20/6212679195040.jpg"
            , ""
            , "")
        dbHelper.insertData("71","tari linda", "tarian", "sulawesi tenggara"
            , "Linda berasal dari kata melinda-linda yang artinya gerakan-gerakan tubuh yang ritmis yang dapat menyentuh hati, sehingga menimbulkan rasa indah dan artistik. Dahulu tari ini dipentaskan khusus oleh putri-putri reamaj yang telah dilatih terlebih dahulu. Tarian ini dilakukan oleh mereka secara sendiri-sendiri dan bergantian (tidak bersamaan). Sampai saat ini tarian ini sudah menjadi tarian pertunjukan. Penarinya terdiri dari beberapa orang yang menari secara bersamaan."
            , ""
            , "https://pariwisataindonesia.id/wp-content/uploads/2020/11/tari-linda-foto-by-id.pinterest.com_-640x426.jpg"
            , "https://pariwisataindonesia.id/wp-content/uploads/2020/11/pariwisatamunacom.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("72","tari lenso", "tarian", "maluku"
            , "Tari lenso merupakan salah satu unsur warisan budaya masa lalu yang berasal dari kota Ambon yang sarat dengan nilai-nilai kultural serta historis yang begitu kuat. Dari prespektif sejarah keberadaan tari lenso tidak dapat dilepas pisahkan dengan eksistensi kaum penjajah yakni bangsa Portugis dan Belanda di Maluku dan Ambon khususnya." +
                    "\nTarian ini pada awalnya diperkenalkan oleh bangsa Portugis namun pada masa penjajahan Belanda barulah tarian ini dipopulerkan pada tanggal 31 Agustus 1612. Saat itu penguasa Belanda yang ada di Kota Ambon merayakan hari ulang tahun ratu wihelmina ratu Belanda. Sejak itulah tari lenso pertama kalinya ditampilkan secara terbuka kepada masyarakat umum dalam pesta rakyat yang dibuat oleh Belanda. Negeri kilang dipercayakan untuk menampilkan tari lenso dalam acara pesta rakyat tersebut." +
                    "\nOleh masyarakat kilang tari lenso dijadikan sebagai tarian pusaka yang berasal dari negeri tersebut. Tari lenso mulai merakyat dan menjadi suatu warisan budaya yang terkonstruksi melalui proses akulturasi di Maluku. Pada masa orde lama tarian ini sempat dipopulerkan oleh Presiden Soekarno ke negara-negara yang menjadi tujuan kunjungan kenegaraan atau penyambutan tamu-tamu kenegaraan. Kata lenso berasal dari bahasa Portugis yang artinya sapu tangan. Biasanya lenso (sapu tangan) yang digunakan berwarna putih dan merah, namun tidak terdapat makna simbolik dari warna lenso yang digunakan oleh masing-masing penari. Secara etimologis kata lenso berasal dari bahasa portugis yang artinya sapu tangan. " +
                    "\nNama tarian ini berkaitan dengan properti yang digunakan oleh penari yakni dua buah lenso pada masing-masing penari. Biasanya lenso (sapu tangan) yang digunakan berwarna putih dan merah, namun tidak terdapat makna simbolik dari warna lenso yang digunakan oleh masing-masing penari. Dalam persebarannya tari lenso banyak dijumpai pada negeri-negeri yang penduduknya mayoritas beragama Kristen seperti di Pulau Ambon, Seram, Kepulauan Lease namun tak jarang dalam konteks kekinian pada negeri-negeri yang masyarakatnya mayoritas beragama Islam sering juga dijumpai jenis tarian ini. Sejalan dengan perkembangannya tari lenso yang pada mulanya menjadi tarian rakyat dan ditampilkan dalam jumlah penari yang banyak serta komposisi penari laki-laki dan perempuan namun seiring perkembangan tari lenso hanya dapat dipentaskan oleh penari wanita saja dengan jumlah penari disesuaikan dengan keinginan. Biasanya jumlah penari berkisar mulai dari 4 orang sampai 10 orang bahkan juga ditampilkan dalam jumlah yang banyak (masal). Secara umum Tari lenso memiliki tiga gerakan dasar yang seringkali dimodifikasi sesuai dengan keinginan, tiga gerakan itu yakni gerak tari maju, gerak tari jemput dan gerak tari mundur. Gerak tari maju biasanya dilakukan dengan posisi kaki kanan dan tangan kanan bersama maju, kemudian diikuti kaki kiri dengan hitungan 4/4 dengan posisi badan sedikit merendah dengan posisi lutut yang ditekuk. Bahu digoyang perlahan mengikuti irama sedangkan musik sedangkan tangan yang di depan (baik kiri maupun kanan ) diangkat sejajar pinggang dan telapak tangan dibiarkan keatas serta lenso atau sapu tangan dibiarkan berjuntai ke bawah. Posisi kepala miring kearah dalam dengan dagu sedikit bersandar pada bahu yang tanganya berada di depan. Gerak ini dipakai oleh penari untuk bergerak membuat pola lantai yang telah ditentukan. Gerakan ini memberikan gambaran suatu kebersamaan/kekompakan dalam kerja sama seta gambaran penghormatan kepada tamu atau orang luar yang baru pertama kali berkunjung. Gerak jumput, dimulai dengan gerakan lutut ditekuk rendah sehingga posisi badan berada dalam keadaan setengah duduk. Tangan kanan dan kiri maju kedepan secara bergantian. Tangan yang berada di depan diangkat setinggi dada sedangkan tangan yang lain di bawah sikut sedikit ditekuk, kemudian telapak tangan diputar dari dalam ke luar. Putaran ini di lakukan semaksimal mungkin sehingga lenso/sapu tangan turut berputar juga. Posisi bahu berputar kearah kiri dan kanan secara bergantian dengan membuat sudut putaran kira-kira 90 derajat. Semua gerakan ini dilakukan dalam hitungan empat. Pada gerakan ini tergambar makna keterbukaan masyarakat Maluku kepada orang luar atau pendatang. Simbol kesejajaran tanpa membeda-bedakan dengan kelas sosial menjadi nilai dalam setiap gerakan membungkuk dan berdiri. Dan gerakan yang terakhir adalah gerakan mundur yang merupakan kebalikan dari gerakan maju pada gerakan ini tergambar makna yang melebur dari suatu penghormatan dan keterbukaan terhadap orang luar dan para tamu melalui gerakan tangan yang mempersilahkan masuk."
            , ""
            , "https://cdnwpedutorenews.gramedia.net/wp-content/uploads/2022/09/20141624/image001-21.png"
            , "https://asset.kompas.com/crops/ThWIn0Yw8TvXFJx3c3FIdpaRG9w=/80x0:629x366/780x390/data/photo/2021/03/07/6044744d4f702.png"
            , "https://t-2.tstatic.net/tribunnewswiki/foto/bank/images/Tari-Lenso.jpg"
            , ""
            , "")
        dbHelper.insertData("73","tari legu sahu", "tarian", "maluku utara"
            , "Tari Legu Sahu berasal dari kata Legu yang artinya pesta. Sehingga Legu Sahu berarti pesta masyarakat Sahu. Pesta perayaan panen padi diadakan setiap tahunnya dan telah menjadi tradisi, dari perayaan inilah timbul sebuah tarian rakyat yang mengekspresikan kegembiraan rakyat Sahu. Tarian Legu Sahu merupakan tarian yang merepresentasikan luapan kegembiraan rakyat saat panen padi. Tarian ini menggambarkan rasa syukur rakyat akan kesuksesan panen padi."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485490569.jpg"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1567428318/mjaym7p1v3zdkd91mdpd.jpg"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1567428157/hmjrqdqcbomoaaom3mhe.jpg"
            , ""
            , "")
        dbHelper.insertData("74","bihim (tari tumbutana)", "tarian", "papua barat"
            , "Bihim/Tari tumbutana biasanya oleh orang Arfak disebut dengan istilah tari ular. Penyebutan ini disebabkan oleh gerak dan formasi tari yang menyerupai liukan ular mengikuti irama lagu yang yang dinyanyikan. Bihim bagi suku Arfak diartikan sebagai sebuah ekspresi yang dilakukan kapan saja dalam acara mencari jodoh, menang perang, perdamaian antar suku, penyambutan tamu dan pernikahan.Tarian ini juga melambangkan kesatuan yang kokoh dalam sebuah kebersamaan yang masing-masing penari mengekspresikannya melalui lagu disertai dengan hentakan kakinya di tanah. Oleh karena itu, bagi masyarakat suku Arfak, Bihim tidak dapat dipisahkan dari kehidupan mereka karena tarian adalah bagian dari hidup mereka."
            , ""
            , "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Tari_Tumbu_Tanah_%281%29.jpg/1200px-Tari_Tumbu_Tanah_%281%29.jpg"
            , "http://3.bp.blogspot.com/-y0io-nH8ZmE/VXOo7rpVsmI/AAAAAAAAC2k/02EqWE9JwDQ/s1600/Tarian%2BTumbuk%2BTanah.jpg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485263640.jpg"
            , ""
            , "")

        // ------------------------------------ || -------------------------------------- //

        dbHelper.insertData("75","makyong", "non benda", "kepulauan riau"
            , "Di daerah Kepulauan Riau, tradisi lisan Mak Yong telah dipertunjukkan sejak beberapa abad yang lalu dan menyebar sampai ke Bangka, Johor, Malaka, dan Pulau Pinang. Di Kepulauan Riau, Tradisi lisan ini berkembang pesat pada masa pemerintahan Kesultanan Riau (1722-1911). Seni pertunjukan teater Makyong dimainkan dengan tarian, nyanyian, dan lawakan yang terjalin dalam suatu alur cerita. Pemainnya 20 orang, yang pria bertopeng sedangkan yang wanita mengenakan kostum gemerlap. Makyong merupakan seni drama yang dapat digolongkan ke dalam bentuk drama tari yang mengandung unsur-unsur ritual. Makyong sangat digemari oleh masyarakat Riau, terutama di wilayah Kepulauan Riau, hiburan rakyat di pedesaan.\n" +
                    "\n" +
                    "Ada anggapan bahwa mulanya yang mempertunjukan Makyong adalah Dewa Hindu Jawa yang bernama Semar dan puteranya Turas. Ada yang menyatakan asal mula Makyong berasal dari \"Mak Hyang\", yaitu Dewi Sri, Dewi yang dikenal oleh orang Jawa. Tetapi ternyata lebih banyak pengaruh Siam dari pada pengaruh Jawa. Selain itu ada juga yang menyatakan asal usulnya bermula dari tontonan orang phatani (Thailand), Klantan , Trenggano, Pulau Pinang dan Kedah. Bentuk kesenian ini masuk ke daerah Kepulauan Riau pada masa kekuasaan Sultan Sulaiman pada abad XVIII Masehi.\n" +
                    "\n" +
                    "Dalam pertunjukan Makyong, pada umumnya ditampilkan cerita-cerita warisan yang diperoleh dari para tukang cerita secara lisan. Dialog antar pemain dilakukan secara improvisasi dan umumnya dialog ini berkembang sesuai kekuatan imajinatif pemain tanpa ada patokan. Diantara cerita Makyong yang dipentaskan adalah \"Tuan Putri Ratna Emas, Gunung lntan, Putri Makyang Emas, Ti mun Muda dan lain-lain.\n" +
                    "\n" +
                    "Cerita Makyong selalu berkisar tentang kehidupan kerajaan seperti cerita raja-raja, permaisuri, tuan putri, putri mahkota yang ditimpa musibah dan berakhir dengan kemenangan dengan melalui perjuangan. Kemenangan diperoleh dengan bantuan dewa-dewi dari kahyangan atau tokoh sakti yang berada di jalan yang benar.\n" +
                    "\n" +
                    "Peralatan yang diperlukan dalam pertunjukan adalah rotan, parang, keris, kapak, panah, tongkat kayu (untuk dijadikan sakti), cangai (kuku palsu yang panjang) sekali di buat dari bahan yang berkilat seperti emas dan lain-lain. Sedangkan alat-alat musik yang diperlukan adalah nafiri, gong, gedombak, gendang, mong dan breng-breng. Bertabik, selendang awang, kain kekek, timang-timang anak, dan saridam. Dan tari yang dibawakan menjunjung sambah, gembak, memanggil awang, tanduk dan lain-lain.\n" +
                    "\n" +
                    "Penampilan tari dan lagu yang diiringi oleh alat-alat musik disesuaikan dengan cerita yang dilakonkan. Para pemeran Makyong terdiri atas Pakyong (memerankan raja) Pak Yong Muda (memerankan pangeran), Putri Makyong (memerankan putri raja), Awang Pengasuh (pelayan raja), inang (pelayan wanita). Orang tua, dewa, jin dan raksasa, pembatak (penjahat). Kadang-kadang setiap orang memegang peran lebih dari satu (rangkap).\n" +
                    "\n" +
                    "Dalam penampilan, para pemain (terutama laki-laki) memakai topeng. Macam-macam topeng yang dipergunakan antara lain: topeng nenek betara guru, topeng awang pengasuh, topeng wak dukun, topeng raja jin dan topeng pembatak. Sementara pakaian dalam seni pertunjukan Makyong tidak terlalu mengikat, yang penting hendaklah dibedakan dengan jelas antara pakaian raja-raja dan keluarganya dengan orang kebanyakan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483947673.jpg"
            , "https://www.goodnewsfromindonesia.id/uploads/post/large-mak-yong-bintan-d7df480bd45bcd1d63b9a47c9e483f4c.jpg"
            , "https://seringjalan.com/wp-content/uploads/2020/04/Pertunjukan-Tari-Mak-Yong.jpg"
            , ""
            , "")
        dbHelper.insertData("76","ondel-ondel", "non benda", "dki jakarta"
            , "Ondel-ondel adalah pertunjukan rakyat yang sudah berabad-abad terdapat di Jakarta dan sekitarnya, yang dewasa ini menjadi wilayah Betawi. Walau pun pertunjukan rakyat semacam itu terdapat pula di beberapa tempat lain seperti di Priangan dikenal dengan sebutan Badawang, di Cirebon disebut Barongan Buncis dan di Bali disebut Barong Landung, tetapi ondel-ondel memiliki karakteristik yang khas. Ondel-ondel tergolong salah satu bentuk teater tan pa tutur, karena pada mulanya dijadikan personifikasi leluhur atau nenek moyang, pelindung keselamatan kampung dan seisinya. Dengan demikian dapat dianggap sebagai pembawa lakon atau cerita, sebagaimana halnya dengan bekakak dalam upacara potong bekakak di gunung gamping di sebelah selatan kota Yogyakarta, yang diselenggarakan pada bu Ian sapar setiap tahunnya.\n" +
                    "\n" +
                    "Ondel-ondel berbentuk boneka besar dengan rangka anyaman bambu dengan ukuran kurang lebih 2,SM, tingginya dan garis tengahnya kurang dari 80 cm. Dibuat demikian rupa agar pemikul yang berada didalamnya dapat bergerak agak leluasa. Rambutnya dibuat dari ijuk, duk kata orang Betawi. Mukanya berbentuk topeng atau kedok, dengan mata bundar (bulat) melotot. Ondel-ondel yang menggambarkan laki-laki mukanya bercat merah, yang menggambarkan perempuan bermuka putih atau kuning. Ondel-ondel biasanya digunakan untuk memeriahkan arak-arakan, seperti mengarak pengantin sunat dan sebagainya. Lazimnya dibawa sepasang saja, laki dan perempuan. Tetapi dewasa ini tergantung dari permintaan yang empunya hajat. Bahkan dalam perayaan-perayaan umum seperti ulang tahun hari jadi kota Jakarta, biasa pula dibawa beberapa pasang, sehingga merupakan arak-arakan tersendiri yang cukup meriah. Disamping untuk memeriahkan arak-arakan pada masa yang lalu biasa pula mengadakan pertunjukan keliling, atau Ngamen. Terutama pada perayaan-perayaan Tahun Baru, baik masehi maupun lmlek. Sasaran pada perayaan Tahun Baru Masehi adalah daerah Menteng, yang banyak dihuni orang-orang Kristen. Pendukung utama kesenian ondel-ondel petani yang termasuk abangan, khususnya yang terdapat di daerah pinggiran kota Jakarta dan sekitarnya. Pembuatan ondel-onde/ dilakukan secara tertib, baik waktu membentuk kedoknya demikian pula pada waktu menganyam badannya dengan bahan bambu. Sebelum pekerjaan dimulai, biasanya disediakan sesajen yang antara lain berisi bubur merah putih, rujak-rujakan tujuh rupa, bunga-bungaan tujuh macam dan sebagainya, serta kemenyan yang dibakar. Demikian pula ondel-ondel yang sudah jadi, disediakan sesajen dan dibakari kemenyan, disertai mantera-mantera yang ditujukan kepada roh halus yang dianggap penunggu ondel-ondel tersebut. Sebelum dikeluarkan dari tempat penyimpanan, bila akan berangkat main, selalu diberi sesajen. Pembakaran kemenyan dilakukan oleh pimpinan rombongan, atau salah seorang yang dituakan. Menurut istilah setempat upacara demikian disebut ukup atau ngukup."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483949031.jpg"
            , "https://cdn0-production-images-kly.akamaized.net/uEc6ru41kW4AzqKx0rcVN18C0p8=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3471885/original/056202700_1622701319-PF25_Ondel-ondel_Betawi.jpg"
            , "https://www.goodnewsfromindonesia.id/uploads/post/large-ondel2-ec67b0c63351df1071ba5043ec0253f7.jpg"
            , "https://thumb.viva.co.id/media/frontend/thumbs3/2012/12/19/184598_aksi-ondel-ondel-betawi_665_374.jpg"
            , "https://cdn.antaranews.com/cache/800x533/2022/06/20/antarafoto-pentas-budaya-betawi-di-kota-tua-jakarta-190622-app-6.jpg")
        dbHelper.insertData("78","upacara ngarot", "non benda", "jawa barat"
            , "Upacara Adat Ngarot atau Pesta Kasinoman diprakarsai oleh Ki Kapol yang datang dari Banten dalam rangka syiar Islam, di mana pada saat itu wilayah Lelea yang merupakan bagian dari Kerajaan Sumedang Larang masyarakatnya masih menganut agama Hindu. Pada saat itu sekitar abad ke-16, Ki Kapol memiliki sawah yang luas. Dengan cara mengumpulkan para Budak Laki Bujang (Pemuda) dan para Budak Wewe Cuwene (Pemudi/Gadis), Ki Kapol memberikan wejangan tentang bagaimana cara menggarap sawah yang baik sambil diselingi bercerita. Sehingga sawah Ki Kapol digarap oleh para Kasinoman/Budak laki, sementara Kasinoman/Budak Wewe mengantarkan makan dan minuman."
            , ""
            , "https://terasmedia.net/wp-content/uploads/2022/07/adat-ngarot.jpg"
            , "https://cdn0-production-images-kly.akamaized.net/HcclQRzGObZszkj3Dd7q64LBrEQ=/1231x710/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2551499/original/072116600_1545210685-20181219-Ngarot-9.jpg"
            , "https://static.republika.co.id/uploads/images/inpicture_slide/sejumlah-gadis-mengikuti-upacara-adat-ngarot-di-desa-lelea_211222113037-210.jpg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485404936.jpg"
            , "")
        dbHelper.insertData("79","ruwatan rambut gimbal", "non benda", "jawa tengah"
            , "Anak-anak yang berambut gimbal banyak ditemui di dataran tinggi Dieng dan lereng Gunung Sindoro-Sumbing serta di lereng Merbabu dan Kabupaten Banjarnegara. Rambut gimbal dianggap sebagai sesuker oleh karena itu untuk membersihkan sesuker itu harus dengan upacara ruwatan dengan cara mencukur bagian rambutnya yang gimbal. Ruwatan berasal dari kata ruwat yang artinya melepas dari nasib sial. Acara ruwatan dilakukan setelah si anak mengajukan permintaan sebagai persyaratan khusus yang disebut \"bebana\".Masyarakat Dieng meyakini munculnya rambut gimbal merupakan warisan leluhurnya yaitu Kyai Kolodete. Menurut cerita, demi kemakmuran desa, Kyai Kolodete bersumpah tidak akan memotong rambutnya dan tidak akan mandi sebelum desa yang dibukanya menjadi makmur, hal inilah yang menyebabkan keturunan Kyai Kolodete nantinya akan mempunyai ciri rambut yang sama seperti dirinya. Versi lain menyebutkan bahwa munculnya rambut gimbal pada anak-anak merupakan titipan Kanjeng Ratu Kidul di Pantai Selatan terutama bagi masyarakat yang masih menganut kepercayaan Kejawen."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483932369.jpg"
            , "http://assets.kompasiana.com/items/album/2021/05/08/img-20190727-wa0034-1-60964ff9d541df26c3469372.jpg"
            , "https://jatengprov.go.id/wp-content/uploads/2019/07/IMG-20190727-WA0028.jpg"
            , ""
            , "")
        dbHelper.insertData("81","upacara mubeng beteng", "non benda", "di yogyakarta"
            , "Pada tahun 1919 Karaton Yogyakarta atas permintaan rakyat Yogyakarta melakukan upacara ritual berupa pengibaran bendera pusaka yang bernama Kangjeng Kyai Tunggulwulung, sambil berjalan kaki mengelilingi beteng karaton. Upacara tersebut dimaksudkan untuk mencegah dan menghentikan berjangkitnya penyakit influenza, yang saat itu mewabah secara luas melanda masyarakat Yogyakarta.Begitu besarnya keyakinan masyarakat pada masa itu terhadap keramatnya pusaka tersebut sehingga menganggap semua penyakit bisa disirnakan. Kangjeng Kyai Tunggulwulung konon merupakan bagian dari bungkus Kabah di Mekkah yang dibawa oleh Imam Syafei utusan Sultan HB I pada tahun 1784 M, sehingga karena pengaruh keyakinan dan sugesti, penyakit dan wabah tersebut dapat dihilangkan. Kejadian itu berulang pada tahun 1932, 1946, dan 1951."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485406004.jpg"
            , "https://img.okezone.com/content/2022/07/29/406/2638851/mengenal-tradisi-mubeng-beteng-tapa-bisu-sarana-introspeksi-diri-di-malam-1-suro-UxxQQXIYMx.JPG"
            , "https://cdn.antaranews.com/cache/800x533/2012/11/20121114mubeng-beteng.jpg"
            , ""
            , "")
        dbHelper.insertData("82","keraben sape (karapan sapi)", "non benda", "jawa timur"
            , "Karapan sapi merupakan salah satu jenis kesenian/olahraga/permainan tradisional yang selalu dilakukan oleh masyarakat P. Madura, Jawa Timur. Kerapan atau karapan sapi adalah satu istilah dalam bahasa Madura yang digunakan untuk menamakan suatu perlombaan pacuan sapi. Ada dua versi mengenai asal usul nama kerapan. Versi pertama mengatakan bahwa istilah \"kerapan\" berasal dari kata \"kerap\" atau \"kirap\" yang artinya \"berangkat dan dilepas secara bersama-sama atau berbondong-bondong''. Sedangkan, versi yang lain menyebutkan bahwa kata \"kerapan\" berasal dari bahasa Arab \"kirabah\" yang berarti \"persahabatan\". Pengertian yang umum saat ini, kerapan adalah suatu atraksi lomba pacuan khusus bagi binatang sapi. Sebagai catatan, di daerah Madura khususnya di Pulau Kangean terdapat lomba pacuan serupa yang menggunakan kerbau. Pacuan kerbau ini dinamakan mamajir dan bukan kerapan kerbau.\n" +
                    "\n" +
                    "Pada perlombaan ini, sepasang sapi yang menarik semacam kereta dari kayu (tempat joki berdiri dan mengendalikan pasangan sapi tersebut) dipacu dalam lomba adu cepat melawan pasangan-pasangan sapi lain.\n" +
                    "\n" +
                    "Jalur pacuan tersebut biasanya sekitar 100 meter dan lomba pacuan dapat berlangsung sekitar sepuluh sampai lima belas detik. Beberapa kota di Madura menyelenggarakan karapan sapi pada bulan Agustus dan September setiap tahun. Pertandingan final dilaksanakan di kota Pamekasan pada akhir September atau Oktober memperebutkan Piala Bergilir Presiden.\n" +
                    "\n" +
                    "Karapan Sapi yang menjadi ciri khas orang Madura ini sebenarnya terdiri dari beberapa macam, yaitu:\n" +
                    "\n" +
                    "• Kerap Keni (kerapan kecil)\n" +
                    "\n" +
                    "Kerapan jenis ini pesertanya hanya diikuti oleh orang-orang yang berasal dari satu kecamatan atau kewedanaan saja. Dalam kategori ini jarak yang harus ditempuh hanya sepanjang 110 meter dan diikuti oleh sapi-sapi kecil yang belum terlatih. Sedangkan penentu kemenangannya, selain kecepatan, juga lurus atau tidaknya sapi ketika berlari. Bagi sapi-sapi yang dapat memenangkan perlombaan, dapat mengikuti kerapan yang lebih tinggi lagi yaitu kerap raja.\n" +
                    "\n" +
                    "• Kerap Raja (kerapan besar)\n" +
                    "\n" +
                    "Perlombaan yang sering juga disebut kerap negara ini umumnya diadakan di ibukota kabupaten pada hari Minggu. Panjang lintasan balapnya sekitar 120 meter dan pesertanya adalah para juara kerap keni.\n" +
                    "\n" +
                    "• Kerap Onjangan (kerapan undangan)\n" +
                    "\n" +
                    "Kerap onjangan adalah pacuan khusus yang para pesertanya adalah undangan dari suatu kabupaten yang menyelenggarakannya. Kerapan ini biasanya diadakan untuk memperingati hari-hari besar tertentu.\n" +
                    "\n" +
                    "• Kerap Karesidenen (kerapan tingkat keresidenan)\n" +
                    "\n" +
                    "Kerapan ini adalah kerapan besar yang diikuti oleh juara-juara kerap dari empat kabupaten di Madura. Kerap karesidenan diadakan di Kota Pamekasan pada hari Minggu, yang merupakan acara puncak untuk mengakhiri musim kerapan.\n" +
                    "\n" +
                    "• Kerap jar-jaran (kerapan latihan)\n" +
                    "\n" +
                    "Kerapan jar-jaran adalah kerapan yang dilakukan hanya untuk melatih sapi-sapi pacuan sebelum diturunkan pada perlombaan yang sebenarnya.\n" +
                    "\n" +
                    "Karapan Sapi adalah salah satu jenis permainan rakyat yang banyak melibatkan berbagai pihak, yang diantaranya adalah: (1) pemilik sapi pacuan; (2) tukang tongko (orang yang bertugas mengendalikan sapi pacuan di atas kaleles); (3) tukang tambeng (orang yang menahan tali kekang sapi sebelum dilepas); (4) tukang gettak (orang yang menggertak sapi agar pada saat diberi aba-aba dapat melesat dengan cepat); (5) tukang tonja (orang yang bertugas menarik dan menuntun sapi); dan (6) tukang gubra (anggota rombongan yang bertugas bersorak-sorak untuk memberi semangat pada sapi pacuan)."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483950651.jpg"
            , "https://awsimages.detik.net.id/community/media/visual/2020/04/19/fb4bd37e-fae2-4ef3-ad7c-1274c1ec6f29_169.jpeg?w=700&q=90"
            , "https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2021/07/22/2422730323.jpg"
            , "https://cdn.antaranews.com/cache/730x487/2017/10/20171015Seleksi-Tingkat-Kabupaten-151017-sb-4.jpg"
            , "")
        dbHelper.insertData("83","debus banten", "non benda", "banten"
            , "Kata Debus, sebenarnya adalah nama sebuah alat yang terbuat dari besi sepanjang 40 cm dengan ujung yang runcing. Pada pangkalnya diberi alas (dudukan) dari kayu yang diperkuat dengan lilitan pelat baja, agar tidak cepat terbelah jika dipukul. Di dalam permainan besi itu ditusukan kebagian-bagian tubuh, bahkan dipalu bagian pangkalnya, agar bisa menembus bagian-bagian tubuh yang ditusuk. Anehnya, walaupun tubuhnya tertembus alat itu pemain tidak merasa sakit dan tidak mengalami cedera, padahal dialaminya dalam keadaan sadar. Kata Debus merupakan perubahan arti dari kata Tembus.\n" +
                    "\n" +
                    "Pada abad XVII Masehi (tahun 1651 -1652) ketika Sultan Agung Tirtayasa memegang tampuk pemerintahan di Kesultanan Banten, sengaja diciptakan satu bentuk latihan bagi prajurit Banten ialah latihan perang atau perkelahian dengan menggunakan alat yang disebut Debus, selain alat-alat lain seperti pedang, golok, keris, tombak, dan sebagainya. Dalam latihan itu mereka berpasang-pasangan, kadang perang campuk. Dengan ketabahan, keuletan, dan keimanan yang kuat kepada Tuhan mereka dapat mengatasi segala ujian itu. Jadi pada mulanya Debus diciptakan untuk mempertahankan negara (peperangan). Karena Debus sudah ada sejak abad ke 17 tentu saja Debus termasuk permainan rakyat yang berusia cukup tua.\n" +
                    "\n" +
                    "Konon, kesenian yang disebut sebagai debus ini ada hubungannya dengan tarikat Rifaiah yang dibawa oleh Nurrudin Ar-Raniry ke Aceh pada abad ke-16. Para pengikut tarikat ini ketika sedang dalam kondisi epiphany (kegembiraan yang tak terhingga karena \"bertatap muka\" dengan Tuhan) kerap menghantamkan berbagai benda tajam ke tubuh mereka. Filosofi yang mereka gunakan adalah \"laa haula walla Quwata ilabillahil 'aliyyil adhim\" atau tiada daya upaya melainkan karena Allah semata. Jadi, kalau Allah mengizinkan, maka pisau, golok, parang atau peluru sekalipun tidak akan melukai mereka.\n" +
                    "\n" +
                    "Pada awalnya di Banten kesenian ini berfungsi untuk menyebarkan ajaran Islam. Namun, pada masa penjajahan Belanda dan pada saat pemerintahan Sultan Agung Tirtayasa, seni ini digunakan untuk membangkitkan semangat pejuang dan rakyat Banten untuk melawan Belanda. Dewasa ini, seiring dengan perkembangan zaman, kes enian ini hanya berfungsi sebagai sarana hiburan semata.\n" +
                    "\n" +
                    "Permainan debus biasanya dilakukan di halaman rumah pada saat diadakannya acara-acara lain yang melibatkan banyak orang. Peralatan yang digunakan dalam permainan adalah: (1) debus dengan godo-nya (2) golok yang digunakan untuk mengiris tubuh pemain debus; (3) pisau juga digunakan untuk mengiris tubuh pemain; (4) bola lampu yang akan dikunyah atau dimakan (sama seperti permainan kuda lumping di Jawa Tengah dan Timur; (5) panci yang digunakan untuk menggoreng telur di atas kepala pemain; (6) buah kelapa ; (7) minyak tanah dan lain sebagainya. Sementara alat musik pengiringnya antara lain: (1) gendang besar; (2) gendang kecil; (3) rebana; (4) seruling; dan (5) kecrek.\n" +
                    "\n" +
                    "Para pemain debus terdiri dari seorang syeh (pemimpin permainan), beberapa orang pezikir, pemain, dan penabuh gendang. satu sampai dua minggu sebelum diadakannya pertunjukan debus biasanya para pemain akan melaksanakan pantangan-pantangan tertentu agar selamat ketika melakukan pertunjukan, yaitu: (1) tidak boleh minum-minuman keras; (2) tidak boleh berjudi; (3) tidak boleh mencuri; (4) tidak boleh tidur dengan isteri atau perempuan lain; dan lain sebagainya."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485417931.jpg"
            , "https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/11/1186515/content_images/670x335/20200611163725-1-atraksi-debus-004-nfi.jpg"
            , "https://i0.wp.com/www.biem.co/wp-content/uploads/2017/11/DEBUS.png"
            , ""
            , "")
        dbHelper.insertData("84","seni pertunjukan tektekan bali", "non benda", "bali"
            , "Tektekan merupakan kesenian tradisional yang dilakukan secara turun temurun oleh masyarakat desa Kerambitan yang bersifat spontan, menggunakan alat-alat seperti cangkul, kuali, dan berbagai peralatan yang menimbulkan bunyi keras. Tektekan ini mempunyai fungsi khusus dalam kaitannya dengan kondisi dan situasi masyarakat desa Kerambitan."
            , ""
            , "https://2.bp.blogspot.com/-ORCNE8nWU70/VqXKTJTBffI/AAAAAAAAAeY/OolaLTst6xA/w1200-h630-p-k-no-nu/Desa-Adat-Tenganan-Karangasem.jpg"
            , "https://1001indonesia.net/asset/2022/03/Kesenian-Tektekan-1.jpg"
            , "http://kebudayaan.kemdikbud.go.id/bpnbbali/wp-content/uploads/sites/14/2017/09/Dok.jpg"
            , ""
            , "")
        dbHelper.insertData("85","gendang beleq", "non benda", "nusa tenggara barat"
            , "Gendang Beleq adalah seni musik tradisional Sasak yang dikenal oleh seluruh masyarakatnya. Penyebutan atau nama untuk Gendang Beleq bervariasi antara satu daerah dengan daerah lain. Bagi masyarakat Lombok Tengah Gendang Beleq disebut musik oncer, berbeda bagi masyarakat Lombok Barat disebut kecodak dan khususnya di Kecamatan Narmada disebut kedokdaq. Meskipun terdapat sebutan yang bervariasi namun semuanya merupakan sebarungan gamelan (peralatan gamelan) yang sama dengan menggunakan alat musik Gendang Beleq.\n" +
                    "\n" +
                    "Gendang Beleq adalah sebutan seperangkat peralatan musik, karena ukurannya besar dibandingkan dengan ukuran gendang pada umumnya. Gendang berarti kendang dan beleq berarti besar. Gendang besar (Gendang Beleq) ada dua jenis yang disebut gendang mama (laki-laki) dan gendang nina (perempuan). Perbedaan antara kedua gendang tersebut bukan pada bentuk fisiknya melainkan pada suara yang dihasilkan yaitu gendang mama lebih nyaring daripada gendang nina. Gendang Beleq selain sebagai alat musik sekaligus juga merupakan peralatan tari karena memainkan musik dalam keadaan menari seperti dalam tarian oncer.\n" +
                    "\n" +
                    "Bagian-bagian dari Gendang Beleq antara lain :\n" +
                    "\n" +
                    "- rampeng yaitu penampang gendang yang terbuat dari kulit sapi\n" +
                    "\n" +
                    "- batang yaitu badan gendang yang dibuat dari kayu tap\n" +
                    "\n" +
                    "- jangat, yaitu tali yang bahannya dari kulit\n" +
                    "\n" +
                    "- wangkis, yaitu tali penguat yang melingkari rampeng terbuat dari kulit\n" +
                    "\n" +
                    "- pengulung, yaitu pembungkus kawat.\n" +
                    "\n" +
                    "Ukuran Gendang Beleq tidak ada yang standar namun tingginya rata-rata lebih dari 90 cm. Garis tengah rempeng yang kecil kurang lebih berukuran 34 cm dan yang besar 41 cm. Pada ke dua bagian ujung gendang diberi ornamen berupa ragam hias berbentuk bunga dan daun. Sedangkan di bagian tengah diberi hiasan kotak-kotak hitam putih berselang seling dengan pinggiran warna merah.Warna-warna tersebut mempunyai makna tertentu yaitu merah melambangkan semangat, putih melambangkan kejujuran, dan hitam melambangkan semangat jiwa yang membaja. Hal ini sesuai dengan fungsi Gendang Be leq untuk memberi semangat para prajurit yang harus mempunyai semangat, harus memiliki watak satria yaitu kejujuran.\n" +
                    "\n" +
                    "Gendang Beleq biasa dimainkan di panggung maupun di lapangan terbuka. Susunan pendukung musik Gendang Beleq dan penarinya yang baku terdiri dari 40 orang, dan dipertunjukkan pada acara-acara khusus seperti Maulud Nabi, Lebaran, upacara perkawinan, khitanan dan cukur rambut bayi. Sedangkan yang tidak baku terdiri dari 17 orang dipertunjukkan untuk menyambut tamu, perlombaan atau festival.\n" +
                    "\n" +
                    "Untuk dapat bermain Gendang Beleq perlu belajar irama musiknya terlebih dahulu. Belajar memainkan Gendang Beleq dilakukan dengan cara peniruan. Pertama-tama latihan pukulan yang dilakukan dalam waktu +1 minggu dan dilakukan setiap malam. Yang sulit adalah belajar menari sambil sekaligus memainkan irama musiknya, ini memerlukan waktu lebih kurang 1 bulandan dilakukan setiap malam. Pada dasarnya siapa saja boleh ikut bermain Gendang Beleq, namun karena kesulitan terutama pada tari Gendang Beleqnya maka sedikit orang yang bisa menari Gendang Beleq."
            , ""
            , "https://pelopor.id/wp-content/uploads/2021/12/Gendang-Beleq.jpg"
            , "https://lh3.googleusercontent.com/-7n7uOoJdoUg/WlvgZcwQ1WI/AAAAAAAAEXQ/u4tK4JDTSq4h0bkZ0MMZat5KxEsiiGJTgCHMYCw/s640/blogger-image-1503049743.jpg"
            , "https://www.wartantb.com/wp-content/uploads/2017/11/gendang-beleq.jpg"
            , ""
            , "")
        dbHelper.insertData("86","caci", "non benda", "nusa tenggara timur"
            , "Caci merupakan kesenian tradisional masyarakat Manggarai, Nusa Tenggara Timur. Kata caci terdiri dari dua suku kata, yaitu ca yang berarti satu dan ci berarti paksa. Secara harfiah, caci berarti satu lawan satu, saling memukul dan menangkis. Permainan caci dilakukan oleh dua kubu yang terdiri dari penangkis dan pemukul. Pemenang dalam permainan ini adalah orang yang telah berhasil melukai lawannya di bagian wajah. Apabila mengenai bagian tubuh yang lain maka tidak akan diperhitungkan, dan tidak boleh memukul pada bagian tubuh mulai dari pinggang ke bawah. Di sela-sela permainan cad, para tetua adat baik laki-laki maupun perempuan menari (danding) dan bernyanyi (mbata) dengan penuh suka cita sambil berjalan secara teratur membentuk lingkaran. Dalam permainan ini, kubu tidak dimaknai sebagai lawan, namun teman bermain. Anggapan kubu sebagai lawan juga didasari oleh esensi dari caci sendiri yaitu menguatkan semangat kekeluargaan.\n" +
                    "\n" +
                    "Permainan caci menjadi wujud ungkapan syukur masyarakat Manggarai. Biasanya, permainan ini digelar di depan rumah adat dan menjadi bagian dalam upacara-upacara, antara lain perkawinan, pentahbisan imam, penyambutan tamu kehormatan, atau peringatan hari kemerdekaan.\n" +
                    "\n" +
                    "Untuk menggelar permainan caci, masyarakat melakukan beberapa ritual, diantaranya dilakukan di sawah dan mata air yang berada di desa tersebut. Pada malam sebelum permainan ini dimulai dilakukan upacara pemanggilan roh leluhur yang didalamnya terdapat penyembelihan ayam. Hal ini sebagai bentuk penghormatan keselamatan untuk para pemain caci dan semua masyarakat yang terlibat dalam permainan caci. Darah ayam yang disembelih diteteskan di depan pintu rumah adat sebagai pengganti keselamatan pemain caci saat acara berlangsung.\n" +
                    "\n" +
                    "Permainan caci dilakukan di halaman terbuka, atau dikenal dengan istilah natas oleh masyarakat Manggarai. Halaman terbuka dipilih karena setiap permainan ini dilakukan, pemain caci yang ikut bertanding bisa mencapai puluhan dan kedatangan penonton yang sekedar ingin melihat permainan ini.\n" +
                    "\n" +
                    "Dalam permainan caci ada kriteria yang harus dipenuhi. Adapun beberapa kriteria umum dalam permainan cad sebagai berikut:\n" +
                    "\n" +
                    "- Dimainkan oleh kaum pria dewasa pada acara perkawinan (tae kawing) atau acara syukuran (penti) dalam pembukaan lahan ulayat\n" +
                    "\n" +
                    "baru (randang lingko).\n" +
                    "\n" +
                    "- Cara berpakaian atau Selek. Nilai tambah bagi pemain cad adalah cara berpakaian, baik dari kerapian, kebersihan, maupun keserasian warna pakaian yang digunakan. Berpakaian menjadi ekspresi jati diri dan menunjukkan estetika budaya.\n" +
                    "\n" +
                    "- Lames atau tata karma menjadi hal yang utama. Raut wajah ramah, nada suara dan penggunaan bahasa kiasan yang tidak menyinggung orang lain pada saat bernyanyi dapat membuat orang lain terhibur atau kagum. Hal ini akan menimbulkan rasa simpati pada diri pemain caci tersebut.\n" +
                    "\n" +
                    "- llo, berarti tidak kena cambukan oleh lawan.\n" +
                    "\n" +
                    "- Co'o Pakin, adalah cara memukul dan mencambuk.\n" +
                    "\n" +
                    "Dalam permainan caci ada istilah Co'o Pakin yang merupakan cara atau aturan tentang memukul dan mencambuk. Aturan tersebut terdiri dari :\n" +
                    "\n" +
                    "- Mberes Paki\n" +
                    "\n" +
                    "Mberes Paki merupakan memukul atau mencambuk dengan kuat, yang mana kekuatan tersebut mewakili lambang kejantanan dan kekuatan energi laki-laki.\n" +
                    "\n" +
                    "- Nia Pakin\n" +
                    "\n" +
                    "Nia Pakin merupakan sasaran pukulan atau cambukan. Nia Pakin terdapat pada beberapa bagian tubuh saja. Secara umum area tubuh yang dipukul adalah bagian perut hingga ujung rambut kepala. Apabila ada seseorang yang memukul di luar area tersebut, maka pemain akan mendapat teguran dari adat atau panitia pertandingan.\n" +
                    "\n" +
                    "- Ngaceng Hena Paki One Ata\n" +
                    "\n" +
                    "Ngaceng Hena Paki One Ata, dapat diartikan terkena cambuk kubu lain. Tangan dan kepala merupakan sasaran pukulan para pemain karena memiliki bobot nilai yang cukup tinggi, terlebih jika bila melukai, dalam istilah orang Manggarai disebut hena beka. Pemain cad akan merasa malu apabila terkena pukulan cambuk pada bagian tubuh tersebut.\n" +
                    "\n" +
                    "- Nenggo atau Dere\n" +
                    "\n" +
                    "Dalam permainan cad juga terdapat Nenggo atau Dere yang berarti nyayian atau bernyayi. Nyayian yang dinyanyikan saat permainan ini berlangsung tergantung dari kaitan inti acaranya. Bisa saja nyayian itu berisi tentang pesan kepada pengantin apabila caci itu dilakukan dalam kaitan perayaan perkawinan. Ada juga lagu yang dinyanyikan berisi pesan sikap nasionalisme jika permainan cad diadakan dalam rangka perayaan kemerdekaan."
            , ""
            , "https://cdn.medcom.id/images/content/2020/07/20/1166634/Atraksi_Tarian_Caci_Khas_Masyarakat_Manggarai_1.jpg"
            , "https://www.goodnewsfromindonesia.id/uploads/post/large-shutterstock-660102751-e20aec117b3a53a7b6808f41cb62737a.jpg"
            , "https://asset.kompas.com/crops/LEPHUa140NEOx9Q40jsSa7UMBbA=/0x0:1000x667/750x500/data/photo/2018/11/29/658462086.jpg"
            , ""
            , "")
        dbHelper.insertData("87","upacara robo-robo", "non benda", "kalimantan barat"
            , "Upacara ini merupakan salah satu upacara yang dikenal masyarakat Mempawah. Upacara ini dilaksanakan setiap tahunnya pada hari Rabu terakhir dalam bulan Safar. Pada awalnya acara ini digelar untuk menyambut Opu Daeng Menambon dari Kerajaan Matan (Martapura) di Kabupaten Ketapang ke Kerajaan Mempawah di Kabupaten Pontianak pada tahun 1737 M atau 1448 H. Opu Daeng Menambon adalah keturunan Kerajaan Luwu, Sulawesi Selatan. Opu Daeng Menambon datang ke Mempawah untuk menyebarkan agama Islam. Selain menyebarkan agama Islam, Opu Daeng Menambon juga membangun Mempawah dengan menjadi seorang raja di Kerajaan di Mempawah.Ritual Robo-robo dimulai saat Opu Daeng Menambon beserta keluarga, serta punggawa dan pengawal berangkat dari Desa Benteng, Mempawah menggunakan perahu bidar. Perahu bidar adalah perahu kerajaan dari Istana Amantubillah. Kapal tersebut berlayar menuju muara sungai Mempawah yang berada di Desa Kuala, Mempawah dengan jarak tempuh sekitar satu jam perjalanan. Berlayar keluarga kerajaan ini diiringi dengan 40 perahu. Saat masuk Muara Kuala Mempawah, rombongan tersebut disambut dengan suka cita oleh masyarakat Mempawah. Sambutan tersebut dilakukan dengan memasang berbagai kain warna-warni dan kertas di rumah penduduk yang berada di pinggir sungai. Karena kedatangan rombongan tersebut bertepatan dengan bulan Safar, maka masyarakat Mempawah memperingatinya sebagi upacara tolak bala, karena masyarakat Mempawah yakin pada bulan Safar banyak diturunkan bala."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1484128599.jpg"
            , "https://www.indonesia.go.id/assets/upload/headline//1557821389_Festival_Robo_Robo.jpeg"
            , "https://cdn.antaranews.com/cache/730x487/2017/11/20171116robo_robo.jpg"
            , ""
            , "")
        dbHelper.insertData("88","karungut", "non benda", "kalimantan tengah"
            , "Karungut berasal dari kata karunya yang diambil dari bahasa Sangiang dan bahasa Sangen/Ngaju Kuno. Korunyo berarti tembang. Puisi tradisional atau puisi rakyat yang dikenal di Kalimantan Tengah ini diwariskan oleh nenek moyang mereka dalam bentuk lagu dan syair yang disusun sendiri oleh penciptanya, sepanjang tidak menyimpang dari kaidah yang telah dianggap baku. Di awal perkembangannya, bahasa yang digunakan dalam karungut adalah bahasa Sangen (Ngaju Kuno), tapi kini sangat jarang dipergunakan lagi. Dahulu salah satu fungsi karungut adalah sebagai media pengajaran. Karena seorang balian (guru atau dukun) menyampaikan pen gajaran kepada para muridnya dengan mengarungut. Sementara para muridnya menjawab atau melaksanakan perintah dari gurunya dengan mengarungut pula. Sedangkan orang yang menuturkan karungut disebut pengarungut.\n" +
                    "\n" +
                    "Sejak pertama kali karungut mulai dikenal oleh masyarakat Ngaju di Kalimantan Tengah hingga perkembangannya saat ini, telah terjadi penyebaran karungut yang dilakukan dengan berbagai cara. Dahulu penyebaran dilakukan dengan cara migrasi dari satu daerah ke daerah lain, atau melalui perkawinan antar-kelompok subsuku/suku yang berbeda. Namun dewasa ini pendokumentasian, pertunjukan dan perlombaan dijadikan pula sebagai media untuk penyebaran karungut. Dahulu karungut merupakan karya budaya yang dimiliki secara kolektif. Para pencipta karungut tidak pernah mencantumkan namanya, namun setelah dikenal budaya tulis dan rekaman secara elektronik, para pencipta karungut mulai mencantumkan namanya.\n" +
                    "\n" +
                    "Penyair-penyair karungut tidak lahir dari pendidikan formal, juga bukan dari proses pewarisan yang dilakukan secara terstruktur dari generasi tua ke generasi muda. Kemampuan menulis/menciptakan dan melantunkan karungut berlangsung secara alamiah yang didorong oleh keinginan untuk mencoba-coba, meniru dan belajar dari orang-orang tua. Dalam perkembangannya kini proses pewarisan secara tidak langsung pun telah dilakukan. Para penulis maupun perekam karungut ada yang telah mempublikasikan karya-karyanya secara luas, melalui media cetak dan elektronik. Di wilayah pedalaman pun, warga masyarakat yang gemar berkarungut belajar dengan cara menirukan tuturan karungut melalui radio. Dengan demikian dimungkinkan terjadinya pengembangan dan perubahan karungut dari bentuk asalnya.\n" +
                    "\n" +
                    "Hingga saat ini karungut masih dituturkan dengan menggunakan bahasa Ngaju, baik oleh orang Ngaju sendiri ataupun orang di luar Ngaju yang telah mengusai kebudayaan dan bahasa Ngaju dengan baik. Dahulu pelantunan karungut diiringi dengan musuk pengiring berupa kacapi (kecapi) bersenar dua dan tiga. Namun dalam perkembangannya, musik pengiring karungut semakin beragam. Selain kacapi, terdapat pula gong, reba, seruling dan sebagainya. Fungsi instrumen ini semata-mata hanya untuk menyemarakkan pelantunan karungut.\n" +
                    "\n" +
                    "Mereka dapat digolongkan menjadi dua kelompok, yakni: 1) Pencipta (penyair) adalah mereka yang mampu menciptakan karungut dan pasti memiliki kemampuan untuk melantunkan karungut hasil ciptaannya sendiri ataupun ciptaan orang lain 2) Pelantun hanya bisa melantunkan karungut, tetapi belum tentu dapat menciptakan syair-syair karungut dengan baik.\n" +
                    "\n" +
                    "Tema-tema yang digarap untuk sebuah karungut biasanya tentang kejadian atau peristiwa dalam kehidupan sehari-hari. Berdasarkan isi syairnya, karungut itu bisa dikelompokkan menjadi beberapa jenis, diantaranya: karungut cinta, karungut dongeng atau pemujaan terhadap seseorang tokoh/benda/tempat dan karungut nasihat. Berdasarkan proses penciptaannya, karungut dapat dibedakan menjadi dua kelompok besar, yaitu:\n" +
                    "\n" +
                    "• Karungut spontan (tradisional) adalah karungut yang tercipta secara spontan bersamaan dengan ketika syair-syair lagu itu dilantunkan oleh pengarungut. Si pencipta tidak menyusun konsep atau gagasannya secara tertulis, karena syair-syair karungut itu langsung mengalir dari pikiran dan perasaannya saja saat ia sedang mengarungut.\n" +
                    "\n" +
                    "• Karungut tak spontan (modern) adalah karungut yang tercipta secara tidak spontan. Si pencipta menulis dahulu syair-syair yang akan dilantunkannya. Karungutyang dilantunkan bukan oleh penciptanya sendiri juga bisa dikategorikan sebagai karungut tak spontan. Jenis karungut tak spontan terdiri dari dua bentuk, yakni karungut tertulis dan rekaman. Mengingat di masa kini telah banyak pencipta dan pelantun karungut yang merekam karungut dalam bentuk kaset, CD atau alat rekam elektronik lainnya."
            , ""
            , "https://mediacenter.palangkaraya.go.id/wp-content/uploads/sites/24/2021/10/IMG_0066_copy_1024x683-copy.jpg"
            , "https://mediacenter.palangkaraya.go.id/wp-content/uploads/sites/24/2022/02/kar12871-2.jpg"
            , "https://kebudayaan.kemdikbud.go.id/bpnbkalbar/wp-content/uploads/sites/22/2020/09/Karungut.jpg"
            , ""
            , "")
        dbHelper.insertData("89","pasar terapung", "non benda", "kalimantan selatan"
            , "Sejarah tertulis tentang pasar terapung tidak dapat diketahui dengan pasti. Akan tetapi tradisi ini telah berlangsung lama. Pasar terapung terbentuk dari belum atau tidak tersedianya fasilitas angkutan darat. Selain itu didukung oleh pemukiman masyarakat yang berada ditepi sungai (water front). Hal ini berakibat berkembanganya budaya sungai, dengan memanfaatkan sungai sebagai media transportasi dan interaksi masyarakat. Pada umumnya pasar terapung dapat dijumpai di daerah muara sungai, seperti Muara Kuin dan Lokbaintan. Aktivitas di pasar terapung dimulai dari setelah salat subuh sampai terbit matahari. Adapun barang-barang yang diperjualbelikan berasal dari daerah hulu lalu berkumpul di muara sungai. Jenis alat transportasi yang digunakan antara lain perahu jukung dan perahu klotok. Sedangkan jenis barang dagangan antara lain sayuran buah-buahan sampai makanan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485419806.jpg"
            , "https://www.mytrip.co.id/images/uploads/gwaWEUOL_1584686444.jpg"
            , "https://1.bp.blogspot.com/-M5kfsyxOg9E/Wv2X2zbQ5RI/AAAAAAAAAVI/A5gPzTpPmQoLY-laywdw2aL31_P5CnIeQCPcBGAYYCw/s1600/pasar-terapung-kalimantan-selatan.jpg"
            , ""
            , "")
        dbHelper.insertData("90","upacara adat kwangkay", "non benda", "kalimantan timur"
            , "Upacara Adat Kwangkay adalah pemakaman terakhir Suku Dayak Benuaq tempat Kabupaten Kutai Kartanegara dan Kutai Barat. Pelaksanaan prosesi upacara adat tersebut pada bulan Januari Maret. Banyak hal yang tidak boleh dilanggar atau yang dianggap tabu oleh masyarakat pendukung kebudayaan tersebut. Pelanggaran akan dikenai sanksi sesuai hukuman yang berlaku. Upacara Adat Kwangkay dilaksanakan oleh anggota keluarga yang masih hidup agar para mendiang dapat tiba di tempat yang tinggi di Puncak Lumut."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485421293.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("91","bepadaw", "non benda", "kalimantan utara"
            , "Bepadaw adalah Budaya Tradisi asli orang suku Tidung yang biasanya dilakukan dua tahun sekali. Pepadaw adalah kegiatan penurunan perahu Padaw Tuju Dulung (Tujuh Haluan).Perahu ini diarak keliling Kota dan berbentuk sangat khas.Pada bagian bawah perahu dipasang bilah-bilah bambu yang digunakan oleh para pemuda suku Tidung untuk mengangkat Padaw tuju Dulung ini. Padaw Tuju Dulung memiliki tiga cabang yang disebut haluan. Haluan pada bagian tengah dibuat tiga tingkat. Sementara dua haluan lainnya yang ada dikanan dan dikiri perahu dibentuk menjadi dua tingkat. Jika dihitung semua tingkat yang ada di masing-masing haluan jumlahnya adalah tujuh. Angka tujuh ini melambangkan jumlah hari dalam seminggu yang juga berarti perjalanan kehidupan manusia."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485487621.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("92","tulude", "non benda", "sulawesi utara"
            , "Tulude berasal dari bahasa Sangihe dari kata \"Manulude\" yang artinya \"menolak\". Dahulu, upacara adat Tulude dilaksanakan pada tanggal 31 Desember, malam saat pergantian tahun. Saat itu sebuah perahu kecil terbuat dari kayu (tatolang) ditolak/dilepaskan ke tengah laut yang disertai dengan kata-kata atau ucapan bahwa segala sesuatu yang buruk telah dilepaskan ke tengah laut dan telah meninggalkan kehidupan manusia, dengan kata lain yaitu sebagai penolak bala. Masyarakat etnis Sangihe dan Talaud bukan hanya merayakan upacara ini di daerah mereka, akan tetapi sampai di daerah-daerah perantauan. Maksud dan tujuan pelaksanaan upacara ini yaitu sebagai media bersyukur pada Tuhan YME atas anugerah kehidupan di tahun yang lalu dan menerima kehidupan di tahun yang baru serta selalu diridhoi Tuhan."
            , ""
            , "https://img.inews.co.id/media/822/files/inews_new/2022/01/31/adat.jpg"
            , "https://1.bp.blogspot.com/-_LIH36o5KNA/VzLmScFxZwI/AAAAAAAAOv4/O1f0udR3R9EELdlhjGiptccwAudRHUP0ACKgB/s1600/sangir.JPG"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1643628494/slfrdtuw0dwqwpscuusj.jpg"
            , ""
            , "")
        dbHelper.insertData("93","upacara melabot tumpe", "non benda", "sulawesi tengah"
            , "Prosesi upacara Malabot Tumpe diawali dengan pengumpulan telur burung Moleo oleh Perangkat Adat sebanyak 160 butir. Setelah terkumpul, perangkat adat membawanya di rumah Ketua Adat, kemudian menyiapkan parahu dan pengantar telur sebanyak 7 orang terdiri atas: 3 orang Tua-tua Adat, dan 4 orang pendayung. Sebelum diberangkatkan ke Banggai, telur Moleo dibungkus dengan daun komunong (sejenis daun palma)."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485488929.jpg"
            , "https://dhanimahendra.files.wordpress.com/2015/01/33728-20141202_163655.jpg"
            , "https://cdn.antaranews.com/cache/800x533/2019/12/04/Tradisi-Malabot-Tumpe-di-Banggai-Laut-041219-bmz-6.jpg"
            , ""
            , "")
        dbHelper.insertData("94","mappadendang", "non benda", "sulawesi selatan"
            , "Mappadendang adalah ritual untuk syukuran panen padi. Upacara ini adalah sebuah adat yang berasal dari masyarakat Bugis dari zaman dahulu. Upacara ini biasanya dilakukan setelah panen raya ketika memasuki musim kemarau. Ritual ini biasanya dilaksanakan pada malam hari. Komponen utama dalam acara ini, yaitu 6 perempuan, 3 pria, bilik Baruga, lesung, alu, dan pakaian tradisional yaitu baju Bodo. Para perempuan yang beraksi dalam bilik baruga disebut Pakkindona, sedang pria yang menari dan menabur bagian ujung lesung disebut Pakkambona. Bilik baruga terbuat dari bambu, serta memiliki pagar yang terbuat dari anyaman bambu yang disebut Walasoji.Saat musim panen tiba para warga biasanya memotong ujung batang padi dengan ani-ani. Ani-ani adalah sebuah pisau pemotong yang ukurannya kecil. Jika padi sudah terkumpul, biasanya padi hasil panenan tersebut akan dirontokkan dengan cara menumbuk dalam sebuah lesung."
            , ""
            , "https://mandarnesia.com/wp-content/uploads/2020/11/Mappadendang.jpg"
            , "https://mediatani.co/wp-content/uploads/2022/10/Tradisi-Mappadendang.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("95","kalosara", "non benda", "sulawesi tenggara"
            , "Kalosara atau yang biasa disebut juga dengan kalo merupakan sebuah simbol hukum adat pada kebudayaan Tolaki di Sulawesi Tenggara yang telah diwariskan secara turun-temurun. Kalosara digunakan dalam berbagai aturan hukum adat seperti hukum dalam bidang pemerintahan, pertanahan, perkawinan, pewarisan, utang-piutang, konflik dan penyelesainnya, serta banyak bidang lainnya.\n" +
                    "\n" +
                    "Kalosara berbentuk lingkaran uang terbuat dari tiga utas rotan yang kemudian dililit ke arah kiri berlawanan dengan arah jarum jam. Ujung lilitannya kemudian disimpul dan diikat, dimana dua ujung dari rotan tersebut tersembunyi dalam simpulnya, sedangkan ujung rotan yang satunya dibiarkan mencuat keluar.\n" +
                    "\n" +
                    "Tiga ujung rotan yang dua di antaranya tersembunyi dalam simpul berkaitan erat dengan kata bijak Orang Tolaki yang berbunyi: kenota kaduki osara mokong gadu'i, toono meohai mokonggoa'i, pamaernda mokombono'i. Kalimat tersebut memiliki arti bila dalam menjalankan suatu adat terdapat kekurangan, maka hal tersebut harus dapat diterima sebagai bagian dari adat orang Tolaki dan tidak boleh dibeberkan kepada umum atau orang banyak.\n" +
                    "\n" +
                    "Sementara itu, lilitan tiga utas rotan mempunyai makna sebagai kesatuan dari stratifikasi sosial Orang Tolaki yang terdiri dari anakia (bangsawasan), towonua (penduduk asli atau pemilik negeri) yang juga bisa disebut sebagai toono motuo (orang yang dituakan) atau toono dadio (penduduk atau orang kebanyakan), dan o ata(budak). Selain itu, tiga lilitan rotan juga memiliki makna sebagai satuan dari keluarga, yakni bapak, ibu, dan anak sebagai unit terkecil jika digabungkan atas beberapa keluarga akan membentuk suatu masyarakat. Stratifikasi sosial tersebut mempengaruhi ukuran kalosara yang dipergunakan, yaitu:\n" +
                    "\n" +
                    "• Kalosara dengan ukuran lingkaran yang dapat masuk dalam tubuh manusia dewasa diperuntukkan bagi urusan golongan bangsawan.\n" +
                    "\n" +
                    "• Kalosara dengan ukuran lingkaran dapat masuk pada bahu manusia diperuntukkan bagi urusan-urusan golongan toono motuo yakni para pemangku adat.\n" +
                    "\n" +
                    "• Kalosaro dengan ukuran lingkaran dapat masuk pada kepala atau lutut manusia dewasa diperuntukkan bagi urusan-urusan golongan toono dadio atau orang kebanyakan."
            , ""
            , "https://1001indonesia.net/asset/2022/01/Kalosara.jpg"
            , "https://alif.id/wp-content/uploads/2020/08/Kalosara.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("96","molapi saronde", "non benda", "Gorontalo"
            , "Molapi Saronde secara harfiah terdiri dari kata molapi artinya menjatuhkan salentangi (selendang) yilonta (wewangian yang terbuat dari aneka kembang dan dedaunan rempah-rempah yang dicampur dengan minyak kelapa), selanjutnya disebut Saronde. Maksudnya ialah mempersilahkan menari dengan selendang yang harum semerbak kepada calon pengantin laki-laki, dalam acara mopotilantahu (mempertunangkan), sebagai bagian dari tata cara moponika (perkawinan) menurut ketentuan adat Gorontalo.\n" +
                    "\n" +
                    "Rangkaian acara itu (mopotilantahu dan molapi saronde) juga disebut motile huwali (meninjau kamar) dengan maksud memberi kesempatan kepada calon mempelai laki-laki untuk memastikan calon isteri yang akan dinikahi sesuai dengan yang direncanakan sebelumnya. Selain itu, calon mempelai laki-laki melalui tarian tersebut berkesempatan meninjau dan memastikan penataan kamar tidur yang dipersiapkan sesuai keinginannya.Tujuannya adalah untuk mewujudkan prosesi perkawinan adat secara ideal sebagai gerbang pencapaian keluarga sejahtera, sakinah mawaddah dan warahmah.\n" +
                    "\n" +
                    "Asal usul sejarah molapi saronde menurut asal histori tak bisa lepas dari masuknya Islam ke Gorontalo (sekitar tahun 1525 M). Bermula dari olongia (raja) Amai yang menjadikan Islam sebagai agama kerajaan, lalu merumuskan prinsip adati hula-hula'a to sara'a, sara'a hula'a lo adati (adat bersendi syarak, syarak bersendi adat). Formulasi itu menimbulkan ketegangan kreatif (Niode, 2007) yang melahirkan butiran-butiran tata peradatan. Secara turun-temurun terdapat 185 butir adat yang terdokumentasi dan diwariskan melalui pemangku adat dan jaringan keluarga. Pada urutan ke-11 tertulis jelas butir adat mopotilantahu (mempertunangkan) dalam adat pernikahan. Molapi saronde adalah bagian dari adat pernikahan yang melekat pada butir mopotilantahu tersebut.\n" +
                    "\n" +
                    "Meskipun demikian, pernyataan tertulis tentang molapi saronde pada era tersebut belum ditemukan. Beberapa kalangan dan pemangku adat berpendapat bahwa molapi saronde adalah konsep yang baru dipraktekkan secara serius di era pemerintahan Eato (1673 M - 1679 M). Pendapat demikian didasarkan atas argumentasi sejarah dan kebudayaan. Secara kultural, pada masa ini ketatanegaraan Kerajaan Gorontalo tegak berdiri mengikuti kerangka demokrasi yang unik. Tacco (1935:80-81) menyebutkan dengan \"good ingericht bestuur bezaten'l Sistem ketatanegaraan itu dibangun di atas prinsip adati hula-hula'a to sara'a sara'a hula'a to quru'ani (Adat bersendi syarak, syarak bersendi Qur'an). Detail prinsip tersebut melembaga pada berbagai pranata sosial, termasuk pranata perkawinan, yang didalamnya menginternalisasikan molapi saronde sebagai bagian dari kegiatan mopotilantahu yang diwariskan dari masa pemerintahan Amai.Tentang kuatnya peran pertautan adat dan Islam pada masa transisi pemerintahan kerajaan ke sistem pemerintahan kolonial. Pada masa itu realitas kehidupan masyarakat Gorontalo begitu terikat dengan agama Islam."
            , ""
            , "https://1001indonesia.net/asset/2022/01/Malopi-Saronde-e1641263422503.jpg"
            , "https://t-2.tstatic.net/gorontalo/foto/bank/images2/15082022_Molapi-Saronde.jpg"
            , "https://infopublik.id/resources/album/bulan-november-2019/Prosesi_Adat_Molapi_Saronde.jpg"
            , ""
            , "")
        dbHelper.insertData("97","passayang-sayang", "non benda", "sulawesi barat"
            , "Passayang-sayang adalah seni pertunjukan musik dan nyanyian tradisional Mandar. Alat musik yang dipakai adalah 3 buah gitar. Jumlah pemain terdiri dari 3 orang pemain gitar, sekurang-kurangnya 1 orang penyanyi laki-laki dan 1 orang penyanyi perempuan, 1 orang pemain gitar melodi, 1 orang pemain gitar rytem, dan 1 orang pemain gitar bass. Biasa pula dipertunjukkan dengan formasi pemain gitar hanya 2 orang yakni 1 orang pemain gitar melodi sekaligus pemain gitar bass dan 1 orang pemain gitar rytem. Irama petikan melodi terdiri dari irama los king, irama padang pasir, irama kemayoran, irama tallu-tallu, dan irama karambangan. Irama-irama petikan gitar yang mengiringi lagu-lagu Mandar dari syair-syair kalindada tersebut adalah penyampaian isi hati seorang pamuda kepada seorang gadis, demikian pula sebaliknya. Itulah sebabnya pertunjukan ini dinamakan Passayang-sayang karena penyanyi laki-laki menyampaikan syair-syair kalindada yang menyatakan perasaan kasih sayangnya kepada penyanyi perempuan demikian pula penyanyi perempuan."
            , ""
            , "https://1001indonesia.net/asset/2022/04/Passayang-sayang-1.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("98","cuci negri soya", "non benda", "maluku"
            , "Upacara Cuci Negeri merupakan sebuah tradisi yang telah lama berkembang di Negeri Soya. Upacara ini telah dilakukan sejak zaman datuk-datuk yang mendiami negeri Soya sampai sekarang. Upacara adat Cuci Negeri dilakukan di Negeri Soya dan Gunung Sirimau. Cuci Negeri berarti membersihkan negeri dari segala kotoran dan juga membersihkan hati dan pikiran dari seluruh masyarakat yang mendiami negeri Soya. Cuci Negeri Soya biasanya dilakukan melai dari tanggal satu Desember dan berakhir pada minggu pertama bulan Januari."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485489971.jpg"
            , "https://s3.theasianparent.com/tap-assets-prod/wp-content/uploads/sites/24/2022/04/cuci-negeri-soya-6_twitter-%40indorover.jpg"
            , "https://ambon.go.id/wp-content/uploads/2018/12/IMG-20181214-WA0041.jpg"
            , ""
            , "")
        dbHelper.insertData("99","bambu gila", "non benda", "maluku utara"
            , "Bambu Gila adalah atraksi tradisional masyarakat Kepulauan Maluku. Kesenian yang juga dikenal dengan nama Buluh Gila dan Bara Suwen ini terdapat di Provinsi Maluku dan Provinsi Maluku Utara. Di Provinsi Maluku, atraksi bernuansa magis tersebut dapat dijumpai di dua desa, yaitu Desa Liang, Kecamatan Salahatu dan Desa Mamala, Kecamatan Leihitu, Kabupaten Maluku Tengah. Sementara di Provinsi Maluku Utara, permainan yang tergolong gaib ini terdapat di beberapa daerah di Kota Ternate dan sekitarnya. Belum ditemukan data dan sumber sejarah yang dapat dipertanggungjawabkan kebenaran mengenai asal-usul atraksi Bambu Gila. Kendati demikian, atraksi ini diyakini telah ada di Kepulauan Rempah itu sebelum agama Kristen dan agama Islam masuk ke daerah tersebut.\n" +
                    "\n" +
                    "Pemain Bambu Gila terdiri dari tujuh orang pemuda atau laki-laki dewasa yang didampingi oleh seseorang yang bertindak sebagai pawang. Selain berbadan sehat dan kuat untuk melakukan permainan, tidak ada syarat lain bagi para pemain Bambu Gila. Hanya saja, selama pertunjukan berlangsung, para pemain dilarang memakai perhiasan atau menggunakan barang yang berbahan logam, seperti gelang, cincin, kalung, dan bahkan gigi palsu yang terbuat dari logam.\n" +
                    "\n" +
                    "Sebelum pertunjukan dimulai, terlebih dahulu disiapkan bambu berwarna cokelat atau bambu suanggi yang memiliki panjang sekitar 2,5 meter dengan diameter sekitar delapan sentimeter. Bambu dipotong menjadi tujuh ruas, di mana tiap-tiap potongan ruasnya dipegang oleh seorang pemain. Lalu, bambu tersebut diletakkan di dada masing-masing pemain. Perlengkapan lain untuk permainan yang tergolong gaib ini adalah kemenyan (styrax benzoin) atau jahe (zingiber officinale). Kemenyan biasanya digunakan untuk pertunjukkan bambu gila yang tergolong besar, sedangkan jahe untuk pertunjukan Bambu Gila yang tergolong kecil.\n" +
                    "\n" +
                    "Setelah semua keperluan permainan disiapkan, kemenyan dibakar di atas tempurung kelapa sambil membaca mantera. Asap dari kemenyan tersebut digunakan untuk melumuri ruas bambu satu-persatu. Sedangkan jika menggunakan media jahe, maka jahe diiris sebanyak tujuh irisan. Ketika membaca mantera, tujuh irisan jahe tersebut dikunyah oleh pawang dan lalu disemburkan ke setiap ruas bambu. Kemenyan dan jahe memiliki fungsi yang sama, yaitu untuk memanggil jin-jin atau roh-roh leluhur agar memberi kekuatan magis pada bambu.\n" +
                    "\n" +
                    "Setelah segala perlengkapan dan persyaratan dipenuhi, pawang beserta tujuh pemain Bambu Gila memasuki arena pertunjukan. Atraksi diawali dengan memanjatkan doa kepada Yang Maha Kuasa supaya pertunjukan berjalan dengan lancar dan para pemain diberi keselamatan. Kemudian, sambil membakar kemenyan atau mengunyah irisan jahe, sang pawang membaca mantera-mantera atau jampi-jampi dalam bahasa Tanah, yaitu salah satu bahasa tradisional yang terdapat di Pulau Maluku. Sambil membaca mantera, sang pawang akan melumuri ruas bambu dengan asap kemenyan atau menyemburkan irisan jahe. Hal tersebut dilakukannya berulang kali dari ruas bambu pertama hingga ruas bambu terakhir.\n" +
                    "\n" +
                    "Sehabis memanterai bambu, pawang kemudian berteriak \"Gila, gila, gila\", atraksi Bambu Gila pun dimulai. Tubuh para pemain akan terombang-ambing ke sana-ke mari, dan bahkan kadangkala sampai jatuh bangun, akibat mengendalikan gerak liar Bambu Gila. Permainan kian meriah seiring terdengarnya suara Tifa, tambur tradisional Maluku, yang dipukul oleh para pemuda dengan penuh semangat dengan irama tertentu. Suasana bertambah semarak dengan iringan tepuk tangan dan sorak-sorai para penonton. Atraksi Bambu Gila akan berakhir dengan jatuh pingsannya para pemain di arena pertunjukan. Uniknya, meski pertunjukan sudah selesai, kekuatan gaib bambu tersebut tidak serta merta hilang begitu saja sebelum diberi makan api yang terbuat dari kertas yang dibakar."
            , ""
            , "https://1001indonesia.net/asset/2018/04/Bambu-Gila.jpg"
            , "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1586860003/uonjbzcnqemn4ovxwbbg.jpg"
            , "https://indonesia.go.id/assets/upload/headline//1570537758_Bambu_Gila_dari_Tanah_Maluku.jpg"
            , ""
            , "")
        dbHelper.insertData("100","wor biak", "non benda", "papua"
            , "Wor dalam kebudayaan orang Biak dipandang dari dua sisi, yaitu tradisi wor sebagai upacara adat dan wor sebagai nyanyian adat. Wor sebagai upacara adat mengandung suatu makna simbol dalam kehidupan orang Biak yang di dalamnya terkandung nilai-nilai budaya yang mengatur hubungan mereka dengan sang penciptanya, hubungan mereka dengan sesamanya, dan hubungan mereka dengan lingkungan alam di mana mereka berada. Dalam tradisi religi orang Biak, Wor dianggapnya sebagai suatu upacara yang sakral. Wor berfungsi melindungi seseorang individu dalam momen peralihan peran sosialnya, mulai dari saat ia lahir, hidup, hingga mati. Orang tua Biak mengatakan: Nggowor baido nari nggomar (kalau kita tidak menyanyi kami akan mati). Hakekat dari pernyataan ini adalah, bahwa Wor merupakan jaminan kepastian dan kelestarian hidup bagi orang Biak Numfor. Wor (upacara tradisi orang Biak) dibagi atas dua bagian, yaitu : (a) upacara siklus hidup, dan (b) upacara insidentil. Wor Siklus Hidup yaitu upacara yang dilakukan dalam mengikuti tahapan pertumbuhan manusia yang dikenal dengan sebutan upacara siklus hidup (daur hidup). Wor insidentil yaitu beberapa upacara yang dilakukan dalam lingkaran hidup orang Biak yang disesuaikan dengan kondisi alam dan situasi hidup yang dihadapinya, antara lain Wor Fan Nanggi untuk menunjukkan kedudukan Manseren Manggundi dalam kehidupan religi orang Biak, Wor Fan Nanggi yang merupakan media pemujaan untuk mengundang kehadiran Manseren Manggundi dan mengharapkan pertolongannya dalam kehidupan mereka selanjutnya."
            , ""
            , "https://beritapapua.id/wp-content/uploads/2020/02/Wor-dan-Yospan-Dua-Tarian-Pelindung-Asal-Papua.png"
            , "https://xposeindonesia.com/wp-content/uploads/2021/05/Upacara-Wor-Suku-Biak-Papua.6.jpg"
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485225059.jpg"
            , ""
            , "")
        dbHelper.insertData("101","fararior", "non benda", "papua barat"
            , "Di kalangan Suku Doreri, sebelum keluarga laki-laki mengadakan acara peminangan kepada seorang perempuan, pertama diadakan perundingan antara beberapa keluarga terdekat dari pihak laki-laki seperti, om-om, bapa tua, dan tete.\n" +
                    "\n" +
                    "Perundingan tersebut ditetapkan beberapa perempuan yang akan dipilih, salah satu diantara mereka yang akan menjadi calon istri dari laki-laki. Perundingan hanya melibatkan laki-laki saja dan dalam waktu yang cukup lama. Ini cara penentuan calon istri berdasarkan kesepakatan orang tua terhadap seorang gadis tanpa pengetahuan anaknya. Sebenarnya ada tiga cara lainnya yaitu: melalui perjanjian atau mufakat antara kedua belah pihak orang tua selama bayi masih berada dalam kandungan ibu; perjodohan yang terjadi atas bantuan dari pihak lain (om dan tante); dan suka sama suka antara perempuan dan laki-laki.\n" +
                    "\n" +
                    "Perundingan perlu dilakukan karena pihak keluarga laki-laki perlu mempelajari latar belakang kehidupan, status sosial keluarga perempuan yang akan dipinang. Pertimbangan untung-rugi (ekonomi) dan kekuasaan (politik) menjadi faktor penentu mengambil keputusan terhadap perempuan mana yang dipilih untuk dipinang. Pertimbangan lain, faktor sosial yakni strata sosial dari kedua mempelai harus sama. Artinya strata yang tergolong Mambri atau Manawir Beba tidak bisa kawin dengan strata biasa.\n" +
                    "\n" +
                    "Setelah perundingan menetapkan untuk peminangan, pihak keluarga laki-laki mengutus beberapa orang perempuan yang sudah berumur (tante, mama tua, nene, mama ade) yang dianggap berpengalaman untuk menyampaikan rencana peminangan mereka kepada keluarga perempuan dengan berbisik (panggir kna).\n" +
                    "\n" +
                    "Proses peminangan dilakukan selama tiga hari pada malam hari, karena utusan dari pihak laki-laki akan merasa malu jika dilakukan pada siang hari dan ternyata ditolak sehingga orang banyak akan mengetahui kejadian tersebut. Jika peminangan diterima, maka keluarga perempuan akan bereaksi dengan cara mematikan lampu sehingga rumah dalam keadaan gelap, kemudian menyiram utusan dengan air bekas cucian ikan, abu tungku, ludah pinang atau air apa saja yang berbau busuk. Utusan yang disiram tidak akan marah, namun mereka senang peminangan mereka diterima.\n" +
                    "\n" +
                    "Di kalangan Suku Doreri juga terdapat adat yang tidak mengharuskan orang tua calon mempelai perempuan meminta mas kawin, tetapi pihak perempuan memberikan beban tugas yang harus dilaksanakan oleh si pria seperti, memperbaiki rumah, membuat kebun, dan berlaku sopan dan hormat terhadap orang tua perempuan. Pada zaman sekarang, pihak keluarga laki-laki mengantar mas kawin diiringi dengan dansa adat."
            , ""
            , "https://lh6.googleusercontent.com/zMi6kchiwgsoziREXrlxndhu3OiDG-_SEdqTtYQgGqBPAaa1IuCEBah8abm5D1iBCtdl0KqktvvUyiDMTD17E6j3iwXgbrqvVHmcBsujFkdelOW8e3NvHZ_iHcqXCG3orEvIBrRNf6tUJg0n8OuLSmA-3GWWMIZgdFBXfl-lwLjjhqt_dkGn3LOp5g"
            , "https://menara62.com/wp-content/uploads/2017/10/papua.jpg"
            , ""
            , ""
            , "")

        // ------------------------------------ ||| ----------------------------------- //
        dbHelper.insertData("","", "benda", "kepulauan bangka belitung"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "kepulauan riau"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "dki jakarta"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "jawa barat"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "jawa tengah"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "di yogyakarta"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "jawa timur"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "banten"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "bali"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "nusa tenggara barat"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "nusa tenggara timur"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("102","kledik", "benda", "kalimantan barat"
            , "Alat musik kledik terdapat di Kabupaten Melawi, khususnya di Kecamatan Nanga Pinoh. Cara memainkannya adalah dengan meniupnya melalui lubang yang tersedia pada alat musik ini. Alat musik ini dimainkan dengan tiupan melalui lubang pada buah bambu, kemudian tangan kiri memegang bagian bawah bambu yang berlubang, selanjutnya tangan kanan memegang bambu pada bagian sebelah kanan. Setelah posisi serasi maka dimulailah meniup alat tersebut, dan bunyi yang dihasilkan tergantung pada tiupan dan nada yang tertekan pada lubang bambu."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485419214.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("103","sapundu", "benda", "kalimantan tengah"
            , "Sapundu merupakan salah satu bentuk seni ukir tradisional masyarakat Dayak Ngaju di Kalimantan Tengah, berupa patung-patung dengan motif dan fungsi yang khas. Sesungguhnya tidak terdapat aturan adat yang secara ketat mengatur motif ukiran pada sapundu. Namun pada kenyataannya motif ukiran sapundu hampir seluruhnya menggambarkan tentang manusia. Pada umumnya media ukirnya menggunakan kayu ulin, atau dalam bahasa Dayak kayu disebut juga kayu tabalian. Umumnya masyarakat Dayak Ngaju menganggap bahwa kayu ulin memiliki kekuatan yang luar biasa. Selain itu, masyarakat setempat lebih familiar dengan jenis kayu ini dibandingkan dengan kayu-kayu lainnya. Sapundu merupakan alat kelengkapan dari upacara Tiwah. Dalam upacara tersebut sapundu digunakan untuk mengikat hewan-hewan yang akan dikurbankan. Selain fungsinya itu, sapundu juga dapat digunakan untuk mengukur tinggi rendahnya tingkatan sosial seseorang di dalam suatu kelompok masyarakat. Di sisi lain sapundu juga dianggap memiliki kekuatan magis dan nilai eksotime. Hal inilah yang menyebabkan banyak sapundu-sapundu yang dicuri untuk kemudian diperjualbelikan. Apabila aksi pencurian dan penjualan sapundu dibiarkan saja tanpa adanya usaha perlindungan, maka dikhawatirkan suatu hari nanti sapundu-sapundu yang telah berusia ratusan tahun akan hilang. Keaslian sapundu pun kini mulai dipertanyakan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485419506.jpg"
            , "https://kaltengnews.co.id/wp-content/uploads/2021/03/IMG-20210328-WA0017-850x560.jpg"
            , "https://jurnaltoddoppuli.files.wordpress.com/2014/09/sapundu.jpg"
            , ""
            , "")
        dbHelper.insertData("104","kuriding/guriding", "benda", "kalimantan selatan"
            , "Mitos asal usul Kuriding/Guriding adalah milik seekor macan di hutan Kalimantan selatan. Suatu ketika sang macan meminta anaknya untuk memainkan kuriding. Namun sang anak justru mati karena tenggorokannya tertusuk kuriding. Akibatnya sang macan mewanti-wanti agar anak keturunannya tidak lagi memainkan kuriding. Dalam perkembangannya, mitos ini menjadi dasar mitos masyarakat Banjar membunyikan kuriding, yakni sebagai alat ampuh untuk mengusir macan. Mereka juga menggantungkan atau meletakkannya di atas tempat tidur anak-anak mereka. Dalam kehidupan sosial dan budaya urang banjar, kuriding/guriding memiliki fungsi guna yang beragam, yaitu sebagai alat pelipur lara dikala sepi dan melepas lelah usai bekerja di kebun atau hutan, sebagai alat untuk mengingatkan mereka akan leluhur, dan sebagai media yang disakralkan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485420017.jpg"
            , "https://1001indonesia.net/asset/2021/08/Kuriding-min.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("105","sarung tenun samarinda", "benda", "kalimantan timur"
            , "Sarung Samarinda atau Tajong Samarinda adalah jenis kain tenunan tradisional yang bisa didapatkan di Kota Samarinda, Kalimantan Timur. Sarung ini ditenun dengan menggunakan Alat Tenun Bukan Mesin (ATBM) yang disebut Gedokan. Produk yang dihasilkan untuk satu buah sarung memakan waktu 15 hari. Ciri khas Sarung Samarinda adalah bahan bakunya yang menggunakan sutera yang khusus didatangkan dari Cina. Sebelum ditenun, bahan baku sutera masih harus menjalani beberapa proses agar kuat saat dipintal.Sehelai sarung yang dihasilkan pengrajin biasanya memiliki lebar 80 centimeter dan panjang 2 meter. Dengan ukuran sarung sebesar itu pasti ada jahitan sambungan di bagian tengahnya yang dibuat dengan menggunakan tangan. Sarung asli tidak pernah disambung dengan menggunakan mesin jahit. Inilah salah satu cara untuk membedakan kain yang asli dari yang palsu atau buatan mesin pabrik. Kerajinan tenun sarung ini pada mulanya dibawa oleh pendatang suku Bugis dari Sulawesi yang berdiam di kawasan Tanah Rendah (sekarang bernama Samarinda Seberang) pada tahun 1668. Meskipun Samarinda berada di Kalimantan Timur, rupanya kebudayaan menenun sarung di Samarinda tersebut dibawa oleh masyarakat Bugis yang mencari suaka di Kerajaan Kutai Kartanegara akibat perjanjian Bungaja antara Kerajaan Gowa dan Belanda sekitar abad ke-16. Orang Bugis pendatang inilah yang mengembangkan corak asli tenun Bugis menjadi tenun Samarinda."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1484191102.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("106","jatung utang", "benda", "kalimantan utara"
            , "Jatung Utang merupakan seni pertunjukan musik tradisional masyarakat Dayak di Kalimantan Utara khususnya. Pada awalnya, musik ini merupakan musik pengisi waktu senggang di ladang. Pada jaman dahulu alat musik ini digantung di ladang untuk dimainkan sebagai pengisi waktu istirahat.\n" +
                    "\n" +
                    "Jatung utang adalah alat musik tradisional yang menyerupai kulintang, yang terbuat dari kayu. Pada jaman dahulu alat musik ini digantung dengan mengunakan rotan atau tali, tetapi sekarang sudah dikreasikan mengikuti perkembangan jaman dengan dibuatkan kotak kayu untuk meletakan kayu-kayu yang berfungsi sebagai not-not musik.\n" +
                    "\n" +
                    "Jatung Utang pertama kali not-not musiknya tidak manggunakan notasi nada fa dan si, namun pada perkembangannya notasi tersebut dipakai ketika memainkan musik-musik modern.\n" +
                    "\n" +
                    "Jatung Utang merupakan salah satu bentuk seni pertunjukan yang masih hidup dan berkembang terutama di Desa Metun Sajau. Untuk menyelaraskan nada pada alat musik Jatung Utang merupakan sebuah pekerjaan yang membutuhkan konsentrasi dan keahlian khusus sehingga nada-nada yang keluar sama persis dengan nada-nada dari alat musik modern.\n" +
                    "\n" +
                    "Saat ini Jatung Utang sudah jarang digunakan lagi di ladang, tapi sudah mulai dipakai untuk mengiringi upacara adat atau di gereja sebagai alat pengiring nyanyian dan pertunjukan seni. Cara memainkan Jatung Utang cukup sederhana yaitu dipukul dengan 2 buah batang kayu terpisah pada tiap lempengan kayunya. Tiap lempengan kayu diikat di atas tali yang dipasang pada blok kayu yang tersusun dan akan mengeluarkan kunci nada yang berbeda-beda."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/201700550-penetapan-4_1532405515.jpg"
            , "https://pariwisataindonesia.id/wp-content/uploads/2020/10/Bermain_Jatung-foto-by-wikimedia.org_.jpg"
            , "https://assets.promediateknologi.com/crop/0x0:1075x534/x/photo/2022/03/11/40832494.jpeg"
            , ""
            , "")
        dbHelper.insertData("107","kolintang", "benda", "sulawesi utara"
            , "Kolintang adalah alat musik khas dari Minahasa (Sulawesi Utara) yang mempunyai bahan dasar kayu, jika dipukul dapat mengeluarkan bunyi yang cukup panjang dan dapat mencapai nada-nada tinggi maupun rendah, seperti kayu telur, bandaran, wenang, kakinik atau sejenisnya (jenis kayu yang agak ringan tapi cukup padat dan serat kayunya tersusun sedemikian rupa membentuk garis-gari s sejajar). Kata kolintang berasal dari bunyi: tong (nada rendah), ting (nada tinggi) dan tang (nada tengah). Dahulu dalam bahasa daerah Minahasa digunakan untuk mengajak orang bermain kolintang \"mari kita ber-Tong, Ting, Tang\" dengan ungkapan \"Maimo Kumolintang\" dan dari kebiasaan itulah muncul kolintang.\n" +
                    "\n" +
                    "Pada mulanya kolintang hanya terdiri dari beberapa potong kayu yang diletakkan berjejer diatas kedua kaki pemainnya dengan posisi duduk di tanah, dengan kedua kaki terbujur lurus kedepan. Dengan berjalannya waktu, kedua kaki pemain diganti dengan dua batang pisang, atau kadang-kadang diganti dengan tali seperti Arumba dari Jawa Barat. Sedangkan penggunaan peti sesonator dimulai sejak Pangeran Diponegoro berada di Minahasa pada tahun 1830. Pada saat itu, konon peralatan gamelan dan gambang dibawa oleh rombongannya.\n" +
                    "\n" +
                    "Adapun pemakaian kolintang erat hubungannya dengan kepercayaan tradisional rakyat Minahasa, seperti dalam upacara-upacara ritual sehubungan dengan pemujaan arwah para leluhur. ltulah sebabnya dengan masuknya agama Kristen di Minahasa, eksistensi kolintang demikian terdesak bahkan hampir menghilang sekitar 100 tahun. Sesudah Perang Dunia II, barulah kolintang muncul kembali yang dipelopori oleh Nelwan Katuuk (yang menyusun nada kolintang menurut susunan nada musik universal).\n" +
                    "\n" +
                    "Pada mulanya hanya terdiri dari satu melodi dengan susunan nada diatonis, dengan jarak nada 2 oktaf, dan pengiring dipakai alat-alat string seperti gitar, ukulele, dan stringbas. Tahun 1954 kolintang sudah dibuat 21/2 oktaf (masih diatonis). Pada tahun 1960 sudah mencapai 31/2 oktaf dengan nada 1 kruis, naturel, dan 1 mol. Dasar nada masih terbatas pada 3 kunci (naturel, 1 mol, 1 kruis) dengan jarak nada 4 v. oktaf dan dari F s/d C. Perkembangan musik kolintang baik kualitas alat, perluasan jarak nada, bentuk peti resonator (untuk memperbaiki suara), maupun penampilan telah berkembang dengan baik. Saat ini kolintang yang dibuat sudah mencapai 6 oktaf dengan kromatis penuh.\n" +
                    "\n" +
                    "Kelengkapan kolintang adalah sebagai berikut : B-Bas = Loway, C-Cello = Cello, T-Tenor 1 = Karua - Tenor 2 = Karua rua A-Alto 1 = Uner - Alto 2 = Uner rua U-Ukulele = Katelu M-Melody 1 = Ina esa - Melody 2 = Ina rua - Melody 3 = Ina taweng.\n" +
                    "\n" +
                    "Melodi fungsi pembawa lagu, dapat disamakan dengan melodi gitar, biola, xylophone, atau vibraphone. Hanya saja dikarenakan suaranya kurang panjang, maka pada nada yang diinginkan; harus ditahan dengan cara menggetarkan pemukulnya (ratn. Biasanya menggunakan dua pemukul, maka salah satu melodi pokok yang lain kombinasinya sama dengan orang menyanyi duet atau trio (jika memakai tiga pemukul). Bila ada 2 melodi, maka dapat digunakan bersama agar suaranya lebih kuat. Dengan begitu dapat mengimbangi pengiring (terutama untuk set lengkap) atau bisa juga dimainkan dengan cara memukul nada yang sama tetapi dengan oktaf yang berbeda, atau salah satu melodi memainkan pokok lagu, yang lain berupa improvisasi."
            , ""
            , "https://cdnwpseller.gramedia.net/wp-content/uploads/2022/07/27084905/Alat-musik-kolintang1.jpg"
            , "https://www.djkn.kemenkeu.go.id/files/images/2021/09/Manado_-_Kolintang_IE1.jpeg"
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "sulawesi tengah"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("108","pinisi", "benda", "sulawesi selatan"
            , "Perahu pinisi merupakan jenis perahu tradisional yang merupakan hasil dari teknologi tradisional masyarakat Bugis di Sulawesi Selatan. Perahu pinisi mempunyai ciri memiliki dua tiang layar utama dan tujuh buah layar; tiga buah layar di ujung depan, dua di tengah, dan dua di belakang. Perahu ini memiliki fungsi utama sebagai pengangkut barang antar pulau.\n" +
                    "\n" +
                    "Tidak diketahui secara jelas asal-usul dari nama pinisi, tetapi terdapat dua teori mengenai asal-usul penamaan pinisi. Teori pertama menyatakan bahwa pinisi berasal dari kata Venecia, sebuah kota pelabuhan di Italia. Diduga dari kata venecia inilah kemudian berubah menjadi penisi menurut dialek Konjo yang selanjutnya mengalami proses fonemik menjadi pinisi. Pengambilan nama kota tersebut diperkiran didasari atas kebiasaan orang Bugis Makassar mengabadikan nama tempat terkenal atau mempunyai kesan istimewa kepada benda kesayangannya, termasuk perahu.\n" +
                    "\n" +
                    "Sementara teori kedua berpendapat bahwa nama pinisi berasal dari kata panisi yang memiliki arti sisip.Mappanisi(menyisip) yaitu menyumbat semua persambungan papan, dinding, dan lantai perahu dengan bahan tertentu agar tidak kemasukan air. Dugaan tersebut berdasar pada pendapat yang menyatakan bahwa orang Bugis yang pertama menggunakan perahu pinisi. Lopi dipanisi' (Bugis) artinya perahu yang disisip. Diduga dari kata pinisi mengalami proses fonemik menjadi pinisi.\n" +
                    "\n" +
                    "Untuk bentuk perahu pinisi sendiri diperkirakan merupakan pengembangan dari perahu panjala. Panjala sendiri merupakan perahu yang dipergunakan nelayan untuk menjala (menangkap ikan), namun nama tersebut kemudian menjadi nama jenis perahu. Hubungan antara perahu panjala dengan pinisi terlihat dari bentuk lambung perahu pinisi yang memiliki kesamaan dengan perahu panjala.\n" +
                    "\n" +
                    "Sebelum masuk ke dalam proses pembuatan pinisi, kita terlebih dahulu mengenal sistem menajemen pertukangannya. Hal ini dikarenakan dalam pembuatan perahu diperlukan sekelompok tukang yang tidak sedikit sehingga diharuskan untuk memiliki pola manajemen yang tertata rapi untuk menjaga keharmonisan dalam komunitas tukang. Walaupun struktur ini bukan sesuatu yang resmi, namun ketaatan pada sistem dan struktur kerja tetap dipatuhi. Secara sederhana struktur tersebut terdiri dari punggawa atau panrita (kepala tukang), sawi (tukang) yang terdiri sawi kabusu dan sawi pemula, sambalu (pemilik perahu) dan ledeng yang merupakan dewan musyawarah."
            , ""
            , "https://media.suara.com/pictures/970x544/2021/08/08/21652-kapal-pinisi.jpg"
            , "https://asset.kompas.com/crops/gRqwCXP89p4Sxs1FDNA62VxdMLs=/128x85:1152x768/750x500/data/photo/2019/07/23/5d36afed83edd.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "sulawesi tenggara"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "Gorontalo"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "sulawesi barat"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "maluku"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "maluku utara"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "papua"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("","", "benda", "papua barat"
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")

        // --------------------------------- |||| -------------------------------- //
        dbHelper.insertData("78","kujang", "senjata", "jawa barat"
            , "Secara umum, Kujang mempunyai pengertian sebagai pusaka yang mempunyai kekuatan tertentu yang berasal dari para dewa (Hyang), dan sebagai sebuah senjata sejak dahulu. Hingga saat ini Kujang menempati satu posisi yang sangat khusus di kalangan masyarakat Jawa Barat (Sunda). Sebagai lam bang atau simbol dengan nilai-nilai filosofis yang terkandung di dalamnya, Kujang dipakai sebagai salah satu estetika dalam beberapa lambang organisasi serta pemerintahan. Disamping itu, Kujang pun dipakai pula sebagai sebuah nama dari berbagai organisasi, kesatuan dan tentunya dipakai pula oleh Pemda Propinsi Jawa Barat.\n" +
                    "\n" +
                    "Di masa lalu Kujang tidak dapat dipisahkan dari kehidupan masyarakat Sunda karena fungsinya sebagai peralatan pertanian. Pernyataan ini tertera dalam naskah kuno Sanghyang Siksa Kanda Ng Karesian (1518 M) maupun tradisi lisan yang berkembang di beberapa daerah diantaranya di daerah Rancah, Ciamis. Bukti yang memperkuat pernyataan bahwa kujang sebagai peralatan berladang masih dapat kita saksikan hingga saat ini pada masyarakat Baduy, Banten dan Pancer Pangawinan di Sukabumi.\n" +
                    "\n" +
                    "Dengan perkembangan kemajuan, teknologi, budaya, sosial dan ekonomi masyarakat Sunda, Kujang pun mengalami perkembangan dan pergeseran bentuk, fungsi dan makna. Dari sebuah peralatan pertanian, kujang berkembang menjadi sebuah benda yang memiliki karakter tersendiri dan cenderung menjadi senjata yang bernilai simbolik dan sakral. Wujud baru kujang tersebut seperti yang kita kenal saat ini diperkirakan lahir antara abad 9 sampai abad 12.\n" +
                    "\n" +
                    "Dalam Wacana dan Khasanah Kebudayaan Nusantara, Kujang diakui sebagai senjata tradisional masyarakat Jawa Barat (Sundal dan Kujang dikenal sebagai senjata yang memiliki nilai sakral serta mempunyai kekuatan magis. Beberapa peneliti menyatakan bahwa istilah Kujang berasal dari kata kudihyang dengan akar kata kudi dan hyang.\n" +
                    "\n" +
                    "Kudi diambil dari bahasa Sunda Kuno yang artinya senjata yang mempunyai kekuatan gaib sakti, sebagai jimat, sebagai penolak bala, misalnya untukmmenghalau musuh atau menghindari bahaya/penyakit. Senjata ini juga disimpan sebagai pusaka, yang digunakan untuk melindungi rumah dari bahaya dengan meletakkannya di dalam sebuah peti atau tempat tertentu di dalam rumah atau dengan meletakkannya di atas tempat tidur. Sedangkan hyang dapat disejajarkan dengan pengertian Dewa dalam beberapa mitologi, namun bagi masyarakat Sunda Hyang mempunyai arti dan kedudukan di atas Dewa. Hal ini tercermin di dalam ajaran \"Dasa Prebakti\" yang tercermin dalam naskah Sanghyang Siksa Kanda Ng Karesian disebutkan \"Dewa bakti di Hyang''.\n" +
                    "\n" +
                    "Karakteristik sebuah kujang memiliki sisi tajaman dan nama bagian, antara lain : papatuk/congo (ujung kujang yang menyerupai panah), eluk/silih (lekukan pada bagian punggung), tadah (lengkungan menonjol pada bagian perut) dan mata (lubang kecil yang ditutupi logam emas dan perak). Selain bentuk karakteristik bahan kujang sangat unik cenderung tipis, bahannya bersifat kering, berpori dan banyak mengandung unsur logam alam.\n" +
                    "\n" +
                    "Dalam Pantun Bogar sebagaimana dituturkan oleh Anis Djatisunda (996-2000), kujang memiliki beragam fungsi dan bentuk. Berdasarkan fungsi, kujang terbagi empat antara lain : Kujang Pusaka (lambang keagungan dan pelindungan keselamatan), Kujang Pakarang (untuk berperang), Kujang Pangarak (sebagai a lat upacara) dan Kujang Pamangkas (sebagai alat berladang). Sedangkan berdasarkan bentuk bilah ada yang disebut Kujang Jago (menyerupai bentuk ayam jantan), Kujang Ciung (menyerupai burung ciung), Kujang Kuntul (menyerupai burung kuntul/bango), Kujang Badak (menyerupai badak), Kujang Naga (menyerupai binatang mitologi naga) dan Kujang Bangkong (menyerupai katak). Disamping itu terdapat pula tipologi bilah kujang berbentuk wayang kulit dengan tokoh wanita sebagai simbol kesuburan.\n" +
                    "\n" +
                    "Menurut orang tua ada yang memberikan falsafah yang sangat luhur terhadap Kujang sebagai; Ku-Jang-ji rek neruskeun padamelan sepuh karuhun urang Janji untuk meneruskan perjuangan sepuh karuhun urang/ nenek moyang yaitu menegakkan cara-ciri manusia dan cara ciri bangsa. Apa itu? Cara-ciri Manusia ada 5: Welas Asih (Cinta Kasih), Tatakrama (Etika Berprilaku), Undak Usuk (Etika Berbahasa), Budi Daya Budi Basa, Wiwaha Yuda Na Raga Ngaji Sadan. Ciri-ciri Bangsa ada 5: Rupa, Basa, Adat, Aksara, Kebudayaan."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1483949471.jpg"
            , "https://koropak.co.id/storage/img/cover/kujang-pusaka-dan-lambang-keagungan.jpg"
            , "https://pariwisataindonesia.id/wp-content/uploads/2020/09/Kujang-foto-by-.pikiran-rakyat.com_.jpg"
            , ""
            , "")
        dbHelper.insertData("80","keris", "senjata", "jawa tengah"
            , "Keris adalah benda budaya yang eksotik dan original. Keris merupakan 'karya seni' sekaligus 'benda budaya' asli Nusantara. Budaya keris terbentang dari ujung Pulau Sumatra di barat, Semenanjung Siam dan Sulu di Utara, Gugusan kepulauan Maluku di Timur dan Kepulauan Nusa Tenggara di Selatan. Keris menjadi identitas pengikat yang mendorong rasa kebangsaan itu tumbuh subur di Nusantara. Rasa kebangsaan memerlukan simbol, bukan hanya dalam pengertian simbol yang bersifat abstrak melainkan simbol nyata yang dapat mewakili hampir seluruh suku bangsa yang ada di Nusantara. Bukti sejarah menunjukkan pengaruh budaya keris dalam teknik tempa logam yang digunakan oleh suku-suku bangsa yang mendiami kepulauan Nusantara. Budaya keris menyebar sejalan dengan perdagangan dan hubungan diplomatik diantara kerajaan-kerajaan di Nusantara.\n" +
                    "\n" +
                    "Keris merupakan senjata tikam golongan belati (berujung runcing dan tajam pada kedua sisinya) dengan banyak fungsi budaya yang dikenal di kawasan Nusantara bagian barat dan tengah. Bentuknya khas dan mudah dibedakan dari senjata tajam lainnya karena tidak simetris di bagian pangkal yang melebar, seringkali bilahnya berkelok-kelok, dan banyak di antaranya memiliki parnor (serat-serat lapisan logam cerah) pada helai bilah. Pada masa lalu keris berfungsi sebagai senjata dalam peperangan, sekaligus sebagai benda pelengkap sesajian. Saat ini, penggunaan keris lebih banyak sebagai ornamen pelengkap dalam berbusana adat. Sebagai produk kebudayaan, keris mengandung sejumlah nilai luhur kebudayaan pembuatnya yang disimbolkan dalam berbagai bagian keris. Selain itu, keris juga marak menjadi benda koleksi yang dinilai dari segi estetikanya.\n" +
                    "\n" +
                    "Penggunaan keris tersebar pada masyarakat penghuni wilayah yang pernah terpengaruh oleh Majapahit, seperti Jawa, Madura, Nusa Tenggara, Sumatera, pesisir Kalimantan, sebagian Sulawesi, Semenanjung Malaya, Thailand Selatan dan Filipina Selatan (Mindanao). Keris Mindanao dikenal sebagai kalis. Keris di setiap daerah memiliki kekhasan sendiri-sendiri dalam penampilan, fungsi, teknik garapan, serta peristilahan. Keris Indonesia telah terdaftar di UNESCO sebagai Warisan Budaya Dunia Non-Bendawi Manusia sejak tahun 2005.\n" +
                    "\n" +
                    "Keris atau dhuwung terdiri dari tiga bagian utama, yaitu bilah (wilah atau daun keris), ganja (penopang), dan hulu keris (ukiran, pegangan keris). Bagian yang harus ada adalah bilah. Hulu keris dapat terpisah maupun menyatu dengan bilah. Ganja tidak selalu ada, tapi keris-keris yang baik selalu memilikinya. Keris sebagai senjata dan alat upacara dilindungi oleh sarung keris atau warangka.\n" +
                    "\n" +
                    "Bilah keris merupakan bagian utama yang menjadi identifikasi suatu keris. Pengetahuan mengenai bentuk (dhapur) atau morfologi keris menjadi hal yang penting untuk keperluan identifikasi. Bentuk keris memiliki banyak simbol spiritual selain nilai estetika. Hal-hal umum yang perlu diperhatikan dalam morfologi keris adalah kelokan (luk), ornamen (ricikan), warna atau pancaran bilah, serta pola pamor. Kombinasi berbagai komponen ini menghasilkan sejumlah bentuk standar (dhapur) keris yang banyak dipaparkan dalam pustaka-pustaka mengenai keris. Pengaruh waktu mempengaruhi gaya pembuatan."
            , ""
            , "https://awsimages.detik.net.id/community/media/visual/2021/03/04/keris-1.jpeg?w=700&q=90"
            , "http://kebudayaan.kemdikbud.go.id/bpcbyogyakarta/wp-content/uploads/sites/37/2015/03/Keris-Nogososro.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("109","badik", "senjata", "sulawesi selatan"
            , "Badik merupakan salah satu simbol identitas masyarakat Sulawesi. Badik secara universal berbicara bentuk, bahan, dan metode dimana di tiga wilayah ini akan ditemukan perbedaan-perbedaan dari tiap wilayah di Sulawesi. Namun jika kita masuk pada wilayah tujuan maka Badik punya tujuan yang sama. Sebab sama-sama dilahirkan oleh salah satu kebutuhan manusia yaitu rasa ingin aman, damai, dan terlindungi."
            , ""
            , "https://disbudpar.sulselprov.go.id/uploads/budaya/BADIK%20IDENTITAS%20BUGIS%20MAKASSAR.jpg"
            , "https://asset.kompas.com/crops/fIOH9sh3_iYRJJFIngocAUdIh8w=/16x5:860x567/750x500/data/photo/2017/10/17/3149025439.jpg"
            , "https://static.republika.co.id/uploads/images/inpicture_slide/badik-_131023170957-337.jpg"
            , ""
            , "")

        // ------------------------------------ ||||| ----------------------------------- //
        dbHelper.insertData("110","coto makassar", "makanan", "sulawesi selatan"
            , "Dalam masyarakat Makassar kemudian dikenal berbagai jenis masakan tradisional dengan bahan dasar daging dan tulang kerbau. Bahkan isi dalam kerbau seperti usus, hati, jeroan, limpa, dan jantung, dibuat makanan yang khas disebut coto, sementara tulang-belulangnya sampai ke tulang kaki dibuat pula makanan yang disebut konro dan sup kikil."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485488375.jpg"
            , "https://asset.kompas.com/crops/ljY1r3f3HJaNEuLip3iARQOaK-E=/0x1226:3000x3226/750x500/data/photo/2021/06/11/60c2acf88c6f0.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("111","papeda", "makanan", "papua barat"
            , "Di Papua mempunyai makanan tradisional yaitu sagu, betatas, keladi, dan umbi-umbian. Makanan tradisional orang Papua adalah sagu. Sagu dalam bahasa orang Waropen/Napan/Sentani adalah Fi sedangkan untuk orang Yaur adalah Moore dan orang Moi menyebutnya Hi. Sagu adalah makanan pokok dan termasuk salah satu hal utama dalam setiap upacara adat masyarakat Papua. Sagu diolah menjadi beraneka ragam makanan dan mempunyai sebutan yang berbeda sesuai dengan bahan yang campur atau digunakan. Sagu yang dikelola sering dikombinasikan dengan buah-buahan, Biji-bijian, kacang-kacangan dan daging babi, ikan, udang, daging penyu dan siput laut."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485490655.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("112","rumah tongkonan", "benda", "sulawesi selatan"
            , "Tongkonan adalah rumah tradisional masyarakat Toraja yang telah berlangsung sangat lama (tidak ada catatan resmi mengenai awal mula tongkonan). Tongkonan mengalami empat tahap perkembangan, yaitu tahap pertama disebut banua pandoko dena atau rumah pertama yang dikenal oleh masyarakat Toraja yang bentuknya agak bundar dengan dinding yang terbuat dari daun dan rumput-rumputan. Tahap kedua, banua lentong apa atau bentuk bangunan rumah yang mempunyai empat tiang tetapi tidak besar. Tahap ketiga, banua tamben atau rumah yang dibentuk menyusun kayu-kayu secara berselang-seling, dan tahap keempat banua tolo atau rumah yang menggunakan pasak besar."
            , ""
            , "https://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/foto_1485506703.jpg"
            , "https://cdnwpedutorenews.gramedia.net/wp-content/uploads/2021/12/30191712/Rumah-Adat-Tongkonan-2.jpg"
            , ""
            , ""
            , "")
        dbHelper.insertData("113","rumah honai", "benda", "papua"
            , "Honai berasal dari kata hun yang berarti laki-laki dewasa dan ai yang berarti rumah. Jadi, sebutan umum untuk rumah orang Dani adalah honai yang sekarang ini juga semakin dikenal luas oleh orang-orang di mana saja, baik di dalam dan di luar negeri, sedangkan Suku Yali menyebutnya Homea. Untuk mempertegas eksistensi laki-laki sebagai kepala keluarga, benda-benda berharga termasuk harta benda dan pusaka turun temurun (misalnya jimat/batu keramat/kaneke, kalung berharga, untaian kerang/jetak eken atau walimo eken, dan mikhak) disimpan di tempat khusus biasanya berupa lemari kayu kecil (kakok) yang ditutupi dengan dedaunan tertentu dan diletakkan di dinding belakang rumah. Kadang-kadang babi pun dimasukkan dalam pilamo karena babi juga merupakan harta benda berharga perlambang status sosial dan simbol yang dipakai dalam upacara adat.Honai dibangun berhadapan lurus dengan pintu utama luar. Di sini orang yang duduk di honai dapat melihat dan tahu siapa yang datang dan pergi, melihat orang berbuat apa di halaman rumah atau silimo. Pada bagian depan di bagian dalam honai antara tiang utama dengan pintu masuk, ditempatkan pipa-pipa rokok (hanom-oak) dan tempat sampah atau palungan (san). Saat upacara adat diadakan karena kematian seorang anggota masyarakat, sejumlah hewan dikorbankan selama 40 hari sejak kematian seseorang tersebut."
            , ""
            , "https://asset.kompas.com/crops/hfIev8H9bbgU2R7IVxbGR32wOLo=/0x0:1200x800/750x500/data/photo/2021/09/04/61334e074bfbc.jpg"
            , "https://statics.indozone.news/local/621de13950aa8.jpg"
            , ""
            , ""
            , "")
        //dbHelper.close()
    }
}