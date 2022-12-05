package com.rizkirafiif.galeribudaya.Data

import android.content.Context
import com.rizkirafiif.galeribudaya.db.DatabaseHelper

class DataBudaya(context: Context) {
    val dbHelper = DatabaseHelper.getInstance(context)

    fun executeDB(){
        dbHelper.insertData("1","rencong", "senjata", "aceh"
            , "Menurut catatan sejarah, Rencong merupakan senjata tradisional yang digunakan di Kesultanan Aceh sejak masa pemerintahan Sultan Ali Mughayat Syah yang merupakan Sultan Aceh yang pertama. Kedudukan Rencong di Kesultanan Aceh sangatlah penting, Rencong selalu diselipkan di pinggang Sultan Aceh, selain itu para Ulee Balang dan masyarakat biasa juga menggunakan Rencong. Rencong emas milik Sultan Aceh dapat kita jumpai di Museum Sejarah Aceh"
            , ""
            , "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/COLLECTIE_TROPENMUSEUM_Dolk_met_rechthoekig_gebogen_hoornen_greep_en_houten_schede_TMnr_151-19.jpg/259px-COLLECTIE_TROPENMUSEUM_Dolk_met_rechthoekig_gebogen_hoornen_greep_en_houten_schede_TMnr_151-19.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("2","tari saman", "tarian", "aceh"
            , "Saman adalah salah satu kesenian tradisional yang tumbuh dan berkembang pada masyarakat Gayo di Kabupaten Gayo Lues, Aceh Tenggara, Aceh Timur (Kecamatan Serbejadi), Kabupaten Aceh Tamiang (Tamiang Hulu). Keberadaan saman pada masyarakat Gayo merupakan sebuah tradisi yang turun temurun dan menjadi bagian dalam kehidupan mereka."
            , ""
            , "http://warisanbudaya.kemdikbud.go.id/dashboard/media/photos/56339-11.jpg"
            , ""
            , ""
            , ""
            , "")
        dbHelper.insertData("3","tari piring", "tarian", "aceh"
            , "Tarian ini ditarikan oleh 2 hingga 8 orang dan dilakukan secara berpasangan. Penari memakai cincin pada jari tengah di kedua tangannya dan masing-masing tangan memegang piring kecil (pisin). Penari terdiri dari laki-laki dan perempuan yang komposisinya seimbang. Penari bergerak dengan langkah yang mirip dengan langkah silat, langkah yang lebar dan rendah. Gerakan tariannya juga banyak melibatkan kontak mata diantara pasangan penari tersebut. Pring yang dipegang para penari diangkat dengan gerakan memutar-mutar tangan dan bahkan sesekali piring dilempar kemudian ditangkap kembali. Jika piring jatuh dan pecah, biasanya penari diberikan piring lain oleh seseorang yang merupakan bagian dari kelompok penari tersebut atau bahkan oleh penonton. Selama tarian berlangsung, para penari tak henti-hentinya mengetukan cincin di jari tengah mereka ke piring sehingga jalannya tarian pun menjadi semakin meriah."
            , ""
            , "http://museumnusantara.com/wp-content/uploads/2020/09/tari-piring.jpg"
            , "https://asset.kompas.com/crops/L24Yf9OsnAq5gX8thjs9uhtlymQ=/85x43:598x384/750x500/data/photo/2021/12/21/61c1b92e7a7d9.jpg"
            , "https://1.bp.blogspot.com/-WGVG0CwtnJA/YRJfXYfDGmI/AAAAAAAADck/rTgxzos91kERzZrwOxJqiD8f6Pf3TBb8QCLcBGAsYHQ/w1200-h630-p-k-no-nu/03%2B-%2BTari%2BPiring.jpg"
            , ""
            , "")
        dbHelper.insertData("4","toho", "senjata", "sumatra utara"
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
        dbHelper.insertData("","", "", ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , ""
            , "")

        dbHelper.close()
    }
}