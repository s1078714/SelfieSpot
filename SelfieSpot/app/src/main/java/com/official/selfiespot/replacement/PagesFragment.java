package com.official.selfiespot.replacement;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PagesFragment extends Fragment {
	
	public PagesFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(com.official.selfiespot.replacement.R.layout.fragment_pages, container, false);
         
        return rootView;
    }
}
