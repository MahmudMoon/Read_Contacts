package com.example.moon.read_phonebook;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.moon.read_phonebook.ContactModel;
import com.example.moon.read_phonebook.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<ContactModel> arrayList;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, ArrayList<ContactModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.custom_adp_layout,null);
        TextView tvID,tvName,tvNumber;
        tvID = (TextView)view.findViewById(R.id.tv_id);
        tvName = (TextView)view.findViewById(R.id.tv_name);
        tvNumber = (TextView)view.findViewById(R.id.tv_number);

        tvID.setText(arrayList.get(position).getId());
        tvName.setText(arrayList.get(position).getName());
        tvNumber.setText(arrayList.get(position).getMobileNumber());

        return view;
    }
}
