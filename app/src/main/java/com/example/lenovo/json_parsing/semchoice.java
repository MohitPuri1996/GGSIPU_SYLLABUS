package com.example.lenovo.json_parsing;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class semchoice extends LaunchScreeen {
static int x,se;
    Button odd,even;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emchoice);
        x=getIntent().getExtras().getInt("button");

        odd= (Button) findViewById(R.id.odd);
        even= (Button) findViewById(R.id.even);


        odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                odd.startAnimation(animation1);

                if(x==1){

                    Intent i=new Intent(getApplicationContext(),firstsem.class);
                    Toast.makeText(getApplicationContext(),"Ist SEM",Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
                if(x==2){se=0;
                    //Toast.makeText(getApplicationContext(),"3rd sem",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),stream.class);
                    i.putExtra("button",x);
                    i.putExtra("sem",se);
                    i.putExtra("text","3rd sem");
                    startActivity(i);
                }
                if(x==3){
                    se=0;
                 //   Toast.makeText(getApplicationContext(),"5th sem",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),stream.class);
                    i.putExtra("button",x);
                    i.putExtra("sem",se);
                    i.putExtra("text","5th sem");
                    startActivity(i);
                }
                if(x==4){
                    se=0;
                 //   Toast.makeText(getApplicationContext(),"7th sem",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),stream.class);
                    i.putExtra("button",x);
                    i.putExtra("sem",se);
                    i.putExtra("text","7th sem");
                    startActivity(i);
                }}
        });

even.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        even.startAnimation(animation1);

        if(x==1){
            Intent i=new Intent(getApplicationContext(),secondsem.class);
            Toast.makeText(getApplicationContext(),"IInd SEM",Toast.LENGTH_SHORT).show();
            startActivity(i);
        }
        if(x==2){se=1;
           // Toast.makeText(getApplicationContext(),"4th sem",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),stream.class);
            i.putExtra("button",x);
            i.putExtra("sem",se);
            i.putExtra("text","4th sem");
            startActivity(i);
        }
        if(x==3){
         //   Toast.makeText(getApplicationContext(),"6th sem",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),stream.class);
            se=1;
            i.putExtra("button",x);
            i.putExtra("sem",se);
            i.putExtra("text","6th sem");
            startActivity(i);
        }
        if(x==4){
          //  Toast.makeText(getApplicationContext(),"8th sem",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),stream.class);
            i.putExtra("button",x);
            i.putExtra("sem",se);
            i.putExtra("text","8th sem");
            startActivity(i);
        }
    }
});
    }
}
