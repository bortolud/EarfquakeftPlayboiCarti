package com.example.android.earfquakeftplayboicarti;

public class Earthquake {
    private String mMagnitude;
    private String mLocation1;
    private String mLocation2;

    private String mDate;
    private String mTime;
    private String mURL;

    public Earthquake (String magnitude, String km, String loc, String date, String time, String url){
        mMagnitude = magnitude;
        mLocation2 = loc;
        mLocation1 = km;
        mDate = date;
        mTime = time;
        mURL = url;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmLocation1() {
        return mLocation1;
    }

    public String getmLocation2() {
        return mLocation2;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmURL() {
        return mURL;
    }
}
