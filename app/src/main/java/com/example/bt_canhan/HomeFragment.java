package com.example.bt_canhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bt_canhan.Adapter.NotificationAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private NotificationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo dữ liệu thông báo mẫu
        List<Notification> notificationList = new ArrayList<>();
        notificationList.add(new Notification("Thông báo 1"));
        notificationList.add(new Notification("Thông báo 2"));
        notificationList.add(new Notification("Thông báo 3"));

        // Gán adapter cho RecyclerView
        adapter = new NotificationAdapter(notificationList);
        recyclerView.setAdapter(adapter);

        return view; // Trả về `view` đã sửa đổi
    }

}