package com.example.naitogami.bangundatar.persegiPanjang;

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



public class keliling extends Fragment {
    public static keliling newInstance(){
        return new keliling();
    }
    EditText p,l;
    Button hitung;
    TextView hasil;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.keliling_persegi_panjang, container, false);

        p = (EditText)rootView.findViewById(R.id.panjang);
        l = (EditText)rootView.findViewById(R.id.lebar);
        hitung = (Button) rootView.findViewById(R.id.button);
        hasil = (TextView)rootView.findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi jika panjang dan lebar tidak diisi
                if (p.length()==0 && l.length()==0){
                    Toast.makeText(getActivity(),"Panang dan Lebar harus diisi",Toast.LENGTH_LONG).show();
                }
                else if (p.length()==0){
                    Toast.makeText(getActivity(),"Panjang harus diisi",Toast.LENGTH_LONG) .show();
                }else if (l.length()==0){
                    Toast.makeText(getActivity(),"Lebar harus diisi",Toast.LENGTH_LONG) .show();
                }else{
                    String isiPanjang = p.getText().toString();
                    String isiLebar = l.getText().toString();
                    double p = Double.parseDouble(isiPanjang);
                    double l = Double.parseDouble(isiLebar);
                    double hs = KelilingPersegiPanjang(p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
            public double KelilingPersegiPanjang(double p, double l){return p+p+l+l;}
        });


        return rootView;
    }


}

