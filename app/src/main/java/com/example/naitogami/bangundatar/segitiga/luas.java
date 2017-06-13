package com.example.naitogami.bangundatar.segitiga;

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



public class luas extends Fragment {
    public static luas newInstance(){
        return new luas();
    }
    EditText a,t;
    Button hitung;
    TextView hasil;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.luas_segitiga, container, false);

        a = (EditText)rootView.findViewById(R.id.alas);
        t = (EditText)rootView.findViewById(R.id.tinggi);
        hitung = (Button) rootView.findViewById(R.id.btnHasil);
        hasil = (TextView)rootView.findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi jika alas dan tinggi tidak diisi
                if (a.length()==0 && t.length()==0){
                    Toast.makeText(getActivity(),"Alas dan Tinggi harus diisi",Toast.LENGTH_LONG).show();
                }
                else if (a.length()==0){
                    Toast.makeText(getActivity(),"Alas harus diisi",Toast.LENGTH_LONG) .show();
                }else if (t.length()==0){
                    Toast.makeText(getActivity(),"Tinggi harus diisi",Toast.LENGTH_LONG) .show();
                }else{
                    String isiAlas = a.getText().toString();
                    String isiTinggi = t.getText().toString();
                    double a = Double.parseDouble(isiAlas);
                    double t = Double.parseDouble(isiTinggi);
                    double hs = LuasSegitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
            public double LuasSegitiga(double a, double t){return a*t/2;}
        });


        return rootView;
    }


}

