package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class burc extends AppCompatActivity {

    Button btn_boga;
    Button btn_koc;
    Button btn_akrep;
    Button btn_basak;
    Button btn_aslan;
    Button btn_balik;
    Button btn_ikizler;
    Button btn_kova;
    Button btn_oglak;
    Button btn_terazi;
    Button btn_yay;
    Button btn_yengec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burc);
        btn_koc = (Button) findViewById(R.id.btn_koc);
        btn_koc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , koc.class);
                startActivity(intent);
            }


        });

        btn_boga = (Button) findViewById(R.id.btn_boga);
        btn_boga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , boga.class);
                startActivity(intent);
            }
        });
        btn_akrep = (Button) findViewById(R.id.btn_akrep);
        btn_akrep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , akrep.class);
                startActivity(intent);
            }
        });
        btn_aslan = (Button) findViewById(R.id.btn_aslan);
        btn_aslan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , aslan.class);
                startActivity(intent);
            }
        });
        btn_balik = (Button) findViewById(R.id.btn_balik);
        btn_balik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , balik.class);
                startActivity(intent);
            }
        });
        btn_basak = (Button) findViewById(R.id.btn_basak);
        btn_basak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , basak.class);
                startActivity(intent);
            }
        });
        btn_ikizler = (Button) findViewById(R.id.btn_ikizler);
        btn_ikizler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , ikizler.class);
                startActivity(intent);
            }
        });
        btn_terazi = (Button) findViewById(R.id.btn_terazi);
        btn_terazi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , terazi.class);
                startActivity(intent);
            }
        });
        btn_oglak = (Button) findViewById(R.id.btn_oglak);
        btn_oglak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , oglak.class);
                startActivity(intent);
            }
        });
        btn_yay = (Button) findViewById(R.id.btn_yay);
        btn_yay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , yay.class);
                startActivity(intent);
            }
        });
        btn_yengec = (Button) findViewById(R.id.btn_yengec);
        btn_yengec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , yengec.class);
                startActivity(intent);
            }
        });
        btn_kova = (Button) findViewById(R.id.btn_kova);
        btn_kova.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(burc.this , kova.class);
                startActivity(intent);
            }
        });


    }


}