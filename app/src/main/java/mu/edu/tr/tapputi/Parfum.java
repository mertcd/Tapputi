package mu.edu.tr.tapputi;

import android.graphics.Bitmap;

import java.util.List;

public class Parfum {
    private String brand;
    private String name;
    private float priceTl;
    private float priceDolar;
    private float priceEuro;
    private short rating;
    private List<String> comments;
    private Bitmap image;

    public Parfum(String brand, String name, float priceTl, float priceDolar, float priceEuro, short rating, Bitmap image) {
        this.brand = brand;
        this.name = name;
        this.priceTl = priceTl;
        this.priceDolar = priceDolar;
        this.priceEuro = priceEuro;
        this.rating = rating;

        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
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

    public float getPriceTl() {
        return priceTl;
    }

    public void setPriceTl(float priceTl) {
        this.priceTl = priceTl;
    }

    public float getPriceDolar() {
        return priceDolar;
    }

    public void setPriceDolar(float priceDolar) {
        this.priceDolar = priceDolar;
    }

    public float getPriceEuro() {
        return priceEuro;
    }

    public void setPriceEuro(float priceEuro) {
        this.priceEuro = priceEuro;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }


    }


