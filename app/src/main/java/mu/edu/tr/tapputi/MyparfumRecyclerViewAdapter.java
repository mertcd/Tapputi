package mu.edu.tr.tapputi;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

/**
 *
 * TODO: Replace the implementation with code for your data type.
 */
public class MyparfumRecyclerViewAdapter extends RecyclerView.Adapter<MyparfumRecyclerViewAdapter.ViewHolder> {

    private final List<Parfum> mValues;
    private parfumFragment.OnParfumSelected listener;
    int selectedIndex;

    public MyparfumRecyclerViewAdapter(List<Parfum> items, parfumFragment.OnParfumSelected listener) {
        mValues = items;
        this.listener= listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_parfum, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).getBrand());
        holder.mContentView.setText(mValues.get(position).getName());
        holder.image.setImageBitmap(BitmapFactory.decodeResource(holder.mView.getResources(),mValues.get(position).getImage()));
        holder.priceTl.setText( mValues.get(position).getPriceTl());
        holder.priceDolar.setText( mValues.get(position).getPriceDolar());
        holder.priceEuro.setText( mValues.get(position).getPriceEuro());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (  listener!= null){
                listener.parfumSelected (holder.mItem);
                // Redraw the old selection and the new
                notifyItemChanged(selectedIndex);
                selectedIndex = holder.getLayoutPosition();
                notifyItemChanged(selectedIndex);
            }
            }
        });
        holder.itemView.setBackgroundColor(selectedIndex == position ? Color.GREEN :
                Color.TRANSPARENT);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public final TextView priceTl;
        public final ImageView image;
        public Parfum mItem;
        public final TextView priceEuro;
        public final TextView priceDolar;
        public final Button button;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.brand);
            mContentView = (TextView) view.findViewById(R.id.content);
            image = (ImageView) view.findViewById(R.id.parfumImage);
            priceTl =  (TextView) view.findViewById(R.id.priceTl);
            priceEuro = (TextView) view.findViewById(R.id.priceEuro);
            priceDolar = (TextView) view.findViewById(R.id.priceDolar);
            button= (Button) view.findViewById(R.id.button);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}