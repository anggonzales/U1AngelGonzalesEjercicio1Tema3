package com.example.u1tema3bottomnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragmento extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.login, container, false);
        return view;
    }
}
