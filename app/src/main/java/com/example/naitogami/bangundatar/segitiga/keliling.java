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



public class keliling extends Fragment {
    public static keliling newInstance(){
        return new keliling();
    }
    EditText a, b, c;
    Button hitung;
    TextView hasil;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.keliling_segitiga, container, false);

        a = (EditText)rootView.findViewById(R.id.txtSisi1);
        b = (EditText)rootView.findViewById(R.id.txtSisi2);
        c = (EditText) rootView.findViewById(R.id.txtSisi3) ;
        hitung = (Button) rootView.findViewById(R.id.btnHitung);
        hasil = (TextView)rootView.findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi jika alas dan tinggi tidak diisi
                if (a.length()==0 && b.length()==0 && c.length()==0) {
                    Toast.makeText(getActivity(),"Semua sisi harus diisi",Toast.LENGTH_LONG).show();
                }
                else if (a.length()==0){
                    Toast.makeText(getActivity(),"Sisi 1 harus diisi",Toast.LENGTH_LONG) .show();
                }else if (b.length()==0){
                    Toast.makeText(getActivity(),"Sisi 2 harus diisi",Toast.LENGTH_LONG) .show();
                }else if (c.length()==0){
                    Toast.makeText(getActivity(),"Sisi 3 harus diisi",Toast.LENGTH_LONG) .show();
                }else{
                    String isiSisi1 = a.getText().toString();
                    String isiSisi2 = b.getText().toString();
                    String isiSisi3 = c.getText().toString();
                    double a = Double.parseDouble(isiSisi1);
                    double b = Double.parseDouble(isiSisi2);
                    double c = Double.parseDouble(isiSisi3);
                    double hs = KelilingSegitiga(a,b,c);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
            public double KelilingSegitiga(double a, double b, double c){return a+b+c;}
        });


        return rootView;
    }


}

