package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dualfragment);

        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment fragment = ( Fragment) fragmentManager.findFragmentById(R.id.fragmentHolder);
//
//        if(fragment == null) {
//            fragment = new SimpleFragment();
//            fragmentManager.beginTransaction()
//                    .add(R.id.fragmentHolder, fragment)
//                    .commit();
//        }

    }
}