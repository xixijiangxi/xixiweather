package com.xixiweather.android;
package com.xixiweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import android.util.Log;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telecom.Call;
import android.widget.ImageView;

import java.io.IOException;

import java.net.URL;
import java.net.URLConnection;

import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class WeatherActivity  extends AppCompatActivity {
    private ImageView bingPicImage;
    private SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
    @Override
    protected void onCreat (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        bingPicImage = (ImageView) findViewById(R.id.bing_pic_img);
        String bingPic = prefs.getString("bing_pic",null);
        if (bingPic != null){
            Glide.with(this).load(bingPic).into(bingPicImage);
        }
        else {
            loadBingPic();
        }
    }
    //根据城市的id来请求天气信息
     public void requestWeather(final String weather){
        loadBingPic();
     }
     //加载必应每日一图
     private void loadBingPic(){
        String requestBingPic = "http://guolin.tech/api/bing_pic";
         HttpUtil.sendOkHttpRequest(requestBingPic, new Callback() {
             @Override
             public void onFailure(Call call, IOException e) {
                 e.printStackTrace();
             }

             @Override
             public void onResponse(Call call, Response response) throws IOException {
                 final String bingPic = response.body().string();
                 SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(WeatherActivity.this).edit();
                 editor.putString("bing_pic",bingPic);
                 editor.apply();
                 runOnUiThread(new Runnable() {
                     @Override
                     public void run() {
                         Glide.with(WeatherActivity.this).load(bingPic).into(bingPicImage);
                     }
                 });

             }
         });
     }

