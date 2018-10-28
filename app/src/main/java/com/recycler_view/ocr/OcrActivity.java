package com.recycler_view.ocr;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OcrActivity extends AppCompatActivity {
    Button button1, button2;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr);
        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button1);
        textView=findViewById(R.id.textview);
        imageView=findViewById(R.id.imageview);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
