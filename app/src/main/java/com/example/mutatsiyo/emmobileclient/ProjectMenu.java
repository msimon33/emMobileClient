package com.example.mutatsiyo.emmobileclient;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.util.Random;

public class ProjectMenu extends AppCompatActivity {

    ImageButton ib;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_menu);

        ib = (ImageButton) findViewById(R.id.imageButton2);

        rl = (RelativeLayout) findViewById(R.id.activity_project_menu);


        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                rl.setBackgroundColor(getRandomColor());
            }
        });
    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

    }

}
