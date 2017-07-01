package com.example.ronald.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost tab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab1 = (TabHost) findViewById(android.R.id.tabhost);//Debido a que su identificación esta en android
        tab1.setup();
        TabHost.TabSpec spec;
        /*PRIMERA REPETICION*/
        spec = tab1.newTabSpec("tab1");
        spec.setIndicator("Inicio");
        spec.setContent(R.id.tab1);
        tab1.addTab(spec);
        /*SEGUNDA REPETICION*/
        spec = tab1.newTabSpec("tab2");
        spec.setIndicator("", getResources().getDrawable(android.R.drawable.ic_dialog_map));
        spec.setContent(R.id.tab2);
        tab1.addTab(spec);
        /*TERCERA REPETICION*/
        spec = tab1.newTabSpec("tab3");
        spec.setIndicator("", getResources().getDrawable(android.R.drawable.ic_dialog_email));
        spec.setContent(R.id.tab3);
        tab1.addTab(spec);

        tab1.setCurrentTab(2);
    }


}
