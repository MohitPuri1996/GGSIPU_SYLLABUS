package com.example.lenovo.json_parsing;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class thirdsem extends semchoice implements AdapterView.OnItemClickListener  {
String csesub[]={"Applied Mathematics","FOUNDATION OF COMPUTER SCIENCE","SWITCHING THEORY AND LOGIC DESIGN","CIRCUITS & SYSTEMS","DATA STRUCTURES","COMPUTER GRAPHICS & MULTIMEDIA"};
    String itsub[]={"Applied Mathematics","FOUNDATION OF COMPUTER SCIENCE","SWITCHING THEORY AND LOGIC DESIGN","CIRCUITS & SYSTEMS","DATA STRUCTURES","COMPUTER GRAPHICS & MULTIMEDIA"};
    String ecesub[]={"Applied Mathematics  ","Analog Electronics ","Switching Theory and Logic Design","Data Structures ","Electronic Instruments and Measurements " ,"Signals and Systems "};
    String eeesub[]={"Applied Mathematics","Analog Electronics","Materials in Electrical Systems","Circuits and Systems","Data Structures ","Electrical Machine"};
    String data;   ArrayAdapter<String> adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdsem);



        data=getIntent().getExtras().getString("stream");
        lv= (ListView) findViewById(R.id.listView4);
        if(data.equals("cse")) {
             adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, csesub){

                 @Override
                 public View getView(int position, View convertView, ViewGroup parent){
                     // Get the current item from ListView
                     View view = super.getView(position,convertView,parent);
                     TextView tv = (TextView) view.findViewById(android.R.id.text1);

                     lv.setDivider(new ColorDrawable(Color.parseColor("#FF1744")));
                     // Set the text color of TextView (ListView Item)
                     lv.setDividerHeight(2);
                     //    tv.setTypeface(fontstyle);


                     // Set the text size 25 dip for ListView each item
                     tv.setTextSize(Typeface.ITALIC,20);


                     // Set the text color of TextView (ListView Item)
                     tv.setTextColor(Color.BLACK);

                     return view;
                 }
             };
        }
        else  if(data.equals("it")) {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itsub){

                @Override
                public View getView(int position, View convertView, ViewGroup parent){
                    // Get the current item from ListView
                    View view = super.getView(position,convertView,parent);
                    TextView tv = (TextView) view.findViewById(android.R.id.text1);


                    //    tv.setTypeface(fontstyle);


                    // Set the text size 25 dip for ListView each item
                    tv.setTextSize(Typeface.ITALIC,20);


                    // Set the text color of TextView (ListView Item)
                    tv.setTextColor(Color.BLACK);

                    return view;
                }
            };
        }
        else  if(data.equals("ece")) {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ecesub){

                @Override
                public View getView(int position, View convertView, ViewGroup parent){
                    // Get the current item from ListView
                    View view = super.getView(position,convertView,parent);
                    TextView tv = (TextView) view.findViewById(android.R.id.text1);


                    //    tv.setTypeface(fontstyle);


                    // Set the text size 25 dip for ListView each item
                    tv.setTextSize(Typeface.ITALIC,20);


                    // Set the text color of TextView (ListView Item)
                    tv.setTextColor(Color.BLACK);

                    return view;
                }
            };
        }
        else  if(data.equals("eee")) {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, eeesub){

                @Override
                public View getView(int position, View convertView, ViewGroup parent){
                    // Get the current item from ListView
                    View view = super.getView(position,convertView,parent);
                    TextView tv = (TextView) view.findViewById(android.R.id.text1);


                    //    tv.setTypeface(fontstyle);


                    // Set the text size 25 dip for ListView each item
                    tv.setTextSize(Typeface.ITALIC,20);


                    // Set the text color of TextView (ListView Item)
                    tv.setTextColor(Color.BLACK);

                    return view;
                }
            };
        }
        lv.setAdapter(adapter);
        lv.setOnItemClickListener((AdapterView.OnItemClickListener) this);
           }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        view.startAnimation(animation1);


        if(data.equals("cse")){
       Intent i=new Intent(getApplicationContext(),working.class);
        i.putExtra("position",position);
        i.putExtra("stream","cse");
        i.putExtra("link","https://api.myjson.com/bins/3z4ho");
        startActivity(i);
    }
      else  if(data.equals("it")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("stream","it");
        i.putExtra("position",position);

            i.putExtra("link","https://api.myjson.com/bins/584v0");
        startActivity(i);
        }
       else if(data.equals("ece")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("stream","ece");
        i.putExtra("position",position);
            i.putExtra("link","https://api.myjson.com/bins/5cf6k");
        startActivity(i);
        }
       else if(data.equals("eee")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("stream","eee");
        i.putExtra("position",position);
            i.putExtra("link","https://api.myjson.com/bins/1p8oj");
        startActivity(i);
        }




    }
}
