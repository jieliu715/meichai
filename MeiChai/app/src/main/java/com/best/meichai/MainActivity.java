package com.best.meichai;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class Faxian extends AppCompatActivity implements View.OnClickListener{
    RadioButton at,at2,share,location;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        at=(RadioButton)findViewById(R.id.at);
        at2=(RadioButton)findViewById(R.id.at2);
        share=(RadioButton)findViewById(R.id.share);
        location=(RadioButton)findViewById(R.id.location);

        location.setChecked(true);
        at.setOnClickListener(this);
        at2.setOnClickListener(this);
        share.setOnClickListener(this);
        location.setOnClickListener(this);

//        fm=getSupportFragmentManager();
        if(savedInstanceState==null){
            FragmentTransaction ftt=fm.beginTransaction();
            BrandFragent bf=new BrandFragent();
            ftt.add(R.id.fragment_parent,bf,"location");
//            toolbar.setTitle("品牌故事");
            ftt.commit();
        }
    }

    @Override
    public void onClick(View v) {

    }
}
