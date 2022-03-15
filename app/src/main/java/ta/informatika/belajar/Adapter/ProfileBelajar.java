package ta.informatika.belajar.Adapter;
/*
Activity untuk keterangan / profile di angka, bangun datar, kendaraan, warna
 */
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ta.informatika.belajar.R;

public class ProfileBelajar extends AppCompatActivity {
    private TextView judul, judul1, keterangan;
    private ImageView img, audio;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_belajar);

        //inisialisasi awal, variabel bisa di assign nilai apapun asalkan sesuai dengan tipenya
        String indo = "Judul";
        String ket = "keterangan";
        int im = 1;
        int suara = 1;

        //find id sesuai dengan nama variabel di layout
        judul = findViewById(R.id.judulbangun);
        judul1 = findViewById(R.id.judulbangun1);
        keterangan = findViewById(R.id.judulbangun2);
        img = findViewById(R.id.gambarbangun);
        audio = findViewById(R.id.playsuara);

        //assign nilai text, gambar dan suara sesuai dengan referensi dengan key yang telah dibuat di awal (AngkaActivity, dll)
        Bundle extras = getIntent().getExtras(); //extras berisi nilai yang telah di assign pada activity awal (AngkaActivity, dll)
        if (extras != null){
            indo = extras.getString("getindo");
            ket = extras.getString("getket");
            im = extras.getInt("getimg");
            suara = extras.getInt("getSuara");
        }

        //menset text dan gambar sesuai dengan data dimana dia berasal
        judul.setText(indo);
        judul1.setText(indo);
        keterangan.setText(ket);
        img.setBackgroundResource(im);

        //ketika button audio di klik maka akan membunyikan suara sesuai dengan datanya
        mediaPlayer = MediaPlayer.create(this, suara);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }
}