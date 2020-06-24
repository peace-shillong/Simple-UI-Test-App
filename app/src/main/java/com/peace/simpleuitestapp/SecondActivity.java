package com.peace.simpleuitestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.peace.simpleuitestapp.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        binding=ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.enteredText.setText(getIntent().getExtras().getString("name"));

    }
}