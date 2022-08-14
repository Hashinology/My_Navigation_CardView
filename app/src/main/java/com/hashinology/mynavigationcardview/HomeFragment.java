package com.hashinology.mynavigationcardview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements MyInterface{
    RecyclerView recyclerView;
    ArrayList<Book> bookList;
    BookAdapter bookAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rvBooks);

        bookList = new ArrayList<>();


        bookList.add(0, new Book("Cat", "White", R.drawable.vaccincetry));
        bookList.add(1, new Book("Dog", "Blue", R.drawable.vaccincetry));
        bookList.add(2, new Book("Duck", "Black", R.drawable.vaccincetry));
        bookList.add(3, new Book("Cat", "White", R.drawable.vaccincetry));
        bookList.add(4, new Book("Dog", "Blue", R.drawable.vaccincetry));
        bookList.add(5, new Book("Duck", "Black", R.drawable.vaccincetry));
        bookList.add(5, new Book("Cat", "White", R.drawable.vaccincetry));
        bookList.add(6, new Book("Dog", "Blue", R.drawable.vaccincetry));
        bookList.add(7, new Book("Duck", "Black", R.drawable.vaccincetry));
        bookList.add(8, new Book("Cat", "White", R.drawable.vaccincetry));
        bookList.add(9, new Book("Dog", "Blue", R.drawable.vaccincetry));
        bookList.add(10, new Book("Duck", "Black", R.drawable.vaccincetry));


        bookAdapter = new BookAdapter(bookList, getActivity());

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(bookAdapter);

        bookAdapter.getAdapterInterface(this);
    }

    @Override
    public void myClick(View view, int position) {
        Toast.makeText(getContext(), "Current Position: "+ position, Toast.LENGTH_SHORT).show();
    }
}