package com.example.intentadvancedusage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view){                                                            //打開電話
        Intent intent =  new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+123456789));          //TEL 加撥打的號碼
        startActivity(intent);
    }

    public void map(View view){                                                                     //打開地圖
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:24.1459032,120.734959"));     //位置座標
        startActivity(intent);
    }

    public void web(View view){                                                                 //打開網頁
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));    //打開的網址
        startActivity(intent);
    }
}