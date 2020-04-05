package com.udgs123.demo3gs.ui.tttaikhoan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TttaikhoanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TttaikhoanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}