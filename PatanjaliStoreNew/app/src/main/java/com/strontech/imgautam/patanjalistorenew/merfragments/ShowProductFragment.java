package com.strontech.imgautam.patanjalistorenew.merfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.strontech.imgautam.patanjalistorenew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowProductFragment extends Fragment {


  public ShowProductFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_show_product, container, false);
  }

}
