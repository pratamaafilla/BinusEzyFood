package com.example.binusezyfood.Activity.ItemsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.binusezyfood.Activity.CartActivity;
import com.example.binusezyfood.Activity.HistoryActivity;
import com.example.binusezyfood.Activity.MainActivity;
import com.example.binusezyfood.Activity.OrderActivity;
import com.example.binusezyfood.R;

public class SnacksActivity extends AppCompatActivity {
    public static final String ITEM = "com.example.binusezyfood.ITEM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
    }

    public void clickCart(View view) {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }

    public void clickFrenchFries(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String item = "French Fries";
        intent.putExtra(ITEM, item);
        startActivity(intent);
    }

    public void clickDoughnut(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String item = "Doughnut";
        intent.putExtra(ITEM, item);
        startActivity(intent);
    }

    public void clickPretzel(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String item = "Pretzel";
        intent.putExtra(ITEM, item);
        startActivity(intent);
    }

    public void clickCinnamonRoll(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String item = "Cinnamon Roll";
        intent.putExtra(ITEM, item);
        startActivity(intent);
    }

    public void clickHistory(View view){
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}