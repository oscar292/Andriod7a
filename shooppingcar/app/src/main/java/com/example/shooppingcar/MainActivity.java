package com.example.shooppingcar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


private ListView listView;
private ArrayList<String> nombres;

public void button(View view){



    EditText variable= (EditText) findViewById(R.id.editText2);
    EditText variable2 = (EditText) findViewById(R.id.editText3);

    nombres.add(variable.getText().toString()+" "+variable2.getText().toString());


    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres);
    listView.setAdapter(adapter);

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombres = new ArrayList<String>();
        listView = (ListView) findViewById(R.id.lista);

    }







}
