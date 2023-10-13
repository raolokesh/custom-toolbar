package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);

//        step 1
        setSupportActionBar(toolbar);

        // step 2

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("My Toolbar");


//        toolbar.setTitle("My Toolbar");
        toolbar.setSubtitle("Sub title");




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();
        if(itemid==R.id.opt_new){
            Toast.makeText(this,"click on the option_new button",Toast.LENGTH_SHORT).show();
        } else if (itemid == R.id.opt_open) {
            Toast.makeText(this, "click on the option_open button", Toast.LENGTH_SHORT).show();

        }else if(itemid == R.id.opt_save) {
            Toast.makeText(this, "Click on the option_save button", Toast.LENGTH_SHORT).show();
        }

        else if(itemid == android.R.id.home) {
            super.onBackPressed();
        }
            return super.onOptionsItemSelected(item);
        }
}