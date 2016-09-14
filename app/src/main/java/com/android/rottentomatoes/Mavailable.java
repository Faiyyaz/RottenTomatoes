package com.android.rottentomatoes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Faiyyaz on 27-Aug-16.
 */
public class Mavailable extends AppCompatActivity {

    ListView list;
    Context context;
    ArrayList movies;

    String[] moviename = {
            "Wazir",
            "Airlift",
            "Kya Kool Hain Hum 3",
            "Mastizaade",
            "Sanam Teri Kasam",
            "Fitoor",
            "Sanam Re",
            "Neerja",
            "Tere Bin Laden:Dead or Alive",
            "Jai Gangaajal",
            "Teraa Surroor",
            "Kapoor & Sons",
            "Rocky Handsome",
            "Ki & Ka",
            "Fan",
            "Baaghi",
            "One Night Stand",
            "1920 London",
            "Azhar",
            "Sarbjit",
            "Housefull3",
            "Do Lafzon Ki Kahani",
            "Te3n",
            "Udta Punjab",
            "Junooniyat"
    };
    Integer[] imageId = {
            R.mipmap.wazir,
            R.mipmap.airlift,
            R.mipmap.kk3,
            R.mipmap.mastizaade,
            R.mipmap.stk,
            R.mipmap.fitoor,
            R.mipmap.sanamre,
            R.mipmap.neerja,
            R.mipmap.tbl,
            R.mipmap.jg,
            R.mipmap.ts,
            R.mipmap.ks,
            R.mipmap.rh,
            R.mipmap.kk,
            R.mipmap.fan,
            R.mipmap.baaghi,
            R.mipmap.ons,
            R.mipmap.london,
            R.mipmap.azhar,
            R.mipmap.sarbjit,
            R.mipmap.hf3,
            R.mipmap.dlkk,
            R.mipmap.teen,
            R.mipmap.udta,
            R.mipmap.junooniyat
    };
    String[] date = {
            "08-01-2016",
            "22-01-2016",
            "22-01-2016",
            "29-01-2016",
            "05-02-2016",
            "12-02-2016",
            "19-02-2016",
            "26-02-2016",
            "04-03-2016",
            "11-03-2016",
            "18-03-2016",
            "25-03-2016",
            "01-04-2016",
            "15-04-2016",
            "29-04-2016",
            "06-05-2016",
            "06-05-2016",
            "13-05-2016",
            "20-05-2016",
            "03-06-2016",
            "10-06-2016",
            "10-06-2016",
            "17-06-2016",
            "24-06-2016"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mavailable);
        context=this;
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(new CustomList(this,moviename,imageId,date));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent main = new Intent(Mavailable.this, M2016.class);
                startActivity(main);
            }
        });
    }
}