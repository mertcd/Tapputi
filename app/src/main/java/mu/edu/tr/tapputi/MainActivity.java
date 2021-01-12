package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

public class MainActivity extends AppCompatActivity implements parfumFragment.OnParfumSelected {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void movieSelected(Parfum parfume) {
        Intent intent = new Intent(this, product.class);
        intent.putExtra("parfüm", (Parcelable) parfume);
        startActivity(intent);
    }
}