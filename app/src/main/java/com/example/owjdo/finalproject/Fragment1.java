package com.example.owjdo.finalproject;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.owjdo.finalproject.R;

import static android.R.attr.fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    public Fragment1() {

       //MyThread t = new MyThread();
       //t.run();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }

}