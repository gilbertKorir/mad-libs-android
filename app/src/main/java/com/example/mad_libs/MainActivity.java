package com.example.mad_libs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.personEditText) EditText mPerson;
    @BindView(R.id.colorEditText) EditText mColor;
    @BindView(R.id.foodEditText) EditText mFood;
    @BindView(R.id.adjective) EditText mAdjective;
    @BindView(R.id.thingEditText) EditText mThing;
    @BindView(R.id.button) EditText mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //capture user input
                String person = mPerson.getText().toString();
                String color = mColor.getText().toString();
                String food = mFood.getText().toString();
                String adjective = mAdjective.getText().toString();
                String thing = mThing.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("person", person);
                intent.putExtra("color", color);
                intent.putExtra("food", food);
                intent.putExtra("adjective", adjective);
                intent.putExtra("thing", thing);

                //starting the activity
                startActivity(intent);
            }
        });
    }
}









