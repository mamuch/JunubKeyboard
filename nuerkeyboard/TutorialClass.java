package com.dhiel.mamuc.nuerkeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class TutorialClass extends AppCompatActivity {

    Button backbtn;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_class);

        backbtn = (Button) findViewById(R.id.tnback);
        mWebView = (WebView) findViewById(R.id.mywebView);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);
        mWebView.loadUrl("https://www.youtube.com/watch?v=c-Uyjd8ErrQ&t=1s");
        mWebView.setWebChromeClient(new WebChromeClient());

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialClass.this,home.class));
            }
        });
    }
}
