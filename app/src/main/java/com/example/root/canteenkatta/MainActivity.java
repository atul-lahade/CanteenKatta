package com.example.root.canteenkatta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Sign_In = (Button) findViewById(R.id.Sign_In);
        Sign_In.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View option)
                    {
                        Intent option_page = new Intent(findViewById(R.id.Sign_In).getContext(),Options.class);
                        startActivity(option_page);
                    }
                }
        );

    }
}
