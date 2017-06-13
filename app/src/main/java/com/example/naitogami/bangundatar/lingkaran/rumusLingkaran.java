package com.example.naitogami.bangundatar.lingkaran;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naitogami.bangundatar.R;



public class rumusLingkaran extends Fragment {
    public static rumusLingkaran newInstance(){
        return new rumusLingkaran();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rumus_lingkaran, container, false);

        return rootView;
    }
}
