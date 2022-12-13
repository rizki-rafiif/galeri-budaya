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
        dbHelper.insertData("","", "", ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")
        //dbHelper.close()
    }
}