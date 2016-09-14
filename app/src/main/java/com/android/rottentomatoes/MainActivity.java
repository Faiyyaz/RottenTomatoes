package com.android.rottentomatoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Faiyyaz on 24-Aug-16.
 */
public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private Button m2016,m2015,mavailable,addamovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        m2016=(Button)findViewById(R.id.m2016);
        m2015=(Button)findViewById(R.id.m2015);
        mavailable=(Button)findViewById(R.id.mavailable);
        addamovie=(Button)findViewById(R.id.addmovie);
        setSupportActionBar(toolbar);
        initNavigationDrawer();

        m2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m2016=new Intent(MainActivity.this,M2016.class);
                startActivity(m2016);
            }
        });

        m2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m2016=new Intent(MainActivity.this,M2015.class);
                startActivity(m2016);
            }
        });

        mavailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m2016=new Intent(MainActivity.this,Mavailable.class);
                startActivity(m2016);
            }
        });

        addamovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m2016=new Intent(MainActivity.this,AddMovie.class);
                startActivity(m2016);
            }
        });

    }
    public void initNavigationDrawer() {

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id){
                    case R.id.settings:
                        Intent settings=new Intent(MainActivity.this,SettingsActivity.class);
                        startActivity(settings);
                        break;
                    case R.id.about:
                        Intent about=new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(about);
                        break;
                }
                return true;
            }
        });
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){

            @Override
            public void onDrawerClosed(View v){
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

}
