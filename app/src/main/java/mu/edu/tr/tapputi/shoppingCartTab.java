
package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class shoppingCartTab extends AppCompatActivity {

    ImageView homeButton;
    ImageView filterButton;
    ImageView favoriteButton;
    ImageView cartButton;
    ImageView accountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart_tab);
        homeButton = findViewById(R.id.homeButton);
        filterButton = findViewById(R.id.filterButton);
        favoriteButton = findViewById(R.id.favoritesButton);
        cartButton = findViewById(R.id.cartButton);
        accountButton = findViewById(R.id.accountButton);

        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, discoverTab.class);
                startActivity(intent);
            }


        });
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, favoritesTab.class);
                startActivity(intent);
            }


        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, MainActivity.class);
                startActivity(intent);
            }


        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, Account.class);
                startActivity(intent);
            }


        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, discoverTab.class);
                startActivity(intent);
            }


        });
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, favoritesTab.class);
                startActivity(intent);
            }


        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, MainActivity.class);
                startActivity(intent);
            }


        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoppingCartTab.this, Account.class);
                startActivity(intent);
            }


        });

    }
}