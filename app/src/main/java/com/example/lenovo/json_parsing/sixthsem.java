package com.example.lenovo.json_parsing;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
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

public class sixthsem extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String csesub[]={"Compiler Design","Operating Systems","Computer Networks ","Web Engineering ","Artificial Intelligence ","Microprocessor and Microcontroller"};
    String itsub[]={"Compiler Design","Operating Systems","Data Communication and Networks  ","Web Engineering ","Artificial Intelligence ","Microprocessor and Microcontroller"};
    String ecesub[]={"Microwave Engineering","Information Theory and Coding","Digital Signal Processing ","VLSI Design ","Data Communication and Network","Antenna and Wave Propagation"};
    String eeesub[]={"Power System ","Utilization of Electrical Energy and Electric Traction ","Digital Signal Processing","VLSI Design","Microprocessor and Microcontroller","Power Station Practice"};
    ArrayAdapter<String> adapter;
    ListView lv;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthsem);
         data=getIntent().getExtras().getString("stream");
        if(data.equals("cse")){
            adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,csesub){

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
            };}
       else if(data.equals("it")){
            adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itsub){

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
            };}
       else if(data.equals("ece")){
            adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ecesub){

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
            };}
       else if(data.equals("eee")){
            adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,eeesub){

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
            };}

lv= (ListView) findViewById(R.id.sixthsemlv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        view.startAnimation(animation1);


        if(data.equals("cse")){

            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/3ou4c");
            i.putExtra("position",position);
            i.putExtra("subname",view.toString());
            startActivity(i);

        }
        else if(data.equals("it")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/319cs");
            i.putExtra("position",position);
            i.putExtra("subname",view.toString());
            startActivity(i);
        }
        else if(data.equals("ece")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/zir7");
            i.putExtra("position",position);
            i.putExtra("subname",view.toString());
            startActivity(i);
        }
        else if(data.equals("eee")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("subname",view.toString());
            i.putExtra("link","https://api.myjson.com/bins/4zc83");
            i.putExtra("position",position);
            startActivity(i);
        }
    }
}
