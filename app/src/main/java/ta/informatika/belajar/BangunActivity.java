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

public class BangunActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BelajarAdapter bangunAdapter;
    private ArrayList<Data> bangunDatarArrayList;
    private BelajarAdapter.RecyclerClickViewListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun);
        recyclerView = findViewById(R.id.recycleViewBangun);
        getData();
        setAdapter();
    }

    public void setAdapter(){
        setOnClickListener();
        bangunAdapter = new BelajarAdapter(bangunDatarArrayList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(BangunActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bangunAdapter);
    }

    //ketika item di dalam acitivity di klik
    private void setOnClickListener() {
        listener = new BelajarAdapter.RecyclerClickViewListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileBelajar.class);
                intent.putExtra("getindo", bangunDatarArrayList.get(position).getIndo());
                intent.putExtra("getlampung", bangunDatarArrayList.get(position).getLampung());
                intent.putExtra("getimg", bangunDatarArrayList.get(position).getImg());
                intent.putExtra("getSuara", bangunDatarArrayList.get(position).getSuara());
                intent.putExtra("getket", bangunDatarArrayList.get(position).getKeterangan());
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
        bangunDatarArrayList = new ArrayList<>();
        bangunDatarArrayList.add(new Data("Persegi", "Pesagi", R.drawable.persegi1, R.raw.persegi, "Persegi dalam bahasa lampung disebut 'Pesagi'. Persegi merupakan bangun datar yang keempat sisinya sama panjang dan keempat sudutnya siku-siku (90°)."));
        bangunDatarArrayList.add(new Data("Persegi Panjang", "Pesagi Tijang", R.drawable.persegipanjang1, R.raw.persegipanjang, "Persegi panjang dalam bahasa lampung disebut 'Pesagi tijang'. Persegi merupakan bangun datar yang kedua sisi sejejar sama panjang dan keempat sudutnya siku-siku (90°)."));
        bangunDatarArrayList.add(new Data("Trapesium", "Trapesium", R.drawable.trapesium1, R.raw.trapesium, "Trapesium dalam bahasa lampung disebut 'Trapesium'. Trapesium merupakan bangun datar yang dibentuk oleh empat buah rusuk yang dua di antaranya saling sejajar namun tidak sama panjang."));
        bangunDatarArrayList.add(new Data("Segitiga", "Segitigo", R.drawable.segitiga1, R.raw.segitiga, "Segitiga dalam bahasa lampung disebut 'Segitigo'. Segitiga merupakan bangun datar yang dibatasi oleh tiga buah sisi dan mempunyai tiga buah titik sudut."));
        bangunDatarArrayList.add(new Data("Segilima", "Segilemou", R.drawable.segilima1, R.raw.segilima, "Segilima dalam bahasa lampung disebut 'Segilemou'. Segilima merupakan bangun datar yang dibatasi oleh lima buah sisi dan mempunyai lima buah titik sudut."));
        bangunDatarArrayList.add(new Data("Lingkaran", "Lekeghan", R.drawable.lingkaran1, R.raw.lingkaran, "Lingkaran dalam bahasa lampung disebut 'Lekeghan'. Lingkaran merupakan bangun datar yang bentuknya bulat penuh. Sehingga panjang diameter akan selalu sama di setiap sisinya."));
        bangunDatarArrayList.add(new Data("Oval", "Bujeu", R.drawable.oval1, R.raw.oval, "Oval dalam bahasa lampung disebut 'Bujeu'. Oval merupakan bangun datar yang bentuknya lonjong. Hal ini membuat panjang diameternya akan berbeda karena ada sisi yang lebih panjang dan lebih pendek."));
        bangunDatarArrayList.add(new Data("Jajar Genjang", "Jajar Genjang", R.drawable.jajarjenjang1, R.raw.jajargenjang, "Jajar genjang dalam bahasa lampung disebut 'Jajar genjang'. Jajar genjang merupakan bangun datar yang tersusun oleh 2 pasang sisi yang sama panjang dan sejajar serta mempunyai 2 pasang sudut yang sama besar (pasangan sudut lancip dan pasangan sudut tumpul)."));
        bangunDatarArrayList.add(new Data("Belah Ketupat", "Belah Ketupat", R.drawable.belahketupat1, R.raw.belahketupat, "Belah Ketupat dalam bahasa lampung disebut 'Belah ketupat'. Belah ketupat merupakan segi empat yang dibentuk oleh dua gabungan segitiga samakaki yang diimpitkan pada alasnya."));
    }
}