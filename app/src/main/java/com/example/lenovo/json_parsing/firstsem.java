package com.example.lenovo.json_parsing;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class firstsem extends Activity implements AdapterView.OnItemClickListener {
static int position=0;
    ListView lv;
    static  String s[] = {"Maths", "HVPE", "Applied Physics-I"," Manufacturing Processes"," Engineering Graphics Lab","Introduction to Computer Systems","Electrical science","Chemistry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, s){

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

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
      view.startAnimation(animation1);
        position=i;
Intent ip=new Intent(this,Main2Activity.class);

        ip.putExtra("turn","first");

        ip.putExtra("position", position);
        startActivity(ip);


    }

}
