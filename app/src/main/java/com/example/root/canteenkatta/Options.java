package com.example.root.canteenkatta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        Button jain_mess_button = (Button) findViewById(R.id.jain_mess_button);
        jain_mess_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View vie)
                    {
                        Intent jain_mess = new Intent(findViewById(R.id.jain_mess_button).getContext(),Sp_jain_mess.class);
                        startActivity(jain_mess);
                    }
                }
        );
    }



}
