package com.example.appcenter.sampleapp_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.microsoft.appcenter.analytics.Analytics;

public class DistributeActivity extends Fragment {
    private static final String pageName = "Distribute";

    @Override
    public void onStart(){
        super.onStart();
        Analytics.trackEvent("Distribute Page");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.distribute_root, container, false);
        return rootView;
    }

    public static DistributeActivity newInstance() {
        Bundle args = new Bundle();
        DistributeActivity fragment = new DistributeActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public static CharSequence getPageName() {
        return pageName;
    }
}

