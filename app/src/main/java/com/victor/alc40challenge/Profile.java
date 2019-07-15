package com.victor.alc40challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setTitle("My Profile");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] arr = {"Track:  Android",
                "Country:  Nigeria",
                "Email:  chivicbtc@gmail.com",
                "Phone:  (+234) 907 628 2648",
                "Slack Username:  CodeEnzyme",
                "Name:  Elezua Victor"
        };

        ListView lv = findViewById(R.id.list_detail);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.detail_layout, R.id.detail, arr);
        lv.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}
