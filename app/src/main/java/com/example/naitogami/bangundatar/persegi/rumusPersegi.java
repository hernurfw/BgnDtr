package com.example.naitogami.bangundatar.persegi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.naitogami.bangundatar.R;

/**
 * Created by NAITOGAMI on 30/05/2017.
 */

public class rumusPersegi extends Fragment {
    public static rumusPersegi newInstance(){
        return new rumusPersegi();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rumus_persegi, container, false);


        return rootView;
    }
}
