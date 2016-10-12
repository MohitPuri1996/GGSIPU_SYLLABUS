package com.example.lenovo.json_parsing;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class stream extends semchoice implements AdapterView.OnItemClickListener{
String stream[]={"CSE","IT","ECE","EEE"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        lv= (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stream){

            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the current item from ListView
                View view = super.getView(position,convertView,parent);
                TextView tv = (TextView) view.findViewById(android.R.id.text1);


                //    tv.setTypeface(fontstyle);


                // Set the text size 25 dip for ListView each item
                tv.setTextSize(Typeface.ITALIC,20);

                lv.setDivider(new ColorDrawable(Color.parseColor("#d3d3d3")));
                // Set the text color of TextView (ListView Item)
                lv.setDividerHeight(2);
                tv.setTextColor(Color.BLACK);
                return view;
            }
        };
    lv.setAdapter(adapter);
    lv.setOnItemClickListener( this);


       // TextView tx= (TextView) findViewById(R.id.tx);
      //  tx.setText(getIntent().getExtras().getString("text"));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String d=getIntent().getExtras().getString("text");
        if(d.equals("3rd sem")){

        if(position==0){
            Intent i=new Intent(this,thirdsem.class);
            Toast.makeText(getApplicationContext(),"IIIrd SEM CSE",Toast.LENGTH_SHORT).show();
            i.putExtra("stream","cse");
            startActivity(i);
        }
        if(position==1){
            Intent i=new Intent(this,thirdsem.class);
            Toast.makeText(getApplicationContext(),"IIIrd SEM IT",Toast.LENGTH_SHORT).show();
            i.putExtra("stream","it");
            startActivity(i);
        }
        if(position==2){
            Intent i=new Intent(this,thirdsem.class);

            Toast.makeText(getApplicationContext(),"IIIrd SEM ECE",Toast.LENGTH_SHORT).show();
            i.putExtra("stream","ece");

            startActivity(i);
        }
        if(position==3){
            Intent i=new Intent(this,thirdsem.class);

            Toast.makeText(getApplicationContext(),"IIIrd SEM IT",Toast.LENGTH_SHORT).show();
            i.putExtra("stream","eee");
            startActivity(i);
        }}
        if(d.equals("4th sem")){

            if(position==0){
                Intent i=new Intent(this,fourthsem.class);

                Toast.makeText(getApplicationContext(),"IVth SEM CSE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","cse");
                startActivity(i);
            }
            if(position==1){
                Intent i=new Intent(this,fourthsem.class);
                Toast.makeText(getApplicationContext(),"IVth SEM IT",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","it");
                startActivity(i);
            }
            if(position==2){
                Intent i=new Intent(this,fourthsem.class);
                Toast.makeText(getApplicationContext(),"IVth SEM ECE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","ece");
                startActivity(i);
            }
            if(position==3){
                Intent i=new Intent(this,fourthsem.class);
                Toast.makeText(getApplicationContext(),"IVth SEM EEE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","eee");
                startActivity(i);
            }}
        if(d.equals("5th sem")){

            if(position==0){
                Intent i=new Intent(this,fifthsem.class);
                Toast.makeText(getApplicationContext(),"Vth SEM CSE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","cse");
                startActivity(i);
            }
            if(position==1){
                Intent i=new Intent(this,fifthsem.class);
                Toast.makeText(getApplicationContext(),"Vth SEM IT",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","it");
                startActivity(i);
            }
            if(position==2){
                Intent i=new Intent(this,fifthsem.class);
                Toast.makeText(getApplicationContext(),"Vth SEM ECE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","ece");
                startActivity(i);
            }
            if(position==3){
                Intent i=new Intent(this,fifthsem.class);
                Toast.makeText(getApplicationContext(),"Vth SEM EEE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","eee");
                startActivity(i);
            }}
        if(d.equals("6th sem")){

            if(position==0){
                Intent i=new Intent(this,sixthsem.class);
                Toast.makeText(getApplicationContext(),"VIth SEM CSE",Toast.LENGTH_SHORT).show();
                i.putExtra("stream","cse");
                startActivity(i);
            }
            if(position==1){
                Intent i=new Intent(this,sixthsem.class);
                Toast.makeText(getApplicationContext(),"VIth SEM IT",Toast.LENGTH_SHORT).show();

                i.putExtra("stream","it");
                startActivity(i);
            }
            if(position==2){
                Intent i=new Intent(this,sixthsem.class);
                Toast.makeText(getApplicationContext(),"VIth SEM ECE",Toast.LENGTH_SHORT).show();

                i.putExtra("stream","ece");
                startActivity(i);
            }
            if(position==3){
                Intent i=new Intent(this,sixthsem.class);
                Toast.makeText(getApplicationContext(),"VIth SEM EEE",Toast.LENGTH_SHORT).show();

                i.putExtra("stream","eee");
                startActivity(i);
            }}

        if(d.equals("7th sem")){

            if(position==0){
                Intent i=new Intent(this,seventhsem.class);
                Toast.makeText(getApplicationContext(),"VIth SEM CSE",Toast.LENGTH_SHORT).show();

                i.putExtra("stream","cse");
                startActivity(i);
            }
            if(position==1){
                Intent i=new Intent(this,seventhsem.class);
                i.putExtra("stream","it");
                startActivity(i);
            }
            if(position==2){
                Intent i=new Intent(this,seventhsem.class);
                i.putExtra("stream","ece");
                startActivity(i);
            }
            if(position==3){
                Intent i=new Intent(this,seventhsem.class);
                i.putExtra("stream","eee");
                startActivity(i);
            }}

        if(d.equals("8th sem")){

            if(position==0){
                Intent i=new Intent(this,eigthsem.class);
                i.putExtra("stream","cse");
                startActivity(i);
            }
            if(position==1){
                Intent i=new Intent(this,eigthsem.class);
                i.putExtra("stream","it");
                startActivity(i);
            }
            if(position==2){
                Intent i=new Intent(this,eigthsem.class);
                i.putExtra("stream","ece");
                startActivity(i);
            }
            if(position==3){
                Intent i=new Intent(this,eigthsem.class);
                i.putExtra("stream","eee");
                startActivity(i);
            }}


    }
}
