package com.mis571_group_d.suchef.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mis571_group_d.suchef.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MixNMatchFragment extends Fragment {


    public MixNMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mix_nmatch, container, false);
    }

}
