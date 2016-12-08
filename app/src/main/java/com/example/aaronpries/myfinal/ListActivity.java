package com.example.aaronpries.myfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;


public class ListActivity extends android.app.ListActivity {


    public final static String EXTRA_MESSAGE = "com.example.ListViewTest.MESSAGE";

    private String[] lv_arr = {"Outdoor Picnic", "Geeks Who Drink", "Fire Spinning Friday", "Sigma Chi Rush", "Cooking For Two", "Thursday Night Triva", "Hiking Weekend","Bonfire at The UC", "Young Republicans Event", "Card Night at Deans", "Videogame Marathon in Michener", "Volunteering at Soup Kitchen", "Movie in The Pool", "Meet Adam Carolla Night", "Parents Weekend", "Learn to Code 101", "Breaking Bad Marathon"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

String[] events = {"Outdoor Picnic", "Geeks Who Drink", "Fire Spinning Friday", "Sigma Chi Rush", "Cooking For Two", "Thursday Night Triva", "Hiking Weekend","Bonfire at The UC", "Young Republicans Event", "Card Night at Deans", "Videogame Marathon in Michener", "Volunteering at Soup Kitchen", "Movie in The Pool", "Meet Adam Carolla Night", "Parents Weekend", "Learn to Code 101", "Breaking Bad Marathon"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, events);
        getListView().setAdapter(adapter);





    }


}
