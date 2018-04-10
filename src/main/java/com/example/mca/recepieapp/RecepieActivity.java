package com.example.mca.recepieapp;;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.jar.Attributes;

public class RecepieActivity extends AppCompatActivity {
    int Position=0;

    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recepie2);
            Intent intent=getIntent();
           Position=intent.getExtras().getInt("Position");
           final CustomAdapter adapter=new CustomAdapter(this);
           final ImageView imageView=(ImageView)findViewById(R.id.imageView1);
           final TextView Recepie_Name=(TextView)findViewById(R.id.Recepie_Name);
        final TextView Description=(TextView)findViewById(R.id.Description);
           imageView.setImageResource(adapter.image[Position]);

        Recepie_Name.setText(adapter.Recepie_Name[Position]);
        Description.setText(adapter.Ingredients[Position]);

        Button btnnext=(Button)findViewById(R.id.button);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos=Position+1;
                imageView.setImageResource(adapter.image[pos]);
                Recepie_Name.setText("RecepieName:"+adapter.Recepie_Name[pos]);
                Description.setText("Ingredients:"+adapter.Ingredients[pos]);
                Position +=1;
                /*if (!(position>=adapter.getCount()-1)) {

                    position += 1;
                }else {

                    position -= 1;
                }*/
            }
        });

    }
}
