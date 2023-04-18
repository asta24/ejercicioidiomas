package com.example.ejercicioidiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String lugares [] = {"Francia", "España", "Portugal", "Rusia", "Albania", "Bielorrusia", "Bulgaria", "Croacia", "República Checa", "Dinamarca"};
    private String idiomas [] = {"francés", "castellano", "portugués", "ruso", "albanes", "bielorruso y ruso", "búlgaro", "croata", "checo", "danés"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_rcorp, lugares);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                tv1.setText("En " + lv1.getItemAtPosition(position) + " se habla " + idiomas[position] + " tontito ");

            }
        });
    }
}