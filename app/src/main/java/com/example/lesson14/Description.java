package com.example.lesson14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lesson14.model.BookModel;

public class Description extends AppCompatActivity {

    TextView txt_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        inItView();
        Bundle bundle = getIntent().getExtras();
        BookModel model = (BookModel) bundle.getSerializable("model");

        txt_title.setText(model.getName());

    }

    private void inItView(){
        txt_title= findViewById(R.id.tv_name);


    }
}

