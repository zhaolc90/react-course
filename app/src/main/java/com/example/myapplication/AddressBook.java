package com.example.myapplication;

import java.util.ArrayList;

public class AddressBook {
    private static AddressBook ourInstance = new AddressBook();

    private ArrayList <NameAndAddress> mNamesAndAddresses;

    private static AddressBook getInstance(){
        return ourInstance;
    }

    private AddressBook(){
        mNamesAndAddresses = new ArrayList<NameAndAddress>();
    }
}
