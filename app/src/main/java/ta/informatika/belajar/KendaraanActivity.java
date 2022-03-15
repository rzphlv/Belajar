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

public class KendaraanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BelajarAdapter kendaraanAdapter;
    private ArrayList<Data> kendaraanArrayList;
    private BelajarAdapter.RecyclerClickViewListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendaraan);
        recyclerView = findViewById(R.id.recycleViewBangun);
        getData();
        setAdapter();
    }
    public void setAdapter(){
        setOnClickListener();
        kendaraanAdapter = new BelajarAdapter(kendaraanArrayList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KendaraanActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kendaraanAdapter);
    }

    //ketika item di dalam acitivity di klik
    private void setOnClickListener() {
        listener = new BelajarAdapter.RecyclerClickViewListener() {
            @Override
            public void onClick(View v, int position) {
                //mengambil data dari referensi untuk menampilkan sesuai yang dipilih
                Intent intent = new Intent(getApplicationContext(), ProfileBelajar.class);
                intent.putExtra("getindo", kendaraanArrayList.get(position).getIndo());
                intent.putExtra("getlampung", kendaraanArrayList.get(position).getLampung());
                intent.putExtra("getimg", kendaraanArrayList.get(position).getImg());
                intent.putExtra("getSuara", kendaraanArrayList.get(position).getSuara());
                intent.putExtra("getket", kendaraanArrayList.get(position).getKeterangan());
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
        kendaraanArrayList = new ArrayList<>();
        kendaraanArrayList.add(new Data("Sepeda", "Sepidah", R.drawable.sepeda, R.raw.sepeda, "Sepeda dalam bahasa lampung disebut 'Sepidah'. Sepeda merupakan kendaraan yang memiliki roda dua atau tiga yang kerjanya dengan cara dikayuh dengan sepasang kaki."));
        kendaraanArrayList.add(new Data("Motor", "Mutor", R.drawable.motor, R.raw.motor, "Motor dalam bahasa lampung disebut 'Mutor'. Motor merupakan kendaraan yang memiliki roda dua atau tiga yang digerakkan dengan mesin."));
        kendaraanArrayList.add(new Data("Mobil", "Mubil", R.drawable.mobil, R.raw.mobil, "Mobil dalam bahasa lampung disebut 'Mubil'. Mobil adalah kendaraan roda empat yang digerakkan dengan mesin."));
        kendaraanArrayList.add(new Data("Kereta api", "Kerito", R.drawable.kereta, R.raw.kereta, "Kereta dalam bahasa lampung disebut 'Kerito'. Kereta adalah alat transportasi yang berjalan di atas rel"));
        kendaraanArrayList.add(new Data("Helikopter", "Helikopter", R.drawable.helikopter, R.raw.helikopter, "Helikopter dalam bahasa lampung disebut 'Helikopter'. Helikopter adalah alat transportasi yang bisa terbang dengan baling-baling."));
        kendaraanArrayList.add(new Data("Kapal laut", "Kapal lawet", R.drawable.kapal, R.raw.kapallaut, "Kapal laut dalam bahasa lampung disebut 'Kapal lawet'."));
        kendaraanArrayList.add(new Data("Becak", "Bicak", R.drawable.becak, R.raw.becak, "Becak dalam bahasa lampung disebut 'Bicak'."));
        kendaraanArrayList.add(new Data("Pesawat", "Pesawat", R.drawable.pesawat, R.raw.pesawat, "Pesawat dalam bahasa lampung disebut 'Pesawat'. Pesawat merupakan alat transportasi yang bisa terbang."));
        kendaraanArrayList.add(new Data("Taksi", "Taksei", R.drawable.taksi, R.raw.taksi, "Taksi dalam bahasa lampung disebut 'Taksei'."));
        kendaraanArrayList.add(new Data("Bus", "Bes", R.drawable.bus, R.raw.bus, "Bus dalam bahasa lampung disebut 'Bes'."));
        kendaraanArrayList.add(new Data("Sampan", "Pegagheu", R.drawable.sampan, R.raw.perahu, "Sampan dalam bahasa lampung disebut 'Pegagheu'"));
        kendaraanArrayList.add(new Data("Rakit", "Rakit", R.drawable.rakit, R.raw.rakit, "Rakit dalam bahasa lampung disebut 'Rakit'."));
    }
}