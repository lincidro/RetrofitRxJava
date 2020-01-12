package com.example.retrofitrxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retrofitrxjava.contract.UserContract;
import com.example.retrofitrxjava.model.User;
import com.example.retrofitrxjava.presenter.UserPresenter;

import java.util.List;

public class MainActivity
        extends AppCompatActivity
        implements UserContract.View
{

    UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    @Override
    public void init() {
        userPresenter = new UserPresenter(this);
        userPresenter.start();
    }

    @Override
    public void showData(List<User> users) {

    }

    @Override
    public void showError(String message) {

    }
}
