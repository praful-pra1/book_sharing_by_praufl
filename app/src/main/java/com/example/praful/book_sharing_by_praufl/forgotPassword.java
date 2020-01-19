package com.example.praful.book_sharing_by_praufl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class forgotPassword extends AppCompatActivity {

    TextView txt_loginNow;
    Button b_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        txt_loginNow=findViewById(R.id.txt_loginNow);
        b_continue=findViewById(R.id.b_continue);

        txt_loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l_intent=new Intent(forgotPassword.this,LoginActivity.class);
                startActivity(l_intent);
            }
        });

        b_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirm_intent=new Intent(forgotPassword.this,forgotPasswordSended.class);
                startActivity(confirm_intent);
            }
        });



    }
}
