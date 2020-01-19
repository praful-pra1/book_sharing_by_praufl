package com.example.praful.book_sharing_by_praufl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    TextView txt_loginNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        txt_loginNow=findViewById(R.id.txt_loginNow);

        txt_loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l_intent=new Intent(Registration.this,LoginActivity.class);
                startActivity(l_intent);
            }
        });



    }
}
