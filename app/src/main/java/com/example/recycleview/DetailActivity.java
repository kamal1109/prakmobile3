package com.example.recycleview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvPreview, tvNamaPreview;
    ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_jenis);

        ivLogo = findViewById(R.id.iv_logo);
        tvNamaPreview = findViewById(R.id.preview_nama_toko);
        tvPreview = findViewById(R.id.tv_preview);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        //gantitampilan
        if (getIntent().hasExtra("logo") && getIntent().hasExtra("nama") && getIntent().hasExtra("preview")){
            int logotoko = getIntent().getIntExtra("logo", 0);
            String namatoko = getIntent().getStringExtra("nama");
            String previewtoko = getIntent().getStringExtra("preview");

            setDataActivity(logotoko, namatoko, previewtoko);
        }
    }

    private void setDataActivity(int logotoko, String namatoko, String previewtoko){
        Glide.with(this).asBitmap().load(logotoko).into(ivLogo);
        tvNamaPreview.setText(namatoko);
        tvPreview.setText(previewtoko);
    }
}
