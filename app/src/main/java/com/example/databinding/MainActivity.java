package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        userProfile();
    }

    private void userProfile() {

        User user = new User();
        user.name = "김영희";
        user.email = "younghee@gmail.com";
        user.address = " 서울 어딘가 ";

        binding.setUser(user);
    }
}