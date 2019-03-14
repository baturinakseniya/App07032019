package com.example.app07032019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    Button button1;
    EditText edit;
    EditText mainEditText;
    ListView mainListView;
    ArrayAdapter mArrayAdapter;
    ArrayList mNameList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.text_view);
        tv.setText(getString(R.string.HelloRussia));

        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(this);
        //edit = findViewById(R.id.edit);
        mainEditText = (EditText) findViewById(R.id.edit);
        mainListView = findViewById(R.id.main_listview);
        mArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                mNameList);
        mainListView.setAdapter(mArrayAdapter);

    }


    @Override
    public void onClick(View v) {
        tv.setText(mainEditText.getText().toString()
            + " is learning Android development!");
        mNameList.add(mainEditText.getText().toString());
        mArrayAdapter.notifyDataSetChanged();

    }


}
