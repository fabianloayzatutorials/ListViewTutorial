package com.fabianloayza.dev.listtutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Loayza on 06/06/2015.
 */
public class ContactListFragment extends ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact_list,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        List<ContactEntity> contacts = ContactFactory.getInstance().getContacts(); //SQLITE //WEBSERVICE //ARRAY //DUMMIE FACTORY

        ContactsListAdapter contactsListAdapter = new ContactsListAdapter(contacts, getActivity());

        setListAdapter(contactsListAdapter);
    }
}
