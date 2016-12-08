package com.example.aaronpries.myfinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);



        defineButtons();

    }

    public void defineButtons() {
        findViewById(R.id.fb_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.group_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.list_button).setOnClickListener(buttonClickListener);
    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.fb_button:
                    Intent FB = new Intent(MainActivity.this, FBActivity.class);
                    startActivity(FB);
                    break;
                case R.id.group_button:
                    Intent Group = new Intent(MainActivity.this, GroupActivity.class);
                    startActivity(Group);
                    break;
                case R.id.list_button:
                    Intent List = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(List);
                    break;
            }
        }
    };


}
