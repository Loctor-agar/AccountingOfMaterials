package com.example.practicate;

/**
 * Created by Хусан on 14.06.2017.
 */

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.Toast;

public class UsersActivity extends Fragment {
    private static final String TAG = "UsersActivity";

    private Button btnUsers;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.users_tab,container,false);
        btnUsers = (Button) view.findViewById(R.id.btnUsers);

        btnUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

//public class UsersActivity extends Fragment{
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.users_tab, container, false);
//        return rootView;
//    }

