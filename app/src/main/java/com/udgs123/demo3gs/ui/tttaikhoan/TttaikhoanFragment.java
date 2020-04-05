package com.udgs123.demo3gs.ui.tttaikhoan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.udgs123.demo3gs.R;

public class TttaikhoanFragment extends Fragment {

    private TttaikhoanViewModel tttaikhoanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tttaikhoanViewModel =
                ViewModelProviders.of(this).get(TttaikhoanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tttaikhoan, container, false);
        final TextView textView = root.findViewById(R.id.text_tttaikhoan);
        tttaikhoanViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}