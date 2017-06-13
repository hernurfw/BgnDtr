package com.example.naitogami.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.naitogami.bangundatar.lingkaran.lingkaran;
import com.example.naitogami.bangundatar.persegi.persegi;
import com.example.naitogami.bangundatar.persegiPanjang.PersegiPanjang;
import com.example.naitogami.bangundatar.segitiga.segitiga;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        CustomListView adapter = new
                CustomListView(MainActivity.this, menu, imageId);
        //get Id List
        list=(ListView)findViewById(R.id.list);
        //Set adapter to list
        list.setAdapter(adapter);
        //Set ketika salah satu list di pilih(klik)
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) list.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_LONG) .show();

                switch (itemPosition){
                    case 0:
                        Intent a = new Intent(MainActivity.this, persegi.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(MainActivity.this, PersegiPanjang.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent(MainActivity.this, segitiga.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d = new Intent(MainActivity.this, lingkaran.class);
                        startActivity(d);
                        break;
                    case 4:
                        Intent e = new Intent(MainActivity.this, tentang.class);
                        startActivity(e);
                        break;

                }
                //Toast.makeText(MainActivity.this, "You Clicked at " +menu[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }

    ListView list;
    String[] menu = {
            "Persegi",
            "Persegi Panjang",
            "Segitiga",
            "Lingkaran",
            //"Trapesium",
            //"Jajargenjang",
            //"Belah Ketupat",
            "Tentang Aplikasi"
    } ;
    Integer[] imageId = {
            R.drawable.persegi,
            R.drawable.persegipanjang,
            R.drawable.segitiga,
            R.drawable.lingkaran,
           // R.drawable.trapesium,
           // R.drawable.jajargenjang,
            // R.drawable.ketupat,
            R.drawable.about
    };


}
