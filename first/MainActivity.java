package com.example.tigran.first;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        TabLayout tab = (TabLayout) findViewById(R.id.tab_layout);
        Fragment[] list = {new Fragment1(), new Fragment2(), new BlankFragment()};
        String[] strArr = {"Tab 1", "Tab 2", "Tab 3"};
        pager.setAdapter(new MyAdapter(getSupportFragmentManager(), list, strArr));
        tab.setupWithViewPager(pager);


    }
}
