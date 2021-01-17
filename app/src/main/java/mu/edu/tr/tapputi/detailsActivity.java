package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Parfum parfum = getIntent().getParcelableExtra("parfum");

        FragmentTransaction fts =getSupportFragmentManager().beginTransaction();
        fts.add(R.id.container,DetailsFragment.newInstance(parfum));

        fts.commit();
    }
}