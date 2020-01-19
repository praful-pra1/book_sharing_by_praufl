package com.example.praful.book_sharing_by_praufl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class LoginActivity extends AppCompatActivity {

    TextView textView6,txt_forgot_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView6=findViewById(R.id.textView6);
        txt_forgot_password=findViewById(R.id.txt_forgotPassword);

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,Registration.class);
                startActivity(intent);
            }
        });

        txt_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f_intent=new Intent(LoginActivity.this,forgotPassword.class);
                startActivity(f_intent);
            }
        });
    }
}
