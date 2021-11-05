package com.example.uts_19090075

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<Modal>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(Modal(R.drawable.alcon,"Alcon Tears Naturale","Rp 48.000 – Rp 55.000",
            "Mata kering disebabkan oleh minimnya sekresi air pada mata. Kalian dapat mengobati mata kering tersebut dengan Alcon Tears Naturale.\n" +
                    "Tetes mata ini mengandung Dextran 0,1% dan hydroxy methylcellulosa 0,3% yang dapat memicu produksi air mata."))

        data?.add(Modal(R.drawable.blink,"Blink Contacts","Rp 55.000 – Rp 106.250",
            "Blink merupakan brand yang berada di bawah perusahaan Johnson and Johnson dan merupakan brand yang berfokus pada kesehatan mata.\n" +
                    "Salah satu varian produk yang ditawarkan oleh Blink adalah Blink Contact Lubricating Eye Drop.\n" +
                    "Tetes mata ini dapat digunakan untuk membasahi lensa kontak yang berbentuk soft maupun Rigid Gas Permeable (RGP)."))

        data?.add(Modal(R.drawable.cendo,"Cendo Cenfresh","Rp 26.000 – Rp 50.000",
            "Cendo Cenfresh membantu mengurangi iritas pada mata dan melembapkan mata kering.\n" +
                    "Selain mengurangi Cendo Cenfresh juga melindungi mata dari debu dan kotoran untuk mencegah adanya iritasi lanjutan."))

        data?.add(Modal(R.drawable.freshkon,"Tetes Mata Freshkon","Rp 17.900 – Rp 77.600",
            "Tetes mata dari Freshkon dapat digunakan untuk melumasi berbagai lensa kontak jenis soft.\n" +
                    "Tetes mata ini juga dapat langsung diteteskan pada mata yang menggunakan lensa kontak.\n" +
                    "Tetes mata ini memiliki kandungan anti-bacteria dan anti-fungal agar lensa kontak tidak mudah terserang jamur."))

        data?.add(Modal(R.drawable.insto,"Tetes Mata Insto","Rp 11.250 – Rp 46.000",
            "Insto merupakan produk tetes mata terkemuka di Indonesia dan telah memenangkan berbagai penghargaan.\n" +
                    "Insto hadir dengan beberapa varian, yaitu Insto Regular untuk mengatasi iritasi dan rada pedih di mata yang disebabkan oleh debu, asap dan angin.\n" +
                    "Sementara untuk varian Insto Dry Eyes berfungsi untuk meringankan rasa kering di mata dan membuatnya segar kembali."))

        data?.add(Modal(R.drawable.lion,"Lion Smile","Rp 120.000 – Rp 150.000",
            "Lion Smile memiliki varian tetes mata yang dapat meringankan berbagai keluhan kesehatan mata untuk anak-anak hingga orang tua.\n" +
                    "Jika kalian mengalami mata sakit akibat terlalu banyak bekerja disertai dengan kekaburan kalian dapat mencoba varian Smile 40 Premium, Smile 40X Gold dan Smile 40 EX.\n" +
                    "Apabila kalian mengalami iritasi dan mata merah kalian bisa mencoba Smile Whiteye dan Smile 40 Mediclear. "))

        data?.add(Modal(R.drawable.sante,"Tetes Mata Sante","Rp 87.500 – Rp 255.000",
            "Tetes mata yang berasal dari Jepang merupakan produk yang cukup digemari oleh masyarakat.\n" +
                    "Sante diformulasikan khusus untuk mata stres akibat paparan sinar matahari, diet yang tidak seimbang dan kurang tidur.\n" +
                    "Tetes mata ini mengandung taurine untuk melancarkan metabolisme khususnya pada mata dan vitamin B12.\n" +
                    "Kandungan tersebut sangat berguna untuk meregangkan otot-otot mata yang kelelahan."))


        data?.add(Modal(R.drawable.visine,"Tetes Mata Visine","Rp 13.000 – Rp 30.000",
            "Tetes mata dari Visine dapat meredakan gejala mata merah yang disertai dengan rasa gata.\n" +
                    "Tetes mata ini juga mampu mengetasi mata merah akibat pelebaran pembuluh darah pada selaput mata yang disebabkan oleh debu dan kurang tidur.\n" +
                    "Bisa juga mengatasi mata merah karena terlalu lama berada di depan layar komputer atau menatap gawai."))

        data?.add(Modal(R.drawable.refresh,"Allegran Refresh","Rp 44.000 – Rp 84.000",
            "Refresh Contact Eyedrop berfungsi untuk melubrikasi lensa kontak, varian Refresh Liquigel Eye Drops untuk mengobati mata kering.\n" +
                    "Sementara Refresh Eye Drops untuk mengobati mata kering akibat iritasi, dan varian Refresh Night Time untuk malam hari."))


        data?.add(Modal(R.drawable.rohto,"Tetes Mata Rohto","Rp13.500 – Rp130.000",
            "Rohto merupakan brand yang berasal dari Jepang dan telah berdiri sejak 1899 memiliki standar yang sangat ketat, sehingga kualitasnya tidak perlu diragukan lagi.\n" +
                    "Ada 3 obat tetes mata yang ditawarkan oleh Rohto, yaitu Rohto C Cube untuk melumasi mata sebelum menggunakan lensa kontak.\n" +
                    "Serta Rohto OMR dan Rohto Cool untuk mengatasi mata memerah akibat iritasi ringan."))

        //Set data to Adapter
        recyclerView.adapter = Adapter(data, object : Adapter.OnClickListener{
            override fun detail(item: Modal?) {
                val intent = Intent(this@MainActivity, Description::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("Produk", item?.nama)
                intent.putExtra("Harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })
    }
}