package com.example.astro



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class InvestingComActivity : AppCompatActivity() {

    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_investing_com)

        webView = findViewById(R.id.webview)
        // Enable JavaScript
        webView.settings.javaScriptEnabled = true


        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.investing.com/")
    }
}







