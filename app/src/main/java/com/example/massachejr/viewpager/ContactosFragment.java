package com.example.massachejr.viewpager;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactosFragment extends Fragment {

    RecyclerView recyclerView;
    UserListAdapter adapter;

    List<User> userList;


    public ContactosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contactos, container, false);

       // Toolbar toolbar = view.findViewById(R.id.toolbar);
        //setsSupportActionBar(toolbar); //TODO: Implementar essaPorra



        userList = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        userList.add(
                new User("12345","Angelo","asdasd@c.com","default"));
        userList.add(
                new User("12345","Elton","asdasd@k.com","default"));
        userList.add(
                new User("122345","Ivan","aodasd@c.com","default"));
        userList.add(
                new User("12343","Cedrik","asdayd@c.com","default"));
        userList.add(
                new User("12325","Ticongolo","asppd@c.com","default"));
        userList.add(
                new User("12345","Gerson","aslksd@c.com","default"));
        userList.add(
                new User("12345","Faiane","aslasdad@c.com","default"));
        userList.add(
                new User("12345","Josue","aslooood@c.com","default"));
        userList.add(
                new User("12345","Mandava","aslksdppp@c.com","default"));
        userList.add(
                new User("12345","Socrates","aslksasdasd@c.com","default"));
        userList.add(
                new User("12345","Gimo","aslksasdasd@c.com","default"));
        userList.add(
                new User("12345","William","aslksasdasd@c.com","default"));


        adapter = new UserListAdapter(this.getContext(),userList);
        recyclerView.setAdapter(adapter);

        
        return view;
    }



}

