package com.example.naitogami.bangundatar.persegiPanjang;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    final Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = rumus.newInstance();
                break;
            case 1:
                fragment = luas.newInstance();
                break;
            case 2:
                fragment = keliling.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Rumus";
            case 1:
                return "Luas";
            case 2:
                return "Keliling";

        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
