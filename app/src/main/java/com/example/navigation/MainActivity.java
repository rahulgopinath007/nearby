package com.example.navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    GridView simpleList;
    ArrayList list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        simpleList =(GridView) findViewById(R.id.simpleGridView);
        ArrayList<coursemodel> courseModelArrayList = new ArrayList<coursemodel>();
        courseModelArrayList.add(new coursemodel("ELECTRICIAN", R.drawable.elec));
        courseModelArrayList.add(new coursemodel("PLUMBING",R.drawable.plumberr));
        courseModelArrayList.add(new coursemodel("AC SERVICES", R.drawable.ac));
        courseModelArrayList.add(new coursemodel("PAINTER",R.drawable.paint));
        courseModelArrayList.add(new coursemodel("CARPENTER", R.drawable.carpntr));
        courseModelArrayList.add(new coursemodel("HOME CLEANING",R.drawable.house));
        courseModelArrayList.add(new coursemodel("KITCHEN CLEANING", R.drawable.kitchen));
        courseModelArrayList.add(new coursemodel("TILE WORK",R.drawable.tilework));
        courseModelArrayList.add(new coursemodel("STEAM IRON", R.drawable.steam));
        courseModelArrayList.add(new coursemodel("LAUNDRY",R.drawable.laundy));
        courseModelArrayList.add(new coursemodel("EVENT PHOTO SHOOT", R.drawable.photoshoot));
        courseModelArrayList.add(new coursemodel("MORE",R.drawable.more));




        servicesAdapter adapter = new servicesAdapter(this, courseModelArrayList);
        simpleList.setAdapter(adapter);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
            bottomNavigationView.setSelectedItemId(R.id.home);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId())
                    {
                        case R.id.activerequest:
                            startActivity(new Intent(getApplicationContext(),activerequest.class));
                            overridePendingTransition(0,0);
                            return true;
                        case R.id.home:
                            return true;

                        case R.id.category:
                            startActivity(new Intent(getApplicationContext(),gridview.class) );
                            overridePendingTransition(0,0);
                            return true;
                        case R.id.setting:
                            startActivity(new Intent(getApplicationContext(),settings.class));
                            overridePendingTransition(0,0);
                            return true;
                    }

                    return false;
                }
            });
            //service onclick
            simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    switch (i) {

                        case 11:
                            Intent intent = new Intent(getApplicationContext(),gridview.class);
                            startActivity(intent);
                            return;
                    }
                    //more option intent
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(intent);
                }
            });

    }
}