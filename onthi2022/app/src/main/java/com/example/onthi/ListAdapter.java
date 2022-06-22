package com.example.onthi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    final ArrayList<UserModel> listusers;

    public ListAdapter(ArrayList<UserModel> listusers) {
        this.listusers = listusers;
    }

    @Override
    public int getCount() {
        return listusers.size();
    }

    @Override
    public Object getItem(int i) {
        //trả về bản ghi tại vị trí i
        return listusers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listusers.get(i).ID;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        return null;
        View viewUser;
        if (view ==null){
            viewUser = View.inflate(viewGroup.getContext(), R.layout.activity_list, null);
        }else
            viewUser = view;
        //bind du lieu phan tu vao view
        UserModel user  = (UserModel) getItem(i);
        ((TextView) viewUser.findViewById(R.id.editTextTextPersonName)).setText("Name "+ user.username);
        ((TextView) viewUser.findViewById(R.id.editTextPhone)).setText("Phone: "+ user.phone);
        ((TextView) viewUser.findViewById(R.id.editTextTextEmailAddress)).setText("Email "+ user.email);
        return viewUser;
    }
}
