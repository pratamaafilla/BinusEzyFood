package com.example.binusezyfood.HistoryDetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.binusezyfood.Items.Item;
import com.example.binusezyfood.R;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class AdapterHistoryDetail extends BaseAdapter {
    Context context;
    ArrayList<Item> item = new ArrayList<>();

    Item tempItem;

    public AdapterHistoryDetail(Context context, ArrayList<Item> item) {
        this.context = context;
        this.item = item;
    }
    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_receipt, parent,false);
        }

        tempItem = (Item) getItem(position);

        TextView tvName = (TextView)convertView.findViewById(R.id.textViewItemList);
        TextView tvNumber = (TextView)convertView.findViewById(R.id.textViewQuantity);
        TextView tvPrice = (TextView)convertView.findViewById(R.id.textViewPrice) ;
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewList);

        String quantity = String.valueOf(tempItem.getQuantity());

        double harga = tempItem.getPrice();

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        String price = kursIndonesia.format(harga);

        if(tempItem.getName().equals("Mineral Water")){
            imageView.setImageResource(R.drawable.icons8_bottle_of_water_96);
        }else if(tempItem.getName().equals("Apple Juice")){
            imageView.setImageResource(R.drawable.icons8_apple_96);
        }else if(tempItem.getName().equals("Mango Juice")){
            imageView.setImageResource(R.drawable.icons8_pear_96);
        }else if(tempItem.getName().equals("Avocado Juice")){
            imageView.setImageResource(R.drawable.icons8_avocado_96);
        }else if(tempItem.getName().equals("French Fries")){
            imageView.setImageResource(R.drawable.icons8_french_fries_96);
        }else if(tempItem.getName().equals("Doughnut")){
            imageView.setImageResource(R.drawable.icons8_doughnut_96);
        }else if(tempItem.getName().equals("Pretzel")){
            imageView.setImageResource(R.drawable.icons8_pretzel_96);
        }else if(tempItem.getName().equals("Cinnamon Roll")){
            imageView.setImageResource(R.drawable.icons8_cinnamon_roll_96);
        }else if(tempItem.getName().equals("Hamburger")){
            imageView.setImageResource(R.drawable.icons8_hamburger_96);
        }else if(tempItem.getName().equals("Sandwich")){
            imageView.setImageResource(R.drawable.icons8_sandwich_96);
        }else if(tempItem.getName().equals("Fried Egg")){
            imageView.setImageResource(R.drawable.icons8_fry_96);
        }else if(tempItem.getName().equals("Taco")){
            imageView.setImageResource(R.drawable.icons8_taco_96);
        }

        tvName.setText(tempItem.getName());
        tvNumber.setText(quantity);
        tvPrice.setText(price);

        return convertView;
    }
}
