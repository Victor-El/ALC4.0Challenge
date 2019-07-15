package com.victor.alc40challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    public void change(View view) {
        switch (view.getId()) {
            case R.id.profile_btn:
                startActivity(new Intent(this, Profile.class));
            break;

            case R.id.about_alc:
                startActivity(new Intent(this, About.class));
            break;
        }
    }
}
