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

public class fifthsem extends AppCompatActivity implements AdapterView.OnItemClickListener {


    String csesub[]={"Algorithms Design and Analysis ","Software Engineering ","Java Programming ", "Industrial Management","Digital Communication ","Communication Skills for Professionals"};
    String itsub[]={"Algorithms Design and Analysis","Software Engineering","Java Programming ","Industrial Management ","Communication Systems ","Communication Skills for Professionals  "};
    String ecesub[]={"Communication Skills for Professionals","Digital Communication ","Microprocessors and Microcontrollers","Control Systems","Digital System Design","Industrial Management"};
    String eeesub[]={"Communication Skills for Professionals ","Power Electronics","Sensors and Transducers ","Switching Theory and Logic Design","Communication Systems","Industrial Management "};

    ListView lv; String data;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthsem);
        lv= (ListView) findViewById(R.id.fifthsemlv);
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
        if(data.equals("it")){
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
        if(data.equals("ece")){
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
        if(data.equals("eee")){
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


        lv.setAdapter(adapter);
            lv.setOnItemClickListener(this);









    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        view.startAnimation(animation1);

        if(data.equals("cse")){

            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/51x3g");
            i.putExtra("position",position);
            startActivity(i);

        }
        else if(data.equals("it")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/4imng");
            i.putExtra("position",position);
            startActivity(i);
        }
        else if(data.equals("ece")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/2sgzw");
            i.putExtra("position",position);
            startActivity(i);
        }
        else if(data.equals("eee")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/58cks");
            i.putExtra("position",position);
            startActivity(i);
        }

    }
}
