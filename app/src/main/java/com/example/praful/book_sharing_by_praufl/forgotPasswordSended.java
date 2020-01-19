package com.example.praful.book_sharing_by_praufl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgotPasswordSended extends AppCompatActivity {

    Button b_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_sended);
        b_continue=findViewById(R.id.b_continue);

        b_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_intent=new Intent(forgotPasswordSended.this,LoginActivity.class);
                startActivity(b_intent);
            }
        });


    }
}
