package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements parfumFragment.OnParfumSelected {

    Button btn_burc;
    Button btn_shouldperfume;
    Button btn_seasonal;
    ImageButton btn_aboutus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_burc = (Button) findViewById(R.id.btn_burc);
        btn_burc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this , burc.class);
                startActivity(intent);
            }


        });
        btn_shouldperfume = (Button) findViewById(R.id.btn_shouldperfume);
        btn_shouldperfume.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this , ShouldPerfume.class);
                startActivity(intent);
            }


        });
        btn_seasonal = (Button) findViewById(R.id.btn_seasonal);
        btn_seasonal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this , SeasonalProducts.class);
                startActivity(intent);
            }


        });
        btn_aboutus = (ImageButton) findViewById(R.id.btn_aboutus);
        btn_aboutus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this , AboutUs.class);
                startActivity(intent);
            }


        });
    }

    @Override
    public void movieSelected(Parfum parfume) {

    }
}
