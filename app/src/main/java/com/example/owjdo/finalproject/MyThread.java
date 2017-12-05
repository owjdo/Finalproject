package com.example.owjdo.finalproject;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import static com.example.owjdo.finalproject.R.id.imageView1;
import static com.example.owjdo.finalproject.R.id.imageView2;

/**
 * Created by owjdo on 2017-12-04.
 */

public class MyThread extends Activity {
    int myIndex=0;
    int stateIndex =0;

    ArrayList<Integer> images = new ArrayList<Integer>();

    public MyThread(int index) {
        myIndex = index;

        images.add(R.drawable.black);
        images.add(R.drawable.red);
        images.add(R.drawable.yellow);
    }

    public void run() {
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1) ;
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2) ;
        stateIndex = 0;
        for (int i = 0; i < 9; i++) {
            if (myIndex == 0) {
                imageView1.setImageResource(images.get(stateIndex));
            } else if (myIndex == 1) {
                imageView2.setImageResource(images.get(stateIndex));
            }
        }
    }

}


