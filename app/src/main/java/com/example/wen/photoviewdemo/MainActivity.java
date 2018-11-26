package com.example.wen.photoviewdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {
    private PhotoView mPvPhoto;
    private PhotoViewAttacher attacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPvPhoto= findViewById(R.id.pv_photo);
        attacher = new PhotoViewAttacher(mPvPhoto);
        //加载本地图片
//        try {
//            InputStream is = getAssets().open("laopo.jpg");
//            Bitmap bitmap = BitmapFactory.decodeStream(is);
//            mPvPhoto.setImageBitmap(bitmap);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //加载网络图片
        Picasso.with(this).load("http://www.rmzt.com/uploads/allimg/151014/1-151014164149411.jpg").into(mPvPhoto);
        mPvPhoto.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
            @Override
            public void onPhotoTap(View view, float x, float y) {

            }
        });
    }
}
