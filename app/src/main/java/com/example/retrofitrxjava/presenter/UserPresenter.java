package com.example.retrofitrxjava.presenter;

import com.example.retrofitrxjava.callback.Callback;
import com.example.retrofitrxjava.contract.UserContract;
import com.example.retrofitrxjava.model.User;
import com.example.retrofitrxjava.utils.UserTask;

import java.util.List;

public class UserPresenter implements UserContract.Presenter {

    UserContract.View mView;

    //Constructor
    public UserPresenter(UserContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void start() {
        mView.init();
    }

    @Override
    public void loadData() {
        UserTask.getUsers(new Callback<List<User>>() {
            @Override
            public void returnResult(List<User> users) {
                mView.showData(users);
            }

            @Override
            public void returnError(String message) {
                mView.showError(message);
            }
        });
    }
}
