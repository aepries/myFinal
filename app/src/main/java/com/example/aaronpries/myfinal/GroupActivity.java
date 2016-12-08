package com.example.aaronpries.myfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        defineButtons();

    }

    public void defineButtons() {
        findViewById(R.id.btnfire).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnsig).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnfire:
                    Intent Faren = new Intent(GroupActivity.this, FireActivity.class);
                    startActivity(Faren);
                    break;
                case R.id.btnsig:
                    Intent sig = new Intent(GroupActivity.this, GreekActivity.class);
                    startActivity(sig);
                    break;
            }
        }
    };
}
