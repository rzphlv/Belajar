package ta.informatika.belajar;
/*
Class untuk menampilkan angka
*/
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import ta.informatika.belajar.Adapter.BelajarAdapter;
import ta.informatika.belajar.Adapter.Data;
import ta.informatika.belajar.Adapter.ProfileBelajar;

public class AngkaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BelajarAdapter angkaAdapter;
    private ArrayList<Data> AngkaArrayList;
    private BelajarAdapter.RecyclerClickViewListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);
        recyclerView = findViewById(R.id.recycleViewBangun);
        getData();
        setAdapter();
    }
    public void setAdapter(){
        setOnClickListener();
        angkaAdapter = new BelajarAdapter(AngkaArrayList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AngkaActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(angkaAdapter);
    }

    //ketika item di dalam acitivity di klik
    private void setOnClickListener() {
        listener = new BelajarAdapter.RecyclerClickViewListener() {
            @Override
            public void onClick(View v, int position) {
                //mengambil data dari referensi untuk menampilkan sesuai yang dipilih
                Intent intent = new Intent(getApplicationContext(), ProfileBelajar.class);
                intent.putExtra("getindo", AngkaArrayList.get(position).getIndo());
                intent.putExtra("getlampung", AngkaArrayList.get(position).getLampung());
                intent.putExtra("getimg", AngkaArrayList.get(position).getImg());
                intent.putExtra("getSuara", AngkaArrayList.get(position).getSuara());
                intent.putExtra("getket", AngkaArrayList.get(position).getKeterangan());
                startActivity(intent);
            }
        };
    }

    /*
    Menambahkan data ke dalam array list
    Data yang ditambahkan yaitu nama, gambar, suara, dan keterangannya
    Jika ingin menambahkan data baru, maka harus menambahkan fungsi pada class Data
    */
    public void getData(){
        AngkaArrayList = new ArrayList<>();
        AngkaArrayList.add(new Data("Satu", "Sai", R.drawable.satuu, R.raw.satu, "Angka satu (1) dalam bahasa lampung sebut 'Sai'"));
        AngkaArrayList.add(new Data("Dua", "Wo", R.drawable.duaa, R.raw.dua, "Angka dua (2) dalam bahasa lampung sebut 'Wo'"));
        AngkaArrayList.add(new Data("Tiga", "Tigo", R.drawable.tigaa, R.raw.tiga, "Angka tiga (3) dalam bahasa lampung sebut 'Tigo'"));
        AngkaArrayList.add(new Data("Empat", "Pak", R.drawable.empatt, R.raw.empat, "Angka empat (4) dalam bahasa lampung sebut 'Pak'"));
        AngkaArrayList.add(new Data("Lima", "Limou", R.drawable.limaa, R.raw.lima, "Angka lima (5) dalam bahasa lampung sebut 'Limou'"));
        AngkaArrayList.add(new Data("Enam", "Nem", R.drawable.enamm, R.raw.enam, "Angka enam (6) dalam bahasa lampung sebut 'Nem'"));
        AngkaArrayList.add(new Data("Tujuh", "Pituw", R.drawable.tujuhh, R.raw.tujuh, "Angka tujuh (7) dalam bahasa lampung sebut 'Pituw'"));
        AngkaArrayList.add(new Data("Delapan", "Waleu", R.drawable.delapann, R.raw.delapan, "Angka delapan (8) dalam bahasa lampung sebut 'Waleu'"));
        AngkaArrayList.add(new Data("Sembilan", "Siwo", R.drawable.sembilann, R.raw.sembilan, "Angka sembilan (9) dalam bahasa lampung sebut 'Siwo'"));
        AngkaArrayList.add(new Data("Sepuluh", "Puluh", R.drawable.sepuluhh, R.raw.sepuluh, "Angka sepuluh (10) dalam bahasa lampung sebut 'Puluh'"));
    }
}