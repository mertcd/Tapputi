package mu.edu.tr.tapputi;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Parfum implements Parcelable {
    private String brand;
    private String name;
    private String priceTl;
    private String priceDolar;
    private String priceEuro;
    private short rating;
    private List<String> comments;
    private int image;
    private Boolean isInCart;
    private Boolean isInFavorite;

    public Parfum(String brand, String name, String priceTl, String priceDolar, String priceEuro, short rating, int image, Boolean isInCart, Boolean isInFavorite) {
        this.brand = brand;
        this.name = name;
        this.priceTl = priceTl;
        this.priceDolar = priceDolar;
        this.priceEuro = priceEuro;
        this.rating = rating;
        this.isInCart = isInCart;
        this.isInFavorite = isInFavorite;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceTl() {
        return priceTl;
    }

    public void setPriceTl(String priceTl) {
        this.priceTl = priceTl;
    }

    public String getPriceDolar() {
        return priceDolar;
    }

    public void setPriceDolar(String priceDolar) {
        this.priceDolar = priceDolar;
    }

    public String getPriceEuro() {
        return priceEuro;
    }

    public void setPriceEuro(String priceEuro) {
        this.priceEuro = priceEuro;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.brand);
        dest.writeString(this.name);
        dest.writeString(this.priceTl);
        dest.writeString(this.priceDolar);
        dest.writeString(this.priceEuro);
        dest.writeInt(this.rating);
        dest.writeStringList(this.comments);
        dest.writeInt(this.image);
        dest.writeValue(this.isInCart);
        dest.writeValue(this.isInFavorite);
    }

    protected Parfum(Parcel in) {
        this.brand = in.readString();
        this.name = in.readString();
        this.priceTl = in.readString();
        this.priceDolar = in.readString();
        this.priceEuro = in.readString();
        this.rating = (short) in.readInt();
        this.comments = in.createStringArrayList();
        this.image = in.readInt();
        this.isInCart = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isInFavorite = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Creator<Parfum> CREATOR = new Creator<Parfum>() {
        @Override
        public Parfum createFromParcel(Parcel source) {
            return new Parfum(source);
        }

        @Override
        public Parfum[] newArray(int size) {
            return new Parfum[size];
        }
    };
}