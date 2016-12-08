package com.example.aaronpries.myfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GreekActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greek);

        Button submit=(Button) findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }
}
