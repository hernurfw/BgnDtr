package com.example.naitogami.bangundatar.segitiga;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naitogami.bangundatar.R;


public class rumus extends Fragment {
    public static rumus newInstance(){
        return new rumus();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rumus_segitiga, container, false);

        return rootView;
    }
}
