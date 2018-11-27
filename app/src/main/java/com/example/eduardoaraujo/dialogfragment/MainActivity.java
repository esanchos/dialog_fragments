package com.example.eduardoaraujo.dialogfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startFragment();
    }

    private void startFragment() {
        try {
            fragment = MainFragment.class.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return;
        }

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_main, fragment)
                .commit();
    }

}
