package com.example.android.tourlagosisland;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    ArrayList<Location> location;
    ArrayList<Names> names;
    ListView listView;


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.name_list, container, false);

        names = new ArrayList<Names>();
        names.add(new Names("Sailors Lounge", "12 Admiralty Road, Lekki Phase 1, Lagos", R.drawable.sailors_main));
        names.add(new Names("Villa Medici", "1 Alhaji, Babatunde Jose Street, Victoria Island, Lagos", R.drawable.villa_main));
        names.add(new Names("Metisse Restaurant", "Victoria Island, Lagos", R.drawable.metisse_main));
        names.add(new Names("Bungalow's", "1296 Akin Adesola St, Victoria Island, Lagos", R.drawable.bungalow_main));
        names.add(new Names("1662 Cafe & Bar", "2 Raymond Njoku Street, Off Awolowo Road, Ikoyi, Lagos", R.drawable.sixteen_main));
        names.add(new Names("Hard Rock Cafe", "3 & 4, Block XVI, Oniru Estate, Victoria Island, Lagos", R.drawable.hard_main));
        names.add(new Names("The Place Lekki", "Block A10, Admiralty Way, Lekki Phase 1, Lagos", R.drawable.place_main));

        location = new ArrayList<>();
        location.add(new Location("12 Admiralty Road, Lekki Phase 1, Lagos"));
        location.add(new Location("1 Alhaji, Babatunde Jose Street, Victoria Island, Lagos"));
        location.add(new Location("Victoria Island, Lagos"));
        location.add(new Location("1296 Akin Adesola St, Victoria Island, Lagos"));
        location.add(new Location("2 Raymond Njoku Street, Off Awolowo Road, Ikoyi, Lagos"));
        location.add(new Location("3 & 4, Block XVI, Oniru Estate, Victoria Island, Lagos"));
        location.add(new Location("Block A10, Admiralty Way, Lekki Phase 1, Lagos"));

        NameAdapter adapter = new NameAdapter(getActivity(), names);

        LocationAdapter locAdapter = new LocationAdapter(getActivity(), location);

        listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("name", names.get(i).getPlaceName());
                intent.putExtra("location", names.get(i).getlocation());
                startActivity(intent);
            }
        });
        return rootView;
    }

}
