package com.example.daiverandresdoria.seccion06_fragments.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.daiverandresdoria.seccion06_fragments.R;

public class DataFragments extends Fragment {
    private EditText text;
    private Button btnsend;
    private DataListener callBack;

    public DataFragments() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack = (DataListener) context;
        }catch (Exception e){
            throw  new ClassCastException(context.toString()+" should implement DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_fragments, container, false);
        text = view.findViewById(R.id.ImputDataFragment);
        btnsend = view.findViewById(R.id.sendData);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = text.getText().toString();
                callBack.sendData(textToSend);

            }
        });
        // Inflate the layout for this fragment
        return view;
    }
    public interface DataListener{
        void sendData(String text);
    }

}
