package info.androidhive.shimmer;

/**
 * Created by ravi on 18/01/18.
 */

public class Recipe {
    int id;
    String name;
    String description;
    double price;
    String thumbnail;
    String chef;
    String timestamp;

    public Recipe() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getChef() {
        return chef;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
