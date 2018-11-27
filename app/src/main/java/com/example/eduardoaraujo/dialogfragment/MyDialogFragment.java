package com.example.eduardoaraujo.dialogfragment;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyDialogFragment extends DialogFragment {

    public interface dialogCallback {
        void changeFragment(Fragment fragment);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog, container, false);
        startFragment();
        return view;
    }

    private void startFragment() {
        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_content, OneFragment.newInstance(new dialogCallback() {
                    @Override
                    public void changeFragment(Fragment fragment) {
                        getChildFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame_content, fragment)
                                .commit();
                    }
                }))
                .commit();
    }
    
}
