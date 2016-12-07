package com.example.aaronpries.myfinal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class CalActivity extends AppCompatActivity {

    RecyclerView rvItem;
    CardView cvItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rvItem = (RecyclerView)findViewById(R.id.rvItem);
        rvItem.setHasFixedSize(true);
//        cvItem = (CardView)findViewById(R.id.cvItem);

        LinearLayoutManager manager = new LinearLayoutManager(this);

        rvItem.setLayoutManager(manager);

        ArrayList<Item> itemList = generatedDummy();

        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), itemList);

        rvItem.setAdapter(adapter);
    }

    private ArrayList<Item> generatedDummy(){
        ArrayList<Item> list = new ArrayList<>();
        for(int i = 0; i<3; i++){
            Item item = new Item();
            item.id = i;
            item.text = "Bizz " + i;
            item.img = "http://www.hesston.edu/wp-content/uploads/2011/04/hcext_3266.jpg";
            list.add(item);

            item.id = i;
            item.text = "Buzz " + i;
            item.img = "http://www.hesston.edu/wp-content/uploads/2011/04/hcext_3266.jpg";
            list.add(item);

            item.id = i;
            item.text = "BizzBuzz " + i;
            item.img = "http://www.usnews.com/cmsmedia/6e/9c/c3cc022740baa3287a2a1a6c37e2/150824-collegecampus-stock.jpg";
            list.add(item);

        }
        return list;
    }

}
