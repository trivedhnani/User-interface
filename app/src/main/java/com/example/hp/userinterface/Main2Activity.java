package com.example.hp.userinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView=(WebView)findViewById(R.id.wv);
        webView.setWebViewClient(new mb()); //TO OPEN URL IS OUR APP ONLY
        webView.getSettings().setJavaScriptEnabled(true); //SCROLLBAR IS NOT ACCESSIBLE UNTIL WE ENABLE JAVASCRIPT
        webView.loadUrl("http://www.moma.org");
    }
    private class mb extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    }

