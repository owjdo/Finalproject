package com.example.owjdo.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by owjdo on 2017-12-04.
 */



    public class Emoticon {

        // 1. 멤버변수 또는 필드
        private int image1, image2, image3;

        public  enum Feelings {NORMAL, HAPPY, SMILE}
        Feelings feel;

        //2. 생성자


        public Emoticon(int image1, int image2, int image3) {
            this.image1 = image1;
            this.image2 = image2;
            this.image3 = image3;

            feel = Feelings.NORMAL;
        }

        public void setFeel(Feelings feel) {
            this.feel = feel;
        }

        public void draw(ImageView iv) {
            switch (feel) {
                case NORMAL: iv.setImageResource(this.image1); break;
                case HAPPY: iv.setImageResource(this.image2); break;
                case SMILE: iv.setImageResource(this.image3); break;
            }
        }

        public void setImages(int image1, int image2, int image3) {
            this.image1 = image1;
            this.image2 = image2;
            this.image3 = image3;

            feel = Feelings.NORMAL;
        }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }


    }



