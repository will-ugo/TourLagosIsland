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
public class BeachesFragment extends Fragment {

    ArrayList<Location> location;
    ArrayList<Names> names;
    ListView listView;


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.name_list, container, false);

        names = new ArrayList<Names>();
        names.add(new Names("Elegushi Royal Beach", "Rd 3, Lekki Phase I, Lekki", R.drawable.elegushi_main));
        names.add(new Names("Tarkwa Bay Beach", "Lagos Harbour", R.drawable.tarkwa_main));
        names.add(new Names("Kuramo Beach", "Southern Victoria Island, Lagos", R.drawable.kuramo_main));
        names.add(new Names("Oniru Private Beach", "1 Ligali Ayorinde St, Eti-Osa, Lagos", R.drawable.oniru_main));
        names.add(new Names("Atican Beach", "Lekki", R.drawable.atican_main));
        names.add(new Names("Eleko Beach", "Eleko Beach Rd, Lekki", R.drawable.eleko_main));
        names.add(new Names("Coconut Beach", "Off Lagos - Badagry Expressway, Lagos", R.drawable.coconut_main));
        names.add(new Names("Lekki Leisure Lake", "Eti - Osa, Lagos", R.drawable.lekki_main));

        location = new ArrayList<>();
        location.add(new Location("Lekki Phase I"));
        location.add(new Location("Lagos Harbour"));
        location.add(new Location("Southern Victoria Island, Lagos"));
        location.add(new Location("1 Ligali Ayorinde St, Eti-Osa, Lagos"));
        location.add(new Location("Lekki"));
        location.add(new Location("Eleko Beach Rd, Lekki"));
        location.add(new Location("Off Lagos - Badagry Expressway, Lagos"));
        location.add(new Location("Eti - Osa, Lagos"));

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
