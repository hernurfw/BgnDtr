package com.example.naitogami.bangundatar.persegi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.naitogami.bangundatar.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class kelilingPersegi extends Fragment {
    public static kelilingPersegi newInstance(){
        return new kelilingPersegi();
    }
    EditText s;
    Button hitung;
    TextView hasil;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.keliling_persegi, container, false);

        s = (EditText)rootView.findViewById(R.id.alas);
        hitung = (Button) rootView.findViewById(R.id.button);
        hasil = (TextView)rootView.findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi jika lebar tidak diisi
                if (s.length()==0){
                    Toast.makeText(getActivity(),"Sisi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = KelilingPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
            public double KelilingPersegi(double s){return s*4;}
        });


        return rootView;
    }


}

