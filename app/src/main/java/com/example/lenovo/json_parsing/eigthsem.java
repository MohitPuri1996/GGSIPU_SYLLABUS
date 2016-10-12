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

public class eigthsem extends AppCompatActivity implements AdapterView.OnItemClickListener{
String data;
    String csesub[]={"Mobile Computing ","Machine Learning","Human Values and Professional Ethics ","Digital Image Processing ","Microelectronics ","Ad Hoc and Sensor Networks","Soft Computing ","VLSI Design ","Distributed Systems ","Object Oriented Software Engineering ","Computer Vision","Software Project Management ","Human Computer Interaction","Information Theory and Coding   ","Web Intelligence and Big Data","Service Oriented Architecture ","Multiagent Systems ","Principles of Programming Languages  ","Telecommunication Networks","Science and Engineering"};
    String itsub[]={"Mobile Computing ","Ad hoc and Sensor Networks ","Human Values and Professional Ethics","Big Data Analytics","Social Network Analysis","Soft Computing ","Bio Informatics","Web Application development using .NET ","VLSI Design ","Information Theory and Coding ","Human Computer Interaction","Digital Image Processing  ","Next Generation Networks ","GPS and GIS ","Satellite Communication ","E-Commerce and M-Commerce ","Distributed Systems "};
    String ecesub[]={"Human Values and Professional Ethics","Satellite Communication ","Ad Hoc and Sensor Networks ","Consumer Electronics","Digital Image Processing","ASIC Design","Mobile Computing","Introduction to Nanotechnology","GPS and GIS","Adaptive Signal Processing ","Robotics","Computer Graphics and Multimedia","Next Generation Networks"};
    String eeesub[]={"Neuro-Fuzzy Systems","Power System Operation and Control","Human Values and Professional Ethics","Application of Power Electronics to Power Systems ","Digital Image Processing","Reliability Engineering and Application to Power System " ,"Electrical Machine","Electrical Energy Conservation","Power System Analysis and Stability","Electrical System Design","Embedded Systems","Data Communication and Networks","Object Oriented Programming Using C++","Power Plant Instrumentation","Intelligent and Smart Instrumentation ","Digital Communication","Electrical Power Quality"};

    ListView lv; ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigthsem);
        data=getIntent().getExtras().getString("link");
        lv= (ListView) findViewById(R.id.listView7);
        data=getIntent().getExtras().getString("stream");

        if(data.equals("cse")){
            adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,csesub){

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
         else  if(data.equals("it")){
            adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itsub){

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
        else  if(data.equals("ece")){
              adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ecesub){

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
        else  if(data.equals("eee")){
            adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,eeesub){

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
            i.putExtra("link","https://api.myjson.com/bins/3wbwj");
            i.putExtra("position",position);
            startActivity(i);

        }
        else if(data.equals("it")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/55c9v");
            i.putExtra("position",position);
            startActivity(i);
        }
        else if(data.equals("ece")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/4fu2b");
            i.putExtra("position",position);
            startActivity(i);
        }
        else if(data.equals("eee")){
            Intent i=new Intent(this,working2.class);
            i.putExtra("link","https://api.myjson.com/bins/3qbur");
            i.putExtra("position",position);
            startActivity(i);
        }
    }
}
