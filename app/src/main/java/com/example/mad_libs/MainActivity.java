package com.example.mad_libs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}