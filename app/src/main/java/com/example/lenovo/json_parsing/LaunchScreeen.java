package com.example.lenovo.json_parsing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class LaunchScreeen extends AppCompatActivity {
static int no;
    Button first,second,third,fourth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screeen);
        //Toast.makeText(this,"hi",Toast.LENGTH_SHORT).show();
        first= (Button) findViewById(R.id.first);
        second= (Button) findViewById(R.id.second);
        third= (Button) findViewById(R.id.third);
        fourth= (Button) findViewById(R.id.fourth);


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no=1;


                    Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                    first.startAnimation(animation1);


                Intent i=new Intent(getApplicationContext(),semchoice.class);
                i.putExtra("button", no);


                startActivity(i);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no=2;
                Intent i=new Intent(getApplicationContext(),semchoice.class);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                second.startAnimation(animation1);
                i.putExtra("button", no);
                startActivity(i);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no=3;
                Intent i=new Intent(getApplicationContext(),semchoice.class);
                i.putExtra("button", no);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                third.startAnimation(animation1);
                startActivity(i);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no=4;
                Intent i=new Intent(getApplicationContext(),semchoice.class);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                fourth.startAnimation(animation1);
                i.putExtra("button", no);
                startActivity(i);
            }
        });






    }
}
