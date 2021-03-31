package info.tim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoTimf1, imageViewFotoPembalapf1;
    TextView textViewNamaTimf1, textViewInfoTimf1, textViewInfoTimf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoTimf1 = findViewById(R.id.imageViewFotoTimf1);
        textViewNamaTimf1 = findViewById(R.id.textViewNamaTimf1);
        textViewInfoTimf1 = findViewById(R.id.textViewInfoTimf1);
        imageViewFotoPembalapf1 = findViewById(R.id.imageViewFotoPembalap1);
        textViewInfoTimf2 = findViewById(R.id.textViewInfoTimf2);


        getIncomingExtra();


    }

    private void getIncomingExtra() {

        if (getIntent().hasExtra("foto_timf1") && getIntent().hasExtra("nama_timf1") && getIntent().hasExtra("info_timf1")&& getIntent().hasExtra("foto_pembalapf1") && getIntent().hasExtra("info_timf2")) {

            String fotoTimf1 = getIntent().getStringExtra("foto_timf1");
            String namaTimf1 = getIntent().getStringExtra("nama_timf1");
            String infoTimf1 = getIntent().getStringExtra("info_timf1");
            String fotoPembalapf1 = getIntent().getStringExtra("foto_pembalapf1");
            String infoTimf2 = getIntent().getStringExtra("foto_timf2");
            setDataActivity(fotoTimf1, namaTimf1, infoTimf1, fotoPembalapf1, infoTimf2);
        }
    }

    private void setDataActivity(String fotoTimf1, String namaTimf1, String infoTimf1, String fotoPembalapf1, String infoTimf2){

        Glide.with(this).asBitmap().load(fotoTimf1).into(imageViewFotoTimf1);

        Glide.with(this).load(fotoPembalapf1).placeholder(R.drawable.ic_launcher_background).centerCrop().into(imageViewFotoPembalapf1);

        textViewNamaTimf1.setText(namaTimf1);
        textViewInfoTimf1.setText(infoTimf1);
        textViewInfoTimf2.setText(infoTimf2);
    }

}