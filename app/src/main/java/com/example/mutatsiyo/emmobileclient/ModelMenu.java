package com.example.mutatsiyo.emmobileclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class ModelMenu extends AppCompatActivity {

    ListView list;
    String[] web = {
            "Diagram 1 UML",
            "Model1234 EPK",
            "Model42 ERM",

    };
    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_menu);

        MenuListView adapter = new
                MenuListView(ModelMenu.this, web, imageId);
        list = (ListView) findViewById(R.id.model_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(ModelMenu.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), Workpage.class));

            }
        });
    }
}
