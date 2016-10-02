package com.example.android.myfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ahmed on 7/14/16.
 */
public class fragment1 extends Fragment implements View.OnClickListener{

    Button button;
    int counter = 0;
    coumicater coumicater;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button= (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
        coumicater= (com.example.android.myfragments.coumicater) getActivity();

    }

    @Override
    public void onClick(View v) {
        counter++;
        coumicater.makechange("button cliked"+counter);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState !=null)
        counter= (int) savedInstanceState.get("counter");
    }
}
