package com.example.lenovo.json_parsing;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
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

public class working2 extends AppCompatActivity {
String subname;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working2);
subname=getIntent().getExtras().getString("subname");
        String link=getIntent().getExtras().getString("link");
tx= (TextView) findViewById(R.id.tx);
        new JSONTask().execute(link);
    }
    public class JSONTask extends AsyncTask<String,String,String>{
HttpURLConnection connection=null;
        BufferedReader reader=null;
StringBuffer buff=null;
int p;
        @Override
        protected String doInBackground(String... params) {
            try {
                URL url=new URL(params[0]);
                connection= (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream stream=connection.getInputStream();
                reader=new BufferedReader(new InputStreamReader(stream));
                String line = "Maths";
                buff=new StringBuffer();
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
            }finally {
                if(connection!=null)
                    connection.disconnect();
                if(reader!=null)
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }


            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //Toast.makeText(getApplicationContext(), "YOU SELECTED "+subname.toString()      .toUpperCase(), Toast.LENGTH_SHORT).show();
            //Intent ij = new Intent(getApplicationContext(), Main2Activity.class);
            if (s == null) tx.setText("no internet connectioon");

            else tx.setText(s);
        }
    }

}
