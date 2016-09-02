package com.example.tigran.first;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private String[] arr;
    private Fragment[] fragArr;


    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);

    }

    public MyAdapter(FragmentManager fm, Fragment[] list, String[] strArr) {
        super(fm);
        this.arr = strArr;
        this.fragArr = list;
    }

    @Override
    public int getCount() {
        return fragArr.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragArr[position];
    }


}
