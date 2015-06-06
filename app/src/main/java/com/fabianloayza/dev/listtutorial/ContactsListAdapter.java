package com.fabianloayza.dev.listtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Loayza on 06/06/2015.
 */
public class ContactsListAdapter extends BaseAdapter {
    private List<ContactEntity> mContacts;
    private Context mContext;

    public ContactsListAdapter(List<ContactEntity> contacts, Context context){

        mContacts = contacts;
        mContext = context;

    }

    private static class ViewHolder{
        TextView tvName;
        TextView tvPhone;
        TextView tvAddress;
    }

    @Override
    public int getCount() {
        return mContacts.size();
    }

    @Override
    public Object getItem(int position) {
        return mContacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mContacts.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if(row == null)
        {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item_view_contact,parent,false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) row.findViewById(R.id.tv_name);
            viewHolder.tvPhone = (TextView) row.findViewById(R.id.tv_phone);
            viewHolder.tvAddress = (TextView) row.findViewById(R.id.tv_address);

            row.setTag(viewHolder);
        }
        ContactEntity contactEntity = mContacts.get(position);
        ViewHolder viewHolder = (ViewHolder) row.getTag();

        viewHolder.tvName.setText(contactEntity.getName());
        viewHolder.tvPhone.setText(contactEntity.getPhone());
        viewHolder.tvAddress.setText(contactEntity.getAddress());

        return row;
    }
}
