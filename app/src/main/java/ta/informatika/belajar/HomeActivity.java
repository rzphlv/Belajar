package ta.informatika.belajar;
//Class halaman awal aplikasi
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    //berpindah halaman ke BangunActivity
    public void bangundatar(View view){
        Intent intent = new Intent(getApplicationContext(), BangunActivity.class);
        startActivity(intent);
    }
    //berpindah halaman ke AngkaActivity
    public void pengenalanangka(View view){
        Intent intent = new Intent(getApplicationContext(), AngkaActivity.class);
        startActivity(intent);
    }
    //berpindah halaman ke WarnaActivity
    public void pengenalanwarna(View view){
        Intent intent = new Intent(getApplicationContext(), WarnaActivity.class);
        startActivity(intent);
    }
    //berpindah halaman ke KendaraanActivity
    public void kendaraan(View view){
        Intent intent = new Intent(getApplicationContext(), KendaraanActivity.class);
        startActivity(intent);
    }
}