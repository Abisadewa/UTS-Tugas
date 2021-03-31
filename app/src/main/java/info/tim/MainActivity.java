package info.tim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoTimf1 = new ArrayList<>();
    private ArrayList<String> namaTimf1 = new ArrayList<>();
    private ArrayList<String> infoTimf1 = new ArrayList<>();
    private ArrayList<String> fotoPembalapf1 = new ArrayList<>();
    private ArrayList<String> infoTimf2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoTimf1,namaTimf1, infoTimf1, fotoPembalapf1, infoTimf2, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    private void getDataFromInternet(){

        namaTimf1.add("Mercedes");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2018/07/racefansdotnet-20180719-141416-17-470x313.jpg");
        infoTimf1.add("Mercedes memasuki musim terakhir dari periode peraturan saat ini tanpa terkalahkan, merebut setiap kejuaraan sejak 2014. Akankah 2021 terulang? Ini mungkin pertarungan karena tim tidak menikmati awal metronomi yang biasa untuk musim ini, mencatatkan jarak tempuh paling sedikit dari tim mana pun selama pengujian. W12 terlihat sedikit lebih merepotkan bagi pembalapnya dibandingkan pendahulunya, tetapi tim tersebut belum memenangkan kejuaraan tujuh kali berturut-turut tanpa alasan. Masalah apa pun yang saat ini dihadapi pasti akan diselesaikan lebih cepat daripada nanti.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/11055/production/_117371796_mercedes2_pa.jpg");
        infoTimf2.add("Tim Mercedes meluncurkan mobil balap terbaru mereka untuk musim balap F1 2021 yang diberi nama W12 pada hari Selasa (2/3/2021). Liverynya jauh lebih cantik. Lewis Hamilton dan Valtteri Bottas akan memacu mobil W12 tersebut pada musim balap F1 2021 guna meraih gelar juara dunia yang ke-8 kali berturut-turut untuk tim Mercedes. Dari segi mekanis, mobil terbaru tim bernama lengkap Mercedes-AMG Petronas F1 Team di F1 2021 tersebut tidak jauh berbeda dari pendahulunya yaitu W11 Perubahan yang terbesar yang diusung oleh W12 berada di segi aerodinamika, yang menuruti aturan teknis baru untuk F1 2021.");

        namaTimf1.add("Red Bull");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2018/07/racefansdotnet-20180719-081755-2-470x313.jpg");
        infoTimf1.add("Sebuah tim yang biasanya mengakhiri musim dengan catatan tinggi, Red Bull tampaknya akhirnya membawa sebagian kecepatan itu ke tahun baru. Max Verstappen menduduki puncak pengujian pramusim dan RB16B tampak jauh lebih stabil daripada iterasi sebelumnya yang membuat bagian belakang tidak dapat diprediksi. Ciri-ciri penanganan yang buruk itu tampaknya telah diselesaikan dengan perubahan peraturan, dan dengan penambahan Sergio Perez, tim sepertinya akan mungkin menjadi ancaman gelar bagi Mercedes jika lampu start dimulai.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/15E75/production/_117371798_redbull2_pa.jpg");
        infoTimf2.add("Tim dan mobil Red Bull Racing untuk Formula 1 (F1) 2021 resmi diluncurkan pada Selasa (23/2/2021). Red Bull Racing menjadi tim kontestan F1 2021 keempat yang telah menggelar acara peluncuran alias launching. Secara sekilas, tidak banyak perubahan yang diusung mobil baru Red Bull Racing yang diberi nama RB16B tersebut. Hanya saja, jika diamati lebih cermat, sasis RB16B lebih ramping dibandingkan RB16 yang digunakan pada F1 2020. Tim yang berbasis di Milton Keynes, Inggris tersebut berusaha beradaptasi dengan regulasi baru yang dibuat untuk mengurangi daya cengkeram ban belakang. Maka dari itu, dimensi lantai mobil RB16B dibuat lebih ramping di bagian belakang. RB16B juga akan menggunakan mesin baru buatan Honda yang diklaim jauh lebih bagus dibandingkan musim lalu. Seperti diketahui, salah satu masalah yang sering dialami Red Bull Racing terkait dengan mesin mobil mereka adalah clipping.");

        namaTimf1.add("McLaren");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2018/04/racefansdotnet-20180427-163642-25-470x313.jpg");
        infoTimf1.add("McLaren adalah salah satu tim yang meninggalkan tes pramusim paling bahagia dari semuanya. Tim tampak seperti telah bermigrasi dari Renault ke kekuatan Mercedes dengan mulus dan menunjukkan kecepatan yang menjanjikan di tiga hari tersebut. Daniel Ricciardo menyelesaikan sesi paginya dengan mobil tercepat dari semua sehingga tampaknya juga menyesuaikan diri dengan lingkungan baru segera, dan Lando Norris secara konsisten membangun penampilan sebelumnya; Tahun 2021 terlihat menjanjikan bagi kru pepaya.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/4D73/production/_117372891_mclaren2_pa.jpg");
        infoTimf2.add("Tim McLaren baru saja mengadakan event peluncuran mobil yang akan mereka paka untuk kompetisi Formula 1 (F1) 2021. Acara launching tersebut dilaksanakan pada Senin (15/2/2021) pukul 20.00 waktu Inggris atau Selasa dini hari WIB. Dua pembalap McLaren, Lando Norris dan Daniel Ricciardo, turut hadir dalam acara yang turut disiarkan secara daring tersebut. McLaren menjadi kontestan pertama F1 2021 yang memperkenalkan tim dan mobil terbaru mereka. Tim asal Inggris tersebut akan menggunakan blok mesin buatan Mercedes yang ditunjukkan dengan huruf M di akhir nama mobil mereka. Sebelumnya, mereka menggunakan power unit bikinan Honda (2015-2017) dan Renault (2018-2020). Pergantian power unit tersebut membuat sasis MCL35M mengalami perubahan signifikan dibandingkan desain musim lalu. ");

        namaTimf1.add("Aston Martin");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2021/03/racefansdotnet-21-03-14-07-42-35-33-470x313.jpg");
        infoTimf1.add("Tim ini menimbulkan kontroversi dengan tampilan mirip Mercedes tahun lalu, dan AMR21 2021 melanjutkan filosofi desain tersebut. Aston Martin menggunakan konsep low-rake seperti Mercedes meskipun pada penampilan pertama, ini mungkin menjadi poin yang berlawanan. Mobil-mobil berdaya tinggi tampak jauh lebih nyaman dengan perubahan regulasi baru selama pengujian. Dengan tambahan juara dunia empat kali Sebastian Vettel ke kotak peralatannya dan pabrik baru yang sedang dibangun, tim di bawah Lawrence Stroll berarti bisnis.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/185F3/production/_117372899_astonmartin'snewf1car.jpg");
        infoTimf2.add("Tim Aston Martin memperkenalkan mobil AMR21 pada Rabu (3/3/2021). Mobil warna hijau ini akan dipakai Sebastian Vettel dan Lance Stroll di musim balap F1 2021. Memliki nama lengkap Aston Martin Cognizant Formula One Team, ini merupakan nama baru atau rebranded dari yang sebelumnya dikenal dengan tim Racing Point. Seperti sudah diduga, tim tim Aston Martin menggunakan livery warna hijau yang dikenal dengan sebutan British Racing Green. Launching mobil AMR21 ini menandai kembalinya nama Aston Martin ke grid Formula 1, sejak terakhir tampil pada 1960 atau 61 tahun lalu. Aston Martin AMR21 ini mengambil spek dari mobil pendahulunya, RP20 yang dipakai tim Racing Point pada balap F1 2020. Masih mengandalkan mesin Mercedes-AMG, mobil Aston Martin AMR21 ini akan menjadi andalan pembalap barunya, Sebastian Vettel yang ditemani Lance Stroll.");

        namaTimf1.add("Alpine");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2021/03/racefansdotnet-21-03-13-13-24-42-3-470x313.jpg");
        infoTimf1.add("Banyak yang telah dibuat dari struktur manajemen F1 Alpine yang unik. Dengan kepergian Cyril Abiteboul dan perekrutan Davide Brivio dari tim MotoGP Suzuki, tim mengatakan tidak masalah tanpa kepala tim tradisional yang memimpin. Bisakah itu mengatur kembalinya Fernando Alonso? Juara dua kali itu kembali pada 2021 setelah kepergian Daniel Ricciardo ke McLaren. Orang Australia itu menjadi kecewa dengan proyek jangka panjang yang dijanjikan Renault kepadanya; akankah pembalap asal Spanyol itu bersabar di Alpine?");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/C2A3/production/_117372894_alpine1_pa.jpg");
        infoTimf2.add("Tim Alpine akan meluncurkan mobil F1 2021 awal bulan depan sebagai musim pertamanya sejak peralihan dari tim Renault. Tim Alpine yang berasal dari Prancis dan bermarkas di Enstone, Inggris ini telah mengumumkan melalui media sosial. Yaitu akan mengadakan launching virtual mobil Alpine A521 pada hari Selasa, 2 Maret 2021, akan jatuh pada hari yang sama dengan tim Mercedes sang juara dunia. Alpine A521 adalah Renault R.S.20, mobil yang didesain tim F1 Renault untuk berkompetisi di tahun 2020. Tim Alpine akan menyambut juara dunia F1 dua kali Fernando Alonso sebagai rekan setim Esteban Ocon. Bagi Fernando Alonso, ini seperti reuni dengan tim yang sebelumnya bernama tim Renault. Pembalap Spanyol ini kembali ke grid Formula 1 setelah cuti selama dua tahun, terakhir balapan untuk tim McLaren. ");

        namaTimf1.add("Ferrari");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2020/03/racefansdotnet-20200311-040709-12-470x313.jpg");
        infoTimf1.add("2020 adalah musim terburuk bagi Ferrari selama lebih dari 40 tahun. Tim merosot ke urutan keenam dalam klasemen dengan hanya tiga kali naik podium sepanjang musim. Tim mengalami atmosfer yang cukup beracun dengan balapan Sebastian Vettel mengetahui dia keluar dari tim pada akhir tahun, tetapi masalah utama tim berasal dari penyelesaian pribadi dengan FIA atas unit kekuatannya. Tahun ini, tim mengatakan datanya menunjukkan bahwa mereka telah memperoleh keuntungan dalam hal kecepatan top-end dibandingkan tahun lalu, dan kedatangan Carlos Sainz selanjutnya dapat menyegarkan kembali mereka yang berada di Maranello.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/134B1/production/_117552097_thenewferrarisf21.jpg");
        infoTimf2.add("Tim Scuderia Ferrari akhirnya memamerkan tampilan mobil barunya SF21 untuk F1 2021 (10/3/2021). Sebelumnya tepat pada 26 Februari lalu, Ferrari sudah melakukan launching tim untuk F1 2021. Launching ini unik karena hanya memperkenalkan pembalap dan susunan tim saja. Sedangkan untuk launching mobil SF21-nya dilakukan terpisah, tepatnya hari ini (10/3/2021). Launching semacam ini sempat membuat Ferrari dikritik oleh banyak pihak karena terlalu bertele-tele dalam launching. SF21 akhirnya jadi mobil terakhir yang dilaunching di F1 2021. Seperti pada bocoran yang beredar beberapa waktu lalu, SF21 benar-benar memakai dua warna merah 'two-tone'.");

        namaTimf1.add("AlphaTauri");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2020/02/racefansdotnet-20200220-114222-8-470x313.jpg");
        infoTimf1.add("AlphaTauri adalah tim lain yang sedang naik daun dan merupakan salah satu paket yang lebih kuat selama pengujian pramusim. Pierre Gasly pulih dari penurunan pangkatnya dari Red Bull untuk menjadi pemenang F1 pertama kali di Monza musim lalu, dan penambahan pembalap Jepang Yuki Tsunoda membuat line-up yang menjanjikan tahun ini. Tsunoda telah menikmati pendakian cepat di dunia kursi tunggal, naik dari F4 Jepang ke F1 hanya dalam lima tahun. Dia menyelesaikan pengujian tercepat kedua setelah beberapa waktu cepat pada hari terakhir.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/110C3/production/_117372896_rb_at02.jpg");
        infoTimf2.add("Tim Scuderia AlphaTauri resmi melakukan launching tim untuk F1 2021. AlphaTauri jadi tim kedua setelah McLaren, yang sudah meluncurkan mobil barunya untuk F1 2021. Mobil ini bernama AT02, versi terbaru setelah AT01 tahun lalu saat pertama kali memakai nama AlphaTauri. Mobil ini akan dipakai oleh pemenang 1 balapan F1, Pierre Gasly, yang akan ditemani seorang rookie asal Jepang, Yuki Tsunoda. Soal livery, biru dongker dan putih masih menjadi warna utama mobil terbaru AlphaTauri ini. Hanya saja, porsi warna biru dongkernya lebih banyak dibandingkan tahun lalu.");

        namaTimf1.add("Alfa Romeo");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2020/02/racefansdotnet-20200219-091825-280-470x313.jpg");
        infoTimf1.add("Salah satu dari hanya tiga tim yang menurunkan susunan pemain yang tidak berubah pada tahun 2021, Alfa Romeo bertahan dengan apa yang mereka ketahui untuk musim baru. Fokusnya sangat banyak pada perubahan peraturan 2022 dan dikatakan tidak ingin menghadapi tantangan menyambut pengemudi baru di tahun yang penting untuk pembangunan. Pengalaman Kimi Räikkönen kemungkinan besar akan menjadi vital, tetapi begitu pula janji akan lebih banyak tenaga dari mesin Ferrari.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/9B93/production/_117372893_alfaromeo2_pa.jpg");
        infoTimf2.add("Alfa Romeo Racing menghelat peluncuran resmi tim dan mobil untuk Formula 1 (F1) 2021 pada Senin (22/2/2021). Dalam acara yang disiarkan langsung dari Warsawa, Polandia tersebut, Alfa Romeo memperkenalkan mobil baru mereka yang diberi nama C41. Duet Kimi Raikkonen dan Antonio Giovinazzi mendapat kehormatan membuka selubung C41 dalam prosesi peluncuran tadi. Dengan terlaksananya launching ini, perjalanan Alfa Romeo pada F1 2021 pun resmi dimulai. Secara umum, tidak ada perbedaan signifikan dalam tampilan C41 jika dibandingkan mobil tahun lalu, C39. Mobil yang menggunakan blok mesin buatan Ferrari tersebut masih menggunakan corak warna dominan merah dan putih. Hanya saja, Alfa Romeo sedikit mengubah perpaduan warna merah dan putih di bagian tertentu. Jika pada musim lalu penutup mesin C39 diberi warna merah, pada C41 warna putih lebih dominan. Bagitu pula pada bagian sidepod yang pada musim lalu didominasi warna putih, kini berubah menjadi merah.");

        namaTimf1.add("Haas");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2020/02/racefansdotnet-20200226-181129-23-470x313.jpg");
        infoTimf1.add("Kembalinya nama Schumacher ke Formula 1 adalah salah satu cerita kunci menuju musim baru. Mick Schumacher mengambil gelar F2 musim lalu tetapi mungkin akan mengalami tahun debut yang sulit. Haas telah memperjelas niatnya dan telah mengalihkan fokus penuh ke 2022. Mobil tersebut telah menerima peningkatan terbatas sejak awal musim 2020 tetapi investasi baru dari Dmitri Mazepin dan sponsor baru Uralkali dapat mengubah nasib Haas.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/2330/production/_117380090_haas'newf1car.jpg");
        infoTimf2.add("Tim Haas akhirnya memamerkan mobil barunya untuk kompetisi F1 2021. Mobil baru ini bernama VF-21 yang akan dipakai oleh Mick Schumacher dan Nikita Mazepin. Dari segi livery, kelirnya sangat berbeda dengan tahun lalu. Jika tahun lalu warna hitam dan putih, kini warna putih terlihat sangat dominan. Warna putih ini berpadu dengan warna biru dan merah dengan sponsor barunya, Uralkali. Uralkali sendiri adalah perusahaan milik ayah sang pembalap Nikita Mazepin, Dimitri Mazepin. Nikita Mazepin jadi pembalap tim Haas memang berstatus sebagai pay driver, hal ini sangat terlihat dari livery tim Haas yang baru ini.");

        namaTimf1.add("Williams");
        fotoTimf1.add("https://www.racefans.net/wp-content/uploads/2019/04/racefansdotnet-20190403-075703-16-470x313.jpg");
        infoTimf1.add("2021 adalah musim penuh pertama tanpa anggota keluarga Williams yang memimpin Williams Grand Prix Engineering. Sebaliknya, Simon Roberts telah mengambil alih sebagai kepala tim dengan Jost Capito kembali ke F1 sebagai CEO tim setelah sempat bermain singkat di McLaren di masa lalu. Dorilton Capital memiliki harapan yang tinggi untuk tim tetapi perbaikan besar tidak mungkin terjadi sampai 2022. George Russell adalah pemain bintang tahun lalu, dan dengan kontrak kedua pembalap Mercedes di akhir musim, kemungkinan menjadi kesempatan dalam pengambilan kursi pembalab tim top teratas yaitu Mercedes.");
        fotoPembalapf1.add("https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/6E06/production/_117466182_williams.jpg");
        infoTimf2.add("Tetap mempertahankan warna biru dan putih, tim Williams memperkenalkan livery mobil FW43B hari Jumat (5/3/2021) yang desainnya lebih fresh dan memiliki arti. Williams mengatakan, desain livery mobil FW43B untuk musim balap F1 2021 ini terinspirasi oleh mobil-mobil lama pemenang gelar. Tetap mempertahankan warna biru dan putih, tim Williams memperkenalkan livery mobil FW43B hari Jumat (5/3/2021) yang desainnya lebih fresh dan memiliki arti.");


        prosesRecyclerViewAdapter();

    }


}