package mu.edu.tr.tapputi;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements parfumFragment.OnParfumSelected {
    public static List<Parfum> parfums = new ArrayList<>();
    public static ArrayAdapter<String> adapter;
    public static List<Parfum> SHOPPING_CART = new ArrayList<>();

    Button btn_burc;
    Button btn_shouldperfume;
    Button btn_seasonal;
    ImageButton btn_aboutus;
    ImageView homeButton;
    ImageView filterButton;
    ImageView favoriteButton;
    ImageView cartButton;
    ImageView accountButton;
    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeButton = findViewById(R.id.homeButton);
        filterButton = findViewById(R.id.filterButton);
        favoriteButton = findViewById(R.id.favoritesButton);
        cartButton = findViewById(R.id.cartButton);
        accountButton = findViewById(R.id.accountButton);
        firestore = FirebaseFirestore.getInstance();



    getDataFirestore();

    butons();
    }

    public void getDataFirestore(){
        CollectionReference collectionReference = firestore.collection("parfumes");
        collectionReference.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null){
                    Toast.makeText(getApplicationContext(),error.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
                }
                if(value!=null){
                    for (DocumentSnapshot snapshot : value.getDocuments()){
                        Map<String,Object> data = snapshot.getData();

                        String name = (String) data.get("name");
                        String brand = (String) data.get("brand");
                        String priceTl = (String) data.get("priceTl");
                        String priceDolar = (String) data.get("priceDolar");
                        String priceEu = (String) data.get("priceEu");
                        String image = (String) data.get("Image");


                        parfums.add(new Parfum(brand,name,priceTl,priceDolar,priceEu, (short) 4,image,true,true));
                    }
                }
            }
        }) ;

    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
             /*   if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }*/
                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void parfumSelected(Parfum parfume) {
        Intent intent = new Intent(this, detailsActivity.class);
        intent.putExtra("parfum", parfume);
        startActivity(intent);
    }

    public  void butons(){
        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, discoverTab.class);
                startActivity(intent);
            }


        });
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, favoritesTab.class);
                startActivity(intent);
            }


        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Account.class);
                startActivity(intent);
            }


        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, shoppingCartTab.class);
                startActivity(intent);
            }


        });

        btn_burc = (Button) findViewById(R.id.btn_burc);
        btn_burc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, burc.class);
                startActivity(intent);
            }


        });
        btn_shouldperfume = (Button) findViewById(R.id.btn_shouldperfume);
        btn_shouldperfume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShouldPerfume.class);
                startActivity(intent);
            }


        });
        btn_seasonal = (Button) findViewById(R.id.btn_seasonal);
        btn_seasonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SeasonalProducts.class);
                startActivity(intent);
            }


        });
        btn_aboutus = (ImageButton) findViewById(R.id.btn_aboutus);
        btn_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
            }


        });

    }
}
