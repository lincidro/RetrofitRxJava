package com.example.retrofitrxjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.retrofitrxjava.adapter.CustomAdapter;
import com.example.retrofitrxjava.contract.UserContract;
import com.example.retrofitrxjava.model.User;
import com.example.retrofitrxjava.presenter.UserPresenter;

import java.util.List;

public class MainActivity
        extends AppCompatActivity
        implements UserContract.View
{

    CustomAdapter adapter;
    private RecyclerView recyclerView;
    private UserContract.Presenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userPresenter = new UserPresenter(this);
        userPresenter.start();
    }

    @Override
    public void init() {
        recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager((manager));
        userPresenter.loadData();
    }

    @Override
    public void showData(List<User> users) {
        adapter = new CustomAdapter(users);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.d("showError", "showError: "+message);
    }
}
