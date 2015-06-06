package com.fabianloayza.dev.listtutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Loayza on 06/06/2015.
 */
public class ContactFactory {
    private static ContactFactory mInstance;
    private List<ContactEntity> mContacts;

    private ContactFactory(){
        mContacts = new ArrayList<ContactEntity>();
    }

    public static ContactFactory getInstance(){
        if (mInstance == null)
            mInstance = new ContactFactory();

        return mInstance;
    }

    public List<ContactEntity> getContacts(){
        for(int i=0; i<40 ; i++)
        {
            ContactEntity contactEntity = new ContactEntity();
            contactEntity.setId(i);
            contactEntity.setName("Name "+ i);
            contactEntity.setPhone("7895468"+ i);
            contactEntity.setAddress("Address Number "+i);

            mContacts.add(contactEntity);

        }
        return mContacts;
    }

}
