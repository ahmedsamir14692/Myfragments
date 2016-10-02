package com.example.android.myfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ahmed on 7/14/16.
 */
public class fragment2 extends Fragment {
    String text;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2,container,false);
    }

    public void chnage (String data)
    {
        TextView textView = (TextView) getActivity().findViewById(R.id.textView);

        textView.setText(data);
        text=data;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",text);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null)
        {
            text = savedInstanceState.getString("text");
            chnage(text);

        }
    }
}
