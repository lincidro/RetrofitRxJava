package com.example.retrofitrxjava.contract;

import com.example.retrofitrxjava.model.User;

import java.util.List;

public interface UserContract {

    interface View {
        void init();
        void showData(List<User> users);
        void showError(String message);
    }

    interface Presenter {
        void start();
        void loadData();
    }

}
