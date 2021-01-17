package mu.edu.tr.tapputi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static mu.edu.tr.tapputi.MainActivity.parfums;

/**
 * A fragment representing a list of Items.
 */
public class parfumFragment extends Fragment {
    OnParfumSelected listener;

    List<Parfum> shoppingCart = new ArrayList<>();

    public List<Parfum> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Parfum> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public parfumFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static parfumFragment newInstance(int columnCount) {
        parfumFragment fragment = new parfumFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
        int giorgio =  R.drawable.giorgio;

        Parfum blackOpium = new Parfum("Yvis Laurent", "Black Opium", "1000₺", "150$", "120€", (short) 4, giorgio, false, false);
        parfums.add(blackOpium);
        Bitmap calvin = BitmapFactory.decodeResource(this.getResources(), R.drawable.calvin);
        Parfum calvinKlein = new Parfum("Calvin Klein", "Intense Europhia", "1000₺", "150$", "120€", (short) 4, R.drawable.calvin, false, false);
        parfums.add(calvinKlein);
        Bitmap armaniImage = BitmapFactory.decodeResource(this.getResources(), R.drawable.giorgio);
        Parfum aquaDıGıo = new Parfum("Giorgio Armani", "Aqua DI Gio", "1000₺", "150$", "120€", (short) 4,R.drawable.dior , false, false);
        parfums.add(aquaDıGıo);
        parfums.add(calvinKlein);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parfum_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyparfumRecyclerViewAdapter(parfums, listener));
        }
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnParfumSelected) {
            listener = (OnParfumSelected) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface OnParfumSelected {
        void parfumSelected(Parfum parfume);
    }
}