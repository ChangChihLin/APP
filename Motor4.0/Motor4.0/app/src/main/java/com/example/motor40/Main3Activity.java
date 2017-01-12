package com.example.motor40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button sent_btn;
    EditText set_data1;
    EditText set_data2;
    EditText set_data3;
    EditText set_data4;
    EditText set_data5;
    EditText set_data6;
    EditText set_data7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        sent_btn = (Button) findViewById(R.id.sent1);
        sent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set_data1 = (EditText) findViewById(R.id.editText3);
                String temp1 = set_data1.getText().toString();
                set_data2 = (EditText) findViewById(R.id.editText4);
                String temp2 = set_data2.getText().toString();
                set_data3 = (EditText) findViewById(R.id.editText5);
                String temp3 = set_data3.getText().toString();
                set_data4 = (EditText) findViewById(R.id.editText6);
                String temp4 = set_data4.getText().toString();
                set_data5 = (EditText) findViewById(R.id.editText7);
                String temp5 = set_data5.getText().toString();
                set_data6 = (EditText) findViewById(R.id.editText8);
                String temp6 = set_data6.getText().toString();
                set_data7 = (EditText) findViewById(R.id.editText9);
                String temp7 = set_data7.getText().toString();
                Intent i = new Intent();
                Bundle b = new Bundle();

                b.putString("data1_level", temp1);
                b.putString("data2_level", temp2);
                b.putString("data3_level", temp3);
                b.putString("data4_level", temp4);
                b.putString("data5_level", temp5);
                b.putString("data6_level", temp6);
                b.putString("data7_level", temp7);

                i.putExtras(b);
                setResult(101, i);
                finish();
            }
        });
    }
}
