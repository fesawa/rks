package com.example.ibank;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Paket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        Button pkt1 = (Button) findViewById(R.id.button1);
        Button pkt2 = (Button) findViewById(R.id.button);
        Button pkt3 = (Button) findViewById(R.id.button2);
        Button pkt4 = (Button) findViewById(R.id.button3);
        Button pkt5 = (Button) findViewById(R.id.button4);
        pkt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(Paket.this, Rincian.class);
                startActivity(inte);

            }
        });
        pkt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(Paket.this, Rincian.class);
                startActivity(inte);

            }
        });


    }
}
