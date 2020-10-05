package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] namanegara = new String[]{


                "Indonesia",

                "Malaysia",

                "Singapora",

                "Kamboja",

                "Myanmar",

                "Filipina",

                "Italia",

                "Inggris",

                "Belanda",

                "Perancis",

                 "Jepang",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
        this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                namanegara
        );

        listView = findViewById(R.id.ListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, namanegara[position], Toast.LENGTH_LONG).show();
            }
        });


    }
}
