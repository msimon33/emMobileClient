package com.example.mutatsiyo.emmobileclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Startpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
    }

    public  void onCreateNewModelClick (View v){
        startActivity(new Intent(getApplicationContext(), ProjectMenu.class));
    }
    public  void onOpenExistingModelClick (View v){
        startActivity(new Intent(getApplicationContext(), ModelMenu.class));
    }
    public  void onOptionsClick (View v){
        startActivity(new Intent(getApplicationContext(), Options.class));
    }

    public  void onImportFilesClick (View v){
        startActivity(new Intent(getApplicationContext(), Workpage.class));
    }

}
