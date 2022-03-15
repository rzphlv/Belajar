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

public class WarnaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BelajarAdapter warnaAdapter;
    private ArrayList<Data> warnaArrayList;
    private BelajarAdapter.RecyclerClickViewListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna);
        recyclerView = findViewById(R.id.recycleViewBangun);
        getData();
        setAdapter();
    }
    public void setAdapter(){
        setOnClickListener();
        warnaAdapter = new BelajarAdapter(warnaArrayList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(WarnaActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(warnaAdapter);
    }

    //ketika item di dalam acitivity di klik
    private void setOnClickListener() {
        listener = new BelajarAdapter.RecyclerClickViewListener() {
            @Override
            public void onClick(View v, int position) {
                //mengambil data dari referensi untuk menampilkan sesuai yang dipilih
                Intent intent = new Intent(getApplicationContext(), ProfileBelajar.class);
                intent.putExtra("getindo", warnaArrayList.get(position).getIndo());
                intent.putExtra("getlampung", warnaArrayList.get(position).getLampung());
                intent.putExtra("getimg", warnaArrayList.get(position).getImg());
                intent.putExtra("getSuara", warnaArrayList.get(position).getSuara());
                intent.putExtra("getket", warnaArrayList.get(position).getKeterangan());
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
        warnaArrayList = new ArrayList<>();
        warnaArrayList.add(new Data("Merah", "Suluh", R.drawable.merah, R.raw.merah, "Merah dalam bahasa lampung disebut 'Suluh'."));
        warnaArrayList.add(new Data("Kuning", "Kuning", R.drawable.kuning, R.raw.kuning, "Kuning dalam bahasa lampung disebut 'Kuning'."));
        warnaArrayList.add(new Data("Biru", "Bireu", R.drawable.biru, R.raw.biru, "Biru dalam bahasa lampung disebut 'Bireu'."));
        warnaArrayList.add(new Data("Hijau", "Ujau", R.drawable.hijau, R.raw.hijau, "Hijau dalam bahasa lampung disebut 'Ujau'."));
        warnaArrayList.add(new Data("Putih", "Andak", R.drawable.putih, R.raw.putih, "Putih dalam bahasa lampung disebut 'Andak'."));
        warnaArrayList.add(new Data("Hitam", "Agheng", R.drawable.hitam, R.raw.hijau, "Hitam dalam bahasa lampung disebut 'Agheng'."));
        warnaArrayList.add(new Data("Ungu", "Ungu", R.drawable.ungu, R.raw.ungu, "Ungu dalam bahasa lampung disebut 'Ungu'."));
        warnaArrayList.add(new Data("Abu-abu", "Abeu-abeu", R.drawable.abuabu, R.raw.abuabu, "Abu-abu dalam bahasa lampung disebut 'Abeu-abeu'."));
        warnaArrayList.add(new Data("Merah Muda", "Suluh mudo", R.drawable.merahmuda, R.raw.merahmuda, "Merah muda  dalam bahasa lampung disebut 'Suluh mudo'."));
        warnaArrayList.add(new Data("Orange", "Oren", R.drawable.orange, R.raw.orange, "Orange  dalam bahasa lampung disebut 'Oren'."));
        warnaArrayList.add(new Data("Cokelat", "Cuklat", R.drawable.coklat, R.raw.coklat, "Coklat dalam bahasa lampung disebut 'Cuklat'."));
    }
}