package com.example.tut9_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = new BookmarksFragment();
        manager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();

        Bundle args = new Bundle();
        args.putString("KEY", "value"); // putInt, putDouble...
        fragment.setArguments(args);
    }


}