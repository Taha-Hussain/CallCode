package com.example.taha.callcode;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button callmebutton = (Button) findViewById(R.id.callmebutton);

        callmebutton.setOnClickListener(mCorkyListener);

    }

    private View.OnClickListener mCorkyListener = new View.OnClickListener() {
        public void onClick(View v) {


            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "03362175378"));

            try{
                startActivity(intent);
            }

            catch (android.content.ActivityNotFoundException ex){
                Toast.makeText(getApplicationContext(), "yourActivity is not founded" + ex, Toast.LENGTH_SHORT).show();
            }
        }
    };



}
