package com.example.retrofitrxjava.network;

import com.example.retrofitrxjava.network.adapter.RetrofitAdapter;
import com.example.retrofitrxjava.network.adapter.api.UserService;

public class NetworkingUtils {

    private static UserService userService;

    public static UserService getUserApiInstance() {
        if(userService == null)
            userService = RetrofitAdapter.getInstance().create(UserService.class);

        return userService;
    }
}
