package com.example.android.tourlagosisland;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_details, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationName = listItemView.findViewById(R.id.location);
        locationName.setText(currentLocation.getlocation());


        return listItemView;
    }
}
