package mu.edu.tr.tapputi;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static mu.edu.tr.tapputi.MainActivity.SHOPPING_CART;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String PARFUM = "parfum";
    private Parfum parfum;

    public DetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param parfum parfum .

     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsFragment newInstance(Parfum parfum) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putParcelable(PARFUM, parfum);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            parfum = getArguments().getParcelable(PARFUM);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView txtBrand = (TextView) view.findViewById(R.id.brandParfume);
        txtBrand.setText(parfum.getBrand());

        TextView txtName = (TextView) view.findViewById(R.id.nameParfume);
        txtName.setText(parfum.getName());

        ImageView parfumImage = (ImageView) view.findViewById(R.id.parfumIma);
        Picasso.get().load(parfum.getImage()).into(parfumImage);;

        TextView priceTl = (TextView) view.findViewById(R.id.tlPriceParfume);
        priceTl.setText(parfum.getPriceTl());

        TextView priceEu = (TextView) view.findViewById(R.id.euPriceParfume);
        priceEu.setText(parfum.getPriceEuro());

        Button button = (Button) view.findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SHOPPING_CART.add(parfum);
                System.out.println(parfum.getName());
            }
        });


    }
}