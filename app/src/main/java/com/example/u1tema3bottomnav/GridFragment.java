package com.example.u1tema3bottomnav;


import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class GridFragment extends Fragment {

    MediaPlayer mp;
    Context context;
    String items [] = new String[]{"Peru, Bolivia, Rosario"};
    public GridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_grid,container,false);
        final GridView gv = view.findViewById(R.id.migridview);

        ArrayAdapter miarrayadapter= ArrayAdapter.createFromResource(getActivity(),R.array.milista,android.R.layout.simple_list_item_1);
        gv.setAdapter(miarrayadapter);

        return view;
    }

}
