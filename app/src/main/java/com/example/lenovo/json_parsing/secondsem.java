package com.example.lenovo.json_parsing;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class secondsem extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String subject[]={"Maths","Physics","Electronic Devices"," INTRODUCTION TO PROGRAMMING","ENGINEERING MECHANICS","COMMUNICATION SKILLS","Environmental Science"};

    ListView lv;
    Typeface fontstyle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondsem);
//        fontstyle = Typeface.createFromAsset(getAssets(), "fonts/BRUSHSCI.ttf");
        lv= (ListView) findViewById(R.id.listView3);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subject){

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
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        view.startAnimation(animation1);


        Intent i=new Intent(this,Main2Activity.class);
        String selectedItem = (String) parent.getItemAtPosition(position);
        Toast.makeText(this,"Your selected fruit is : " + selectedItem,Toast.LENGTH_SHORT);
        i.putExtra("turn","second");
        i.putExtra("position",position);
        i.putExtra("link","https://api.myjson.com/bins/2rfd5");

        startActivity(i);





    }
}
