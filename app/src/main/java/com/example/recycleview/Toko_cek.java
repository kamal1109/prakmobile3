package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Toko_cek extends RecyclerView.Adapter<Toko_cek.ViewHolder> {
    private Context context;
    private ArrayList<Toko_Gaya> tokoGayas;

    public Toko_cek(Context context) {
        this.context = context;
    }

    public ArrayList<Toko_Gaya> getTokoGayas() {
        return tokoGayas;
    }

    public void setTokoGayas(ArrayList<Toko_Gaya> tokoGayas) {
        this.tokoGayas = tokoGayas;
    }

    @NonNull
    @Override
    //identifikasi jumlah baris untuk menampilkan urut sebaris
    public Toko_cek.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_toko,viewGroup,false);
        return new ViewHolder(itRow);
    }

    @Override
    //mengatur tampilan dan button agar sesuai dengan perintah yang diberikan
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(getTokoGayas().get(i).getLambangtoko()).into(viewHolder.ivLambangtoko);
        viewHolder.tvNamatoko.setText(getTokoGayas().get(i).getNamatoko());
        //menamampilan nama dan lambang toko
        viewHolder.share.setOnClickListener(new View.OnClickListener()
        //perintah untuk menampilkan pilihan button share
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getTokoGayas().get(i).getPrivew());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });

        viewHolder.visit.setOnClickListener(new View.OnClickListener()
            //menampilkan perintah pada button preview
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("logo", getTokoGayas().get(i).getLambangtoko());
                intent.putExtra("nama", getTokoGayas().get(i).getNamatoko());
                intent.putExtra("preview", getTokoGayas().get(i).getPrivew());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getTokoGayas().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivLambangtoko;
        private TextView tvNamatoko;
        private Button share;
        private Button visit;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivLambangtoko = itemView.findViewById(R.id.IV);
            tvNamatoko = itemView.findViewById(R.id.nama_toko);
            share = itemView.findViewById(R.id.btn_share);
            visit = itemView.findViewById(R.id.btn_preview);
            //inisiasi button, text view dan image view pada tampilan utama
        }
    }
}
