package com.example.eduardoaraujo.dialogfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThreeFragment extends Fragment implements View.OnClickListener{

    private static MyDialogFragment.dialogCallback mDialogCallback;

    public static ThreeFragment newInstance(MyDialogFragment.dialogCallback dialogCallback) {

        mDialogCallback = dialogCallback;

        Bundle args = new Bundle();

        ThreeFragment fragment = new ThreeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btnPrev).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPrev:
                mDialogCallback.changeFragment(TwoFragment.newInstance(mDialogCallback));
                break;
            case R.id.btnNext:
                break;
        }
    }
}
