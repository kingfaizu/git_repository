package com.mh.faizi.kutte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

/**
 * Created by faizi on 4/9/2018.
 */

public class mainactivity extends AppCompatActivity {
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
       /* ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#CC0000"));
        actionBar.setBackgroundDrawable(colorDrawable);*/
        i1= new Intent(mainactivity.this,MapsActivity.class);

    }

    public void userLogin(View view)
    {
        startActivity(i1);

    }
}
