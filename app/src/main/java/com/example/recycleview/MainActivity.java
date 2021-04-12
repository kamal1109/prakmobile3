package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvtoko;
    private ArrayList<Toko_Gaya> listtoko = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvtoko = findViewById(R.id.rv_toko_list);
        rvtoko.setHasFixedSize(true);
        listtoko.addAll(TokoData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvtoko.setLayoutManager(new LinearLayoutManager(this));
        Toko_cek footbalAdapter = new Toko_cek(this);
        footbalAdapter.setTokoGayas(listtoko);
        rvtoko.setAdapter(footbalAdapter);
    }
}