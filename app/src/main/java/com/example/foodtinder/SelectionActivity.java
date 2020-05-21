package com.example.foodtinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class SelectionActivity extends AppCompatActivity {
    /*
    User reaches this page after entering address into first map page
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        changeStatusBarColour(R.color.colorPrimaryDark); // Change status bar to match our top bar colour
    }

    public void changeStatusBarColour(int colourCode) {
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), colourCode));
    }
}
