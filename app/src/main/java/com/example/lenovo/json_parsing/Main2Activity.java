package com.example.lenovo.json_parsing;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Main2Activity extends firstsem implements AdapterView.OnItemClickListener {

String p;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         tx= (TextView) findViewById(R.id.textView);
        //tx.setText(getIntent().getExtras().getString("name"));
        String turn=getIntent().getExtras().getString("turn");
        if(turn.equals("first")) {
            new JSONTASK().execute("https://api.myjson.com/bins/4w5j8");
        }
        if(turn.equals("second")){
            new JSONTASK().execute("https://api.myjson.com/bins/z8nb");
        }

    }


    public class JSONTASK extends AsyncTask<String, String, String>{
        int p;
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuffer buff = null;

        @Override
        protected String doInBackground(String... params) {



                try {
                    URL url = new URL(params[0]);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.connect();

//            Toast.makeText(getApplicationContext(), "connected", Toast.LENGTH_SHORT).show();
                    InputStream str = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(str));
                    buff = new StringBuffer();
                    String line = "Maths";
                    while ((line = reader.readLine()) != null) {
                        buff.append(line);
                        //  Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT).show();
                    }
                    String finaljson=buff.toString();
                    JSONObject parentobject=new JSONObject(finaljson);
                    JSONArray parentarray=parentobject.getJSONArray("Subject ");
                    p=getIntent().getExtras().getInt("position");
                    JSONObject finalobject=parentarray.getJSONObject(p);
                    String sname=finalobject.getString("sname");
                    String year=finalobject.getString("year");
                    String name1=finalobject.getString("name1");
                    String unit1=finalobject.getString("unit1");
                    String name2=finalobject.getString("name2");
                    String unit2=finalobject.getString("unit2");
                    String name3=finalobject.getString("name3");
                    String unit3=finalobject.getString("unit3");
                    String name4=finalobject.getString("name4");
                    String unit4=finalobject.getString("unit4");


                    return sname+"\n"+year+"\n"+name1+"\n"+unit1+"\n"+name2+"\n"+unit2+"\n"+name3+"\n"+unit3+"\n"+name4+"\n"+unit4;
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                } finally {
                    if (connection != null) connection.disconnect();
                    if (reader != null) try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


                return null;   }/*
        if(i==1) Toast.makeText(getApplicationContext(),"mohit",Toast.LENGTH_SHORT).show();

        if(i==2) Toast.makeText(getApplicationContext(),"mohit puri",Toast.LENGTH_SHORT).show();*/



            @Override
            protected void onPostExecute(String s){
                super.onPostExecute(s);
               // Toast.makeText(getApplicationContext(), "mohit puri", Toast.LENGTH_SHORT).show();
                //Intent ij = new Intent(getApplicationContext(), Main2Activity.class);
                if (s == null) tx.setText("no internet connectioon");

                else tx.setText(s);



            }

            }

}