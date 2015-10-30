package net.harulabo.icchi.initialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button myButton1 = (Button) findViewById(R.id.button3);
        myButton1.setOnClickListener(new Button1ClickListener());

        Button myButton2 = (Button) findViewById(R.id.button5);
        myButton2.setOnClickListener(new Button2ClickListener());

    }

    private class Button1ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity4.this, "push button", Toast.LENGTH_SHORT).show();
        }
    }

    private class Button2ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText("push button2");
        }
    }
}
