package com.example.retrofitrxjava.network.adapter.api;

import com.example.retrofitrxjava.model.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface UserService {

    @GET("/posts/")
    Observable<List<User>> getUsers();
}
