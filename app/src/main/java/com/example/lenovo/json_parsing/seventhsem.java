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
import android.widget.Toast;

public class seventhsem extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String csesub[]={"Information  Security ","Software Testing  and Quality Assurance","Wireless Communication ","Complexity Theory ","Intellectual Property Rights ","Embedded Systems","Data Mining  and Business Intelligence","Advanced Computer Architecture ","Natural Language Processing","Digital Signal Processing","Simulation and Modelling","Advanced DBMS ","Parallel Computing","Advanced Computer Networks ","Control System","Sociology and Elements of Indian History for Engineers"};
    String itsub[]={"Advanced Computer Networks ","Cryptography and Network  Security","Wireless Communication","Embedded Systems ","Optoelectronics and Optical Communication ","Cloud Computing","Distributed Databases ","Semantic Web Technologies ","Software Testing  ","Digital Signal Processing ",".NET and C#  Programming","Enterprise Computing in Java ","System and Network Administration ","Grid Computing  ","Advanced Database Administration ","Probablistic Graphical Models","Sociology and Elements of Indian History for Engineers"};
    String ecesub[]={"Embedded Systems","Optoelectronics and Optical Communication","Wireless Communication","Advanced DSP","Introduction to MEMS","Advanced VLSI Design","Biomedical Instrumentation","PLC and SCADA Systems","Power Electronics","RF Devices and Circuits","Database Management System","Renewable Energy Resources","Radar and Navigation ","Project Management","Economics for Engineers","Grid Computing","Parallel Computing","Sociology and Elements of Indian History for Engineers "};
    String eeesub[]={"Electrical Drives ","Advanced Control Systems","EHV  AC and HVDC Transmissions","Renewable Energy Resources","Power Distribution System ","Telemetry and Data Acquisition System","PLC and SCADA Systems","Mechatronics","High Voltage Engineering","Optoelectronics and Optical Communication","Database Management Systems","Biomedical Instrumentation ","Digital System Design","Power line Carrier Communication","Electrical Machines Design","Sociology and Elements of Indian History for Engineers"};

    ListView lv;
String data;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventhsem);
        lv= (ListView) findViewById(R.id.listView6);
        data=getIntent().getExtras().getString("stream");
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
        if(data.equals("cse")) {
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
       else if(data.equals("it")) {
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
       else if(data.equals("ece")) {
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
       else if(data.equals("eee")) {
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
