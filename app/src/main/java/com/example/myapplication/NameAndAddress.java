package com.example.myapplication;

import java.io.Serializable;

public class NameAndAddress implements Serializable {
    private  String mName;
    private  String mAddrress1;
    private  String mAddrress2;
    private  String mZipCode;


    public NameAndAddress(String mName,
                          String mAddrress1,
                          String mAddrress2,
                          String mZipCode) {
        this.mName = mName;
        this.mAddrress1 = mAddrress1;
        this.mAddrress2 = mAddrress2;
        this.mZipCode = mZipCode;
    }

    public String getName() {
        return mName;
    }

    public String getAddrress1() {
        return mAddrress1;
    }

    public String getAddrress2() {
        return mAddrress2;
    }

    public String getZipCode() {
        return mZipCode;
    }
}
