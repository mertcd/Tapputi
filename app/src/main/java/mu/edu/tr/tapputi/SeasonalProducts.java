package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SeasonalProducts extends AppCompatActivity {

    ImageView homeButton;
    ImageView filterButton;
    ImageView favoriteButton;
    ImageView cartButton;
    ImageView accountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasonal_products);
        homeButton = findViewById(R.id.homeButton);
        filterButton = findViewById(R.id.filterButton);
        favoriteButton = findViewById(R.id.favoritesButton);
        cartButton = findViewById(R.id.cartButton);
        accountButton = findViewById(R.id.accountButton);
    }
    public void butons() {

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeasonalProducts.this, MainActivity.class);
                startActivity(intent);
            }


        });

        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeasonalProducts.this, discoverTab.class);
                startActivity(intent);
            }


        });
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeasonalProducts.this, favoritesTab.class);
                startActivity(intent);
            }


        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeasonalProducts.this, Account.class);
                startActivity(intent);
            }


        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeasonalProducts.this, shoppingCartTab.class);
                startActivity(intent);
            }


        });
    }
}