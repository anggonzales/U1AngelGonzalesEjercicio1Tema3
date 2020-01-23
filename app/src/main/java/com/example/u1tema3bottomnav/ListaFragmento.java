package com.example.u1tema3bottomnav;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Vector;

public class ListaFragmento extends Fragment {

    Context context;
    String items [] = new String[]{"Peru, Bolivia, Rosario"};

    public ListaFragmento() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.listafragmento,container,false);

        final ListView ls = view.findViewById(R.id.milista);

        ArrayAdapter miarrayadapter= ArrayAdapter.createFromResource(getActivity(),R.array.milista,android.R.layout.simple_list_item_1);
        ls.setAdapter(miarrayadapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "SELECCIONANDO UN ITEM DE LA LISTVIEW" ,
                        Toast.LENGTH_LONG).show();
            }
        });


        return view;

    }
}
