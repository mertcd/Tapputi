
package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import static mu.edu.tr.tapputi.MainActivity.SHOPPING_CART;

public class shoppingCartTab extends AppCompatActivity {

    ImageView homeButton;
    ImageView filterButton;
    ImageView favoriteButton;
    ImageView cartButton;
    ImageView accountButton;
    CartRecyclerAdapter cartRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart_tab);
        butons();


        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cartRecyclerAdapter = new CartRecyclerAdapter((ArrayList<Parfum>) SHOPPING_CART);
        recyclerView.setAdapter(cartRecyclerAdapter);

    }

    @Override
    protected void onResume() {
        super.onResume();

        butons();

    }
    void butons(){
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
}