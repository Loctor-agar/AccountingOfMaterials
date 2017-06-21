package com.example.practicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AutorisationActivity extends AppCompatActivity {
    Button regButton, singInButton, forgotPassButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorisation);
        getSupportActionBar().hide();

        regButton = (Button) findViewById(R.id.regButton);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AutorisationActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        });
        forgotPassButton = (Button) findViewById(R.id.forgotPassButton);
    }
}
