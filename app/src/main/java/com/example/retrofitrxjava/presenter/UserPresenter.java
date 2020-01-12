package com.example.retrofitrxjava.presenter;

import android.app.Activity;

import com.example.retrofitrxjava.contract.UserContract;

public class UserPresenter implements UserContract.Presenter {

    Activity activity;

    //Constructor
    public UserPresenter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadData() {

    }
}
