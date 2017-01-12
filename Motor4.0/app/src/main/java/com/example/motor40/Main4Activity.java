package com.example.motor40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main4Activity extends AppCompatActivity {
    Button sent_btn3;
    String oil = "無";
    String gearoil = "無";
    String air = "無";
    String tires = "無";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radiogroup1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedld) {
                switch (checkedld) {
                    case R.id.radio0:
                        oil = "5W-30";
                        break;
                    case R.id.radio1:
                        oil = "15W-40";
                        break;
                    case R.id.radio2:
                        oil = "5W-30";
                        break;
                    case R.id.radio3:
                        oil = "10W-40";
                        break;
                    case R.id.radio4:
                        oil = "無";
                        break;
                }
            }
        });

        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radiogroup2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedld) {
                switch (checkedld) {
                    case R.id.radio5:
                        tires = "登樂";
                        break;
                    case R.id.radio6:
                        tires = "象牌";
                        break;
                    case R.id.radio7:
                        tires = "正新";
                        break;
                    case R.id.radio8:
                        tires = "無";
                        break;
                }
            }
        });
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radiogroup3);
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedld) {
                switch (checkedld) {
                    case R.id.radio9:
                        gearoil = "更換";
                        break;

                }
            }
        });

        RadioGroup rg4 = (RadioGroup) findViewById(R.id.radiogroup4);
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedld) {
                switch (checkedld) {
                    case R.id.radio10:
                        air = "更換";
                        break;

                }
            }
        });




        sent_btn3 = (Button) findViewById(R.id.sent);
        sent_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent();
                Bundle b = new Bundle();

                b.putString("oil",oil);
                b.putString("tires", tires);
                b.putString("gearoil", gearoil);
                b.putString("air",air);




                j.putExtras(b);
                setResult(102, j);
                finish();
            }
        });

    }
}
