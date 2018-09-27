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
public class ParksFragment extends Fragment {

    ArrayList<Location> location;
    ArrayList<Names> names;
    ListView listView;


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.name_list, container, false);

        names = new ArrayList<Names>();
        names.add(new Names("Lekki Conservation Centre", "19 Lekki - Epe Expy, Lekki Penninsula II, Lekki", R.drawable.lekki_con_main));
        names.add(new Names("LUFASI Nature Park", "Eti - Osa, Lagos", R.drawable.lufasi_main));
        names.add(new Names("Gberefu Island", "Badagry, Close to the Atlantic Ocean", R.drawable.gberefu_main));
        names.add(new Names("Freedom Park", "Broad St, Lagos Island, Lagos", R.drawable.freedom_main));
        names.add(new Names("Leisure Sports Park", "39 Kusenla Rd, Lekki Penninsula II, Lekki", R.drawable.leisure_main));
        names.add(new Names("Dolphin Park", "Dolphin Estate, Lagos", R.drawable.dolphin_main));

        location = new ArrayList<>();
        location.add(new Location("19 Lekki - Epe Expy, Lekki Penninsula II, Lekki"));
        location.add(new Location("Eti - Osa, Lagos"));
        location.add(new Location("Badagry, Close to the Atlantic Ocean"));
        location.add(new Location("Broad St, Lagos Island, Lagos"));
        location.add(new Location("39 Kusenla Rd, Lekki Penninsula II, Lekki"));
        location.add(new Location("Dolphin Estate, Lagos"));

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
