package com.example.binusezyfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.binusezyfood.Activity.ItemsActivity.DrinksActivity;
import com.example.binusezyfood.R;

public class OrderActivity extends AppCompatActivity {
    public static final String QUANTITY = "com.example.binusezyfood.QUANTITY";
    public static final String NAME = "com.example.binusezyfood.NAME";
    public static final String PRICE = "com.example.binusezyfood.PRICE";

    public String name = "";
    public String price = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String item = intent.getStringExtra(DrinksActivity.ITEM);

        TextView textView = findViewById(R.id.textViewItem);
        textView.setText(item);

        TextView textPrice = findViewById(R.id.textViewPrice);

        ImageView imageView = findViewById(R.id.imageViewItem);

        if(item.equals("Mineral Water")){
            imageView.setImageResource(R.drawable.icons8_bottle_of_water_96);
            name = item;
            textPrice.setText("Rp8.000");
            price = "8000";
        }else if(item.equals("Apple Juice")){
            imageView.setImageResource(R.drawable.icons8_apple_96);
            name = item;
            textPrice.setText("Rp12.000");
            price = "12000";
        }else if(item.equals("Mango Juice")){
            imageView.setImageResource(R.drawable.icons8_pear_96);
            name = item;
            textPrice.setText("Rp14.000");
            price = "14000";
        }else if(item.equals("Avocado Juice")){
            imageView.setImageResource(R.drawable.icons8_avocado_96);
            name = item;
            textPrice.setText("Rp18.000");
            price = "18000";
        }else if(item.equals("French Fries")){
            imageView.setImageResource(R.drawable.icons8_french_fries_96);
            name = item;
            textPrice.setText("Rp20.000");
            price = "20000";
        }else if(item.equals("Doughnut")){
            imageView.setImageResource(R.drawable.icons8_doughnut_96);
            name = item;
            textPrice.setText("Rp15.000");
            price = "15000";
        }else if(item.equals("Pretzel")){
            imageView.setImageResource(R.drawable.icons8_pretzel_96);
            name = item;
            textPrice.setText("Rp18.000");
            price = "18000";
        }else if(item.equals("Cinnamon Roll")){
            imageView.setImageResource(R.drawable.icons8_cinnamon_roll_96);
            name = item;
            textPrice.setText("Rp22.000");
            price = "22000";
        }else if(item.equals("Hamburger")){
            imageView.setImageResource(R.drawable.icons8_hamburger_96);
            name = item;
            textPrice.setText("Rp40.000");
            price = "40000";
        }else if(item.equals("Sandwich")){
            imageView.setImageResource(R.drawable.icons8_sandwich_96);
            name = item;
            textPrice.setText("Rp35.000");
            price = "35000";
        }else if(item.equals("Fried Egg")){
            imageView.setImageResource(R.drawable.icons8_fry_96);
            name = item;
            textPrice.setText("Rp21.000");
            price = "21000";
        }else if(item.equals("Taco")){
            imageView.setImageResource(R.drawable.icons8_taco_96);
            name = item;
            textPrice.setText("Rp33.000");
            price = "33000";
        }
    }

    public void clickAddToCart(View view) {
        Intent intent = new Intent(this, CartActivity.class);
        EditText editText = findViewById(R.id.editTextQuantity);
        String quantity = editText.getText().toString();

        if(quantity.isEmpty()){
            Toast toast = Toast.makeText(getApplicationContext(),"Please insert at least 1 item",Toast.LENGTH_SHORT);toast.show();
        }else if(Integer.parseInt(quantity) < 1) {
            Toast toast = Toast.makeText(getApplicationContext(),"Please insert at least 1 item",Toast.LENGTH_SHORT);toast.show();
        } else {
            intent.putExtra(NAME, name);
            intent.putExtra(QUANTITY, quantity);
            intent.putExtra(PRICE, price);

            startActivity(intent);
        }
    }

    public void clickCart(View view) {
        Intent intent = new Intent(this, CartActivity.class);
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