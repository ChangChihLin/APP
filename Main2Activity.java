package com.example.motor40;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    TextView t_data1;
    TextView t_data2;
    TextView t_data3;
    TextView t_data4;
    TextView t_data5;
    TextView t_data6;
    TextView t_data7;

    Button btn1;
    TextView t_oil;
    TextView t_gearoil;
    TextView t_air;
    TextView t_tires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Main1Activity.class);
                startActivity(intent);
                Main2Activity.this.finish();
            }
        });


        btn = (Button) findViewById(R.id.sent1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(Main2Activity.this,Main3Activity.class);
                startActivityForResult(i,0);
            }
        });

        btn = (Button) findViewById(R.id.sent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent();
                j.setClass(Main2Activity.this,Main4Activity.class);
                startActivityForResult(j,1);
            }
        });

    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        if (requestCode == 0) {
            if (resultCode == 101) {
                Bundle b = data.getExtras();
                String str1 = b.getString("data1_level");
                String str2 = b.getString("data2_level");
                String str3 = b.getString("data3_level");
                String str4 = b.getString("data4_level");
                String str5 = b.getString("data5_level");
                String str6 = b.getString("data6_level");
                String str7 = b.getString("data7_level");

                t_data1 = (TextView) findViewById(R.id.data1);
                t_data2 = (TextView) findViewById(R.id.data2);
                t_data3 = (TextView) findViewById(R.id.data3);
                t_data4 = (TextView) findViewById(R.id.data4);
                t_data5 = (TextView) findViewById(R.id.data5);
                t_data6 = (TextView) findViewById(R.id.data6);
                t_data7 = (TextView) findViewById(R.id.data7);

                t_data1.setText(str1);
                t_data2.setText(str2);
                t_data3.setText(str3);
                t_data4.setText(str4);
                t_data5.setText(str5);
                t_data6.setText(str6);
                t_data7.setText(str7);

            }
        }



        if (requestCode == 1) {
            if (resultCode == 102) {
                Bundle b = data.getExtras();
                String str1 = b.getString("oil");
                String str2 = b.getString("gearoil");
                String str3 = b.getString("air");
                String str4 = b.getString("tires");

                t_oil = (TextView) findViewById(R.id.oil);
                t_gearoil = (TextView) findViewById(R.id.gearoil);
                t_air = (TextView) findViewById(R.id.air);
                t_tires = (TextView) findViewById(R.id.tires);


                t_oil.setText(str1);
                t_gearoil.setText(str2);
                t_air.setText(str3);
                t_tires.setText(str4);
            }
        }
    }
}
