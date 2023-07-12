package com.example.affirm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView restaurantName;
    private ImageView restaurantImage;
    private RatingBar rating;
    private Button btn_next;
    private Button btn_previous;


    public void names(List<restaurant> restaurants){
        restaurant restaurant1 = new restaurant("Trail1", "www.trail1.com", "5");
        restaurant restaurant2 = new restaurant("Trail2", "www.trail2.com", "4");
        restaurant restaurant3 = new restaurant("Trail3", "www.trail3.com", "3");

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;

        //Initialize views
        restaurantName = (TextView) findViewById(R.id.restaurantnametv);
        restaurantImage = (ImageView) findViewById(R.id.restaurantimg);
        rating = (RatingBar) findViewById(R.id.ratingBar);
        btn_next = (Button) findViewById(R.id.nextbtn);
        btn_previous = (Button) findViewById(R.id.previousbtn);

        //Next Button action

        //previous button action


    }


}