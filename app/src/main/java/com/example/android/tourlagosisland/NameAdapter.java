package com.example.android.tourlagosisland;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NameAdapter extends ArrayAdapter<Names> {

    public NameAdapter(Activity context, ArrayList<Names> names) {
        super(context, 0, names);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.name_item, parent, false);
        }

        Names currentName = getItem(position);

        TextView placeName = listItemView.findViewById(R.id.placeName);
        placeName.setText(currentName.getPlaceName());

        ImageView placeImage = listItemView.findViewById(R.id.placeImage);
        placeImage.setImageResource(currentName.getImageResource());

        return listItemView;
    }

}
