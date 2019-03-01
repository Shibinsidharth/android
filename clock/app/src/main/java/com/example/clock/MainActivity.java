package com.example.clock;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.Toast;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
TextClock tc;
TextToSpeech tt;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tc= (TextClock) findViewById(R.id.textClock);
        b= (Button) findViewById(R.id.button2);
        tt= new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                    if(status != TextToSpeech.ERROR)
                    {
                        tt.setLanguage(Locale.UK);
                    }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tc.getText().toString();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                tt.speak(s, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }
}
