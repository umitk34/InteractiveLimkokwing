package com.example.user.interactivelimkokwing;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebViewClient;

/**
 * Created by user on 6/9/15.
 */
public class WebView extends Activity {

    private android.webkit.WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Bundle extras = getIntent().getExtras();
        String value = extras.getString("new_variable_name");

        if (value.contains("register")) {
            String url_address = "http://www.limkokwing.net/malaysia/academic/application_procedures";
            webview = (android.webkit.WebView) findViewById(R.id.webview);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.loadUrl(url_address);
            webview.setWebViewClient(new GoogleWebViewClient());
        }
        else{
            String url_address = "http://www.limkokwing.net/malaysia/academic/financial_assistance";
            webview = (android.webkit.WebView) findViewById(R.id.webview);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.loadUrl(url_address);
            webview.setWebViewClient(new GoogleWebViewClient());
        }

    }

    private class GoogleWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webview, String url)

        {
            webview.loadUrl(url);
            return true;
        }
    }
}
