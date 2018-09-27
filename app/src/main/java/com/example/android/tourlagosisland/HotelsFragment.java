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
public class HotelsFragment extends Fragment {

    ArrayList<Location> location;
    ArrayList<Names> names;
    ListView listView;


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.name_list, container, false);

        names = new ArrayList<>();
        names.add(new Names("Intercontinental Hotel", "Plot 52, Kofo Abayomi Street, Victoria Island, Lagos", R.drawable.inter_main));
        names.add(new Names("Lagos Oriental Hotel", "3 Lekki - Epe Express Way, Victoria Island, Lagos", R.drawable.oriental_main));
        names.add(new Names("Federal Palace Hotel", "6–8 Ahmadu Bello Way,Victoria Island, Lagos", R.drawable.federal_main));
        names.add(new Names("Eko Hotel & Suites", "1415 Adetokunbo Ademola Street, Victoria Island, Lagos", R.drawable.eko_main));
        names.add(new Names("Southern Sun", "47 Alfred Rewane Road, Ikoyi, Lagos", R.drawable.southern_mainmain));
        names.add(new Names("Radisson Blu Anchorage Hotel", "1A Ozumba Mbadiwe Avenue, Victoria Island, Lagos", R.drawable.radisson_main));
        names.add(new Names("Four Points", "Plot 9/10, Block 2, Oniru Chieftaincy Estate, 2 Alaba Oniru Ave, Victoria Island, Lagos", R.drawable.four_points_main));

        location = new ArrayList<>();
        location.add(new Location("Plot 52, Kofo Abayomi Street, Victoria Island, Lagos"));
        location.add(new Location("3 Lekki - Epe Express Way, Victoria Island, Lagos"));
        location.add(new Location("6–8 Ahmadu Bello Way,Victoria Island, Lagos"));
        location.add(new Location("1415 Adetokunbo Ademola Street, Victoria Island, Lagos"));
        location.add(new Location("47 Alfred Rewane Road, Ikoyi, Lagos"));
        location.add(new Location("1A Ozumba Mbadiwe Avenue, Victoria Island, Lagos"));
        location.add(new Location("Plot 9/10, Block 2, Oniru Chieftaincy Estate, 2 Alaba Oniru Ave, Victoria Island, Lagos"));


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
