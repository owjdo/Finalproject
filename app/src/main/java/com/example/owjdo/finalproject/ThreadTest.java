package com.example.owjdo.finalproject;

import android.os.Bundle;

/**
 * Created by owjdo on 2017-12-04.
 */

public class ThreadTest extends Thread {
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        ExampleThread thread = new ExampleThread();
        thread.start();
    }

    private class ExampleThread extends Thread {
        private static final String TAG = "ExampleThread";

        public ExampleThread() {
            // 초기화 작업
        }

        public void run() {

        }
    }
}
