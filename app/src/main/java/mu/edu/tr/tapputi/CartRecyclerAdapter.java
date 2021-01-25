package mu.edu.tr.tapputi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CartRecyclerAdapter  extends RecyclerView.Adapter<CartRecyclerAdapter.ParfumHolder> {
    private ArrayList<Parfum> parfums;

    public CartRecyclerAdapter(ArrayList<Parfum> parfums) {
        this.parfums = parfums;
    }

    @NonNull
    @Override
    public ParfumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_row, parent,false);
        return new ParfumHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParfumHolder holder, int position) {
        holder.name.setText(parfums.get(position).getName());
        holder.brand.setText(parfums.get(position).getBrand());
        holder.price.setText(parfums.get(position).getPriceTl());
        Picasso.get().load(parfums.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return parfums.size();
    }

    class ParfumHolder extends  RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView brand;
        TextView price;
        public ParfumHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.parfumImageCart);
            name = itemView.findViewById(R.id.nameCart);
            brand = itemView.findViewById(R.id.brandCart);
            price = itemView.findViewById(R.id.priceTlCart);
        }
    }

}
