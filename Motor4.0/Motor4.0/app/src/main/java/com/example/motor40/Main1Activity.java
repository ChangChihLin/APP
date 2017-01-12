package com.example.motor40;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Main1Activity extends Activity {


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Main1Activity.this, Main2Activity.class);
                startActivity(intent);
                Main1Activity.this.finish();
            }
        });

        Button button1 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Main1Activity.this, Main5Activity.class);
                startActivity(intent);
                Main1Activity.this.finish();
            }
        });
    }
}