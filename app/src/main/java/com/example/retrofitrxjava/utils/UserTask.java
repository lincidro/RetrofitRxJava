package com.example.retrofitrxjava.utils;

import com.example.retrofitrxjava.callback.Callback;
import com.example.retrofitrxjava.model.User;
import com.example.retrofitrxjava.network.NetworkingUtils;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UserTask {

    public static void getUsers(final Callback<List<User>> callback) {

        NetworkingUtils.getUserApiInstance()
                .getUsers()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<User>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<User> users) {
                        callback.returnResult(users);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.returnError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
