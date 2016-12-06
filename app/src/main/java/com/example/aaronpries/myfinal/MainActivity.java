package com.example.aaronpries.myfinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends AppCompatActivity {

//    ImageButton myFbButton;
//    ImageButton myCalButton;
//    ImageButton myGroupButton;
//    ImageButton myListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        ImageButton myCalButton = (ImageButton) findViewById(R.id.cal_button);
        ImageButton myFbButton = (ImageButton) findViewById(R.id.fb_button);
        ImageButton myGroupButton = (ImageButton) findViewById(R.id.group_button);
        ImageButton myListButton = (ImageButton) findViewById(R.id.list_button);
        myCalButton.setOnClickListener((View.OnClickListener) this);
        myGroupButton.setOnClickListener((View.OnClickListener) this);
        myListButton.setOnClickListener((View.OnClickListener) this);}

    public void onClick(View v) {

        int viedId = v.getId();

        switch(viedId ){
            case R.id.fb_button:
                Intent intentLoadFBActivity = new Intent(MainActivity.this, FBActivity.class);
                startActivity(intentLoadFBActivity);
                break;
            case R.id.cal_button:
                Intent intentLoadCalActivity = new Intent(MainActivity.this, CalActivity.class);
                startActivity(intentLoadCalActivity);
                break;
            case R.id.group_button:
                //your implementation here
                break;

        }





//        myFbButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadFBActivity = new Intent(MainActivity.this, FBActivity.class);
//                startActivity(intentLoadFBActivity);
//            }
//        });


//        myFbButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadCalActivity = new Intent(MainActivity.this, CalActivity.class);
//                startActivity(intentLoadCalActivity);
//            }
//        });
//
//
//        myFbButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadNewActivity = new Intent(MainActivity.this, GroupActivity.class);
//                startActivity(intentLoadNewActivity);
//            }
//        });
//
//
//        myFbButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadNewActivity = new Intent(MainActivity.this, ListActivity.class);
//                startActivity(intentLoadNewActivity);
//            }
//        });


    }


}
