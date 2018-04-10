package com.example.mca.recepieapp;

import android.content.Intent;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Recepie extends AppCompatActivity {
    ListView list;
    int[] image= new int[]{R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10};
    String[]Name={"ALOO GOBI",
                  "BUTTER CHICKEN",
                  "DAL MAKHANI",
                  "GULAB JAMUN",
                  "BIRIYANI",
                  "JALEBI",
                  "PAYASAM",
                  "TANDOORI CHICKEN",
                  "BARFI",
                 "CARROT HALWA",
                 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);
       list=(ListView)findViewById(R.id.listview);
       CustomAdapter CustomAdapter=new CustomAdapter();
       list.setAdapter(CustomAdapter);
       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int Position, long id) {
               Intent intent = new Intent(getApplicationContext(),RecepieActivity.class);
            intent.putExtra("Position",Position);
            startActivity(intent);
           }
       });

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup parent){
           View view1=getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView) view1.findViewById(R.id.imageView);
            TextView textView=view1.findViewById(R.id.TextView);
            imageView.setImageResource(image[position]);
            textView.setText(Name[position]);
            return view1;
        }
    }
}
