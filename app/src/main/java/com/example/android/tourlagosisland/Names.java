package com.example.android.tourlagosisland;

public class Names {
    private String mPlaceName;
    private String mLocation;
    private int mImageResourceID;

    public Names(String placeName, String location, int imageResource) {
        mPlaceName = placeName;
        mLocation = location;
        mImageResourceID = imageResource;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getlocation() {
        return mLocation;
    }


    public int getImageResource() {
        return mImageResourceID;
    }

}
