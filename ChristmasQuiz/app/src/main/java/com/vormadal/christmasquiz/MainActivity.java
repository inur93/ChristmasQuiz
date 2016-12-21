package com.vormadal.christmasquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView gif = (WebView) findViewById(R.id.image_gif);
        gif.loadData("<html><body>\n" +
                "    <img src=\"assets/gif1.gif\" alt=\"Mountain View\" style=\"width:304px;height:228px;\">\n" +
                "</body>\n" +
                "\n" +
                "</html>", "text/html", null);

    }
}
