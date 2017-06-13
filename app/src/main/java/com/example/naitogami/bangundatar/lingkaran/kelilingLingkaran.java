package com.example.naitogami.bangundatar.lingkaran;

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



public class kelilingLingkaran extends Fragment {
    public static kelilingLingkaran newInstance(){
        return new kelilingLingkaran();
    }
    EditText r;
    Button hitung;
    TextView hasil;
    Double phi = 3.14;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.keliling_lingkaran, container, false);

        r = (EditText)rootView.findViewById(R.id.txtJari);
        hitung = (Button) rootView.findViewById(R.id.btnHitung);
        hasil = (TextView)rootView.findViewById(R.id.txtHasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi jika lebar tidak diisi
                if (r.length()==0){
                    Toast.makeText(getActivity(),"Jari-jari harus diisi",Toast.LENGTH_LONG).show();
                }
                else{
                    String isiJari = r.getText().toString();
                    double r = Double.parseDouble(isiJari);
                    double hs = KelilingLingkaran(r);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
            public double KelilingLingkaran(double r){return 2*phi*r;}
        });


        return rootView;
    }


}

