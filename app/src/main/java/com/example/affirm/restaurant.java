package com.example.affirm;

public class restaurant {
    //restaurant_name, restuarant_image, rating
    String restaurantName;
    String restaurantImage;
    String rating;

    public restaurant(String restaurantName, String restaurantImage, String rating){
        this.restaurantName = restaurantName;
        this.restaurantImage = restaurantImage;
        this.rating = rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantImage() {
        return restaurantImage;
    }

    public String getRating() {
        return rating;
    }

}
