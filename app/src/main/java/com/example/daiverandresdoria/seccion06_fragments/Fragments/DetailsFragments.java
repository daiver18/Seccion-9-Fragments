package com.example.daiverandresdoria.seccion06_fragments.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daiverandresdoria.seccion06_fragments.R;
public class DetailsFragments extends Fragment {

    private TextView message;

    public DetailsFragments() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details_fragments, container, false);
        message = view.findViewById(R.id.TextViewMessage);
        // Inflate the layout for this fragment
        return view;
    }

    public void renderizarText(String text){
        message.setText(text);
    }

}
