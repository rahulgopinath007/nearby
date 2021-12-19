package com.example.navigation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class gridview extends AppCompatActivity {
    GridView simpleList;
    ArrayList list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        //actionbar
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
        //more services
        courseModelArrayList.add(new coursemodel("TELEVISION", R.drawable.television));
        courseModelArrayList.add(new coursemodel("GAS STOVE", R.drawable.gas_sotve));
        courseModelArrayList.add(new coursemodel("CURTAINS", R.drawable.curtain));
        courseModelArrayList.add(new coursemodel("FLOWER ARRANGEMENT", R.drawable.flower));
        courseModelArrayList.add(new coursemodel("CAR WASHING", R.drawable.carwash));
        courseModelArrayList.add(new coursemodel("SOFA CLEANING", R.drawable.sofa));
        courseModelArrayList.add(new coursemodel("MOBILE REPAIR", R.drawable.mobile));
        courseModelArrayList.add(new coursemodel("LAPTOP REPAIR", R.drawable.laptop));
        courseModelArrayList.add(new coursemodel("DESKTOP/COMPUTER REPAIR", R.drawable.computer));
        courseModelArrayList.add(new coursemodel("CCTV INSTALLATION", R.drawable.cctv));
        courseModelArrayList.add(new coursemodel("DRIVER", R.drawable.driver));
        courseModelArrayList.add(new coursemodel("CAKE DELIVERY", R.drawable.cake));
        courseModelArrayList.add(new coursemodel("PACKER & MOVERS", R.drawable.packer));
        courseModelArrayList.add(new coursemodel("ESSENTIAL DELIVERY", R.drawable.delivery));
        courseModelArrayList.add(new coursemodel("DOCTOR AT HOME", R.drawable.doctor));
        courseModelArrayList.add(new coursemodel("HOME NURSE", R.drawable.homenurse));
        courseModelArrayList.add(new coursemodel("HAIR CUT", R.drawable.hair_cut));
        courseModelArrayList.add(new coursemodel("LADIES SALON", R.drawable.ladysaloon));
        courseModelArrayList.add(new coursemodel("TAXI SERVICE", R.drawable.taxi));
        courseModelArrayList.add(new coursemodel("TAILORING SERVICES", R.drawable.tailoring));
        courseModelArrayList.add(new coursemodel("GRASS CUTTING", R.drawable.grasscutting));
        courseModelArrayList.add(new coursemodel("MASON", R.drawable.mason));
        courseModelArrayList.add(new coursemodel("ADD NEW SERVICES", R.drawable.newservices));

        //adapter
        servicesAdapter adapter = new servicesAdapter(this, courseModelArrayList);
        simpleList.setAdapter(adapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
            }
    }
