package com.example.lenovo.json_parsing;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
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


public class fourthsem extends AppCompatActivity implements AdapterView.OnItemClickListener{

String csesub[]={"Applied Mathematics","Computer Organization and Architecture ","Theory of Computation ","Database Management Systems ","Object Oriented Programming ","Communication Systems "};
    String ecesub[]={" Applied Mathematics","COMPUTER ORGANIZATION & ARCHITECTURE"," ANALOG ELECTRONICS","COMMUNICATION SYSTEMS "," ELECTROMAGNETIC FIELD THEORY","NETWORK ANALYSIS AND SYNTHESIS"};
    String itsub[]={"Applied Mathematics","Computer Organization and Architecture","Theory of Computation ","Database Management Systems ","Object Oriented Programming ","Control Systems"};
    String eeesub[]={"ELECTRICAL MACHINES","ANALOG ELECTRONICS","POWER SYSTEM"," ELECTRICAL AND ELECTRONIC MEASURING INSTRUMENTS"," ELECTROMAGNETIC FIELD THEORY","CONTROL SYSTEMS"};
    ArrayAdapter<String> adapter;String stream;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthsem);

            lv= (ListView) findViewById(R.id.listView5);
      stream =getIntent().getExtras().getString("stream");
        if(stream.equals("cse")) {
             adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, csesub){

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
        else if(stream.equals("it")) {
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
       else if(stream.equals("ece")) {
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
        else if(stream.equals("eee")) {
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
        lv.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        view.startAnimation(animation1);

        if(stream.equals("cse")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("link","https://api.myjson.com/bins/2suj3");
            i.putExtra("position",position);
            startActivity(i);
        }
        else
        if(stream.equals("it")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("link","https://api.myjson.com/bins/2mmrj");
            i.putExtra("position",position);
            startActivity(i);
        }

       else if(stream.equals("ece")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("link","https://api.myjson.com/bins/36toz");
            i.putExtra("position",position);
            startActivity(i);
        }

       else if(stream.equals("eee")){
            Intent i=new Intent(getApplicationContext(),working.class);
            i.putExtra("link","https://api.myjson.com/bins/18b43");
            i.putExtra("position",position);
            startActivity(i);
        }








    }
}
